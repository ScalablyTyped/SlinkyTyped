package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.anon.Hint
import typingsSlinky.auth0Lock.auth0LockStrings.`false`
import typingsSlinky.auth0Lock.auth0LockStrings.`true`
import typingsSlinky.auth0Lock.auth0LockStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockAdditionalCheckboxSignUpField extends Auth0LockAdditionalSignUpField {
  var icon: js.UndefOr[String] = js.native
  var name: String = js.native
  var placeholder: String = js.native
  var prefill: `true` | `false` = js.native
  var `type`: js.UndefOr[checkbox] = js.native
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.native
}

object Auth0LockAdditionalCheckboxSignUpField {
  @scala.inline
  def apply(name: String, placeholder: String, prefill: `true` | `false`): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
  @scala.inline
  implicit class Auth0LockAdditionalCheckboxSignUpFieldOps[Self <: Auth0LockAdditionalCheckboxSignUpField] (val x: Self) extends AnyVal {
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
    def withPrefill(value: `true` | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(value.asInstanceOf[js.Any])
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
    def withType(value: checkbox): Self = {
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
    def withValidator(value: /* input */ String => Hint): Self = {
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

