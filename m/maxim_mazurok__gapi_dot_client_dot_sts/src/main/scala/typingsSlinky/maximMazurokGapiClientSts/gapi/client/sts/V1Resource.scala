package typingsSlinky.maximMazurokGapiClientSts.gapi.client.sts

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSts.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSts.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends js.Object {
  
  /** Exchanges a credential for a Google OAuth 2.0 access token. */
  def token(request: Accesstoken): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(request: Alt, body: GoogleIdentityStsV1ExchangeTokenRequest): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
}
