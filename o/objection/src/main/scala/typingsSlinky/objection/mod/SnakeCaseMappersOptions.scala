package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnakeCaseMappersOptions extends js.Object {
  var underscoreBeforeDigits: js.UndefOr[Boolean] = js.native
  var upperCase: js.UndefOr[Boolean] = js.native
}

object SnakeCaseMappersOptions {
  @scala.inline
  def apply(): SnakeCaseMappersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnakeCaseMappersOptions]
  }
  @scala.inline
  implicit class SnakeCaseMappersOptionsOps[Self <: SnakeCaseMappersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnderscoreBeforeDigits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoreBeforeDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderscoreBeforeDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoreBeforeDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperCase")(js.undefined)
        ret
    }
  }
  
}

