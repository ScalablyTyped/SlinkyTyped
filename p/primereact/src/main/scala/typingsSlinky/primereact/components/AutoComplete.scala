package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.OriginalEvent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.autocompleteAutoCompleteMod.AutoCompleteProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  @JSImport("primereact/autocomplete", "AutoComplete")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.autocompleteMod.AutoComplete] {
    @scala.inline
    def appendTo(value: js.Any): this.type = set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def completeMethod(value: /* e */ OriginalEvent => Unit): this.type = set("completeMethod", js.Any.fromFunction1(value))
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdown(value: Boolean): this.type = set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownMode(value: String): this.type = set("dropdownMode", value.asInstanceOf[js.Any])
    @scala.inline
    def field(value: String): this.type = set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: js.Object): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTemplate(value: /* data */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def maxlength(value: Double): this.type = set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* event */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* e */ Value => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClear(value: /* event */ Event => Unit): this.type = set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: /* event */ Event => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: /* event */ Event => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onDblClick(value: /* event */ Event => Unit): this.type = set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDropdownClick(value: /* e */ OriginalEvent => Unit): this.type = set("onDropdownClick", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* event */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: /* event */ Event => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: /* event */ Event => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: /* event */ Event => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* e */ Value => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onUnselect(value: /* e */ Value => Unit): this.type = set("onUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedItemTemplate(value: /* data */ js.Any => js.UndefOr[ReactElement]): this.type = set("selectedItemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestions(value: js.Array[_]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def tabindex(value: Double): this.type = set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AutoComplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

