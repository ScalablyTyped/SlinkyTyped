package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import org.scalablytyped.runtime.StObject
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
- typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IFloatType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType")
@js.native
class FloatType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MFloatType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MFloatType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MFloatType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MFloatType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MFloatType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MFloatType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MFloatType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MFloatType: MicroflowParameterBase = js.native
}
object FloatType {
  
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.create")
  @js.native
  def create(model: IModel): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInAppServiceActionParameterUnderParameterType")
  @js.native
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInAppServiceActionUnderActionReturnType")
  @js.native
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInConstantUnderType")
  @js.native
  def createInConstantUnderType(container: Constant): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInCreateVariableActionUnderVariableType")
  @js.native
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInDataSetColumnUnderColumnType")
  @js.native
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInDataSetParameterUnderParameterType")
  @js.native
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInDocumentTemplateParameterUnderParameterType")
  @js.native
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInImportMappingUnderParameterType")
  @js.native
  def createInImportMappingUnderParameterType(container: ImportMapping): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInMicroflowBaseUnderMicroflowReturnType")
  @js.native
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInMicroflowParameterBaseUnderParameterType")
  @js.native
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInMicroflowParameterObjectUnderVariableType")
  @js.native
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInPublishedOperationUnderOperationReturnType")
  @js.native
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInPublishedParameterUnderParameterType")
  @js.native
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInRestOperationParameterUnderType")
  @js.native
  def createInRestOperationParameterUnderType(container: RestOperationParameter): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInResultHandlingUnderVariableType")
  @js.native
  def createInResultHandlingUnderVariableType(container: ResultHandling): FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.createInValueMappingElementUnderType")
  @js.native
  def createInValueMappingElementUnderType(container: ValueMappingElement): FloatType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
