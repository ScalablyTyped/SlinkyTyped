package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  /** Sets the background color of all hover labels on graph. */
  var bgcolor: String = js.native
  /** Sets the border color of all hover labels on graph. */
  var bordercolor: String = js.native
  /** Sets the default hover label font used by all traces on the graph. */
  var font: PartialFont = js.native
}

object Label {
  @scala.inline
  def apply(bgcolor: String, bordercolor: String, font: PartialFont): Label = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordercolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

