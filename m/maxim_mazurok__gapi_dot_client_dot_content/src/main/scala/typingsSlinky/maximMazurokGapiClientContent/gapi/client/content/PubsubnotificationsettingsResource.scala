package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.AltCallbackFieldsKey
import typingsSlinky.maximMazurokGapiClientContent.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubnotificationsettingsResource extends js.Object {
  
  /** Retrieves a Merchant Center account's pubsub notification settings. */
  def get(): Request[PubsubNotificationSettings] = js.native
  def get(request: UploadType): Request[PubsubNotificationSettings] = js.native
  
  /** Register a Merchant Center account for pubsub notifications. Note that cloud topic name should not be provided as part of the request. */
  def update(request: AltCallbackFieldsKey): Request[PubsubNotificationSettings] = js.native
  def update(request: UploadType, body: PubsubNotificationSettings): Request[PubsubNotificationSettings] = js.native
}
