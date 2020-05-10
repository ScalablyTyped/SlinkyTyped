package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.chartJs.chartJsStrings.x
import typingsSlinky.chartJs.chartJsStrings.xy
import typingsSlinky.chartJs.chartJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartHoverOptions extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.native
  var axis: js.UndefOr[x | y | xy] = js.native
  var intersect: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[InteractionMode] = js.native
  var onHover: js.UndefOr[
    js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
  ] = js.native
}

object ChartHoverOptions {
  @scala.inline
  def apply(): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHoverOptions]
  }
  @scala.inline
  implicit class ChartHoverOptionsOps[Self <: ChartHoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: x | y | xy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: InteractionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(
      value: js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
  }
  
}

