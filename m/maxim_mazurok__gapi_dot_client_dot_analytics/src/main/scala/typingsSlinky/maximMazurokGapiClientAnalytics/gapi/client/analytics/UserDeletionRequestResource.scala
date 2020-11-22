package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.AltFieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionRequestResource extends js.Object {
  
  /** Insert or update a user deletion requests. */
  def upsert(request: AltFieldsKeyOauthtoken): Request[UserDeletionRequest] = js.native
  def upsert(request: UserIp, body: UserDeletionRequest): Request[UserDeletionRequest] = js.native
}
