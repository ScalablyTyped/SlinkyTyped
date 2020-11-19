package typingsSlinky.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Platform")
@js.native
class Platform protected () extends js.Object {
  def this(cluster: js.Any, `object`: js.Any) = this()
  
  def accessChecks(entries: js.Any, callback: js.Any): js.Any = js.native
  
  def accessLookups(entries: js.Any, callback: js.Any): js.Any = js.native
  
  def adminIndexDatastores(): js.Any = js.native
  
  def adminRepair(): js.Any = js.native
  
  def app(settings: js.Any, callback: js.Any): js.Any = js.native
  
  def assignAccessPolicy(accessPolicyId: js.Any, ref: js.Any): js.Any = js.native
  
  def authenticate(config: js.Any, authFailureHandler: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def checkApplicationAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkApplicationPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkAuthenticationGrantAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkAuthenticationGrantPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkBillingProviderConfigurationAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkBillingProviderConfigurationPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkClientAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkClientPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentPackageAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentPackagePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentReceiverAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentReceiverPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentStrategyAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentStrategyPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentTargetAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDeploymentTargetPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDirectoryAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDirectoryPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDomainAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkDomainPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkProjectAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkProjectPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRegistrarAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRegistrarPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkReportAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkReportPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRepositoryAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkRepositoryPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkScheduledWorkAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkScheduledWorkPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkServiceDescriptorAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkServiceDescriptorPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkStackAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkStackPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkUIConfigAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkUIConfigPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkVaultAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkVaultPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkViewAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkViewPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWebHostAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWebHostPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowCommentAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowCommentPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowInstanceAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowInstancePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowModelAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowModelPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowTaskAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkWorkflowTaskPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def createAccessPolicy(`object`: js.Any): js.Any = js.native
  
  def createApplication(`object`: js.Any): js.Any = js.native
  
  def createAuthenticationGrant(`object`: js.Any): js.Any = js.native
  
  def createBillingProviderConfiguration(providerId: js.Any, `object`: js.Any): js.Any = js.native
  
  def createClient(`object`: js.Any): js.Any = js.native
  
  def createDeploymentReceiver(`object`: js.Any): js.Any = js.native
  
  def createDeploymentStrategy(`object`: js.Any): js.Any = js.native
  
  def createDeploymentTarget(`object`: js.Any): js.Any = js.native
  
  def createDirectory(`object`: js.Any): js.Any = js.native
  
  def createDomain(`object`: js.Any): js.Any = js.native
  
  def createLogEntry(message: js.Any, level: js.Any, obj: js.Any): js.Any = js.native
  
  def createProject(`object`: js.Any): js.Any = js.native
  
  def createRegistrar(`object`: js.Any): js.Any = js.native
  
  def createReport(`object`: js.Any): js.Any = js.native
  
  def createRepository(`object`: js.Any): js.Any = js.native
  
  def createScheduledWorkItem(`object`: js.Any): js.Any = js.native
  
  def createServiceDescriptor(`object`: js.Any): js.Any = js.native
  
  def createStack(`object`: js.Any): js.Any = js.native
  
  def createUIConfig(`object`: js.Any): js.Any = js.native
  
  def createVault(`object`: js.Any): js.Any = js.native
  
  def createView(`object`: js.Any): js.Any = js.native
  
  def createWebHost(`object`: js.Any): js.Any = js.native
  
  def createWorkflow(workflowModelId: js.Any, `object`: js.Any): js.Any = js.native
  
  def createWorkflowComment(workflowId: js.Any, workflowTaskId: js.Any, `object`: js.Any): js.Any = js.native
  
  def createWorkflowModel(id: js.Any, `object`: js.Any): js.Any = js.native
  
  def del(): js.Any = js.native
  
  def executeReport(reportId: js.Any, config: js.Any, pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def exportDownloadUrl(exportId: js.Any, index: js.Any, useDispositionHeader: js.Any): js.Any = js.native
  
  def findAccessPolicies(ref: js.Any, pagination: js.Any): js.Any = js.native
  
  def findStackForDataStore(datastoreType: js.Any, datastoreId: js.Any): js.Any = js.native
  
  def getPlatform(): js.Any = js.native
  
  def getTenantPreviewUri(name: js.Any, config: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listAccessPolicies(pagination: js.Any): js.Any = js.native
  
  def listAccessPolicyTargets(accessPolicyId: js.Any, pagination: js.Any): js.Any = js.native
  
  def listAllWorkflowModels(pagination: js.Any): js.Any = js.native
  
  def listApplicationTypes(pagination: js.Any): js.Any = js.native
  
  def listApplications(pagination: js.Any): js.Any = js.native
  
  def listBillingProviderConfigurations(pagination: js.Any): js.Any = js.native
  
  def listClients(pagination: js.Any): js.Any = js.native
  
  def listDeploymentPackages(pagination: js.Any): js.Any = js.native
  
  def listDeploymentReceivers(pagination: js.Any): js.Any = js.native
  
  def listDeploymentStrategies(pagination: js.Any): js.Any = js.native
  
  def listDeploymentTargets(pagination: js.Any): js.Any = js.native
  
  def listDirectories(pagination: js.Any): js.Any = js.native
  
  def listDomains(pagination: js.Any): js.Any = js.native
  
  def listProjectTypes(pagination: js.Any): js.Any = js.native
  
  def listProjects(pagination: js.Any): js.Any = js.native
  
  def listRegistrars(pagination: js.Any): js.Any = js.native
  
  def listReports(pagination: js.Any): js.Any = js.native
  
  def listRepositories(pagination: js.Any): js.Any = js.native
  
  def listRuleActions(pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def listRuleConditions(pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def listScheduledWorkItems(pagination: js.Any): js.Any = js.native
  
  def listServiceDescriptors(pagination: js.Any): js.Any = js.native
  
  def listStacks(pagination: js.Any): js.Any = js.native
  
  def listTasksForCurrentUser(filter: js.Any, pagination: js.Any): js.Any = js.native
  
  def listTenantAttachments(): js.Any = js.native
  
  def listUIConfigs(pagination: js.Any): js.Any = js.native
  
  def listVaults(pagination: js.Any): js.Any = js.native
  
  def listViews(pagination: js.Any): js.Any = js.native
  
  def listWebHosts(pagination: js.Any): js.Any = js.native
  
  def listWorkflowComments(pagination: js.Any): js.Any = js.native
  
  def listWorkflowModelVersions(id: js.Any, pagination: js.Any): js.Any = js.native
  
  def listWorkflowModels(pagination: js.Any): js.Any = js.native
  
  def listWorkflowTasks(pagination: js.Any): js.Any = js.native
  
  def listWorkflows(pagination: js.Any): js.Any = js.native
  
  def loadInfo(callback: js.Any): js.Any = js.native
  
  def loadWorkflowHistory(workflowId: js.Any, pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def logout(expireAccessToken: js.Any): js.Any = js.native
  
  def postLogEntry(message: js.Any, level: js.Any, obj: js.Any): js.Any = js.native
  
  def queryAccessPolicies(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryAllWorkflowModels(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryApplications(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryAuthenticationGrants(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryBillingProviderConfigurations(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryClients(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDeploymentPackages(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDeploymentReceivers(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDeploymentStrategies(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDeploymentTargets(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDirectories(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryDomains(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryLogEntries(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryProjects(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryRegistrars(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryReports(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryRepositories(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryScheduledWorkItems(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryServiceDescriptors(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryStacks(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryTasks(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryTasksForCurrentUser(filter: js.Any, query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryUIConfigs(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryVaults(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryViews(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWebHosts(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWorkflowComments(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWorkflowModelVersions(id: js.Any, query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWorkflowModels(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWorkflowTasks(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryWorkflows(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def readAccessPolicy(accessPolicyId: js.Any): js.Any = js.native
  
  def readApplication(applicationId: js.Any): js.Any = js.native
  
  def readAuthenticationGrant(authenticationGrantId: js.Any): js.Any = js.native
  
  def readBillingProviderConfiguration(billingProviderConfigurationId: js.Any): js.Any = js.native
  
  def readClient(clientId: js.Any): js.Any = js.native
  
  def readCluster(): js.Any = js.native
  
  def readDeploymentPackage(deploymentPackageId: js.Any): js.Any = js.native
  
  def readDeploymentReceiver(deploymentReceiverId: js.Any): js.Any = js.native
  
  def readDeploymentStrategy(deploymentStrategyId: js.Any): js.Any = js.native
  
  def readDeploymentTarget(deploymentTargetId: js.Any): js.Any = js.native
  
  def readDirectory(directoryId: js.Any): js.Any = js.native
  
  def readDomain(domainId: js.Any): js.Any = js.native
  
  def readExportStatus(exportId: js.Any, callback: js.Any): js.Any = js.native
  
  def readLog(callback: js.Any): js.Any = js.native
  
  def readLogEntry(logEntryId: js.Any): js.Any = js.native
  
  def readPrimaryDomain(): js.Any = js.native
  
  def readProject(projectId: js.Any): js.Any = js.native
  
  def readRegistrar(registrarId: js.Any): js.Any = js.native
  
  def readReport(reportId: js.Any): js.Any = js.native
  
  def readRepository(repositoryId: js.Any): js.Any = js.native
  
  def readRuleAction(actionId: js.Any, callback: js.Any): js.Any = js.native
  
  def readRuleCondition(conditionId: js.Any, callback: js.Any): js.Any = js.native
  
  def readScheduledWorkItem(scheduledWorkId: js.Any): js.Any = js.native
  
  def readServiceDescriptor(descriptorId: js.Any): js.Any = js.native
  
  def readStack(stackId: js.Any): js.Any = js.native
  
  def readUIConfig(uiConfigId: js.Any): js.Any = js.native
  
  def readVault(vaultId: js.Any): js.Any = js.native
  
  def readView(viewId: js.Any): js.Any = js.native
  
  def readWebHost(webhostId: js.Any): js.Any = js.native
  
  def readWorkflow(workflowId: js.Any): js.Any = js.native
  
  def readWorkflowComment(workflowCommentId: js.Any): js.Any = js.native
  
  def readWorkflowModel(workflowModelId: js.Any, workflowModelVersionId: js.Any): js.Any = js.native
  
  def readWorkflowTask(workflowTaskId: js.Any): js.Any = js.native
  
  def referenceDiff(sourceRef: js.Any, targetRef: js.Any, callback: js.Any): js.Any = js.native
  
  def referenceMerge(sourceRef: js.Any, diffObject: js.Any, callback: js.Any): js.Any = js.native
  
  def referenceReads(entries: js.Any, callback: js.Any): js.Any = js.native
  
  def reload(): js.Any = js.native
  
  def runExport(objects: js.Any, configuration: js.Any, callback: js.Any): js.Any = js.native
  
  def startCreateProject(`object`: js.Any, params: js.Any, callback: js.Any): js.Any = js.native
  
  def tenantAttach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  
  def tenantAttachment(attachmentId: js.Any): js.Any = js.native
  
  def tenantUnattach(attachmentId: js.Any): js.Any = js.native
  
  def unassignAccessPolicy(accessPolicyId: js.Any, ref: js.Any): js.Any = js.native
  
  def unassignAllAccessPolicies(ref: js.Any): js.Any = js.native
  
  def update(): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Platform")
@js.native
object Platform extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
