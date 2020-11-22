package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGameservices.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientGameservices.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Callback
import typingsSlinky.maximMazurokGapiClientGameservices.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Fields
import typingsSlinky.maximMazurokGapiClientGameservices.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientGameservices.anon.GameServerClusterId
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Parent
import typingsSlinky.maximMazurokGapiClientGameservices.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientGameservices.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientGameservices.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerClustersResource extends js.Object {
  
  /** Creates a new game server cluster in a given project and location. */
  def create(request: GameServerClusterId): Request[Operation] = js.native
  def create(request: Parent, body: GameServerCluster): Request[Operation] = js.native
  
  /** Deletes a single game server cluster. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single game server cluster. */
  def get(): Request[GameServerCluster] = js.native
  def get(request: Callback): Request[GameServerCluster] = js.native
  
  /** Lists game server clusters in a given project and location. */
  def list(): Request[ListGameServerClustersResponse] = js.native
  def list(request: Fields): Request[ListGameServerClustersResponse] = js.native
  
  def patch(request: QuotaUser, body: GameServerCluster): Request[Operation] = js.native
  /** Patches a single game server cluster. */
  def patch(request: Xgafv): Request[Operation] = js.native
  
  /** Previews creation of a new game server cluster in a given project and location. */
  def previewCreate(request: AccesstokenAlt): Request[PreviewCreateGameServerClusterResponse] = js.native
  def previewCreate(request: AltCallback, body: GameServerCluster): Request[PreviewCreateGameServerClusterResponse] = js.native
  
  /** Previews deletion of a single game server cluster. */
  def previewDelete(): Request[PreviewDeleteGameServerClusterResponse] = js.native
  def previewDelete(request: CallbackFields): Request[PreviewDeleteGameServerClusterResponse] = js.native
  
  /** Previews updating a GameServerCluster. */
  def previewUpdate(request: FieldsKey): Request[PreviewUpdateGameServerClusterResponse] = js.native
  def previewUpdate(request: UpdateMask, body: GameServerCluster): Request[PreviewUpdateGameServerClusterResponse] = js.native
}
