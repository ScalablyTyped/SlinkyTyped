package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentBase extends Style {
  var absolutePosition: js.UndefOr[X] = js.native
  var headlineLevel: js.UndefOr[Double] = js.native
  var pageBreak: js.UndefOr[PageBreak] = js.native
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  var relativePosition: js.UndefOr[X] = js.native
  var style: js.UndefOr[String | js.Array[String] | Style] = js.native
}

object ContentBase {
  @scala.inline
  def apply(): ContentBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentBase]
  }
  @scala.inline
  implicit class ContentBaseOps[Self <: ContentBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePosition(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadlineLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadlineLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headlineLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreak(value: PageBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: PageOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePosition(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String | js.Array[String] | Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

