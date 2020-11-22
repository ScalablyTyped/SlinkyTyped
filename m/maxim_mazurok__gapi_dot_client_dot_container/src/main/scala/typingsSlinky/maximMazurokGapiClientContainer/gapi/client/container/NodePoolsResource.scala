package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientContainer.anon.Alt
import typingsSlinky.maximMazurokGapiClientContainer.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientContainer.anon.Callback
import typingsSlinky.maximMazurokGapiClientContainer.anon.CallbackClusterId
import typingsSlinky.maximMazurokGapiClientContainer.anon.ClusterId
import typingsSlinky.maximMazurokGapiClientContainer.anon.Fields
import typingsSlinky.maximMazurokGapiClientContainer.anon.Key
import typingsSlinky.maximMazurokGapiClientContainer.anon.Name
import typingsSlinky.maximMazurokGapiClientContainer.anon.NodePoolId
import typingsSlinky.maximMazurokGapiClientContainer.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientContainer.anon.Parent
import typingsSlinky.maximMazurokGapiClientContainer.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientContainer.anon.ProjectId
import typingsSlinky.maximMazurokGapiClientContainer.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientContainer.anon.Resource
import typingsSlinky.maximMazurokGapiClientContainer.anon.UploadType
import typingsSlinky.maximMazurokGapiClientContainer.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientContainer.anon.Xgafv
import typingsSlinky.maximMazurokGapiClientContainer.anon.Zone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePoolsResource extends js.Object {
  
  /** Sets the autoscaling settings for the specified node pool. */
  def autoscaling(request: NodePoolId): Request[Operation] = js.native
  def autoscaling(request: ProjectId, body: SetNodePoolAutoscalingRequest): Request[Operation] = js.native
  
  /** Creates a node pool for a cluster. */
  def create(request: Alt): Request[Operation] = js.native
  def create(request: Callback, body: CreateNodePoolRequest): Request[Operation] = js.native
  /** Creates a node pool for a cluster. */
  def create(request: UploadType): Request[Operation] = js.native
  def create(request: Uploadprotocol, body: CreateNodePoolRequest): Request[Operation] = js.native
  
  /** Deletes a node pool from a cluster. */
  def delete(): Request[Operation] = js.native
  def delete(request: ClusterId): Request[Operation] = js.native
  def delete(request: Xgafv): Request[Operation] = js.native
  
  /** Retrieves the requested node pool. */
  def get(): Request[NodePool] = js.native
  def get(request: ClusterId): Request[NodePool] = js.native
  def get(request: Xgafv): Request[NodePool] = js.native
  
  /** Lists the node pools for a cluster. */
  def list(): Request[ListNodePoolsResponse] = js.native
  def list(request: Fields): Request[ListNodePoolsResponse] = js.native
  def list(request: Parent): Request[ListNodePoolsResponse] = js.native
  
  /** Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed. */
  def rollback(request: Key): Request[Operation] = js.native
  def rollback(request: Name, body: RollbackNodePoolUpgradeRequest): Request[Operation] = js.native
  def rollback(request: ProjectId, body: RollbackNodePoolUpgradeRequest): Request[Operation] = js.native
  /** Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed. */
  def rollback(request: Zone): Request[Operation] = js.native
  
  def setAutoscaling(request: Name, body: SetNodePoolAutoscalingRequest): Request[Operation] = js.native
  /** Sets the autoscaling settings for the specified node pool. */
  def setAutoscaling(request: Oauthtoken): Request[Operation] = js.native
  
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: AccesstokenAlt): Request[Operation] = js.native
  def setManagement(request: Name, body: SetNodePoolManagementRequest): Request[Operation] = js.native
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: PrettyPrint): Request[Operation] = js.native
  def setManagement(request: ProjectId, body: SetNodePoolManagementRequest): Request[Operation] = js.native
  
  /** Sets the size for a specific node pool. */
  def setSize(request: AltCallback): Request[Operation] = js.native
  def setSize(request: Name, body: SetNodePoolSizeRequest): Request[Operation] = js.native
  def setSize(request: ProjectId, body: SetNodePoolSizeRequest): Request[Operation] = js.native
  /** Sets the size for a specific node pool. */
  def setSize(request: QuotaUser): Request[Operation] = js.native
  
  /** Updates the version and/or image type for the specified node pool. */
  def update(request: CallbackClusterId): Request[Operation] = js.native
  def update(request: Name, body: UpdateNodePoolRequest): Request[Operation] = js.native
  def update(request: ProjectId, body: UpdateNodePoolRequest): Request[Operation] = js.native
  /** Updates the version and/or image type for the specified node pool. */
  def update(request: Resource): Request[Operation] = js.native
}
