package typingsSlinky.ionicReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CompositionEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicReact.anon.PickIonicReactExternalProAbout
import typingsSlinky.ionicReact.ionicReactStrings.`additions text`
import typingsSlinky.ionicReact.ionicReactStrings.`inline`
import typingsSlinky.ionicReact.ionicReactStrings.additions
import typingsSlinky.ionicReact.ionicReactStrings.all
import typingsSlinky.ionicReact.ionicReactStrings.ascending
import typingsSlinky.ionicReact.ionicReactStrings.assertive
import typingsSlinky.ionicReact.ionicReactStrings.both
import typingsSlinky.ionicReact.ionicReactStrings.copy
import typingsSlinky.ionicReact.ionicReactStrings.date
import typingsSlinky.ionicReact.ionicReactStrings.descending
import typingsSlinky.ionicReact.ionicReactStrings.dialog
import typingsSlinky.ionicReact.ionicReactStrings.execute
import typingsSlinky.ionicReact.ionicReactStrings.grammar
import typingsSlinky.ionicReact.ionicReactStrings.grid
import typingsSlinky.ionicReact.ionicReactStrings.horizontal
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
import typingsSlinky.ionicReact.ionicReactStrings.off
import typingsSlinky.ionicReact.ionicReactStrings.other
import typingsSlinky.ionicReact.ionicReactStrings.page
import typingsSlinky.ionicReact.ionicReactStrings.polite
import typingsSlinky.ionicReact.ionicReactStrings.popup
import typingsSlinky.ionicReact.ionicReactStrings.removals
import typingsSlinky.ionicReact.ionicReactStrings.spelling
import typingsSlinky.ionicReact.ionicReactStrings.step
import typingsSlinky.ionicReact.ionicReactStrings.text
import typingsSlinky.ionicReact.ionicReactStrings.time
import typingsSlinky.ionicReact.ionicReactStrings.tree
import typingsSlinky.ionicReact.ionicReactStrings.vertical
import typingsSlinky.ionicReact.ionicReactStrings.yes
import typingsSlinky.ionicons.componentsMod.global.HTMLIonIconElement
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonIconInner {
  @JSImport("@ionic/react/dist/types/components/inner-proxies", "IonIconInner")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
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
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def `class`(value: String | StringDictionary[Boolean]): this.type = set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentEditable(value: Boolean | String): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
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
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def flipRtl(value: Boolean): this.type = set("flipRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: js.Any): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def innerHTML(value: String): this.type = set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def ios(value: String): this.type = set("ios", value.asInstanceOf[js.Any])
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
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def md(value: String): this.type = set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: ios | md): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEndCapture(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIteration(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIterationCapture(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationIterationCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStartCapture(value: /* event */ AnimationEvent => Unit): this.type = set("onAnimationStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClick(value: /* event */ MouseEvent => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLIonIconElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* event */ FocusEvent => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onBlurCapture(value: /* event */ FocusEvent => Unit): this.type = set("onBlurCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* event */ Event => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onChangeCapture(value: /* event */ Event => Unit): this.type = set("onChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: /* event */ MouseEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onClickCapture(value: /* event */ MouseEvent => Unit): this.type = set("onClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionEnd(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionEndCapture(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStart(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStartCapture(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdate(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdateCapture(value: /* event */ CompositionEvent => Unit): this.type = set("onCompositionUpdateCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: /* event */ MouseEvent => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenuCapture(value: /* event */ MouseEvent => Unit): this.type = set("onContextMenuCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: /* event */ ClipboardEvent => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCopyCapture(value: /* event */ ClipboardEvent => Unit): this.type = set("onCopyCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCut(value: /* event */ ClipboardEvent => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def onCutCapture(value: /* event */ ClipboardEvent => Unit): this.type = set("onCutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDblClick(value: /* event */ MouseEvent => Unit): this.type = set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDblClickCapture(value: /* event */ MouseEvent => Unit): this.type = set("onDblClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLIonIconElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: /* event */ DragEvent => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: /* event */ DragEvent => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEndCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: /* event */ DragEvent => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnterCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExit(value: /* event */ DragEvent => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExitCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragExitCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: /* event */ DragEvent => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeaveCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: /* event */ DragEvent => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOverCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: /* event */ DragEvent => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStartCapture(value: /* event */ DragEvent => Unit): this.type = set("onDragStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: /* event */ DragEvent => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onDropCapture(value: /* event */ DragEvent => Unit): this.type = set("onDropCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* event */ Event => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onErrorCapture(value: /* event */ Event => Unit): this.type = set("onErrorCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* event */ FocusEvent => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onFocusCapture(value: /* event */ FocusEvent => Unit): this.type = set("onFocusCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onGotPointerCapture(value: /* event */ PointerEvent => Unit): this.type = set("onGotPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onGotPointerCaptureCapture(value: /* event */ PointerEvent => Unit): this.type = set("onGotPointerCaptureCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onInput(value: /* event */ Event => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onInputCapture(value: /* event */ Event => Unit): this.type = set("onInputCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onInvalid(value: /* event */ Event => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def onInvalidCapture(value: /* event */ Event => Unit): this.type = set("onInvalidCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDownCapture(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPressCapture(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyPressCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUpCapture(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: /* event */ Event => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadCapture(value: /* event */ Event => Unit): this.type = set("onLoadCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onLostPointerCapture(value: /* event */ PointerEvent => Unit): this.type = set("onLostPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onLostPointerCaptureCapture(value: /* event */ PointerEvent => Unit): this.type = set("onLostPointerCaptureCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: /* event */ MouseEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDownCapture(value: /* event */ MouseEvent => Unit): this.type = set("onMouseDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* event */ MouseEvent => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* event */ MouseEvent => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: /* event */ MouseEvent => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMoveCapture(value: /* event */ MouseEvent => Unit): this.type = set("onMouseMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOut(value: /* event */ MouseEvent => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOutCapture(value: /* event */ MouseEvent => Unit): this.type = set("onMouseOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: /* event */ MouseEvent => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOverCapture(value: /* event */ MouseEvent => Unit): this.type = set("onMouseOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: /* event */ MouseEvent => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUpCapture(value: /* event */ MouseEvent => Unit): this.type = set("onMouseUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: /* event */ ClipboardEvent => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onPasteCapture(value: /* event */ ClipboardEvent => Unit): this.type = set("onPasteCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onPointerCancel(value: /* event */ PointerEvent => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerCancelCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDown(value: /* event */ PointerEvent => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDownCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnter(value: /* event */ PointerEvent => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnterCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeave(value: /* event */ PointerEvent => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeaveCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMove(value: /* event */ PointerEvent => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMoveCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOut(value: /* event */ PointerEvent => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOutCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOver(value: /* event */ PointerEvent => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOverCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUp(value: /* event */ PointerEvent => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUpCapture(value: /* event */ PointerEvent => Unit): this.type = set("onPointerUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onReset(value: /* event */ Event => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def onResetCapture(value: /* event */ Event => Unit): this.type = set("onResetCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: /* event */ UIEvent => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onScrollCapture(value: /* event */ UIEvent => Unit): this.type = set("onScrollCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onSubmit(value: /* event */ Event => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmitCapture(value: /* event */ Event => Unit): this.type = set("onSubmitCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchCancel(value: /* event */ TouchEvent => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchCancelCapture(value: /* event */ TouchEvent => Unit): this.type = set("onTouchCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: /* event */ TouchEvent => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEndCapture(value: /* event */ TouchEvent => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: /* event */ TouchEvent => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMoveCapture(value: /* event */ TouchEvent => Unit): this.type = set("onTouchMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: /* event */ TouchEvent => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStartCapture(value: /* event */ TouchEvent => Unit): this.type = set("onTouchStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: /* event */ TransitionEvent => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEndCapture(value: /* event */ TransitionEvent => Unit): this.type = set("onTransitionEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def onWheel(value: /* event */ WheelEvent => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def onWheelCapture(value: /* event */ WheelEvent => Unit): this.type = set("onWheelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def part(value: String): this.type = set("part", value.asInstanceOf[js.Any])
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
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
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
    def unselectable(value: Boolean): this.type = set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickIonicReactExternalProAbout): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IonIconInner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

