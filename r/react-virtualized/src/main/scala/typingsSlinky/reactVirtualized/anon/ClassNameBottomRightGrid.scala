package typingsSlinky.reactVirtualized.anon

import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameBottomRightGrid extends js.Object {
  var classNameBottomLeftGrid: _empty = js.native
  var classNameBottomRightGrid: _empty = js.native
  var classNameTopLeftGrid: _empty = js.native
  var classNameTopRightGrid: _empty = js.native
  var enableFixedColumnScroll: `false` = js.native
  var enableFixedRowScroll: `false` = js.native
  var fixedColumnCount: `0` = js.native
  var fixedRowCount: `0` = js.native
  var scrollToColumn: `-1` = js.native
  var scrollToRow: `-1` = js.native
}

object ClassNameBottomRightGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: _empty,
    classNameBottomRightGrid: _empty,
    classNameTopLeftGrid: _empty,
    classNameTopRightGrid: _empty,
    enableFixedColumnScroll: `false`,
    enableFixedRowScroll: `false`,
    fixedColumnCount: `0`,
    fixedRowCount: `0`,
    scrollToColumn: `-1`,
    scrollToRow: `-1`
  ): ClassNameBottomRightGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameBottomRightGrid]
  }
  @scala.inline
  implicit class ClassNameBottomRightGridOps[Self <: ClassNameBottomRightGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNameBottomLeftGrid(value: _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameBottomRightGrid(value: _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameTopLeftGrid(value: _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameTopRightGrid(value: _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFixedColumnScroll(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedColumnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFixedRowScroll(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedRowScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedColumnCount(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedRowCount(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToColumn(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToRow(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

