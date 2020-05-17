package typingsSlinky.reactRange.typesMod

import slinky.core.TagMod
import typingsSlinky.reactRange.anon.Children
import typingsSlinky.reactRange.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProps extends js.Object {
  var allowOverlap: Boolean = js.native
  var direction: Direction = js.native
  var disabled: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  var rtl: Boolean = js.native
  var step: Double = js.native
  var values: js.Array[Double] = js.native
  def onChange(values: js.Array[Double]): Unit = js.native
  def renderThumb(params: Index): TagMod[Any] = js.native
  def renderTrack(params: Children): TagMod[Any] = js.native
}

object IProps {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Unit,
    renderThumb: Index => TagMod[Any],
    renderTrack: Children => TagMod[Any],
    rtl: Boolean,
    step: Double,
    values: js.Array[Double]
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderThumb(value: Index => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTrack(value: Children => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFinalChange(value: /* values */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinalChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinalChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinalChange")(js.undefined)
        ret
    }
  }
  
}

