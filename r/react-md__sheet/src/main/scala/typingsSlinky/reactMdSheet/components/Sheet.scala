package typingsSlinky.reactMdSheet.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
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
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import typingsSlinky.reactMdSheet.reactMdSheetStrings.`additions text`
import typingsSlinky.reactMdSheet.reactMdSheetStrings.`inline`
import typingsSlinky.reactMdSheet.reactMdSheetStrings.additions
import typingsSlinky.reactMdSheet.reactMdSheetStrings.all
import typingsSlinky.reactMdSheet.reactMdSheetStrings.ascending
import typingsSlinky.reactMdSheet.reactMdSheetStrings.assertive
import typingsSlinky.reactMdSheet.reactMdSheetStrings.both
import typingsSlinky.reactMdSheet.reactMdSheetStrings.copy
import typingsSlinky.reactMdSheet.reactMdSheetStrings.date
import typingsSlinky.reactMdSheet.reactMdSheetStrings.decimal
import typingsSlinky.reactMdSheet.reactMdSheetStrings.descending
import typingsSlinky.reactMdSheet.reactMdSheetStrings.dialog
import typingsSlinky.reactMdSheet.reactMdSheetStrings.div
import typingsSlinky.reactMdSheet.reactMdSheetStrings.email
import typingsSlinky.reactMdSheet.reactMdSheetStrings.execute
import typingsSlinky.reactMdSheet.reactMdSheetStrings.first
import typingsSlinky.reactMdSheet.reactMdSheetStrings.grammar
import typingsSlinky.reactMdSheet.reactMdSheetStrings.grid
import typingsSlinky.reactMdSheet.reactMdSheetStrings.horizontal
import typingsSlinky.reactMdSheet.reactMdSheetStrings.inherit
import typingsSlinky.reactMdSheet.reactMdSheetStrings.last
import typingsSlinky.reactMdSheet.reactMdSheetStrings.link
import typingsSlinky.reactMdSheet.reactMdSheetStrings.list
import typingsSlinky.reactMdSheet.reactMdSheetStrings.listbox
import typingsSlinky.reactMdSheet.reactMdSheetStrings.location
import typingsSlinky.reactMdSheet.reactMdSheetStrings.menu
import typingsSlinky.reactMdSheet.reactMdSheetStrings.mixed
import typingsSlinky.reactMdSheet.reactMdSheetStrings.move
import typingsSlinky.reactMdSheet.reactMdSheetStrings.nav
import typingsSlinky.reactMdSheet.reactMdSheetStrings.no
import typingsSlinky.reactMdSheet.reactMdSheetStrings.none
import typingsSlinky.reactMdSheet.reactMdSheetStrings.numeric
import typingsSlinky.reactMdSheet.reactMdSheetStrings.off
import typingsSlinky.reactMdSheet.reactMdSheetStrings.on
import typingsSlinky.reactMdSheet.reactMdSheetStrings.other
import typingsSlinky.reactMdSheet.reactMdSheetStrings.page
import typingsSlinky.reactMdSheet.reactMdSheetStrings.polite
import typingsSlinky.reactMdSheet.reactMdSheetStrings.popup
import typingsSlinky.reactMdSheet.reactMdSheetStrings.removals
import typingsSlinky.reactMdSheet.reactMdSheetStrings.search
import typingsSlinky.reactMdSheet.reactMdSheetStrings.spelling
import typingsSlinky.reactMdSheet.reactMdSheetStrings.step
import typingsSlinky.reactMdSheet.reactMdSheetStrings.tel
import typingsSlinky.reactMdSheet.reactMdSheetStrings.text
import typingsSlinky.reactMdSheet.reactMdSheetStrings.time
import typingsSlinky.reactMdSheet.reactMdSheetStrings.tree
import typingsSlinky.reactMdSheet.reactMdSheetStrings.url
import typingsSlinky.reactMdSheet.reactMdSheetStrings.vertical
import typingsSlinky.reactMdSheet.reactMdSheetStrings.yes
import typingsSlinky.reactMdSheet.sheetMod.SheetHorizontalSize
import typingsSlinky.reactMdSheet.sheetMod.SheetPosition
import typingsSlinky.reactMdSheet.sheetMod.SheetVerticalSize
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactMdUtils.usePreviousFocusMod.FocusFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sheet {
  
  object SheetPropsPickSheetPropsh {
    
    @JSImport("@react-md/sheet", "Sheet")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLDivElement] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
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
      def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
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
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classNames(value: js.Any): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def component(value: div | nav): this.type = set("component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
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
      def defaultFocus(value: first | last | String): this.type = set("defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableEscapeClose(value: Boolean): this.type = set("disableEscapeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusCache(value: Boolean): this.type = set("disableFocusCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusContainer(value: Boolean): this.type = set("disableFocusContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnMount(value: Boolean): this.type = set("disableFocusOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnMountScroll(value: Boolean): this.type = set("disableFocusOnMountScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnUnmount(value: Boolean): this.type = set("disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableNestedDialogFixes(value: Boolean): this.type = set("disableNestedDialogFixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableScrollLock(value: Boolean): this.type = set("disableScrollLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableTabFocusWrap(value: Boolean): this.type = set("disableTabFocusWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableTransition(value: Boolean): this.type = set("disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def horizontalSize(value: SheetHorizontalSize): this.type = set("horizontalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
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
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mountOnEnter(value: js.Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnter(value: js.Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntered(value: js.Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntering(value: js.Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExit(value: js.Any): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExited(value: js.Any): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExiting(value: js.Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlay(value: Boolean): this.type = set("overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayHidden(value: Boolean): this.type = set("overlayHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoHTMLElement(value: HTMLElement): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoFunction0(value: () => HTMLElement | Null): this.type = set("portalInto", js.Any.fromFunction0(value))
      
      @scala.inline
      def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoNull: this.type = set("portalInto", null)
      
      @scala.inline
      def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(value: SheetPosition): this.type = set("position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: dialog | menu | none): this.type = set("role", value.asInstanceOf[js.Any])
      
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
      def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackHTMLElement(value: HTMLElement): this.type = set("unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackFunction0(value: () => HTMLElement | Null): this.type = set("unmountFocusFallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def unmountFocusFallback(value: FocusFallback): this.type = set("unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackNull: this.type = set("unmountFocusFallback", null)
      
      @scala.inline
      def unmountOnExit(value: js.Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def verticalSize(value: SheetVerticalSize): this.type = set("verticalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropsh): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      `aria-label`: js.UndefOr[String] with String,
      id: String,
      onRequestClose: () => Unit,
      visible: Boolean
    ): Builder = {
      val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __props.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropsh]))
    }
  }
  
  object SheetPropsPickSheetPropshAbout {
    
    @JSImport("@react-md/sheet", "Sheet")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLDivElement] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
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
      def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
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
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classNames(value: js.Any): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def component(value: div | nav): this.type = set("component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
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
      def defaultFocus(value: first | last | String): this.type = set("defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableEscapeClose(value: Boolean): this.type = set("disableEscapeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusCache(value: Boolean): this.type = set("disableFocusCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusContainer(value: Boolean): this.type = set("disableFocusContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnMount(value: Boolean): this.type = set("disableFocusOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnMountScroll(value: Boolean): this.type = set("disableFocusOnMountScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFocusOnUnmount(value: Boolean): this.type = set("disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableNestedDialogFixes(value: Boolean): this.type = set("disableNestedDialogFixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableScrollLock(value: Boolean): this.type = set("disableScrollLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableTabFocusWrap(value: Boolean): this.type = set("disableTabFocusWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableTransition(value: Boolean): this.type = set("disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def horizontalSize(value: SheetHorizontalSize): this.type = set("horizontalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
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
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mountOnEnter(value: js.Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnter(value: js.Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntered(value: js.Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntering(value: js.Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExit(value: js.Any): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExited(value: js.Any): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExiting(value: js.Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlay(value: Boolean): this.type = set("overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayHidden(value: Boolean): this.type = set("overlayHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoHTMLElement(value: HTMLElement): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoFunction0(value: () => HTMLElement | Null): this.type = set("portalInto", js.Any.fromFunction0(value))
      
      @scala.inline
      def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def portalIntoNull: this.type = set("portalInto", null)
      
      @scala.inline
      def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(value: SheetPosition): this.type = set("position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: dialog | menu | none): this.type = set("role", value.asInstanceOf[js.Any])
      
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
      def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackHTMLElement(value: HTMLElement): this.type = set("unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackFunction0(value: () => HTMLElement | Null): this.type = set("unmountFocusFallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def unmountFocusFallback(value: FocusFallback): this.type = set("unmountFocusFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountFocusFallbackNull: this.type = set("unmountFocusFallback", null)
      
      @scala.inline
      def unmountOnExit(value: js.Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def verticalSize(value: SheetVerticalSize): this.type = set("verticalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropshAbout): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      `aria-labelledby`: js.UndefOr[String] with String,
      id: String,
      onRequestClose: () => Unit,
      visible: Boolean
    ): Builder = {
      val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __props.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropshAbout]))
    }
  }
}
