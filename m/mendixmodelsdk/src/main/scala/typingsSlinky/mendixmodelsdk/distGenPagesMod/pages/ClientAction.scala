package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  val containerAsActionButton: ActionButton = js.native
  val containerAsActionItem: ActionItem = js.native
  val containerAsAssociationWidget: AssociationWidget = js.native
  val containerAsAttributeWidget: AttributeWidget = js.native
  val containerAsBottomBarItem: BottomBarItem = js.native
  val containerAsDataViewActionButton: DataViewActionButton = js.native
  val containerAsDivContainer: DivContainer = js.native
  val containerAsDynamicImageViewer: DynamicImageViewer = js.native
  val containerAsGridActionButton: GridActionButton = js.native
  val containerAsListView: ListView = js.native
  val containerAsMenuItem: MenuItem = js.native
  val containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  val containerAsStaticImageViewer: StaticImageViewer = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  @JSName("model")
  var model_ClientAction: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
object ClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

