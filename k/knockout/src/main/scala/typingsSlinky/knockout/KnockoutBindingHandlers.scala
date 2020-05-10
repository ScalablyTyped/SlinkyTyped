package typingsSlinky.knockout

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends /* bindingHandler */ StringDictionary[KnockoutBindingHandler[_, _, _]] {
  var attr: KnockoutBindingHandler[_, _, _] = js.native
  var checked: KnockoutBindingHandler[_, _, _] = js.native
  // Working with form fields
  var click: KnockoutBindingHandler[_, _, _] = js.native
  // Components (new for v3.2)
  var component: KnockoutBindingHandler[_, _, _] = js.native
  var css: KnockoutBindingHandler[_, _, _] = js.native
  var disable: KnockoutBindingHandler[_, _, _] = js.native
  var enable: KnockoutBindingHandler[_, _, _] = js.native
  var event: KnockoutBindingHandler[_, _, _] = js.native
  // Control Flow
  var foreach: KnockoutBindingHandler[_, _, _] = js.native
  var hasfocus: KnockoutBindingHandler[_, _, _] = js.native
  var html: KnockoutBindingHandler[_, _, _] = js.native
  var `if`: KnockoutBindingHandler[_, _, _] = js.native
  var ifnot: KnockoutBindingHandler[_, _, _] = js.native
  var options: KnockoutBindingHandler[_, _, _] = js.native
  var selectedOptions: KnockoutBindingHandler[_, _, _] = js.native
  var style: KnockoutBindingHandler[_, _, _] = js.native
  var submit: KnockoutBindingHandler[_, _, _] = js.native
  // Rendering templates
  var template: KnockoutBindingHandler[_, _, _] = js.native
  var text: KnockoutBindingHandler[_, _, _] = js.native
  var textInput: KnockoutBindingHandler[_, _, _] = js.native
  var uniqueName: KnockoutBindingHandler[_, _, _] = js.native
  var value: KnockoutBindingHandler[_, _, _] = js.native
  // Controlling text and appearance
  var visible: KnockoutBindingHandler[_, _, _] = js.native
  var `with`: KnockoutBindingHandler[_, _, _] = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    attr: KnockoutBindingHandler[_, _, _],
    checked: KnockoutBindingHandler[_, _, _],
    click: KnockoutBindingHandler[_, _, _],
    component: KnockoutBindingHandler[_, _, _],
    css: KnockoutBindingHandler[_, _, _],
    disable: KnockoutBindingHandler[_, _, _],
    enable: KnockoutBindingHandler[_, _, _],
    event: KnockoutBindingHandler[_, _, _],
    foreach: KnockoutBindingHandler[_, _, _],
    hasfocus: KnockoutBindingHandler[_, _, _],
    html: KnockoutBindingHandler[_, _, _],
    `if`: KnockoutBindingHandler[_, _, _],
    ifnot: KnockoutBindingHandler[_, _, _],
    options: KnockoutBindingHandler[_, _, _],
    selectedOptions: KnockoutBindingHandler[_, _, _],
    style: KnockoutBindingHandler[_, _, _],
    submit: KnockoutBindingHandler[_, _, _],
    template: KnockoutBindingHandler[_, _, _],
    text: KnockoutBindingHandler[_, _, _],
    textInput: KnockoutBindingHandler[_, _, _],
    uniqueName: KnockoutBindingHandler[_, _, _],
    value: KnockoutBindingHandler[_, _, _],
    visible: KnockoutBindingHandler[_, _, _],
    `with`: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], hasfocus = hasfocus.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInput = textInput.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeach(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasfocus(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIf(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfnot(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifnot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedOptions(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextInput(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

