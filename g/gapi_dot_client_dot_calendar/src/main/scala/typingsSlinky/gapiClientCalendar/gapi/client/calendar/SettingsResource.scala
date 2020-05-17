package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: typingsSlinky.gapiClientCalendar.anon.Setting): Request[Setting] = js.native
  /** Returns all user settings for the authenticated user. */
  def list(request: PageToken): Request[Settings] = js.native
  /** Watch for changes to Settings resources. */
  def watch(request: PageToken): Request[Channel] = js.native
}

object SettingsResource {
  @scala.inline
  def apply(
    get: typingsSlinky.gapiClientCalendar.anon.Setting => Request[Setting],
    list: PageToken => Request[Settings],
    watch: PageToken => Request[Channel]
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
    def withGet(value: typingsSlinky.gapiClientCalendar.anon.Setting => Request[Setting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PageToken => Request[Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: PageToken => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

