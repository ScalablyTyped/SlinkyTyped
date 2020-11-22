package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Alt
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.ClusterId
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.PageToken
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Parent
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends js.Object {
  
  var backups: BackupsResource = js.native
  
  /** Creates a cluster within an instance. */
  def create(request: ClusterId): Request[Operation] = js.native
  def create(request: Parent, body: Cluster): Request[Operation] = js.native
  
  /** Deletes a cluster from an instance. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets information about a cluster. */
  def get(): Request[Cluster] = js.native
  def get(request: Alt): Request[Cluster] = js.native
  
  /** Lists information about clusters in an instance. */
  def list(): Request[ListClustersResponse] = js.native
  def list(request: PageToken): Request[ListClustersResponse] = js.native
  
  def update(request: Alt, body: Cluster): Request[Operation] = js.native
  /** Updates a cluster within an instance. */
  def update(request: Resource): Request[Operation] = js.native
}
