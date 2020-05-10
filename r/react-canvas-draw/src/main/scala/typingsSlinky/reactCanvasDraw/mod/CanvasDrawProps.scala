package typingsSlinky.reactCanvasDraw.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDrawProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var brushColor: js.UndefOr[String] = js.native
  var brushRadius: js.UndefOr[Double] = js.native
  var canvasHeight: js.UndefOr[Double | String] = js.native
  var canvasWidth: js.UndefOr[Double | String] = js.native
  var catenaryColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var gridColor: js.UndefOr[String] = js.native
  var hideGrid: js.UndefOr[Boolean] = js.native
  var hideInterface: js.UndefOr[Boolean] = js.native
  var imgSrc: js.UndefOr[String] = js.native
  var immediateLoading: js.UndefOr[Boolean] = js.native
  var lazyRadius: js.UndefOr[Double] = js.native
  var loadTimeOffset: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[(js.Function1[/* canvas */ CanvasDraw, Unit]) | Null] = js.native
  var saveData: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CanvasDrawProps {
  @scala.inline
  def apply(): CanvasDrawProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasDrawProps]
  }
  @scala.inline
  implicit class CanvasDrawPropsOps[Self <: CanvasDrawProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCatenaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catenaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatenaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catenaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withHideInterface(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withImgSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediateLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTimeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* canvas */ CanvasDraw => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(null)
        ret
    }
    @scala.inline
    def withSaveData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveData")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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

