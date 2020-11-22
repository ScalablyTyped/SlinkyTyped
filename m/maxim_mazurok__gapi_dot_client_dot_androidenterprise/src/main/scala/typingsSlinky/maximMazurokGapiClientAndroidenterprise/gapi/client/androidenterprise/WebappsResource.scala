package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.ResourceUploadType
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.UploadTypeUploadprotocol
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.WebAppId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebappsResource extends js.Object {
  
  /** Deletes an existing web app. */
  def delete(): Request[Unit] = js.native
  def delete(request: WebAppId): Request[Unit] = js.native
  
  /** Gets an existing web app. */
  def get(): Request[WebApp] = js.native
  def get(request: WebAppId): Request[WebApp] = js.native
  
  def insert(request: Oauthtoken, body: WebApp): Request[WebApp] = js.native
  /** Creates a new web app for the enterprise. */
  def insert(request: ResourceUploadType): Request[WebApp] = js.native
  
  /** Retrieves the details of all web apps for a given enterprise. */
  def list(): Request[WebAppsListResponse] = js.native
  def list(request: Oauthtoken): Request[WebAppsListResponse] = js.native
  
  /** Updates an existing web app. */
  def update(request: UploadTypeUploadprotocol): Request[WebApp] = js.native
  def update(request: WebAppId, body: WebApp): Request[WebApp] = js.native
}
