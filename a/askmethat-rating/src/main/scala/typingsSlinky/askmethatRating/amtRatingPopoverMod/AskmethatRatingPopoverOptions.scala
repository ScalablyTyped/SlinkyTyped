package typingsSlinky.askmethatRating.amtRatingPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AskmethatRatingPopoverOptions extends js.Object {
  /**
    * Color used by the font & progress bar inside popover
    */
  var color: String = js.native
  /**
    * Display popover at bottom or top
    */
  var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.native
  /**
    * fontClass used by the rating element inside popover
    */
  var fontClass: String = js.native
  /**
    * Array of percentage to display
    */
  var values: js.Array[Double] = js.native
}

object AskmethatRatingPopoverOptions {
  @scala.inline
  def apply(color: String, fontClass: String, values: js.Array[Double]): AskmethatRatingPopoverOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontClass = fontClass.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AskmethatRatingPopoverOptions]
  }
  @scala.inline
  implicit class AskmethatRatingPopoverOptionsOps[Self <: AskmethatRatingPopoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: AskmethatRatingPopoverDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

