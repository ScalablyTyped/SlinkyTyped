package typingsSlinky.bizcharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import slinky.core.facade.ReactRef
import typingsSlinky.antvG2.mod.EventParams
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.bizcharts.AnonBottom
import typingsSlinky.bizcharts.AnonData
import typingsSlinky.bizcharts.AnonItems
import typingsSlinky.bizcharts.AnonTooltip
import typingsSlinky.bizcharts.AnonTooltipAny
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait ChartProps
  extends DOMAttributes[js.Object]
     with /* event */ StringDictionary[js.Any] {
  var animate: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[typingsSlinky.antvG2.mod.Styles.background] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var filter: js.UndefOr[js.Array[_]] = js.native
  var forceFit: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var key: js.UndefOr[Key] = js.native
  // 事件属性
  var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ typingsSlinky.antvG2.mod.Chart, Unit]] = js.native
  var onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ AnonData, Unit]] = js.native
  var onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  var onTooltipChange: js.UndefOr[js.Function1[/* ev */ AnonItems, Unit]] = js.native
  var onTooltipHide: js.UndefOr[js.Function1[/* ev */ AnonTooltipAny, Unit]] = js.native
  var onTooltipShow: js.UndefOr[js.Function1[/* ev */ AnonTooltip, Unit]] = js.native
  var padding: js.UndefOr[
    String | AnonBottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String])
  ] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var placeholder: js.UndefOr[Node | String | Boolean] = js.native
  var plotBackground: js.UndefOr[background] = js.native
  var ref: js.UndefOr[LegacyRef[js.Any]] = js.native
  var scale: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ChartProps {
  @scala.inline
  def apply(height: Double): ChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  @scala.inline
  implicit class ChartPropsOps[Self <: ChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
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
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFit")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetG2Instance(value: /* chart */ typingsSlinky.antvG2.mod.Chart => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetG2Instance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetG2Instance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetG2Instance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelected(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelectedChange(value: /* ev */ AnonData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelectedChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelectedChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelectedChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemUnselected(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemUnselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemUnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemUnselected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlotClick(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlotClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlotDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlotEnter(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlotEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlotLeave(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlotLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlotMove(value: /* ev */ EventParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlotMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlotMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipChange(value: /* ev */ AnonItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipHide(value: /* ev */ AnonTooltipAny => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShow(value: /* ev */ AnonTooltip => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(
      value: String | AnonBottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String])
    ): Self = {
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
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: Node | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBackground(value: background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: LegacyRef[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

