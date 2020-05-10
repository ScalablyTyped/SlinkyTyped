package typingsSlinky.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEasyChart.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var data: js.Array[AnonColor] = js.native
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[Double] = js.native
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[Boolean] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[Double] = js.native
  /** Size in pixels in each dimension */
  var size: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
}

object PieChartProps {
  @scala.inline
  def apply(data: js.Array[AnonColor]): PieChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[AnonColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHoleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHoleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHoleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHoleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseMoveHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMoveHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseOutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMouseOverHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

