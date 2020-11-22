package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.CallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignupUrlsResource extends js.Object {
  
  /** Creates an enterprise signup URL. */
  def create(): Request[SignupUrl] = js.native
  def create(request: CallbackUrl): Request[SignupUrl] = js.native
}
