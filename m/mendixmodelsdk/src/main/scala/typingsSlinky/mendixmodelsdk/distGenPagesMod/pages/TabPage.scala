package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var caption: Text = js.native
  var conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  val containerAsTabContainer: TabContainer = js.native
  @JSName("model")
  var model_TabPage: IModel = js.native
  var name: String = js.native
  var refreshOnShow: Boolean = js.native
  /**
    * In version 7.15.0: deleted
    */
  var widget: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  val widgets: IList[Widget] = js.native
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

