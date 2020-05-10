package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.auth0LockStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockAdditionalSelectSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[String] = js.native
  var name: String = js.native
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.native
  var placeholder: String = js.native
  var prefill: js.UndefOr[String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.native
  var `type`: js.UndefOr[select] = js.native
  var validator: js.UndefOr[js.Function1[/* input */ String, AnonHint]] = js.native
}

object Auth0LockAdditionalSelectSignUpField {
  @scala.inline
  def apply(name: String, placeholder: String): Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSelectSignUpField]
  }
  @scala.inline
  implicit class Auth0LockAdditionalSelectSignUpFieldOps[Self <: Auth0LockAdditionalSelectSignUpField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
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
    def withOptionsFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(
      value: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefillFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefill(value: String | Auth0LockAdditionalSignUpFieldPrefillFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: select): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: /* input */ String => AnonHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

