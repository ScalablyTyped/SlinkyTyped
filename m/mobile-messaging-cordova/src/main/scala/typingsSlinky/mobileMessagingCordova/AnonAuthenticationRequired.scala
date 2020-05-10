package typingsSlinky.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthenticationRequired extends js.Object {
  var authenticationRequired: js.UndefOr[Boolean] = js.native
  var destructive: js.UndefOr[Boolean] = js.native
  var foreground: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var identifier: js.UndefOr[String] = js.native
  var moRequired: js.UndefOr[Boolean] = js.native
  var textInputActionButtonTitle: js.UndefOr[String] = js.native
  var textInputPlaceholder: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AnonAuthenticationRequired {
  @scala.inline
  def apply(): AnonAuthenticationRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuthenticationRequired]
  }
  @scala.inline
  implicit class AnonAuthenticationRequiredOps[Self <: AnonAuthenticationRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withDestructive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructive")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withMoRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInputActionButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputActionButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInputActionButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputActionButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInputPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInputPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

