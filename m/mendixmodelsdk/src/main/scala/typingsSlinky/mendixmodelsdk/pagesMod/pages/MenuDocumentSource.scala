package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.IMenuDocument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuDocumentSource")
@js.native
class MenuDocumentSource protected () extends MenuSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def menu: IMenuDocument | Null = js.native
  
  def menuQualifiedName: String | Null = js.native
  
  def menu_=(newValue: IMenuDocument | Null): Unit = js.native
  
  @JSName("model")
  var model_FMenuDocumentSource: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuDocumentSource")
@js.native
object MenuDocumentSource extends js.Object {
  
  /**
    * Creates and returns a new MenuDocumentSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MenuDocumentSource = js.native
  
  /**
    * Creates and returns a new MenuDocumentSource instance in the SDK and on the server.
    * The new MenuDocumentSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  def createIn(container: MenuWidget): MenuDocumentSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
