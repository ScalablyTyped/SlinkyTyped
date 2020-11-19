package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionItem")
@js.native
abstract class ActionItem protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def action: ClientAction = js.native
  def action_=(newValue: ClientAction): Unit = js.native
  
  def containerAsDropDownButton: DropDownButton = js.native
  
  def containerAsNavigationList: NavigationList = js.native
  
  @JSName("model")
  var model_FActionItem: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ActionItem")
@js.native
object ActionItem extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
