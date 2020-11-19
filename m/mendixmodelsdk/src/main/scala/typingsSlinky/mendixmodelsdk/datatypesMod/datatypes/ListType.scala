package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.Constant
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsSlinky.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ResultHandling
import typingsSlinky.mendixmodelsdk.restMod.rest.RestOperationParameter
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IDataType because Already inherited
- typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IEntityType because Already inherited
- typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IListType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, entity, entityQualifiedName, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.ListType")
@js.native
class ListType protected () extends EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MListType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MListType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MListType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MListType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MListType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MListType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MListType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MListType: MicroflowParameterBase = js.native
  
  @JSName("model")
  var model_FListType: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.ListType")
@js.native
object ListType extends js.Object {
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): ListType = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): ListType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
