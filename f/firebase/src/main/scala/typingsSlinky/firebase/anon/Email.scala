package typingsSlinky.firebase.anon

import typingsSlinky.firebase.mod.auth.MultiFactorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: js.UndefOr[String | Null] = js.native
  /**
    * @deprecated
    * This field is deprecated in favor of previousEmail.
    */
  var fromEmail: js.UndefOr[String | Null] = js.native
  var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.native
  var previousEmail: js.UndefOr[String | Null] = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(null)
        ret
    }
    @scala.inline
    def withFromEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEmailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEmail")(null)
        ret
    }
    @scala.inline
    def withMultiFactorInfo(value: MultiFactorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiFactorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiFactorInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactorInfo")(null)
        ret
    }
    @scala.inline
    def withPreviousEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousEmailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousEmail")(null)
        ret
    }
  }
  
}

