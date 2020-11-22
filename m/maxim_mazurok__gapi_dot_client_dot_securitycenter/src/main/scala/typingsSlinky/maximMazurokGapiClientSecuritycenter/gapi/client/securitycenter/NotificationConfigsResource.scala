package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.ConfigId
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfigsResource extends js.Object {
  
  /** Creates a notification config. */
  def create(request: ConfigId): Request[NotificationConfig] = js.native
  def create(request: Oauthtoken, body: NotificationConfig): Request[NotificationConfig] = js.native
  
  /** Deletes a notification config. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Gets a notification config. */
  def get(): Request[NotificationConfig] = js.native
  def get(request: PrettyPrint): Request[NotificationConfig] = js.native
  
  /** Lists notification configs. */
  def list(): Request[ListNotificationConfigsResponse] = js.native
  def list(request: PageSize): Request[ListNotificationConfigsResponse] = js.native
  
  /** Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter */
  def patch(request: QuotaUser): Request[NotificationConfig] = js.native
  def patch(request: UpdateMask, body: NotificationConfig): Request[NotificationConfig] = js.native
}
