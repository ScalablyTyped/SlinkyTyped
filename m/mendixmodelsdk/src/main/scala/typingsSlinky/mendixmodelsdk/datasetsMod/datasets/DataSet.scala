package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSet because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined parameters */ @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet")
@js.native
class DataSet protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MDataSet: FolderBase = js.native
  
  def dataSetAccess: DataSetAccess = js.native
  def dataSetAccess_=(newValue: DataSetAccess): Unit = js.native
  
  @JSName("model")
  var model_FDataSet: IModel = js.native
  
  def parameters: IList[DataSetParameter] = js.native
  @JSName("parameters")
  val parameters_FDataSet: IList[IDataSetParameter] = js.native
  
  def source: DataSetSource = js.native
  def source_=(newValue: DataSetSource): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet")
@js.native
object DataSet extends js.Object {
  
  /**
    * Creates a new DataSet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): DataSet = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
