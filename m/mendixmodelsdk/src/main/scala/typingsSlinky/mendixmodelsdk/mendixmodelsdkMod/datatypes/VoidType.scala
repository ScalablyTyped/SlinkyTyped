package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.datatypes

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction
import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenConstantsMod.constants.Constant
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter
import typingsSlinky.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterBase
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterObject
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling
import typingsSlinky.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedOperation
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "datatypes.VoidType")
@js.native
class VoidType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.datatypes.VoidType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "datatypes.VoidType")
@js.native
object VoidType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): typingsSlinky.mendixmodelsdk.distGenDatatypesMod.datatypes.VoidType = js.native
}

