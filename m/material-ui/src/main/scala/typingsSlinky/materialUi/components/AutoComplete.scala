package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.AutoCompleteProps
import typingsSlinky.materialUi.MaterialUI.DividerProps
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.Menus.MenuItemProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.materialUi.anon.Text
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.reactStrings.`additions removals`
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.`removals additions`
import typingsSlinky.react.reactStrings.`removals text`
import typingsSlinky.react.reactStrings.`text additions`
import typingsSlinky.react.reactStrings.`text removals`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.vertical
import typingsSlinky.react.reactStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoComplete {
  
  @JSImport("material-ui", "AutoComplete")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.AutoComplete] {
    
    @scala.inline
    def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceConfig(value: Text): this.type = set("dataSourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorText(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: (/* searchText */ String, /* key */ String, js.Any) => Boolean): this.type = set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelFocusStyle(value: CSSProperties): this.type = set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelShrinkStyle(value: CSSProperties): this.type = set("floatingLabelShrinkStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelTextReactElement(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelText(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintTextReactElement(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintText(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxSearchResults(value: Double): this.type = set("maxSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxlength(value: String): this.type = set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuCloseDelay(value: Double): this.type = set("menuCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuProps(value: js.Any): this.type = set("menuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minlength(value: String): this.type = set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiLine(value: Boolean): this.type = set("multiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(
      value: (SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event], /* newValue */ String) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNewRequest(value: (js.Any, /* index */ Double) => Unit): this.type = set("onNewRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def onUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[js.Any]) => Unit): this.type = set("onUpdateInput", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popoverProps(value: PopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textFieldStyle(value: CSSProperties): this.type = set("textFieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textareaStyle(value: CSSProperties): this.type = set("textareaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineShow(value: Boolean): this.type = set("underlineShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(dataSource: js.Array[js.Any]): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteProps[js.Any]]))
  }
  
  object Divider {
    
    @JSImport("material-ui", "AutoComplete.Divider")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DividerProps): typingsSlinky.materialUi.components.AutoComplete.Divider.Builder = new typingsSlinky.materialUi.components.AutoComplete.Divider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Divider.type): typingsSlinky.materialUi.components.AutoComplete.Divider.Builder = new typingsSlinky.materialUi.components.AutoComplete.Divider.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    
    @JSImport("material-ui", "AutoComplete.Item")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoGenerateNestedIndicator(value: Boolean): this.type = set("autoGenerateNestedIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerElementReactElement(value: ReactElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerElement(value: ReactElement | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def desktop(value: Boolean): this.type = set("desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableKeyboardFocus(value: Boolean): this.type = set("disableKeyboardFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def focusRippleColor(value: String): this.type = set("focusRippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def focusRippleOpacity(value: Double): this.type = set("focusRippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def focusState(value: String): this.type = set("focusState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hoverColor(value: String): this.type = set("hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def initiallyOpen(value: Boolean): this.type = set("initiallyOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def innerDivStyle(value: CSSProperties): this.type = set("innerDivStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def insetChildren(value: Boolean): this.type = set("insetChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboardFocused(value: Boolean): this.type = set("keyboardFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: String | ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def leftAvatar(value: ReactElement): this.type = set("leftAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def leftCheckbox(value: ReactElement): this.type = set("leftCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def leftIcon(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def menuItemsReactElement(value: ReactElement): this.type = set("menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def menuItems(value: ReactElement): this.type = set("menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nestedItemsVarargs(value: ReactElement*): this.type = set("nestedItems", js.Array(value :_*))
      
      @scala.inline
      def nestedItems(value: js.Array[ReactElement]): this.type = set("nestedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nestedLevel(value: Double): this.type = set("nestedLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nestedListStyle(value: CSSProperties): this.type = set("nestedListStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrag(value: DragEvent[js.Object] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnd(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnter(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExit(value: DragEvent[js.Object] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeave(value: DragEvent[js.Object] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOver(value: DragEvent[js.Object] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStart(value: DragEvent[js.Object] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrop(value: DragEvent[js.Object] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEnded(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onError(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): this.type = set("onKeyboardFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def onLoad(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onNestedListToggle(value: ReactComponentClass[ListItemProps] => Unit): this.type = set("onNestedListToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPause(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgress(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[js.Object] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalled(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[js.Object] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[js.Object] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def primaryTextReactElement(value: ReactElement): this.type = set("primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def primaryText(value: ReactElement): this.type = set("primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def primaryTogglesNestedList(value: Boolean): this.type = set("primaryTogglesNestedList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightAvatar(value: ReactElement): this.type = set("rightAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightIcon(value: ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightIconButton(value: ReactElement): this.type = set("rightIconButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightToggle(value: ReactElement): this.type = set("rightToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryTextReactElement(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryText(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryTextLines(value: Double): this.type = set("secondaryTextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchRippleColor(value: String): this.type = set("touchRippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchRippleOpacity(value: Double): this.type = set("touchRippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: MenuItemProps): typingsSlinky.materialUi.components.AutoComplete.Item.Builder = new typingsSlinky.materialUi.components.AutoComplete.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): typingsSlinky.materialUi.components.AutoComplete.Item.Builder = new typingsSlinky.materialUi.components.AutoComplete.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
