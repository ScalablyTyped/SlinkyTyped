package typingsSlinky.askmethatRating.mod

import typingsSlinky.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AskmethatRatingOptions extends js.Object {
  /**
    * Color when the rating is not hovered
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Class to display as rating (FontAwesome or Rating for exemple)
    */
  var fontClass: js.UndefOr[String] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  /**
    * Input name (Default is AskmethatRating)
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Maximum rating that the plugin display
    */
  var maxRating: js.UndefOr[Double] = js.native
  /**
    * Mininmum rating that the user can set
    */
  var minRating: js.UndefOr[Double] = js.native
  /**
    * options if popover is set. Put element as readonly
    */
  var popover: js.UndefOr[AskmethatRatingPopoverOptions] = js.native
  /**
    * Set the rating to readonly
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * The stepping for the rating
    */
  var step: js.UndefOr[AskmethatRatingSteps] = js.native
}

object AskmethatRatingOptions {
  @scala.inline
  def apply(): AskmethatRatingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AskmethatRatingOptions]
  }
  @scala.inline
  implicit class AskmethatRatingOptionsOps[Self <: AskmethatRatingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRating")(js.undefined)
        ret
    }
    @scala.inline
    def withPopover(value: AskmethatRatingPopoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: AskmethatRatingSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

