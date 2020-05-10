package typingsSlinky.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  var attr: KnockoutBindingHandler = js.native
  var checked: KnockoutBindingHandler = js.native
  // Working with form fields
  var click: KnockoutBindingHandler = js.native
  // Components (new for v3.2)
  var component: KnockoutBindingHandler = js.native
  var css: KnockoutBindingHandler = js.native
  var disable: KnockoutBindingHandler = js.native
  var enable: KnockoutBindingHandler = js.native
  var event: KnockoutBindingHandler = js.native
  // Control Flow
  var foreach: KnockoutBindingHandler = js.native
  var hasfocus: KnockoutBindingHandler = js.native
  var html: KnockoutBindingHandler = js.native
  var `if`: KnockoutBindingHandler = js.native
  var ifnot: KnockoutBindingHandler = js.native
  var options: KnockoutBindingHandler = js.native
  var selectedOptions: KnockoutBindingHandler = js.native
  var style: KnockoutBindingHandler = js.native
  var submit: KnockoutBindingHandler = js.native
  // Rendering templates
  var template: KnockoutBindingHandler = js.native
  var text: KnockoutBindingHandler = js.native
  var textInput: KnockoutBindingHandler = js.native
  var uniqueName: KnockoutBindingHandler = js.native
  var value: KnockoutBindingHandler = js.native
  // Controlling text and appearance
  var visible: KnockoutBindingHandler = js.native
  var `with`: KnockoutBindingHandler = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    attr: KnockoutBindingHandler,
    checked: KnockoutBindingHandler,
    click: KnockoutBindingHandler,
    component: KnockoutBindingHandler,
    css: KnockoutBindingHandler,
    disable: KnockoutBindingHandler,
    enable: KnockoutBindingHandler,
    event: KnockoutBindingHandler,
    foreach: KnockoutBindingHandler,
    hasfocus: KnockoutBindingHandler,
    html: KnockoutBindingHandler,
    `if`: KnockoutBindingHandler,
    ifnot: KnockoutBindingHandler,
    options: KnockoutBindingHandler,
    selectedOptions: KnockoutBindingHandler,
    style: KnockoutBindingHandler,
    submit: KnockoutBindingHandler,
    template: KnockoutBindingHandler,
    text: KnockoutBindingHandler,
    textInput: KnockoutBindingHandler,
    uniqueName: KnockoutBindingHandler,
    value: KnockoutBindingHandler,
    visible: KnockoutBindingHandler,
    `with`: KnockoutBindingHandler
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
    def withAttr(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeach(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasfocus(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIf(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfnot(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifnot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedOptions(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextInput(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith(value: KnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

