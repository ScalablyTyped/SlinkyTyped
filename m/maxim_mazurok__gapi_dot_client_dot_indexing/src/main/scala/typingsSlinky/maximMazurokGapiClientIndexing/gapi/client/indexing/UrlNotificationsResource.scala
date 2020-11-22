package typingsSlinky.maximMazurokGapiClientIndexing.gapi.client.indexing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIndexing.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientIndexing.anon.Alt
import typingsSlinky.maximMazurokGapiClientIndexing.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlNotificationsResource extends js.Object {
  
  /**
    * Gets metadata about a Web Document. This method can _only_ be used to query URLs that were previously seen in successful Indexing API notifications. Includes the latest
    * `UrlNotification` received via this API.
    */
  def getMetadata(): Request[UrlNotificationMetadata] = js.native
  def getMetadata(request: Accesstoken): Request[UrlNotificationMetadata] = js.native
  
  /** Notifies that a URL has been updated or deleted. */
  def publish(request: Alt): Request[PublishUrlNotificationResponse] = js.native
  def publish(request: Callback, body: UrlNotification): Request[PublishUrlNotificationResponse] = js.native
}
