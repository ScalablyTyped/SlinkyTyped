package typingsSlinky.reactWidgets.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactWidgets.mod.NumberPicker.^
import typingsSlinky.reactWidgets.numberPickerMod.NumberPickerMessages
import typingsSlinky.reactWidgets.numberPickerMod.NumberPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberPicker {
  @JSImport("react-widgets", "NumberPicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def culture(value: String): this.type = set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: js.Any): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def messages(value: NumberPickerMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def parseFunction2(value: (/* str */ String, /* culture */ String) => Double): this.type = set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def parse(value: js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])): this.type = set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NumberPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NumberPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

