package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFont extends js.Object {
  /**
  		 * Sets the font of the current value label text.
  		 */
  var font: PartialFont = js.native
  /**
  		 * The amount of space, in pixels, between the current value label
  		 * and the slider.
  		 */
  var offset: Double = js.native
  /**
  		 * When currentvalue.visible is true, this sets the prefix of the label.
  		 */
  var prefix: String = js.native
  /**
  		 * When currentvalue.visible is true, this sets the suffix of the label.
  		 */
  var suffix: String = js.native
  /**
  		 * Shows the currently-selected value above the slider.
  		 */
  var visible: Boolean = js.native
  /**
  		 * The alignment of the value readout relative to the length of the slider.
  		 */
  var xanchor: left | center | right = js.native
}

object AnonFont {
  @scala.inline
  def apply(
    font: PartialFont,
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): AnonFont = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFont]
  }
  @scala.inline
  implicit class AnonFontOps[Self <: AnonFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXanchor(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

