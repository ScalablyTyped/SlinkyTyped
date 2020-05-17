package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Confirmation extends js.Object {
  var confirmation: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var warning: js.UndefOr[String] = js.native
}

object Confirmation {
  @scala.inline
  def apply(): Confirmation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confirmation]
  }
  @scala.inline
  implicit class ConfirmationOps[Self <: Confirmation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

