package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowedCharacterCount extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  var limitType: js.UndefOr[String] = js.native
  var remainingCharacterCount: js.UndefOr[Double] = js.native
}

object AnonAllowedCharacterCount {
  @scala.inline
  def apply(): AnonAllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowedCharacterCount]
  }
  @scala.inline
  implicit class AnonAllowedCharacterCountOps[Self <: AnonAllowedCharacterCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedCharacterCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCharacterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedCharacterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCharacterCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitType")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingCharacterCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingCharacterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingCharacterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingCharacterCount")(js.undefined)
        ret
    }
  }
  
}

