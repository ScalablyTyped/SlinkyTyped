package typingsSlinky.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptOptions extends js.Object {
  var ownerPassword: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var userProtectionFlag: js.UndefOr[Double] = js.native
}

object EncryptOptions {
  @scala.inline
  def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  @scala.inline
  implicit class EncryptOptionsOps[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProtectionFlag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProtectionFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProtectionFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProtectionFlag")(js.undefined)
        ret
    }
  }
  
}

