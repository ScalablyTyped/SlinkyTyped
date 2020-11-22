package typingsSlinky.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVerifiedaccess.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientVerifiedaccess.anon.Alt
import typingsSlinky.maximMazurokGapiClientVerifiedaccess.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeResource extends js.Object {
  
  /** CreateChallenge API */
  def create(request: Accesstoken): Request[Challenge] = js.native
  def create(request: Alt, body: Empty): Request[Challenge] = js.native
  
  def verify(request: Alt, body: VerifyChallengeResponseRequest): Request[VerifyChallengeResponseResult] = js.native
  /** VerifyChallengeResponse API */
  def verify(request: Callback): Request[VerifyChallengeResponseResult] = js.native
}
