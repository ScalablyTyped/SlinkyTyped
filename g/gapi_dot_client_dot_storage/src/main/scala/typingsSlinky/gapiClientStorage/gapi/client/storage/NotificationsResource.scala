package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: typingsSlinky.gapiClientStorage.anon.Notification): Request[Unit]
  /** View a notification configuration. */
  def get(request: typingsSlinky.gapiClientStorage.anon.Notification): Request[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientStorage.anon.Notification => Request[Unit],
    get: typingsSlinky.gapiClientStorage.anon.Notification => Request[Notification],
    insert: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Notification],
    list: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[NotificationsResource]
  }
}

