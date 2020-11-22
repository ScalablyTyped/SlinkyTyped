package typingsSlinky.mendixmodelsdk.baseModelMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IConsumedAppService
import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSet
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImageCollection
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaAction
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter
import typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptAction
import typingsSlinky.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptActionParameter
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure
import typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IConsumedKafkaService
import typingsSlinky.mendixmodelsdk.kafkaMod.kafka.IPublishedKafkaService
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typingsSlinky.mendixmodelsdk.menusMod.menus.IMenuDocument
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.INanoflowParameter
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IRule
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IRuleParameter
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.INativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.INativePage
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.INavigationDocument
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.INavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IBuildingBlock
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IFormBase
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ILayout
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ILayoutParameter
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPageTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ISnippet
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ITemplateFormBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolder
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProjectConversion
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProjectDocument
import typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression
import typingsSlinky.mendixmodelsdk.restMod.rest.IConsumedODataService
import typingsSlinky.mendixmodelsdk.restMod.rest.IPublishedODataService
import typingsSlinky.mendixmodelsdk.restMod.rest.IPublishedRestService
import typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleSecurity
import typingsSlinky.mendixmodelsdk.securityMod.security.IProjectSecurity
import typingsSlinky.mendixmodelsdk.securityMod.security.IUserRole
import typingsSlinky.mendixmodelsdk.settingsMod.settings.IProjectSettings
import typingsSlinky.mendixmodelsdk.textsMod.texts.ISystemTextCollection
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IPublishedAppService
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IPublishedServiceBase
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IPublishedWebService
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflow
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
- typingsSlinky.mendixmodelsdk.baseModelMod.IBaseModel because var conflicts: id, metaModelVersion, mxVersionForModel, workingCopy. Inlined createElement, allBuildingBlocks, allCodeActions, allConstants, allConsumedAppServices, allConsumedKafkaServices, allConsumedODataServices, allDataSets, allDocuments, allDocumentTemplates, allDomainModels, allEnumerations, allExportMappings, allFolders, allFolderBases, allFormBases, allImageCollections, allImportMappings, allImportedWebServices, allJavaActions, allJavaScriptActions, allJsonStructures, allLayouts, allMappingDocuments, allMenuDocuments, allMessageDefinitionCollections, allMicroflows, allMicroflowBases, allModules, allModuleDocuments, allModuleSecurities, allMxSchemas, allNanoflows, allNativeLayouts, allNativePages, allNavigationDocuments, allPages, allPageTemplates, allProjects, allProjectConversions, allProjectDocuments, allProjectSecurities, allProjectSettings, allPublishedAppServices, allPublishedKafkaServices, allPublishedODataServices, allPublishedRestServices, allPublishedServiceBases, allPublishedWebServices, allRegularExpressions, allRemoteEntitySourceDocuments, allRules, allScheduledEvents, allServerSideMicroflows, allSnippets, allSystemTextCollections, allTemplateFormBases, allWorkflows, allXmlSchemas, findAppServiceActionByQualifiedName, findAppServiceActionParameterByQualifiedName, findConstantByQualifiedName, findDataSetByQualifiedName, findDataSetParameterByQualifiedName, findDocumentTemplateByQualifiedName, findAssociationBaseByQualifiedName, findAttributeByQualifiedName, findEntityByQualifiedName, findRemoteEntitySourceDocumentByQualifiedName, findEnumerationByQualifiedName, findEnumerationValueByQualifiedName, findExportMappingByQualifiedName, findImageByQualifiedName, findImportMappingByQualifiedName, findJavaActionByQualifiedName, findJavaActionParameterByQualifiedName, findJavaScriptActionByQualifiedName, findJavaScriptActionParameterByQualifiedName, findJsonStructureByQualifiedName, findConsumedKafkaServiceByQualifiedName, findMenuDocumentByQualifiedName, findMessageDefinitionByQualifiedName, findMicroflowByQualifiedName, findMicroflowParameterByQualifiedName, findNanoflowByQualifiedName, findNanoflowParameterByQualifiedName, findRuleByQualifiedName, findRuleParameterByQualifiedName, findNativeLayoutByQualifiedName, findNativePageByQualifiedName, findNavigationProfileByQualifiedName, findLayoutByQualifiedName, findLayoutParameterByQualifiedName, findPageByQualifiedName, findSnippetByQualifiedName, findRegularExpressionByQualifiedName, findConsumedODataServiceByQualifiedName, findModuleRoleByQualifiedName, findUserRoleByQualifiedName, findImportedWebServiceByQualifiedName, findWorkflowByQualifiedName, findWorkflowTaskOutcomeByQualifiedName, findXmlSchemaByQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/base-model", "BaseModel")
@js.native
abstract class BaseModel () extends AbstractModel {
  
