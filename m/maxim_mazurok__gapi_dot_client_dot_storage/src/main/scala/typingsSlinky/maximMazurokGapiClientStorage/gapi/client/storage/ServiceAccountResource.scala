package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientStorage.anon.AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountResource extends js.Object {
  
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(): Request[ServiceAccount] = js.native
  def get(request: AltFields): Request[ServiceAccount] = js.native
}
