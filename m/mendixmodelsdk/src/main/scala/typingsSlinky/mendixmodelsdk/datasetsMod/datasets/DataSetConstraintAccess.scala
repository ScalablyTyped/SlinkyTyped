package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
@js.native
class DataSetConstraintAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def constraintText: String = js.native
  def constraintText_=(newValue: String): Unit = js.native
  
  def containerAsDataSetParameterAccess: DataSetParameterAccess = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FDataSetConstraintAccess: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
@js.native
object DataSetConstraintAccess extends js.Object {
  
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetConstraintAccess = js.native
  
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
    * of the parent DataSetParameterAccess element passed as argument.
    */
  def createIn(container: DataSetParameterAccess): DataSetConstraintAccess = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