  def allBuildingBlocks(): js.Array[IBuildingBlock] = js.native
  
  def allCodeActions(): js.Array[ICodeAction] = js.native
  
  def allConstants(): js.Array[IConstant] = js.native
  
  def allConsumedAppServices(): js.Array[IConsumedAppService] = js.native
  
  def allConsumedKafkaServices(): js.Array[IConsumedKafkaService] = js.native
  
  def allConsumedODataServices(): js.Array[IConsumedODataService] = js.native
  
  def allDataSets(): js.Array[IDataSet] = js.native
  
  def allDocumentTemplates(): js.Array[IDocumentTemplate] = js.native
  
  def allDocuments(): js.Array[IDocument] = js.native
  
  def allDomainModels(): js.Array[IDomainModel] = js.native
  
  def allEnumerations(): js.Array[IEnumeration] = js.native
  
  def allExportMappings(): js.Array[IExportMapping] = js.native
  
  def allFolderBases(): js.Array[IFolderBase] = js.native
  
  def allFolders(): js.Array[IFolder] = js.native
  
  def allFormBases(): js.Array[IFormBase] = js.native
  
  def allImageCollections(): js.Array[IImageCollection] = js.native
  
  def allImportMappings(): js.Array[IImportMapping] = js.native
  
  def allImportedWebServices(): js.Array[IImportedWebService] = js.native
  
  def allJavaActions(): js.Array[IJavaAction] = js.native
  
  def allJavaScriptActions(): js.Array[IJavaScriptAction] = js.native
  
  def allJsonStructures(): js.Array[IJsonStructure] = js.native
  
  def allLayouts(): js.Array[ILayout] = js.native
  
  def allMappingDocuments(): js.Array[IMappingDocument] = js.native
  
  def allMenuDocuments(): js.Array[IMenuDocument] = js.native
  
  def allMessageDefinitionCollections(): js.Array[IMessageDefinitionCollection] = js.native
  
  def allMicroflowBases(): js.Array[IMicroflowBase] = js.native
  
  def allMicroflows(): js.Array[IMicroflow] = js.native
  
  def allModuleDocuments(): js.Array[IModuleDocument] = js.native
  
  def allModuleSecurities(): js.Array[IModuleSecurity] = js.native
  
  def allModules(): js.Array[IModule] = js.native
  
  def allMxSchemas(): js.Array[IMxSchema] = js.native
  
  def allNanoflows(): js.Array[INanoflow] = js.native
  
  def allNativeLayouts(): js.Array[INativeLayout] = js.native
  
  def allNativePages(): js.Array[INativePage] = js.native
  
  def allNavigationDocuments(): js.Array[INavigationDocument] = js.native
  
  def allPageTemplates(): js.Array[IPageTemplate] = js.native
  
  def allPages(): js.Array[IPage] = js.native
  
  def allProjectConversions(): js.Array[IProjectConversion] = js.native
  
  def allProjectDocuments(): js.Array[IProjectDocument] = js.native
  
  def allProjectSecurities(): js.Array[IProjectSecurity] = js.native
  
  def allProjectSettings(): js.Array[IProjectSettings] = js.native
  
  def allProjects(): js.Array[IProject] = js.native
  
  def allPublishedAppServices(): js.Array[IPublishedAppService] = js.native
  
  def allPublishedKafkaServices(): js.Array[IPublishedKafkaService] = js.native
  
  def allPublishedODataServices(): js.Array[IPublishedODataService] = js.native
  
  def allPublishedRestServices(): js.Array[IPublishedRestService] = js.native
  
  def allPublishedServiceBases(): js.Array[IPublishedServiceBase] = js.native
  
  def allPublishedWebServices(): js.Array[IPublishedWebService] = js.native
  
  def allRegularExpressions(): js.Array[IRegularExpression] = js.native
  
  def allRemoteEntitySourceDocuments(): js.Array[IRemoteEntitySourceDocument] = js.native
  
  def allRules(): js.Array[IRule] = js.native
  
  def allScheduledEvents(): js.Array[IScheduledEvent] = js.native
  
  def allServerSideMicroflows(): js.Array[IServerSideMicroflow] = js.native
  
  def allSnippets(): js.Array[ISnippet] = js.native
  
  def allSystemTextCollections(): js.Array[ISystemTextCollection] = js.native
  
  def allTemplateFormBases(): js.Array[ITemplateFormBase] = js.native
  
  def allWorkflows(): js.Array[IWorkflow] = js.native
  
  def allXmlSchemas(): js.Array[IXmlSchema] = js.native
  
