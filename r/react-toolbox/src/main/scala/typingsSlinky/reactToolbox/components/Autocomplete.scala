package typingsSlinky.reactToolbox.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToolbox.libAutocompleteAutocompleteMod.AutocompleteProps
import typingsSlinky.reactToolbox.libAutocompleteAutocompleteMod.AutocompleteTheme
import typingsSlinky.reactToolbox.libAutocompleteMod.default
import typingsSlinky.reactToolbox.libInputInputMod.InputTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.above
import typingsSlinky.reactToolbox.reactToolboxStrings.anywhere
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.below
import typingsSlinky.reactToolbox.reactToolboxStrings.disabled
import typingsSlinky.reactToolbox.reactToolboxStrings.down
import typingsSlinky.reactToolbox.reactToolboxStrings.none
import typingsSlinky.reactToolbox.reactToolboxStrings.start
import typingsSlinky.reactToolbox.reactToolboxStrings.up
import typingsSlinky.reactToolbox.reactToolboxStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Autocomplete {
  @JSImport("react-toolbox/lib/autocomplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowCreate(value: Boolean): this.type = set("allowCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: auto | up | down): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: TagMod[Any]): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def hintReactElement(value: ReactElement): this.type = set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def hint(value: TagMod[Any]): this.type = set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: TagMod[Any]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def keepFocusOnChange(value: Boolean): this.type = set("keepFocusOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: TagMod[Any]): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: js.Function): this.type = set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def onFocus(value: js.Function): this.type = set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyDown(value: js.Function): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyPress(value: js.Function): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyUp(value: js.Function): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onQueryChange(value: js.Function): this.type = set("onQueryChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedPosition(value: above | below | none): this.type = set("selectedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def showSelectedWhenNotInSource(value: Boolean): this.type = set("showSelectedWhenNotInSource", value.asInstanceOf[js.Any])
    @scala.inline
    def showSuggestionsWhenValueIsSet(value: Boolean): this.type = set("showSuggestionsWhenValueIsSet", value.asInstanceOf[js.Any])
    @scala.inline
    def source(value: js.Any): this.type = set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionMatch(value: disabled | start | anywhere | word): this.type = set("suggestionMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: AutocompleteTheme with InputTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutocompleteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Autocomplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

