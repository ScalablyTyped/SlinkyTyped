package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
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
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonListHeaderElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicReact.anon.IonListHeaderPickHTMLAttr
import typingsSlinky.ionicReact.ionicReactStrings.`additions text`
import typingsSlinky.ionicReact.ionicReactStrings.`inline`
import typingsSlinky.ionicReact.ionicReactStrings.additions
import typingsSlinky.ionicReact.ionicReactStrings.all
import typingsSlinky.ionicReact.ionicReactStrings.ascending
import typingsSlinky.ionicReact.ionicReactStrings.assertive
import typingsSlinky.ionicReact.ionicReactStrings.both
import typingsSlinky.ionicReact.ionicReactStrings.copy
import typingsSlinky.ionicReact.ionicReactStrings.date
import typingsSlinky.ionicReact.ionicReactStrings.decimal
import typingsSlinky.ionicReact.ionicReactStrings.descending
import typingsSlinky.ionicReact.ionicReactStrings.dialog
import typingsSlinky.ionicReact.ionicReactStrings.email
import typingsSlinky.ionicReact.ionicReactStrings.execute
import typingsSlinky.ionicReact.ionicReactStrings.full
import typingsSlinky.ionicReact.ionicReactStrings.grammar
import typingsSlinky.ionicReact.ionicReactStrings.grid
import typingsSlinky.ionicReact.ionicReactStrings.horizontal
import typingsSlinky.ionicReact.ionicReactStrings.inherit
import typingsSlinky.ionicReact.ionicReactStrings.inset
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.link
import typingsSlinky.ionicReact.ionicReactStrings.list
import typingsSlinky.ionicReact.ionicReactStrings.listbox
import typingsSlinky.ionicReact.ionicReactStrings.location
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.ionicReactStrings.menu
import typingsSlinky.ionicReact.ionicReactStrings.mixed
import typingsSlinky.ionicReact.ionicReactStrings.move
import typingsSlinky.ionicReact.ionicReactStrings.no
import typingsSlinky.ionicReact.ionicReactStrings.none
import typingsSlinky.ionicReact.ionicReactStrings.numeric
import typingsSlinky.ionicReact.ionicReactStrings.off
import typingsSlinky.ionicReact.ionicReactStrings.on
import typingsSlinky.ionicReact.ionicReactStrings.other
import typingsSlinky.ionicReact.ionicReactStrings.page
import typingsSlinky.ionicReact.ionicReactStrings.polite
import typingsSlinky.ionicReact.ionicReactStrings.popup
import typingsSlinky.ionicReact.ionicReactStrings.removals
import typingsSlinky.ionicReact.ionicReactStrings.search
import typingsSlinky.ionicReact.ionicReactStrings.spelling
import typingsSlinky.ionicReact.ionicReactStrings.step
import typingsSlinky.ionicReact.ionicReactStrings.tel
import typingsSlinky.ionicReact.ionicReactStrings.text
import typingsSlinky.ionicReact.ionicReactStrings.time
import typingsSlinky.ionicReact.ionicReactStrings.tree
import typingsSlinky.ionicReact.ionicReactStrings.url
import typingsSlinky.ionicReact.ionicReactStrings.vertical
import typingsSlinky.ionicReact.ionicReactStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonListHeader {
  
  @JSImport("@ionic/react", "IonListHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLIonListHeaderElement] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
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
    def `class`(value: String): this.type = set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
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
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
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
    def lines(value: full | inset | none): this.type = set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: ios | md): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLIonListHeaderElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLIonListHeaderElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLIonListHeaderElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
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
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IonListHeaderPickHTMLAttr): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(color: js.UndefOr[Color] with js.UndefOr[String]): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IonListHeaderPickHTMLAttr]))
  }
}
