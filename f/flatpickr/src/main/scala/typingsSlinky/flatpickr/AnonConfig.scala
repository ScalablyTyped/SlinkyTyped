package typingsSlinky.flatpickr

import typingsSlinky.flatpickr.localeMod.Locale
import typingsSlinky.flatpickr.optionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  var config: js.UndefOr[ParsedOptions] = js.native
  var l10n: js.UndefOr[Locale] = js.native
}

object AnonConfig {
  @scala.inline
  def apply(): AnonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConfig]
  }
  @scala.inline
  implicit class AnonConfigOps[Self <: AnonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ParsedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withL10n(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL10n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(js.undefined)
        ret
    }
  }
  
}

