package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.sliderMod.SliderMarks
import typingsSlinky.antd.sliderMod.SliderProps
import typingsSlinky.antd.sliderMod.SliderValue
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  @JSImport("antd/lib/slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: SliderValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def getTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getTooltipPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def marks(value: SliderMarks): this.type = set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onAfterChange(value: /* value */ SliderValue => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* value */ SliderValue => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def stepNull: this.type = set("step", null)
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tipFormatter(value: /* value */ Double => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def tipFormatterNull: this.type = set("tipFormatter", null)
    @scala.inline
    def tooltipPlacement(value: TooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipPrefixCls(value: String): this.type = set("tooltipPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipVisible(value: Boolean): this.type = set("tooltipVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: SliderValue): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

