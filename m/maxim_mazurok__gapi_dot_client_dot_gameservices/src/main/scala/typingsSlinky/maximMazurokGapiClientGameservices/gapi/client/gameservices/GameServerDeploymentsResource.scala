package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Callback
import typingsSlinky.maximMazurokGapiClientGameservices.anon.DeploymentId
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Fields
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Key
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Name
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientGameservices.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientGameservices.anon.PreviewTime
import typingsSlinky.maximMazurokGapiClientGameservices.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Resource
import typingsSlinky.maximMazurokGapiClientGameservices.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientGameservices.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerDeploymentsResource extends js.Object {
  
  var configs: ConfigsResource = js.native
  
  /** Creates a new game server deployment in a given project and location. */
  def create(request: DeploymentId): Request[Operation] = js.native
  def create(request: Key, body: GameServerDeployment): Request[Operation] = js.native
  
  /** Deletes a single game server deployment. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def fetchDeploymentState(request: Callback, body: FetchDeploymentStateRequest): Request[FetchDeploymentStateResponse] = js.native
  /**
    * Retrieves information about the current state of the game server deployment. Gathers all the Agones fleets and Agones autoscalers, including fleets running an older version of the
    * game server deployment.
    */
  def fetchDeploymentState(request: Name): Request[FetchDeploymentStateResponse] = js.native
  
  /** Gets details of a single game server deployment. */
  def get(): Request[GameServerDeployment] = js.native
  def get(request: Callback): Request[GameServerDeployment] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Gets details a single game server deployment rollout. */
  def getRollout(): Request[GameServerDeploymentRollout] = js.native
  def getRollout(request: Callback): Request[GameServerDeploymentRollout] = js.native
  
  /** Lists game server deployments in a given project and location. */
  def list(): Request[ListGameServerDeploymentsResponse] = js.native
  def list(request: Fields): Request[ListGameServerDeploymentsResponse] = js.native
  
  /** Patches a game server deployment. */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: GameServerDeployment): Request[Operation] = js.native
  
  /** Previews the game server deployment rollout. This API does not mutate the rollout resource. */
  def previewRollout(request: PreviewTime): Request[PreviewGameServerDeploymentRolloutResponse] = js.native
  def previewRollout(request: UpdateMask, body: GameServerDeploymentRollout): Request[PreviewGameServerDeploymentRolloutResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateRollout(request: QuotaUser, body: GameServerDeploymentRollout): Request[Operation] = js.native
  /**
    * Patches a single game server deployment rollout. The method will not return an error if the update does not affect any existing realms. For example - if the
    * default_game_server_config is changed but all existing realms use the override, that is valid. Similarly, if a non existing realm is explicitly called out in
    * game_server_config_overrides field, that will also not result in an error.
    */
  def updateRollout(request: UploadType): Request[Operation] = js.native
}
