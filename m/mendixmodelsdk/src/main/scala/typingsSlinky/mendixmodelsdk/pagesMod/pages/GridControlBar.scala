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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridControlBar")
@js.native
class GridControlBar protected () extends ControlBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def defaultButton: ControlBarItem | Null = js.native
  def defaultButton_=(newValue: ControlBarItem | Null): Unit = js.native
  
  @JSName("model")
  var model_FGridControlBar: IModel = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def searchButton: GridSearchButton = js.native
  def searchButton_=(newValue: GridSearchButton): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridControlBar")
@js.native
object GridControlBar extends js.Object {
  
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridControlBar = js.native
  
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * The new GridControlBar will be automatically stored in the 'controlBar' property
    * of the parent Grid element passed as argument.
    */
  def createIn(container: Grid): GridControlBar = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
