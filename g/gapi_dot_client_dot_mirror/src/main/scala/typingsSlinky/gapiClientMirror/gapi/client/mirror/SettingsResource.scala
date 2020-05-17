package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMirror.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: Alt): Request[Setting] = js.native
}

object SettingsResource {
  @scala.inline
  def apply(get: Alt => Request[Setting]): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SettingsResource]
  }
  @scala.inline
  implicit class SettingsResourceOps[Self <: SettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[Setting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

