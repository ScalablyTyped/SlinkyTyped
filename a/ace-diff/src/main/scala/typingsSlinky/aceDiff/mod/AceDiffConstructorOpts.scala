package typingsSlinky.aceDiff.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AceDiffConstructorOpts extends AceDiffOpts {
  var element: String | HTMLElement = js.native
  @JSName("left")
  var left_AceDiffConstructorOpts: AceDiffLROpts = js.native
  @JSName("right")
  var right_AceDiffConstructorOpts: AceDiffLROpts = js.native
}

object AceDiffConstructorOpts {
  @scala.inline
  def apply(element: String | HTMLElement, left: AceDiffLROpts, right: AceDiffLROpts): AceDiffConstructorOpts = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AceDiffConstructorOpts]
  }
  @scala.inline
  implicit class AceDiffConstructorOptsOps[Self <: AceDiffConstructorOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: AceDiffLROpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: AceDiffLROpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

