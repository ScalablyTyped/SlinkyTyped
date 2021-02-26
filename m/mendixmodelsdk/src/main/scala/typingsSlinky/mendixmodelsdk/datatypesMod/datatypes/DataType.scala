package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.Constant
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typingsSlinky.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling
import typingsSlinky.mendixmodelsdk.restMod.rest.RestOperationParameter
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
abstract class DataType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAppServiceAction: AppServiceAction = js.native
  
  def containerAsAppServiceActionParameter: AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceActionParameter")
  val containerAsAppServiceActionParameter_FDataType: IAppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FDataType: IAppServiceAction = js.native
  
  def containerAsConstant: Constant = js.native
  @JSName("containerAsConstant")
  val containerAsConstant_FDataType: IConstant = js.native
  
  def containerAsCreateVariableAction: CreateVariableAction = js.native
  
  def containerAsDataSetColumn: DataSetColumn = js.native
  
  def containerAsDataSetParameter: DataSetParameter = js.native
  @JSName("containerAsDataSetParameter")
  val containerAsDataSetParameter_FDataType: IDataSetParameter = js.native
  
  def containerAsDocumentTemplateParameter: DocumentTemplateParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  val containerAsDocumentTemplateParameter_FDataType: IDocumentTemplateParameter = js.native
  
  def containerAsImportMapping: ImportMapping = js.native
  @JSName("containerAsImportMapping")
  val containerAsImportMapping_FDataType: IImportMapping = js.native
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  @JSName("containerAsMicroflowBase")
  val containerAsMicroflowBase_FDataType: IMicroflowBase = js.native
  
  def containerAsMicroflowParameterBase: MicroflowParameterBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  val containerAsMicroflowParameterBase_FDataType: IMicroflowParameterBase = js.native
  
  def containerAsMicroflowParameterObject: MicroflowParameterObject = js.native
  
  def containerAsPublishedOperation: PublishedOperation = js.native
  
  def containerAsPublishedParameter: PublishedParameter = js.native
  
  def containerAsRestOperationParameter: RestOperationParameter = js.native
  
  def containerAsResultHandling: ResultHandling = js.native
  
  def containerAsValueMappingElement: ValueMappingElement = js.native
}
object DataType {
  
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
