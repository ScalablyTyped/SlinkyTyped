package typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFirebase.anon.Alt
import typingsSlinky.maximMazurokGapiClientFirebase.anon.Callback
import typingsSlinky.maximMazurokGapiClientFirebase.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaResource extends StObject {
  
  /** Adds a ShaCertificate to the specified AndroidApp. */
  def create(request: Callback): Request[ShaCertificate] = js.native
  def create(request: Fields, body: ShaCertificate): Request[ShaCertificate] = js.native
  
  /** Removes a ShaCertificate from the specified AndroidApp. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Lists the SHA-1 and SHA-256 certificates for the specified AndroidApp. */
  def list(): Request[ListShaCertificatesResponse] = js.native
  def list(request: Fields): Request[ListShaCertificatesResponse] = js.native
}
