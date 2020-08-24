package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: typingsSlinky.gapiClientStorage.anon.Notification): Request[Unit] = js.native
  /** View a notification configuration. */
  def get(request: typingsSlinky.gapiClientStorage.anon.Notification): Request[Notification] = js.native
  /** Creates a notification subscription for a given bucket. */
  def insert(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Notification] = js.native
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Notifications] = js.native
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
  @scala.inline
  implicit class NotificationsResourceOps[Self <: NotificationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientStorage.anon.Notification => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typingsSlinky.gapiClientStorage.anon.Notification => Request[Notification]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Notification]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Notifications]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

