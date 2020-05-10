package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/tab-page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TabPage")
@js.native
class TabPage protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTabPage: IModel = js.native
  def caption: Text = js.native
  def caption(newValue: Text): js.Any = js.native
  def conditionalVisibilitySettings(): js.Any = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Union: ConditionalVisibilitySettings | Null = js.native
  def containerAsTabContainer: TabContainer = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  def refreshOnShow: Boolean = js.native
  def refreshOnShow(newValue: Boolean): js.Any = js.native
  def widget(): js.Any = js.native
  def widget(newValue: Widget): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  @JSName("widget")
  def widget_Union: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TabPage")
@js.native
object TabPage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TabPage = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * The new TabPage will be automatically stored in the 'tabPages' property
    * of the parent TabContainer element passed as argument.
    */
  def createIn(container: TabContainer): TabPage = js.native
}

