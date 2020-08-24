package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
abstract class ClientAction protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FClientAction: IModel = js.native
  def containerAsActionButton: ActionButton = js.native
  def containerAsActionItem: ActionItem = js.native
  def containerAsAssociationWidget: AssociationWidget = js.native
  def containerAsAttributeWidget: AttributeWidget = js.native
  def containerAsBottomBarItem: BottomBarItem = js.native
  def containerAsDataViewActionButton: DataViewActionButton = js.native
  def containerAsDivContainer: DivContainer = js.native
  def containerAsDynamicImageViewer: DynamicImageViewer = js.native
  def containerAsGridActionButton: GridActionButton = js.native
  def containerAsListView: ListView = js.native
  def containerAsMenuItem: MenuItem = js.native
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  def containerAsStaticImageViewer: StaticImageViewer = js.native
  def containerAsTextBox: TextBox = js.native
  def containerAsWidgetValue: WidgetValue = js.native
  /**
    * In version 8.12.0: introduced
    */
  def disabledDuringExecution: Boolean = js.native
  def disabledDuringExecution_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
object ClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

