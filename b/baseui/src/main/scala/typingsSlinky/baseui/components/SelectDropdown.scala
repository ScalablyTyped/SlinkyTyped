package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.EventItem
import typingsSlinky.baseui.anon.OptionState
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.baseui.selectMod.DropdownOverrides
import typingsSlinky.baseui.selectMod.DropdownProps
import typingsSlinky.baseui.selectMod.Value
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectDropdown {
  @JSImport("baseui/select", "SelectDropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.selectMod.SelectDropdown] {
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def getOptionLabel(value: /* args */ OptionState => TagMod[Any]): this.type = set("getOptionLabel", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def labelKey(value: String): this.type = set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDropdownHeight(value: String): this.type = set("maxDropdownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMsgReactElement(value: ReactElement): this.type = set("noResultsMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMsg(value: TagMod[Any]): this.type = set("noResultsMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def onActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): this.type = set("onActiveDescendantChange", js.Any.fromFunction1(value))
    @scala.inline
    def onItemSelect(value: /* args */ EventItem => js.Any): this.type = set("onItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def options(value: Value): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: DropdownOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: select | search): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueKey(value: String): this.type = set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SelectDropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

