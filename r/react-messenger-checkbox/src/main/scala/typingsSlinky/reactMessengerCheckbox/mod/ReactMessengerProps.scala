package typingsSlinky.reactMessengerCheckbox.mod

import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMessengerProps extends js.Object {
  var allowLogin: js.UndefOr[Boolean] = js.native
  var appId: String = js.native
  var autoLogAppEvents: js.UndefOr[Boolean] = js.native
  var centerAlign: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var onEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var origin: String = js.native
  var pageId: String = js.native
  var prechecked: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large | standard | xlarge] = js.native
  var skin: js.UndefOr[light | dark] = js.native
  var userRef: String = js.native
  var version: js.UndefOr[String] = js.native
  var xfbml: js.UndefOr[Boolean] = js.native
}

object ReactMessengerProps {
  @scala.inline
  def apply(appId: String, origin: String, pageId: String, userRef: String): ReactMessengerProps = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMessengerProps]
  }
  @scala.inline
  implicit class ReactMessengerPropsOps[Self <: ReactMessengerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLogAppEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogAppEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLogAppEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogAppEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEvent(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrechecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prechecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrechecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prechecked")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large | standard | xlarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withXfbml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXfbml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(js.undefined)
        ret
    }
  }
  
}

