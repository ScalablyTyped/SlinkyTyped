package typingsSlinky.antd.sliderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[SliderValue] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var included: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[SliderMarks] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double | Null] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tipFormatter: js.UndefOr[Null | (js.Function1[/* value */ Double, TagMod[Any]])] = js.undefined
  var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.undefined
  var tooltipPrefixCls: js.UndefOr[String] = js.undefined
  var tooltipVisible: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[SliderValue] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultValue(value: SliderValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setGetTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getTooltipPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTooltipPopupContainer: Self = this.set("getTooltipPopupContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    @scala.inline
    def setMarks(value: SliderMarks): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnAfterChange(value: /* value */ SliderValue => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ SliderValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTipFormatter(value: /* value */ Double => TagMod[Any]): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTipFormatter: Self = this.set("tipFormatter", js.undefined)
    @scala.inline
    def setTipFormatterNull: Self = this.set("tipFormatter", null)
    @scala.inline
    def setTooltipPlacement(value: TooltipPlacement): Self = this.set("tooltipPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacement: Self = this.set("tooltipPlacement", js.undefined)
    @scala.inline
    def setTooltipPrefixCls(value: String): Self = this.set("tooltipPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPrefixCls: Self = this.set("tooltipPrefixCls", js.undefined)
    @scala.inline
    def setTooltipVisible(value: Boolean): Self = this.set("tooltipVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipVisible: Self = this.set("tooltipVisible", js.undefined)
    @scala.inline
    def setValue(value: SliderValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

