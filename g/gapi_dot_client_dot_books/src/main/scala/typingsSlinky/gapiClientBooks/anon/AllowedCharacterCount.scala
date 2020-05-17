package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedCharacterCount extends js.Object {
  /** Maximum allowed characters on this layer, especially for the "copy" layer. */
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  /** Type of limitation on this layer. "limited" or "unlimited" for the "copy" layer. */
  var limitType: js.UndefOr[String] = js.native
  /** Remaining allowed characters on this layer, especially for the "copy" layer. */
  var remainingCharacterCount: js.UndefOr[Double] = js.native
}

object AllowedCharacterCount {
  @scala.inline
  def apply(): AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedCharacterCount]
  }
  @scala.inline
  implicit class AllowedCharacterCountOps[Self <: AllowedCharacterCount] (val x: Self) extends AnyVal {
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

