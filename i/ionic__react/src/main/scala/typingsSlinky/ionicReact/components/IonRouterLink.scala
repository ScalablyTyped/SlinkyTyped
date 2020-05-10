package typingsSlinky.ionicReact.components

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
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonRouterLinkElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicReact.PickIonRouterLinkcolorhre
import typingsSlinky.ionicReact.ionicReactStrings.`additions text`
import typingsSlinky.ionicReact.ionicReactStrings.`inline`
import typingsSlinky.ionicReact.ionicReactStrings.additions
import typingsSlinky.ionicReact.ionicReactStrings.all
import typingsSlinky.ionicReact.ionicReactStrings.ascending
import typingsSlinky.ionicReact.ionicReactStrings.assertive
import typingsSlinky.ionicReact.ionicReactStrings.back
import typingsSlinky.ionicReact.ionicReactStrings.both
import typingsSlinky.ionicReact.ionicReactStrings.copy
import typingsSlinky.ionicReact.ionicReactStrings.date
import typingsSlinky.ionicReact.ionicReactStrings.decimal
import typingsSlinky.ionicReact.ionicReactStrings.descending
import typingsSlinky.ionicReact.ionicReactStrings.dialog
import typingsSlinky.ionicReact.ionicReactStrings.email
import typingsSlinky.ionicReact.ionicReactStrings.execute
import typingsSlinky.ionicReact.ionicReactStrings.forward
import typingsSlinky.ionicReact.ionicReactStrings.grammar
import typingsSlinky.ionicReact.ionicReactStrings.grid
import typingsSlinky.ionicReact.ionicReactStrings.horizontal
import typingsSlinky.ionicReact.ionicReactStrings.inherit
import typingsSlinky.ionicReact.ionicReactStrings.link
import typingsSlinky.ionicReact.ionicReactStrings.list
import typingsSlinky.ionicReact.ionicReactStrings.listbox
import typingsSlinky.ionicReact.ionicReactStrings.location
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
import typingsSlinky.ionicReact.ionicReactStrings.root
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
import typingsSlinky.react.AnonHtml
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonRouterLink {
  @JSImport("@ionic/react", "IonRouterLink")
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
    def color(value: Color with String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInnerHTML(value: AnonHtml): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
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
    def onAbort(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDrag(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExit(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: DragEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def onEnded(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onStalled(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLIonRouterLinkElement, Event_] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event_, HTMLIonRouterLinkElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLIonRouterLinkElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def routerDirection(value: none | forward | back | root): this.type = set("routerDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def routerLink(value: String): this.type = set("routerLink", value.asInstanceOf[js.Any])
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
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
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
  
  def withProps(p: PickIonRouterLinkcolorhre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onAbortCapture: js.Any,
    onAnimationEndCapture: js.Any,
    onAnimationIterationCapture: js.Any,
    onAnimationStartCapture: js.Any,
    onAuxClickCapture: js.Any,
    onBeforeInputCapture: js.Any,
    onBlurCapture: js.Any,
    onCanPlayCapture: js.Any,
    onCanPlayThroughCapture: js.Any,
    onChangeCapture: js.Any,
    onClickCapture: js.Any,
    onCompositionEndCapture: js.Any,
    onCompositionStartCapture: js.Any,
    onCompositionUpdateCapture: js.Any,
    onContextMenuCapture: js.Any,
    onCopyCapture: js.Any,
    onCutCapture: js.Any,
    onDoubleClickCapture: js.Any,
    onDragCapture: js.Any,
    onDragEndCapture: js.Any,
    onDragEnterCapture: js.Any,
    onDragExitCapture: js.Any,
    onDragLeaveCapture: js.Any,
    onDragOverCapture: js.Any,
    onDragStartCapture: js.Any,
    onDropCapture: js.Any,
    onDurationChangeCapture: js.Any,
    onEmptiedCapture: js.Any,
    onEncryptedCapture: js.Any,
    onEndedCapture: js.Any,
    onErrorCapture: js.Any,
    onFocusCapture: js.Any,
    onGotPointerCapture: js.Any,
    onGotPointerCaptureCapture: js.Any,
    onInputCapture: js.Any,
    onInvalidCapture: js.Any,
    onKeyDownCapture: js.Any,
    onKeyPressCapture: js.Any,
    onKeyUpCapture: js.Any,
    onLoadCapture: js.Any,
    onLoadStartCapture: js.Any,
    onLoadedDataCapture: js.Any,
    onLoadedMetadataCapture: js.Any,
    onLostPointerCapture: js.Any,
    onLostPointerCaptureCapture: js.Any,
    onMouseDownCapture: js.Any,
    onMouseMoveCapture: js.Any,
    onMouseOutCapture: js.Any,
    onMouseOverCapture: js.Any,
    onMouseUpCapture: js.Any,
    onPasteCapture: js.Any,
    onPauseCapture: js.Any,
    onPlayCapture: js.Any,
    onPlayingCapture: js.Any,
    onPointerCancelCapture: js.Any,
    onPointerDownCapture: js.Any,
    onPointerEnterCapture: js.Any,
    onPointerLeaveCapture: js.Any,
    onPointerMoveCapture: js.Any,
    onPointerOutCapture: js.Any,
    onPointerOverCapture: js.Any,
    onPointerUpCapture: js.Any,
    onProgressCapture: js.Any,
    onRateChangeCapture: js.Any,
    onResetCapture: js.Any,
    onScrollCapture: js.Any,
    onSeekedCapture: js.Any,
    onSeekingCapture: js.Any,
    onSelectCapture: js.Any,
    onStalledCapture: js.Any,
    onSubmitCapture: js.Any,
    onSuspendCapture: js.Any,
    onTimeUpdateCapture: js.Any,
    onTouchCancelCapture: js.Any,
    onTouchEndCapture: js.Any,
    onTouchMoveCapture: js.Any,
    onTouchStartCapture: js.Any,
    onTransitionEndCapture: js.Any,
    onVolumeChangeCapture: js.Any,
    onWaitingCapture: js.Any,
    onWheelCapture: js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(onAbortCapture = onAbortCapture.asInstanceOf[js.Any], onAnimationEndCapture = onAnimationEndCapture.asInstanceOf[js.Any], onAnimationIterationCapture = onAnimationIterationCapture.asInstanceOf[js.Any], onAnimationStartCapture = onAnimationStartCapture.asInstanceOf[js.Any], onAuxClickCapture = onAuxClickCapture.asInstanceOf[js.Any], onBeforeInputCapture = onBeforeInputCapture.asInstanceOf[js.Any], onBlurCapture = onBlurCapture.asInstanceOf[js.Any], onCanPlayCapture = onCanPlayCapture.asInstanceOf[js.Any], onCanPlayThroughCapture = onCanPlayThroughCapture.asInstanceOf[js.Any], onChangeCapture = onChangeCapture.asInstanceOf[js.Any], onClickCapture = onClickCapture.asInstanceOf[js.Any], onCompositionEndCapture = onCompositionEndCapture.asInstanceOf[js.Any], onCompositionStartCapture = onCompositionStartCapture.asInstanceOf[js.Any], onCompositionUpdateCapture = onCompositionUpdateCapture.asInstanceOf[js.Any], onContextMenuCapture = onContextMenuCapture.asInstanceOf[js.Any], onCopyCapture = onCopyCapture.asInstanceOf[js.Any], onCutCapture = onCutCapture.asInstanceOf[js.Any], onDoubleClickCapture = onDoubleClickCapture.asInstanceOf[js.Any], onDragCapture = onDragCapture.asInstanceOf[js.Any], onDragEndCapture = onDragEndCapture.asInstanceOf[js.Any], onDragEnterCapture = onDragEnterCapture.asInstanceOf[js.Any], onDragExitCapture = onDragExitCapture.asInstanceOf[js.Any], onDragLeaveCapture = onDragLeaveCapture.asInstanceOf[js.Any], onDragOverCapture = onDragOverCapture.asInstanceOf[js.Any], onDragStartCapture = onDragStartCapture.asInstanceOf[js.Any], onDropCapture = onDropCapture.asInstanceOf[js.Any], onDurationChangeCapture = onDurationChangeCapture.asInstanceOf[js.Any], onEmptiedCapture = onEmptiedCapture.asInstanceOf[js.Any], onEncryptedCapture = onEncryptedCapture.asInstanceOf[js.Any], onEndedCapture = onEndedCapture.asInstanceOf[js.Any], onErrorCapture = onErrorCapture.asInstanceOf[js.Any], onFocusCapture = onFocusCapture.asInstanceOf[js.Any], onGotPointerCapture = onGotPointerCapture.asInstanceOf[js.Any], onGotPointerCaptureCapture = onGotPointerCaptureCapture.asInstanceOf[js.Any], onInputCapture = onInputCapture.asInstanceOf[js.Any], onInvalidCapture = onInvalidCapture.asInstanceOf[js.Any], onKeyDownCapture = onKeyDownCapture.asInstanceOf[js.Any], onKeyPressCapture = onKeyPressCapture.asInstanceOf[js.Any], onKeyUpCapture = onKeyUpCapture.asInstanceOf[js.Any], onLoadCapture = onLoadCapture.asInstanceOf[js.Any], onLoadStartCapture = onLoadStartCapture.asInstanceOf[js.Any], onLoadedDataCapture = onLoadedDataCapture.asInstanceOf[js.Any], onLoadedMetadataCapture = onLoadedMetadataCapture.asInstanceOf[js.Any], onLostPointerCapture = onLostPointerCapture.asInstanceOf[js.Any], onLostPointerCaptureCapture = onLostPointerCaptureCapture.asInstanceOf[js.Any], onMouseDownCapture = onMouseDownCapture.asInstanceOf[js.Any], onMouseMoveCapture = onMouseMoveCapture.asInstanceOf[js.Any], onMouseOutCapture = onMouseOutCapture.asInstanceOf[js.Any], onMouseOverCapture = onMouseOverCapture.asInstanceOf[js.Any], onMouseUpCapture = onMouseUpCapture.asInstanceOf[js.Any], onPasteCapture = onPasteCapture.asInstanceOf[js.Any], onPauseCapture = onPauseCapture.asInstanceOf[js.Any], onPlayCapture = onPlayCapture.asInstanceOf[js.Any], onPlayingCapture = onPlayingCapture.asInstanceOf[js.Any], onPointerCancelCapture = onPointerCancelCapture.asInstanceOf[js.Any], onPointerDownCapture = onPointerDownCapture.asInstanceOf[js.Any], onPointerEnterCapture = onPointerEnterCapture.asInstanceOf[js.Any], onPointerLeaveCapture = onPointerLeaveCapture.asInstanceOf[js.Any], onPointerMoveCapture = onPointerMoveCapture.asInstanceOf[js.Any], onPointerOutCapture = onPointerOutCapture.asInstanceOf[js.Any], onPointerOverCapture = onPointerOverCapture.asInstanceOf[js.Any], onPointerUpCapture = onPointerUpCapture.asInstanceOf[js.Any], onProgressCapture = onProgressCapture.asInstanceOf[js.Any], onRateChangeCapture = onRateChangeCapture.asInstanceOf[js.Any], onResetCapture = onResetCapture.asInstanceOf[js.Any], onScrollCapture = onScrollCapture.asInstanceOf[js.Any], onSeekedCapture = onSeekedCapture.asInstanceOf[js.Any], onSeekingCapture = onSeekingCapture.asInstanceOf[js.Any], onSelectCapture = onSelectCapture.asInstanceOf[js.Any], onStalledCapture = onStalledCapture.asInstanceOf[js.Any], onSubmitCapture = onSubmitCapture.asInstanceOf[js.Any], onSuspendCapture = onSuspendCapture.asInstanceOf[js.Any], onTimeUpdateCapture = onTimeUpdateCapture.asInstanceOf[js.Any], onTouchCancelCapture = onTouchCancelCapture.asInstanceOf[js.Any], onTouchEndCapture = onTouchEndCapture.asInstanceOf[js.Any], onTouchMoveCapture = onTouchMoveCapture.asInstanceOf[js.Any], onTouchStartCapture = onTouchStartCapture.asInstanceOf[js.Any], onTransitionEndCapture = onTransitionEndCapture.asInstanceOf[js.Any], onVolumeChangeCapture = onVolumeChangeCapture.asInstanceOf[js.Any], onWaitingCapture = onWaitingCapture.asInstanceOf[js.Any], onWheelCapture = onWheelCapture.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickIonRouterLinkcolorhre]))
  }
}

