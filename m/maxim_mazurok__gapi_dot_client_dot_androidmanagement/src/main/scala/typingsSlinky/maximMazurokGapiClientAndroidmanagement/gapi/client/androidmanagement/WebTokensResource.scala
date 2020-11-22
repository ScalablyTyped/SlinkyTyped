package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTokensResource extends js.Object {
  
  def create(request: QuotaUser, body: WebToken): Request[WebToken] = js.native
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: Uploadprotocol): Request[WebToken] = js.native
}
