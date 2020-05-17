package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.bottom
import typingsSlinky.exceljs.exceljsStrings.center
import typingsSlinky.exceljs.exceljsStrings.centerContinuous
import typingsSlinky.exceljs.exceljsStrings.distributed
import typingsSlinky.exceljs.exceljsStrings.fill
import typingsSlinky.exceljs.exceljsStrings.justify
import typingsSlinky.exceljs.exceljsStrings.left
import typingsSlinky.exceljs.exceljsStrings.ltr
import typingsSlinky.exceljs.exceljsStrings.middle
import typingsSlinky.exceljs.exceljsStrings.right
import typingsSlinky.exceljs.exceljsStrings.rtl
import typingsSlinky.exceljs.exceljsStrings.top
import typingsSlinky.exceljs.exceljsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Alignment> */
@js.native
trait PartialAlignment extends js.Object {
  var horizontal: js.UndefOr[left | center | right | fill | justify | centerContinuous | distributed] = js.native
  var indent: js.UndefOr[Double] = js.native
  var readingOrder: js.UndefOr[rtl | ltr] = js.native
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  var textRotation: js.UndefOr[Double | vertical] = js.native
  var vertical: js.UndefOr[top | middle | bottom | distributed | justify] = js.native
  var wrapText: js.UndefOr[Boolean] = js.native
}

object PartialAlignment {
  @scala.inline
  def apply(): PartialAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlignment]
  }
  @scala.inline
  implicit class PartialAlignmentOps[Self <: PartialAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: left | center | right | fill | justify | centerContinuous | distributed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingOrder(value: rtl | ltr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRotation(value: Double | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: top | middle | bottom | distributed | justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(js.undefined)
        ret
    }
  }
  
}

