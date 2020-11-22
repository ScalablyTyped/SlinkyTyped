package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.AccesstokenAltCallback
import typingsSlinky.maximMazurokGapiClientContainer.anon.AltCallbackClusterId
import typingsSlinky.maximMazurokGapiClientContainer.anon.AltCallbackFields
import typingsSlinky.maximMazurokGapiClientContainer.anon.Callback
import typingsSlinky.maximMazurokGapiClientContainer.anon.CallbackClusterIdFields
import typingsSlinky.maximMazurokGapiClientContainer.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientContainer.anon.CallbackFieldsKey
import typingsSlinky.maximMazurokGapiClientContainer.anon.ClusterIdFields
import typingsSlinky.maximMazurokGapiClientContainer.anon.ClusterIdFieldsKey
import typingsSlinky.maximMazurokGapiClientContainer.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientContainer.anon.FieldsKeyName
import typingsSlinky.maximMazurokGapiClientContainer.anon.FieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.KeyName
import typingsSlinky.maximMazurokGapiClientContainer.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.KeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientContainer.anon.Name
import typingsSlinky.maximMazurokGapiClientContainer.anon.NameOauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.OauthtokenParent
import typingsSlinky.maximMazurokGapiClientContainer.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientContainer.anon.OauthtokenPrettyPrintProjectId
import typingsSlinky.maximMazurokGapiClientContainer.anon.PrettyPrintProjectId
import typingsSlinky.maximMazurokGapiClientContainer.anon.PrettyPrintProjectIdQuotaUser
import typingsSlinky.maximMazurokGapiClientContainer.anon.PrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientContainer.anon.ProjectIdQuotaUser
import typingsSlinky.maximMazurokGapiClientContainer.anon.ProjectIdQuotaUserResource
import typingsSlinky.maximMazurokGapiClientContainer.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientContainer.anon.QuotaUserResourceUploadType
import typingsSlinky.maximMazurokGapiClientContainer.anon.QuotaUserUploadType
import typingsSlinky.maximMazurokGapiClientContainer.anon.ResourceUploadType
import typingsSlinky.maximMazurokGapiClientContainer.anon.ResourceUploadTypeUploadprotocol
import typingsSlinky.maximMazurokGapiClientContainer.anon.UploadTypeUploadprotocol
import typingsSlinky.maximMazurokGapiClientContainer.anon.UploadTypeUploadprotocolXgafv
import typingsSlinky.maximMazurokGapiClientContainer.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientContainer.anon.UploadprotocolXgafv
import typingsSlinky.maximMazurokGapiClientContainer.anon.UploadprotocolXgafvZone
import typingsSlinky.maximMazurokGapiClientContainer.anon.XgafvZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends js.Object {
  
  /** Sets the addons for a specific cluster. */
  def addons(request: PrettyPrintProjectId): Request[Operation] = js.native
  def addons(request: Uploadprotocol, body: SetAddonsConfigRequest): Request[Operation] = js.native
  
  /** Completes master IP rotation. */
  def completeIpRotation(request: CallbackFields): Request[Operation] = js.native
  def completeIpRotation(request: Name, body: CompleteIPRotationRequest): Request[Operation] = js.native
  /** Completes master IP rotation. */
  def completeIpRotation(request: ProjectIdQuotaUser): Request[Operation] = js.native
  def completeIpRotation(request: Uploadprotocol, body: CompleteIPRotationRequest): Request[Operation] = js.native
  
  def create(request: Callback, body: CreateClusterRequest): Request[Operation] = js.native
  /**
    * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default
    * network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each
    * node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR
    * range the cluster is using.
    */
  def create(request: FieldsKey): Request[Operation] = js.native
  def create(request: QuotaUserUploadType, body: CreateClusterRequest): Request[Operation] = js.native
  /**
    * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default
    * network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each
    * node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR
    * range the cluster is using.
    */
  def create(request: XgafvZone): Request[Operation] = js.native
  
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker nodes. Firewalls and routes that were configured during cluster creation are also deleted. Other Google Compute
    * Engine resources that might be in use by the cluster, such as load balancer resources, are not deleted if they weren't present when the cluster was initially created.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: AltCallbackClusterId): Request[Operation] = js.native
  def delete(request: ClusterIdFields): Request[Operation] = js.native
  
  /** Gets the details of a specific cluster. */
  def get(): Request[Cluster] = js.native
  def get(request: AltCallbackClusterId): Request[Cluster] = js.native
  def get(request: ClusterIdFields): Request[Cluster] = js.native
  
  /** Gets the public component of the cluster signing keys in JSON Web Key format. This API is not yet intended for general use, and is not available for all clusters. */
  def getJwks(): Request[GetJSONWebKeysResponse] = js.native
  def getJwks(request: Callback): Request[GetJSONWebKeysResponse] = js.native
  
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: CallbackClusterIdFields): Request[Operation] = js.native
  def legacyAbac(request: Uploadprotocol, body: SetLegacyAbacRequest): Request[Operation] = js.native
  
  /** Lists all clusters owned by a project in either the specified zone or all zones. */
  def list(): Request[ListClustersResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListClustersResponse] = js.native
  def list(request: OauthtokenParent): Request[ListClustersResponse] = js.native
  
  /**
    * Sets the locations for a specific cluster. Deprecated. Use
    * [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
    */
  def locations(request: ClusterIdFieldsKey): Request[Operation] = js.native
  def locations(request: Uploadprotocol, body: SetLocationsRequest): Request[Operation] = js.native
  
  /** Sets the logging service for a specific cluster. */
  def logging(request: FieldsKeyOauthtoken): Request[Operation] = js.native
  def logging(request: Uploadprotocol, body: SetLoggingServiceRequest): Request[Operation] = js.native
  
  /** Updates the master for a specific cluster. */
  def master(request: KeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def master(request: Uploadprotocol, body: UpdateMasterRequest): Request[Operation] = js.native
  
  /** Sets the monitoring service for a specific cluster. */
  def monitoring(request: OauthtokenPrettyPrintProjectId): Request[Operation] = js.native
  def monitoring(request: Uploadprotocol, body: SetMonitoringServiceRequest): Request[Operation] = js.native
  
  var nodePools: NodePoolsResource = js.native
  
  /** Sets labels on a cluster. */
  def resourceLabels(request: PrettyPrintProjectIdQuotaUser): Request[Operation] = js.native
  def resourceLabels(request: Uploadprotocol, body: SetLabelsRequest): Request[Operation] = js.native
  
  /** Sets the addons for a specific cluster. */
  def setAddons(request: KeyName): Request[Operation] = js.native
  def setAddons(request: Name, body: SetAddonsConfigRequest): Request[Operation] = js.native
  
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def setLegacyAbac(request: NameOauthtoken): Request[Operation] = js.native
  def setLegacyAbac(request: Name, body: SetLegacyAbacRequest): Request[Operation] = js.native
  
  def setLocations(request: Name, body: SetLocationsRequest): Request[Operation] = js.native
  /**
    * Sets the locations for a specific cluster. Deprecated. Use
    * [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
    */
  def setLocations(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  
  def setLogging(request: Name, body: SetLoggingServiceRequest): Request[Operation] = js.native
  /** Sets the logging service for a specific cluster. */
  def setLogging(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  
  def setMaintenancePolicy(request: Name, body: SetMaintenancePolicyRequest): Request[Operation] = js.native
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: ProjectIdQuotaUserResource): Request[Operation] = js.native
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: QuotaUserResource): Request[Operation] = js.native
  def setMaintenancePolicy(request: Uploadprotocol, body: SetMaintenancePolicyRequest): Request[Operation] = js.native
  
  def setMasterAuth(request: Name, body: SetMasterAuthRequest): Request[Operation] = js.native
  /** Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password. */
  def setMasterAuth(request: QuotaUserResourceUploadType): Request[Operation] = js.native
  /** Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password. */
  def setMasterAuth(request: ResourceUploadType): Request[Operation] = js.native
  def setMasterAuth(request: Uploadprotocol, body: SetMasterAuthRequest): Request[Operation] = js.native
  
  def setMonitoring(request: Name, body: SetMonitoringServiceRequest): Request[Operation] = js.native
  /** Sets the monitoring service for a specific cluster. */
  def setMonitoring(request: UploadTypeUploadprotocol): Request[Operation] = js.native
  
  def setNetworkPolicy(request: Name, body: SetNetworkPolicyRequest): Request[Operation] = js.native
  /** Enables or disables Network Policy for a cluster. */
  def setNetworkPolicy(request: ResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  /** Enables or disables Network Policy for a cluster. */
  def setNetworkPolicy(request: UploadprotocolXgafv): Request[Operation] = js.native
  def setNetworkPolicy(request: Uploadprotocol, body: SetNetworkPolicyRequest): Request[Operation] = js.native
  
  /** Sets labels on a cluster. */
  def setResourceLabels(request: AccesstokenAltCallback): Request[Operation] = js.native
  def setResourceLabels(request: Name, body: SetLabelsRequest): Request[Operation] = js.native
  
  /** Starts master IP rotation. */
  def startIpRotation(request: AltCallbackFields): Request[Operation] = js.native
  def startIpRotation(request: Name, body: StartIPRotationRequest): Request[Operation] = js.native
  /** Starts master IP rotation. */
  def startIpRotation(request: UploadTypeUploadprotocolXgafv): Request[Operation] = js.native
  def startIpRotation(request: Uploadprotocol, body: StartIPRotationRequest): Request[Operation] = js.native
  
  /** Updates the settings of a specific cluster. */
  def update(request: CallbackFieldsKey): Request[Operation] = js.native
  def update(request: Name, body: UpdateClusterRequest): Request[Operation] = js.native
  /** Updates the settings of a specific cluster. */
  def update(request: UploadprotocolXgafvZone): Request[Operation] = js.native
  def update(request: Uploadprotocol, body: UpdateClusterRequest): Request[Operation] = js.native
  
  /** Updates the master for a specific cluster. */
  def updateMaster(request: FieldsKeyName): Request[Operation] = js.native
  def updateMaster(request: Name, body: UpdateMasterRequest): Request[Operation] = js.native
  
  var `well-known`: WellKnownResource = js.native
}
