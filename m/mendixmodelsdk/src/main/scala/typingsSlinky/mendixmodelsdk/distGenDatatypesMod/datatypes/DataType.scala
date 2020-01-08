package typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction
import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter
import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction
import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceActionParameter
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenConstantsMod.constants.Constant
import typingsSlinky.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSetParameter
import typingsSlinky.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameterBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterObject
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling
import typingsSlinky.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedOperation
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
abstract class DataType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsAppServiceActionParameter")
  val containerAsAppServiceActionParameter_FDataType: IAppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FDataType: IAppServiceAction = js.native
  @JSName("containerAsConstant")
  val containerAsConstant_FDataType: IConstant = js.native
  @JSName("containerAsDataSetParameter")
  val containerAsDataSetParameter_FDataType: IDataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  val containerAsDocumentTemplateParameter_FDataType: IDocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  val containerAsImportMapping_FDataType: IImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  val containerAsMicroflowBase_FDataType: IMicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  val containerAsMicroflowParameterBase_FDataType: IMicroflowParameterBase = js.native
  @JSName("model")
  var model_FDataType: IModel = js.native
  def containerAsAppServiceAction(): AppServiceAction = js.native
  def containerAsAppServiceActionParameter(): AppServiceActionParameter = js.native
  def containerAsConstant(): Constant = js.native
  def containerAsCreateVariableAction(): CreateVariableAction = js.native
  def containerAsDataSetColumn(): DataSetColumn = js.native
  def containerAsDataSetParameter(): DataSetParameter = js.native
  def containerAsDocumentTemplateParameter(): DocumentTemplateParameter = js.native
  def containerAsImportMapping(): ImportMapping = js.native
  def containerAsMicroflowBase(): MicroflowBase = js.native
  def containerAsMicroflowParameterBase(): MicroflowParameterBase = js.native
  def containerAsMicroflowParameterObject(): MicroflowParameterObject = js.native
  def containerAsPublishedOperation(): PublishedOperation = js.native
  def containerAsPublishedParameter(): PublishedParameter = js.native
  def containerAsRestOperationParameter(): RestOperationParameter = js.native
  def containerAsResultHandling(): ResultHandling = js.native
  def containerAsValueMappingElement(): ValueMappingElement = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
object DataType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

