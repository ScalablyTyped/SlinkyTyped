package typingsSlinky.reactVirtualized

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClassNameBottomLeftGrid extends js.Object {
  var classNameBottomLeftGrid: Validator[String] = js.native
  var classNameBottomRightGrid: Validator[String] = js.native
  var classNameTopLeftGrid: Validator[String] = js.native
  var classNameTopRightGrid: Validator[String] = js.native
  var enableFixedColumnScroll: Validator[Boolean] = js.native
  var enableFixedRowScroll: Validator[Boolean] = js.native
  var fixedColumnCount: Validator[Double] = js.native
  var fixedRowCount: Validator[Double] = js.native
  var style: Validator[CSSProperties] = js.native
  var styleBottomLeftGrid: Validator[CSSProperties] = js.native
  var styleBottomRightGrid: Validator[CSSProperties] = js.native
  var styleTopLeftGrid: Validator[CSSProperties] = js.native
  var styleTopRightGrid: Validator[CSSProperties] = js.native
}

object AnonClassNameBottomLeftGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: Validator[String],
    classNameBottomRightGrid: Validator[String],
    classNameTopLeftGrid: Validator[String],
    classNameTopRightGrid: Validator[String],
    enableFixedColumnScroll: Validator[Boolean],
    enableFixedRowScroll: Validator[Boolean],
    fixedColumnCount: Validator[Double],
    fixedRowCount: Validator[Double],
    style: Validator[CSSProperties],
    styleBottomLeftGrid: Validator[CSSProperties],
    styleBottomRightGrid: Validator[CSSProperties],
    styleTopLeftGrid: Validator[CSSProperties],
    styleTopRightGrid: Validator[CSSProperties]
  ): AnonClassNameBottomLeftGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleBottomLeftGrid = styleBottomLeftGrid.asInstanceOf[js.Any], styleBottomRightGrid = styleBottomRightGrid.asInstanceOf[js.Any], styleTopLeftGrid = styleTopLeftGrid.asInstanceOf[js.Any], styleTopRightGrid = styleTopRightGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNameBottomLeftGrid]
  }
  @scala.inline
  implicit class AnonClassNameBottomLeftGridOps[Self <: AnonClassNameBottomLeftGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNameBottomLeftGrid(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameBottomRightGrid(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameBottomRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameTopLeftGrid(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNameTopRightGrid(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameTopRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFixedColumnScroll(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedColumnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFixedRowScroll(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFixedRowScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedColumnCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedRowCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Validator[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleBottomLeftGrid(value: Validator[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleBottomRightGrid(value: Validator[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBottomRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleTopLeftGrid(value: Validator[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopLeftGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleTopRightGrid(value: Validator[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTopRightGrid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

