package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/base-model", JSImport.Namespace)
@js.native
object baseModelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typingsSlinky.mendixmodelsdk.baseModelMod.IBaseModel because var conflicts: id, metaModelVersion, mxVersionForModel, workingCopy. Inlined allBuildingBlocks, allCodeActions, allConstants, allConsumedAppServices, allConsumedODataServices, allDataSets, allDocuments, allDocumentTemplates, allDomainModels, allEnumerations, allExportMappings, allFolders, allFolderBases, allFormBases, allImageCollections, allImportMappings, allImportedWebServices, allJavaActions, allJavaScriptActions, allJsonStructures, allLayouts, allMappingDocuments, allMenuDocuments, allMessageDefinitionCollections, allMicroflows, allMicroflowBases, allModules, allModuleDocuments, allModuleSecurities, allMxSchemas, allNanoflows, allNativeLayouts, allNativePages, allNavigationDocuments, allPages, allPageTemplates, allProjects, allProjectConversions, allProjectDocuments, allProjectSecurities, allProjectSettings, allPublishedAppServices, allPublishedODataServices, allPublishedRestServices, allPublishedServiceBases, allPublishedWebServices, allRegularExpressions, allRemoteEntitySourceDocuments, allRules, allScheduledEvents, allServerSideMicroflows, allSnippets, allSystemTextCollections, allTemplateFormBases, allXmlSchemas, findAppServiceActionByQualifiedName, findAppServiceActionParameterByQualifiedName, findConstantByQualifiedName, findDataSetByQualifiedName, findDataSetParameterByQualifiedName, findDocumentTemplateByQualifiedName, findAssociationBaseByQualifiedName, findAttributeByQualifiedName, findEntityByQualifiedName, findRemoteEntitySourceDocumentByQualifiedName, findEnumerationByQualifiedName, findEnumerationValueByQualifiedName, findExportMappingByQualifiedName, findImageByQualifiedName, findImportMappingByQualifiedName, findJavaActionByQualifiedName, findJavaActionParameterByQualifiedName, findJavaScriptActionByQualifiedName, findJavaScriptActionParameterByQualifiedName, findJsonStructureByQualifiedName, findMenuDocumentByQualifiedName, findMessageDefinitionByQualifiedName, findMicroflowByQualifiedName, findMicroflowParameterByQualifiedName, findNanoflowByQualifiedName, findNanoflowParameterByQualifiedName, findRuleByQualifiedName, findRuleParameterByQualifiedName, findNativeLayoutByQualifiedName, findNativePageByQualifiedName, findNavigationProfileByQualifiedName, findLayoutByQualifiedName, findLayoutParameterByQualifiedName, findPageByQualifiedName, findSnippetByQualifiedName, findRegularExpressionByQualifiedName, findModuleRoleByQualifiedName, findUserRoleByQualifiedName, findImportedWebServiceByQualifiedName, findXmlSchemaByQualifiedName */ @js.native
  abstract class BaseModel () extends AbstractModel {
    def allBuildingBlocks(): js.Array[IBuildingBlock] = js.native
    def allCodeActions(): js.Array[ICodeAction] = js.native
    def allConstants(): js.Array[IConstant] = js.native
    def allConsumedAppServices(): js.Array[IConsumedAppService] = js.native
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
    def allXmlSchemas(): js.Array[IXmlSchema] = js.native
    def findAppServiceActionByQualifiedName(qname: String): IAppServiceAction = js.native
    def findAppServiceActionParameterByQualifiedName(qname: String): IAppServiceActionParameter = js.native
    def findAssociationBaseByQualifiedName(qname: String): IAssociationBase = js.native
    def findAttributeByQualifiedName(qname: String): IAttribute = js.native
    def findConstantByQualifiedName(qname: String): IConstant = js.native
    def findDataSetByQualifiedName(qname: String): IDataSet = js.native
    def findDataSetParameterByQualifiedName(qname: String): IDataSetParameter = js.native
    def findDocumentTemplateByQualifiedName(qname: String): IDocumentTemplate = js.native
    def findEntityByQualifiedName(qname: String): IEntity = js.native
    def findEnumerationByQualifiedName(qname: String): IEnumeration = js.native
    def findEnumerationValueByQualifiedName(qname: String): IEnumerationValue = js.native
    def findExportMappingByQualifiedName(qname: String): IExportMapping = js.native
    def findImageByQualifiedName(qname: String): IImage = js.native
    def findImportMappingByQualifiedName(qname: String): IImportMapping = js.native
    def findImportedWebServiceByQualifiedName(qname: String): IImportedWebService = js.native
    def findJavaActionByQualifiedName(qname: String): IJavaAction = js.native
    def findJavaActionParameterByQualifiedName(qname: String): IJavaActionParameter = js.native
    def findJavaScriptActionByQualifiedName(qname: String): IJavaScriptAction = js.native
    def findJavaScriptActionParameterByQualifiedName(qname: String): IJavaScriptActionParameter = js.native
    def findJsonStructureByQualifiedName(qname: String): IJsonStructure = js.native
    def findLayoutByQualifiedName(qname: String): ILayout = js.native
    def findLayoutParameterByQualifiedName(qname: String): ILayoutParameter = js.native
    def findMenuDocumentByQualifiedName(qname: String): IMenuDocument = js.native
    def findMessageDefinitionByQualifiedName(qname: String): IMessageDefinition = js.native
    def findMicroflowByQualifiedName(qname: String): IMicroflow = js.native
    def findMicroflowParameterByQualifiedName(qname: String): IMicroflowParameter = js.native
    def findModuleRoleByQualifiedName(qname: String): IModuleRole = js.native
    def findNanoflowByQualifiedName(qname: String): INanoflow = js.native
    def findNanoflowParameterByQualifiedName(qname: String): INanoflowParameter = js.native
    def findNativeLayoutByQualifiedName(qname: String): INativeLayout = js.native
    def findNativePageByQualifiedName(qname: String): INativePage = js.native
    def findNavigationProfileByQualifiedName(qname: String): INavigationProfile = js.native
    def findPageByQualifiedName(qname: String): IPage = js.native
    def findRegularExpressionByQualifiedName(qname: String): IRegularExpression = js.native
    def findRemoteEntitySourceDocumentByQualifiedName(qname: String): IRemoteEntitySourceDocument = js.native
    def findRuleByQualifiedName(qname: String): IRule = js.native
    def findRuleParameterByQualifiedName(qname: String): IRuleParameter = js.native
    def findSnippetByQualifiedName(qname: String): ISnippet = js.native
    def findUserRoleByQualifiedName(qname: String): IUserRole = js.native
    def findXmlSchemaByQualifiedName(qname: String): IXmlSchema = js.native
  }
  
  @js.native
  trait IBaseModel extends IAbstractModel {
    def allBuildingBlocks(): js.Array[IBuildingBlock] = js.native
    def allCodeActions(): js.Array[ICodeAction] = js.native
    def allConstants(): js.Array[IConstant] = js.native
    def allConsumedAppServices(): js.Array[IConsumedAppService] = js.native
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
    def allXmlSchemas(): js.Array[IXmlSchema] = js.native
    def findAppServiceActionByQualifiedName(qname: String): IAppServiceAction = js.native
    def findAppServiceActionParameterByQualifiedName(qname: String): IAppServiceActionParameter = js.native
    def findAssociationBaseByQualifiedName(qname: String): IAssociationBase = js.native
    def findAttributeByQualifiedName(qname: String): IAttribute = js.native
    def findConstantByQualifiedName(qname: String): IConstant = js.native
    def findDataSetByQualifiedName(qname: String): IDataSet = js.native
    def findDataSetParameterByQualifiedName(qname: String): IDataSetParameter = js.native
    def findDocumentTemplateByQualifiedName(qname: String): IDocumentTemplate = js.native
    def findEntityByQualifiedName(qname: String): IEntity = js.native
    def findEnumerationByQualifiedName(qname: String): IEnumeration = js.native
    def findEnumerationValueByQualifiedName(qname: String): IEnumerationValue = js.native
    def findExportMappingByQualifiedName(qname: String): IExportMapping = js.native
    def findImageByQualifiedName(qname: String): IImage = js.native
    def findImportMappingByQualifiedName(qname: String): IImportMapping = js.native
    def findImportedWebServiceByQualifiedName(qname: String): IImportedWebService = js.native
    def findJavaActionByQualifiedName(qname: String): IJavaAction = js.native
    def findJavaActionParameterByQualifiedName(qname: String): IJavaActionParameter = js.native
    def findJavaScriptActionByQualifiedName(qname: String): IJavaScriptAction = js.native
    def findJavaScriptActionParameterByQualifiedName(qname: String): IJavaScriptActionParameter = js.native
    def findJsonStructureByQualifiedName(qname: String): IJsonStructure = js.native
    def findLayoutByQualifiedName(qname: String): ILayout = js.native
    def findLayoutParameterByQualifiedName(qname: String): ILayoutParameter = js.native
    def findMenuDocumentByQualifiedName(qname: String): IMenuDocument = js.native
    def findMessageDefinitionByQualifiedName(qname: String): IMessageDefinition = js.native
    def findMicroflowByQualifiedName(qname: String): IMicroflow = js.native
    def findMicroflowParameterByQualifiedName(qname: String): IMicroflowParameter = js.native
    def findModuleRoleByQualifiedName(qname: String): IModuleRole = js.native
    def findNanoflowByQualifiedName(qname: String): INanoflow = js.native
    def findNanoflowParameterByQualifiedName(qname: String): INanoflowParameter = js.native
    def findNativeLayoutByQualifiedName(qname: String): INativeLayout = js.native
    def findNativePageByQualifiedName(qname: String): INativePage = js.native
    def findNavigationProfileByQualifiedName(qname: String): INavigationProfile = js.native
    def findPageByQualifiedName(qname: String): IPage = js.native
    def findRegularExpressionByQualifiedName(qname: String): IRegularExpression = js.native
    def findRemoteEntitySourceDocumentByQualifiedName(qname: String): IRemoteEntitySourceDocument = js.native
    def findRuleByQualifiedName(qname: String): IRule = js.native
    def findRuleParameterByQualifiedName(qname: String): IRuleParameter = js.native
    def findSnippetByQualifiedName(qname: String): ISnippet = js.native
    def findUserRoleByQualifiedName(qname: String): IUserRole = js.native
    def findXmlSchemaByQualifiedName(qname: String): IXmlSchema = js.native
  }
  
  @js.native
  trait IModel extends IBaseModel {
    /**
      * The actual contents of the model.
      */
    var root: IProject = js.native
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qualifiedName: String): IModule | Null = js.native
  }
  
}

