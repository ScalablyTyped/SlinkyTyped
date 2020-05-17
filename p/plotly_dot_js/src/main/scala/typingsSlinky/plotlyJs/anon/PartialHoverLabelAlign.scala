package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.HoverLabel> */
@js.native
trait PartialHoverLabelAlign extends js.Object {
  var align: js.UndefOr[left | right | auto] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var font: js.UndefOr[Partial[typingsSlinky.plotlyJs.mod.Font]] = js.native
  var namelength: js.UndefOr[Double] = js.native
}

object PartialHoverLabelAlign {
  @scala.inline
  def apply(): PartialHoverLabelAlign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHoverLabelAlign]
  }
  @scala.inline
  implicit class PartialHoverLabelAlignOps[Self <: PartialHoverLabelAlign] (val x: Self) extends AnyVal {
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
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBordercolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordercolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Partial[typingsSlinky.plotlyJs.mod.Font]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withNamelength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namelength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamelength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namelength")(js.undefined)
        ret
    }
  }
  
}

