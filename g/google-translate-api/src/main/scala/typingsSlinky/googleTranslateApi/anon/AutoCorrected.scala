package typingsSlinky.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrected extends js.Object {
  var autoCorrected: Boolean = js.native
  var didYouMean: Boolean = js.native
  var value: String = js.native
}

object AutoCorrected {
  @scala.inline
  def apply(autoCorrected: Boolean, didYouMean: Boolean, value: String): AutoCorrected = {
    val __obj = js.Dynamic.literal(autoCorrected = autoCorrected.asInstanceOf[js.Any], didYouMean = didYouMean.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrected]
  }
  @scala.inline
  implicit class AutoCorrectedOps[Self <: AutoCorrected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCorrected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDidYouMean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didYouMean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

