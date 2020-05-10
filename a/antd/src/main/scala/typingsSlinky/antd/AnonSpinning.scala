package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSpinning extends js.Object {
  var size: small | large | default = js.native
  var spinning: Boolean = js.native
  var wrapperClassName: String = js.native
}

object AnonSpinning {
  @scala.inline
  def apply(size: small | large | default, spinning: Boolean, wrapperClassName: String): AnonSpinning = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpinning]
  }
  @scala.inline
  implicit class AnonSpinningOps[Self <: AnonSpinning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: small | large | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

