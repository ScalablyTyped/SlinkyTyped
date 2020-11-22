package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
@js.native
class JavaDataSetSource protected () extends DataSetSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def columns: IList[DataSetColumn] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def useLegacyCodeGeneration: Boolean = js.native
  def useLegacyCodeGeneration_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
@js.native
object JavaDataSetSource extends js.Object {
  
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaDataSetSource = js.native
  
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * The new JavaDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): JavaDataSetSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
