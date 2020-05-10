package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonPageToken
import typingsSlinky.gapiClientCalendar.AnonSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: AnonSetting): Request_[Setting] = js.native
  /** Returns all user settings for the authenticated user. */
  def list(request: AnonPageToken): Request_[Settings_] = js.native
  /** Watch for changes to Settings resources. */
  def watch(request: AnonPageToken): Request_[Channel] = js.native
}

object SettingsResource {
  @scala.inline
  def apply(
    get: AnonSetting => Request_[Setting],
    list: AnonPageToken => Request_[Settings_],
    watch: AnonPageToken => Request_[Channel]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[SettingsResource]
  }
  @scala.inline
  implicit class SettingsResourceOps[Self <: SettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonSetting => Request_[Setting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[Settings_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonPageToken => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

