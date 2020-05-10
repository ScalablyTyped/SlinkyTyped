package typingsSlinky.jssha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFormatOptions extends js.Object {
  var b64Pad: js.UndefOr[String] = js.native
  var outputUpper: js.UndefOr[Boolean] = js.native
  var shakeLen: js.UndefOr[Double] = js.native
}

object OutputFormatOptions {
  @scala.inline
  def apply(): OutputFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFormatOptions]
  }
  @scala.inline
  implicit class OutputFormatOptionsOps[Self <: OutputFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB64Pad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b64Pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB64Pad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b64Pad")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUpper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUpper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUpper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUpper")(js.undefined)
        ret
    }
    @scala.inline
    def withShakeLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shakeLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShakeLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shakeLen")(js.undefined)
        ret
    }
  }
  
}

