package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridAddButton")
@js.native
class DataGridAddButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FDataGridAddButton: IModel = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridAddButton")
@js.native
object DataGridAddButton extends js.Object {
  
  /**
    * Creates and returns a new DataGridAddButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataGridAddButton = js.native
  
  /**
    * Creates and returns a new DataGridAddButton instance in the SDK and on the server.
    * The new DataGridAddButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): DataGridAddButton = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
