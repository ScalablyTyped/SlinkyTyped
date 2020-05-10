package typingsSlinky.openfin.applicationOptionMod

import typingsSlinky.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationOption extends LegacyWinOptionsInAppOptions {
  var disableIabSecureLogging: js.UndefOr[Boolean] = js.native
  var fdc3Api: js.UndefOr[Boolean] = js.native
  var loadErrorMessage: js.UndefOr[String] = js.native
  var mainWindowOptions: js.UndefOr[WindowOption] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPersistent: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var uuid: String = js.native
  var webSecurity: js.UndefOr[Boolean] = js.native
}

object ApplicationOption {
  @scala.inline
  def apply(uuid: String): ApplicationOption = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationOption]
  }
  @scala.inline
  implicit class ApplicationOptionOps[Self <: ApplicationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableIabSecureLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIabSecureLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIabSecureLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIabSecureLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withFdc3Api(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3Api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFdc3Api: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3Api")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMainWindowOptions(value: WindowOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainWindowOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainWindowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainWindowOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(js.undefined)
        ret
    }
  }
  
}

