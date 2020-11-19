package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDataSet, name */ @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
@js.native
class DataSetParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def constraints: IList[DataSetParameterConstraint] = js.native
  
  def containerAsDataSet: DataSet = js.native
  @JSName("containerAsDataSet")
  val containerAsDataSet_FDataSetParameter: IDataSet = js.native
  
  @JSName("model")
  var model_FDataSetParameter: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FDataSetParameter: String = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def parameterTypeIsRange: Boolean = js.native
  def parameterTypeIsRange_=(newValue: Boolean): Unit = js.native
  
  def parameterType_=(newValue: DataType): Unit = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MDataSetParameter: String | Null = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
@js.native
object DataSetParameter extends js.Object {
  
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetParameter = js.native
  
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * The new DataSetParameter will be automatically stored in the 'parameters' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): DataSetParameter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
