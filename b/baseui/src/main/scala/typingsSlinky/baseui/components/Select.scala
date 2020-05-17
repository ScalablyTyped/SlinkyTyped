package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.LabelKey
import typingsSlinky.baseui.anon.Option
import typingsSlinky.baseui.anon.OptionOption
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.baseui.selectMod.OptionsT
import typingsSlinky.baseui.selectMod.SelectOverrides
import typingsSlinky.baseui.selectMod.SelectProps
import typingsSlinky.baseui.selectMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("baseui/select", "Select")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.selectMod.Select] {
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def backspaceRemoves(value: Boolean): this.type = set("backspaceRemoves", value.asInstanceOf[js.Any])
    @scala.inline
    def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def creatable(value: Boolean): this.type = set("creatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoves(value: Boolean): this.type = set("deleteRemoves", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def escapeClearsValue(value: Boolean): this.type = set("escapeClearsValue", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[LabelKey]) => Value
    ): this.type = set("filterOptions", js.Any.fromFunction4(value))
    @scala.inline
    def filterOutSelected(value: Boolean): this.type = set("filterOutSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def getOptionLabel(value: /* args */ Option => TagMod[Any]): this.type = set("getOptionLabel", js.Any.fromFunction1(value))
    @scala.inline
    def getValueLabel(value: /* args */ OptionOption => TagMod[Any]): this.type = set("getValueLabel", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def labelKey(value: String): this.type = set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDropdownHeight(value: String): this.type = set("maxDropdownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMsgReactElement(value: ReactElement): this.type = set("noResultsMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMsg(value: TagMod[Any]): this.type = set("noResultsMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* e */ Event => _): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onBlurResetsInput(value: Boolean): this.type = set("onBlurResetsInput", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* params */ OnChangeParams => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: () => _): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onCloseResetsInput(value: Boolean): this.type = set("onCloseResetsInput", value.asInstanceOf[js.Any])
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def onOpen(value: () => _): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSelectResetsInput(value: Boolean): this.type = set("onSelectResetsInput", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnClick(value: Boolean): this.type = set("openOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def options(value: OptionsT): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: SelectOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: TagMod[Any]): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: select | search): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueKey(value: String): this.type = set("valueKey", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Select.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

