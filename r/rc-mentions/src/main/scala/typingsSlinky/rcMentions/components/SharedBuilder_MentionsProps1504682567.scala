package typingsSlinky.rcMentions.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mentionsMod.Placement
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.rcMentions.rcMentionsBooleans.`false`
import typingsSlinky.rcMentions.rcMentionsStrings.`additions text`
import typingsSlinky.rcMentions.rcMentionsStrings.`inline`
import typingsSlinky.rcMentions.rcMentionsStrings.additions
import typingsSlinky.rcMentions.rcMentionsStrings.all
import typingsSlinky.rcMentions.rcMentionsStrings.ascending
import typingsSlinky.rcMentions.rcMentionsStrings.assertive
import typingsSlinky.rcMentions.rcMentionsStrings.both
import typingsSlinky.rcMentions.rcMentionsStrings.copy
import typingsSlinky.rcMentions.rcMentionsStrings.date
import typingsSlinky.rcMentions.rcMentionsStrings.decimal
import typingsSlinky.rcMentions.rcMentionsStrings.descending
import typingsSlinky.rcMentions.rcMentionsStrings.dialog
import typingsSlinky.rcMentions.rcMentionsStrings.email
import typingsSlinky.rcMentions.rcMentionsStrings.execute
import typingsSlinky.rcMentions.rcMentionsStrings.grammar
import typingsSlinky.rcMentions.rcMentionsStrings.grid
import typingsSlinky.rcMentions.rcMentionsStrings.horizontal
import typingsSlinky.rcMentions.rcMentionsStrings.inherit
import typingsSlinky.rcMentions.rcMentionsStrings.link
import typingsSlinky.rcMentions.rcMentionsStrings.list
import typingsSlinky.rcMentions.rcMentionsStrings.listbox
import typingsSlinky.rcMentions.rcMentionsStrings.location
import typingsSlinky.rcMentions.rcMentionsStrings.menu
import typingsSlinky.rcMentions.rcMentionsStrings.mixed
import typingsSlinky.rcMentions.rcMentionsStrings.move
import typingsSlinky.rcMentions.rcMentionsStrings.no
import typingsSlinky.rcMentions.rcMentionsStrings.none
import typingsSlinky.rcMentions.rcMentionsStrings.numeric
import typingsSlinky.rcMentions.rcMentionsStrings.off
import typingsSlinky.rcMentions.rcMentionsStrings.on
import typingsSlinky.rcMentions.rcMentionsStrings.other
import typingsSlinky.rcMentions.rcMentionsStrings.page
import typingsSlinky.rcMentions.rcMentionsStrings.polite
import typingsSlinky.rcMentions.rcMentionsStrings.popup
import typingsSlinky.rcMentions.rcMentionsStrings.removals
import typingsSlinky.rcMentions.rcMentionsStrings.search
import typingsSlinky.rcMentions.rcMentionsStrings.spelling
import typingsSlinky.rcMentions.rcMentionsStrings.step
import typingsSlinky.rcMentions.rcMentionsStrings.tel
import typingsSlinky.rcMentions.rcMentionsStrings.text
import typingsSlinky.rcMentions.rcMentionsStrings.time
import typingsSlinky.rcMentions.rcMentionsStrings.tree
import typingsSlinky.rcMentions.rcMentionsStrings.url
import typingsSlinky.rcMentions.rcMentionsStrings.vertical
import typingsSlinky.rcMentions.rcMentionsStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_MentionsProps1504682567[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
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
  def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
  @scala.inline
  def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
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
  def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  @scala.inline
  def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
  @scala.inline
  def filterOptionFunction2(value: (/* input */ String, /* hasValue */ OptionProps) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
  @scala.inline
  def filterOption(value: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean])): this.type = set("filterOption", value.asInstanceOf[js.Any])
  @scala.inline
  def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
  @scala.inline
  def getPopupContainer(value: () => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction0(value))
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
  def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  @scala.inline
  def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  @scala.inline
  def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
  @scala.inline
  def notFoundContent(value: TagMod[Any]): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
  @scala.inline
  def onAbort(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationEnd(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationIteration(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationStart(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
  @scala.inline
  def onAuxClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
  @scala.inline
  def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  @scala.inline
  def onCanPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
  @scala.inline
  def onCanPlayThrough(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
  @scala.inline
  def onChange(value: /* text */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionEnd(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionStart(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
  @scala.inline
  def onContextMenu(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  @scala.inline
  def onCopy(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
  @scala.inline
  def onCut(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
  @scala.inline
  def onDoubleClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
  @scala.inline
  def onDrag(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
  @scala.inline
  def onDragEnd(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onDragEnter(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onDragExit(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
  @scala.inline
  def onDragLeave(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onDragOver(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
  @scala.inline
  def onDragStart(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  @scala.inline
  def onDrop(value: DragEvent[HTMLTextAreaElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  @scala.inline
  def onDurationChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
  @scala.inline
  def onEmptied(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
  @scala.inline
  def onEncrypted(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
  @scala.inline
  def onEnded(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
  @scala.inline
  def onError(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def onInput(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  @scala.inline
  def onInvalid(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyPress(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  @scala.inline
  def onLoad(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadStart(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadedData(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadedMetadata(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseDown(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseMove(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseOut(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseOver(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseUp(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  @scala.inline
  def onPaste(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
  @scala.inline
  def onPause(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
  @scala.inline
  def onPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
  @scala.inline
  def onPlaying(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerCancel(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerDown(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerEnter(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerLeave(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerMove(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerOut(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerOver(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerUp(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
  @scala.inline
  def onProgress(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
  @scala.inline
  def onRateChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
  @scala.inline
  def onReset(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
  @scala.inline
  def onScroll(value: SyntheticUIEvent[HTMLTextAreaElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  @scala.inline
  def onSearch(value: (/* text */ String, /* prefix */ String) => Unit): this.type = set("onSearch", js.Any.fromFunction2(value))
  @scala.inline
  def onSeeked(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
  @scala.inline
  def onSeeking(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
  @scala.inline
  def onSelect(value: (/* option */ OptionProps, /* prefix */ String) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
  @scala.inline
  def onStalled(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
  @scala.inline
  def onSubmit(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
  @scala.inline
  def onSuspend(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
  @scala.inline
  def onTimeUpdate(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchCancel(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchEnd(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchMove(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchStart(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  @scala.inline
  def onTransitionEnd(value: SyntheticTransitionEvent[HTMLTextAreaElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onVolumeChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
  @scala.inline
  def onWaiting(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
  @scala.inline
  def onWheel(value: SyntheticWheelEvent[HTMLTextAreaElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  @scala.inline
  def prefix(value: String | js.Array[String]): this.type = set("prefix", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
  @scala.inline
  def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
  @scala.inline
  def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  @scala.inline
  def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
  @scala.inline
  def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
  @scala.inline
  def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  @scala.inline
  def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
  @scala.inline
  def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
  @scala.inline
  def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  @scala.inline
  def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
  @scala.inline
  def split(value: String): this.type = set("split", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
  @scala.inline
  def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
  @scala.inline
  def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
  @scala.inline
  def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
  @scala.inline
  def validateSearch(value: (/* text */ String, MentionsProps) => Boolean): this.type = set("validateSearch", js.Any.fromFunction2(value))
  @scala.inline
  def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  @scala.inline
  def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  @scala.inline
  def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
}

