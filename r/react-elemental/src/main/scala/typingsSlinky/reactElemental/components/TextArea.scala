package typingsSlinky.reactElemental.components

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactElemental.mod.TextAreaProps
import typingsSlinky.reactElemental.reactElementalStrings.`additions text`
import typingsSlinky.reactElemental.reactElementalStrings.`inline`
import typingsSlinky.reactElemental.reactElementalStrings.additions
import typingsSlinky.reactElemental.reactElementalStrings.all
import typingsSlinky.reactElemental.reactElementalStrings.ascending
import typingsSlinky.reactElemental.reactElementalStrings.assertive
import typingsSlinky.reactElemental.reactElementalStrings.both
import typingsSlinky.reactElemental.reactElementalStrings.copy
import typingsSlinky.reactElemental.reactElementalStrings.date
import typingsSlinky.reactElemental.reactElementalStrings.decimal
import typingsSlinky.reactElemental.reactElementalStrings.descending
import typingsSlinky.reactElemental.reactElementalStrings.dialog
import typingsSlinky.reactElemental.reactElementalStrings.email
import typingsSlinky.reactElemental.reactElementalStrings.execute
import typingsSlinky.reactElemental.reactElementalStrings.grammar
import typingsSlinky.reactElemental.reactElementalStrings.grid
import typingsSlinky.reactElemental.reactElementalStrings.horizontal
import typingsSlinky.reactElemental.reactElementalStrings.inherit
import typingsSlinky.reactElemental.reactElementalStrings.link
import typingsSlinky.reactElemental.reactElementalStrings.list
import typingsSlinky.reactElemental.reactElementalStrings.listbox
import typingsSlinky.reactElemental.reactElementalStrings.location
import typingsSlinky.reactElemental.reactElementalStrings.menu
import typingsSlinky.reactElemental.reactElementalStrings.mixed
import typingsSlinky.reactElemental.reactElementalStrings.move
import typingsSlinky.reactElemental.reactElementalStrings.no
import typingsSlinky.reactElemental.reactElementalStrings.none
import typingsSlinky.reactElemental.reactElementalStrings.numeric
import typingsSlinky.reactElemental.reactElementalStrings.off
import typingsSlinky.reactElemental.reactElementalStrings.on
import typingsSlinky.reactElemental.reactElementalStrings.other
import typingsSlinky.reactElemental.reactElementalStrings.page
import typingsSlinky.reactElemental.reactElementalStrings.polite
import typingsSlinky.reactElemental.reactElementalStrings.popup
import typingsSlinky.reactElemental.reactElementalStrings.removals
import typingsSlinky.reactElemental.reactElementalStrings.search
import typingsSlinky.reactElemental.reactElementalStrings.spelling
import typingsSlinky.reactElemental.reactElementalStrings.step
import typingsSlinky.reactElemental.reactElementalStrings.tel
import typingsSlinky.reactElemental.reactElementalStrings.text
import typingsSlinky.reactElemental.reactElementalStrings.time
import typingsSlinky.reactElemental.reactElementalStrings.tree
import typingsSlinky.reactElemental.reactElementalStrings.url
import typingsSlinky.reactElemental.reactElementalStrings.vertical
import typingsSlinky.reactElemental.reactElementalStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextArea {
  @JSImport("react-elemental", "TextArea")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
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
    def capture(value: Boolean | String): this.type = set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
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
    def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def dirName(value: String): this.type = set("dirName", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
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
    def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onAbort(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]): this.type = set("onAnimationEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationIteration(value: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]): this.type = set("onAnimationIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationStart(value: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement]): this.type = set("onAnimationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onAuxClick(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onAuxClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onBeforeInput(value: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]): this.type = set("onBeforeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement]): this.type = set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def onCanPlay(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onCanPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def onCanPlayThrough(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onCanPlayThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEventHandler[HTMLTextAreaElement] with ChangeEventHandler[HTMLInputElement]): this.type = set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onCompositionEnd(value: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]): this.type = set("onCompositionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onCompositionStart(value: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]): this.type = set("onCompositionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onCompositionUpdate(value: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement]): this.type = set("onCompositionUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def onContextMenu(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def onCopy(value: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]): this.type = set("onCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def onCut(value: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]): this.type = set("onCut", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnd(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnter(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragExit(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragLeave(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragOver(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragStart(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrop(value: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement]): this.type = set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def onDurationChange(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onDurationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onEmptied(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onEmptied", value.asInstanceOf[js.Any])
    @scala.inline
    def onEncrypted(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnded(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def onFocus(value: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement]): this.type = set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def onInput(value: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]): this.type = set("onInput", value.asInstanceOf[js.Any])
    @scala.inline
    def onInvalid(value: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]): this.type = set("onInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyDown(value: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyPress(value: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyUp(value: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement]): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoad(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoadStart(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoadedData(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onLoadedData", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoadedMetadata(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onLoadedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseDown(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseEnter(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseLeave(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseMove(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOut(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOver(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseUp(value: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement]): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onPaste(value: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement]): this.type = set("onPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def onPause(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onPause", value.asInstanceOf[js.Any])
    @scala.inline
    def onPlay(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def onPlaying(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerCancel(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerDown(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerEnter(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerLeave(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerMove(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerOut(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerOver(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerUp(value: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement]): this.type = set("onPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onProgress(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def onRateChange(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onRateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onReset(value: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]): this.type = set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def onScroll(value: UIEventHandler[HTMLTextAreaElement] with UIEventHandler[HTMLInputElement]): this.type = set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def onSeeked(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onSeeked", value.asInstanceOf[js.Any])
    @scala.inline
    def onSeeking(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def onStalled(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onStalled", value.asInstanceOf[js.Any])
    @scala.inline
    def onSubmit(value: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement]): this.type = set("onSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def onSuspend(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onSuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def onTimeUpdate(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onTimeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchCancel(value: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchEnd(value: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchMove(value: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchStart(value: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement]): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onTransitionEnd(value: TransitionEventHandler[HTMLTextAreaElement] with TransitionEventHandler[HTMLInputElement]): this.type = set("onTransitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onVolumeChange(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onVolumeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onWaiting(value: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement]): this.type = set("onWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def onWheel(value: WheelEventHandler[HTMLTextAreaElement] with WheelEventHandler[HTMLInputElement]): this.type = set("onWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
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
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def textarea(value: Boolean): this.type = set("textarea", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextAreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TextArea.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

