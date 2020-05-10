package typingsSlinky.electronSettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsOptions extends js.Object {
  /**
    * Prettify the JSON output. Defaults to `false`.
    */
  var prettify: js.UndefOr[Boolean] = js.native
}

object SettingsOptions {
  @scala.inline
  def apply(): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsOptions]
  }
  @scala.inline
  implicit class SettingsOptionsOps[Self <: SettingsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrettify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(js.undefined)
        ret
    }
  }
  
}

