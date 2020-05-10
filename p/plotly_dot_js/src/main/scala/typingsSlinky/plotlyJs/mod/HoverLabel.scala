package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverLabel extends Label {
  /** Sets the horizontal alignment of the text content within hover label box. */
  var align: left | right | auto = js.native
  /**
  	 * Sets the default length (in number of characters) (default 15) of the trace name
  	 * in the hover labels for all traces.
  	 * -1 shows the whole name regardless of length.
  	 */
  var namelength: Double = js.native
}

object HoverLabel {
  @scala.inline
  def apply(
    align: left | right | auto,
    bgcolor: String,
    bordercolor: String,
    font: PartialFont,
    namelength: Double
  ): HoverLabel = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], namelength = namelength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverLabel]
  }
  @scala.inline
  implicit class HoverLabelOps[Self <: HoverLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | right | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamelength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namelength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

