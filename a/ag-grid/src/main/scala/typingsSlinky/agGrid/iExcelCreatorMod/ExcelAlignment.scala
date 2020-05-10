package typingsSlinky.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelAlignment extends js.Object {
  var horizontal: String = js.native
  var indent: Double = js.native
  var readingOrder: String = js.native
  var rotate: Double = js.native
  var shrinkToFit: Boolean = js.native
  var vertical: String = js.native
  var verticalText: Boolean = js.native
  var wrapText: Boolean = js.native
}

object ExcelAlignment {
  @scala.inline
  def apply(
    horizontal: String,
    indent: Double,
    readingOrder: String,
    rotate: Double,
    shrinkToFit: Boolean,
    vertical: String,
    verticalText: Boolean,
    wrapText: Boolean
  ): ExcelAlignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalText = verticalText.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelAlignment]
  }
  @scala.inline
  implicit class ExcelAlignmentOps[Self <: ExcelAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadingOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