  /**
    * Creates and returns a new element in the SDK and on the server.
    * After creation, assign or add this instance to a property that accepts this kind of elements.
    * @param typeName `structureTypeName` of the element type you want to create
    */
  def createElement[T /* <: /* keyof mendixmodelsdk.mendixmodelsdk/dist/gen/base-model.ConcreteModelElements */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 563 */ js.Any */](typeName: T): /* import warning: importer.ImportType#apply Failed type conversion: mendixmodelsdk.mendixmodelsdk/dist/gen/base-model.ConcreteModelElements[T] */ js.Any = js.native
  
  def findAppServiceActionByQualifiedName(qname: String): IAppServiceAction | Null = js.native
  
  def findAppServiceActionParameterByQualifiedName(qname: String): IAppServiceActionParameter | Null = js.native
  
  def findAssociationBaseByQualifiedName(qname: String): IAssociationBase | Null = js.native
  
  def findAttributeByQualifiedName(qname: String): IAttribute | Null = js.native
  
  def findConstantByQualifiedName(qname: String): IConstant | Null = js.native
  
  def findConsumedKafkaServiceByQualifiedName(qname: String): IConsumedKafkaService | Null = js.native
  
  def findConsumedODataServiceByQualifiedName(qname: String): IConsumedODataService | Null = js.native
  
  def findDataSetByQualifiedName(qname: String): IDataSet | Null = js.native
  
  def findDataSetParameterByQualifiedName(qname: String): IDataSetParameter | Null = js.native
  
  def findDocumentTemplateByQualifiedName(qname: String): IDocumentTemplate | Null = js.native
  
  def findEntityByQualifiedName(qname: String): IEntity | Null = js.native
  
  def findEnumerationByQualifiedName(qname: String): IEnumeration | Null = js.native
  
  def findEnumerationValueByQualifiedName(qname: String): IEnumerationValue | Null = js.native
  
  def findExportMappingByQualifiedName(qname: String): IExportMapping | Null = js.native
  
  def findImageByQualifiedName(qname: String): IImage | Null = js.native
  
  def findImportMappingByQualifiedName(qname: String): IImportMapping | Null = js.native
  
  def findImportedWebServiceByQualifiedName(qname: String): IImportedWebService | Null = js.native
  
  def findJavaActionByQualifiedName(qname: String): IJavaAction | Null = js.native
  
  def findJavaActionParameterByQualifiedName(qname: String): IJavaActionParameter | Null = js.native
  
  def findJavaScriptActionByQualifiedName(qname: String): IJavaScriptAction | Null = js.native
  
  def findJavaScriptActionParameterByQualifiedName(qname: String): IJavaScriptActionParameter | Null = js.native
  
  def findJsonStructureByQualifiedName(qname: String): IJsonStructure | Null = js.native
  
  def findLayoutByQualifiedName(qname: String): ILayout | Null = js.native
  
  def findLayoutParameterByQualifiedName(qname: String): ILayoutParameter | Null = js.native
  
  def findMenuDocumentByQualifiedName(qname: String): IMenuDocument | Null = js.native
  
  def findMessageDefinitionByQualifiedName(qname: String): IMessageDefinition | Null = js.native
  
  def findMicroflowByQualifiedName(qname: String): IMicroflow | Null = js.native
  
  def findMicroflowParameterByQualifiedName(qname: String): IMicroflowParameter | Null = js.native
  
  def findModuleRoleByQualifiedName(qname: String): IModuleRole | Null = js.native
  
  def findNanoflowByQualifiedName(qname: String): INanoflow | Null = js.native
  
  def findNanoflowParameterByQualifiedName(qname: String): INanoflowParameter | Null = js.native
  
  def findNativeLayoutByQualifiedName(qname: String): INativeLayout | Null = js.native
  
  def findNativePageByQualifiedName(qname: String): INativePage | Null = js.native
  
  def findNavigationProfileByQualifiedName(qname: String): INavigationProfile | Null = js.native
  
  def findPageByQualifiedName(qname: String): IPage | Null = js.native
  
  def findRegularExpressionByQualifiedName(qname: String): IRegularExpression | Null = js.native
  
  def findRemoteEntitySourceDocumentByQualifiedName(qname: String): IRemoteEntitySourceDocument | Null = js.native
  
  def findRuleByQualifiedName(qname: String): IRule | Null = js.native
  
  def findRuleParameterByQualifiedName(qname: String): IRuleParameter | Null = js.native
  
  def findSnippetByQualifiedName(qname: String): ISnippet | Null = js.native
  
  def findUserRoleByQualifiedName(qname: String): IUserRole | Null = js.native
  
  def findWorkflowByQualifiedName(qname: String): IWorkflow | Null = js.native
  
  def findWorkflowTaskOutcomeByQualifiedName(qname: String): IWorkflowTaskOutcome | Null = js.native
  
  def findXmlSchemaByQualifiedName(qname: String): IXmlSchema | Null = js.native
}
