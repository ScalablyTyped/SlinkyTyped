package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Alt
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.AppProfileId
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Callback
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Fields
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.IgnoreWarnings
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Key
import typingsSlinky.maximMazurokGapiClientBigtableadmin.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppProfilesResource extends js.Object {
  
  /** Creates an app profile within an instance. */
  def create(request: AppProfileId): Request[AppProfile] = js.native
  def create(request: Callback, body: AppProfile): Request[AppProfile] = js.native
  
  /** Deletes an app profile from an instance. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Gets information about an app profile. */
  def get(): Request[AppProfile] = js.native
  def get(request: Alt): Request[AppProfile] = js.native
  
  /** Lists information about app profiles in an instance. */
  def list(): Request[ListAppProfilesResponse] = js.native
  def list(request: Key): Request[ListAppProfilesResponse] = js.native
  
  /** Updates an app profile within an instance. */
  def patch(request: IgnoreWarnings): Request[Operation] = js.native
  def patch(request: Name, body: AppProfile): Request[Operation] = js.native
}
