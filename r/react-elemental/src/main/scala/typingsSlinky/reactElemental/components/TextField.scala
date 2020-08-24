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
import typingsSlinky.reactElemental.mod.TextFieldProps
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

object TextField {
  @JSImport("react-elemental", "TextField")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.TextField] {
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
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
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
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]],
    onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]],
    onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]],
    onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]]
  ): Builder = {
    val __props = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationEnd = onAnimationEnd.asInstanceOf[js.Any], onAnimationIteration = onAnimationIteration.asInstanceOf[js.Any], onAnimationStart = onAnimationStart.asInstanceOf[js.Any], onAuxClick = onAuxClick.asInstanceOf[js.Any], onBeforeInput = onBeforeInput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanPlay = onCanPlay.asInstanceOf[js.Any], onCanPlayThrough = onCanPlayThrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionEnd = onCompositionEnd.asInstanceOf[js.Any], onCompositionStart = onCompositionStart.asInstanceOf[js.Any], onCompositionUpdate = onCompositionUpdate.asInstanceOf[js.Any], onContextMenu = onContextMenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDoubleClick = onDoubleClick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragEnd = onDragEnd.asInstanceOf[js.Any], onDragEnter = onDragEnter.asInstanceOf[js.Any], onDragExit = onDragExit.asInstanceOf[js.Any], onDragLeave = onDragLeave.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], onDragStart = onDragStart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationChange = onDurationChange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadStart = onLoadStart.asInstanceOf[js.Any], onLoadedData = onLoadedData.asInstanceOf[js.Any], onLoadedMetadata = onLoadedMetadata.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointerCancel = onPointerCancel.asInstanceOf[js.Any], onPointerDown = onPointerDown.asInstanceOf[js.Any], onPointerEnter = onPointerEnter.asInstanceOf[js.Any], onPointerLeave = onPointerLeave.asInstanceOf[js.Any], onPointerMove = onPointerMove.asInstanceOf[js.Any], onPointerOut = onPointerOut.asInstanceOf[js.Any], onPointerOver = onPointerOver.asInstanceOf[js.Any], onPointerUp = onPointerUp.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRateChange = onRateChange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeUpdate = onTimeUpdate.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransitionEnd = onTransitionEnd.asInstanceOf[js.Any], onVolumeChange = onVolumeChange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TextFieldProps]))
  }
}

