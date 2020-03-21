package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePane
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneStyleProps
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneStyles
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.ScrollbarVisibility
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
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
import typingsSlinky.std.Event_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollablePane
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "ScrollablePane")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, contentEditable, dangerouslySetInnerHTML, defaultChecked, defaultValue, dir, draggable, hidden, id, lang, placeholder, spellCheck, style, suppressContentEditableWarning, tabIndex, title */
  def apply(
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    color: String = null,
    componentRef: IRefObject[IScrollablePane] = null,
    contextMenu: String = null,
    datatype: String = null,
    initialScrollPosition: Int | Double = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    onAbort: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onAuxClick: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onBeforeInput: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onBlur: SyntheticFocusEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCanPlay: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCanPlayThrough: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onChange: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onClick: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onContextMenu: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCopy: SyntheticClipboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onCut: SyntheticClipboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDrag: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragEnd: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragEnter: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragExit: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragLeave: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragOver: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDragStart: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDrop: DragEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onDurationChange: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onEmptied: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onEncrypted: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onEnded: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onError: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onFocus: SyntheticFocusEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onInput: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onInvalid: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onLoad: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onLoadStart: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onLoadedData: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onLoadedMetadata: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseDown: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseMove: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseOut: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseOver: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onMouseUp: SyntheticMouseEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPaste: SyntheticClipboardEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPause: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPlay: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPlaying: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerDown: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerMove: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerOut: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerOver: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onPointerUp: SyntheticPointerEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onProgress: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onRateChange: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onReset: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onScroll: SyntheticUIEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onSeeked: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onSeeking: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onSelect: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onStalled: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onSubmit: SyntheticEvent[
      EventTarget with (HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase), 
      Event_
    ] => Unit = null,
    onSuspend: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTimeUpdate: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTouchMove: SyntheticTouchEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTouchStart: SyntheticTouchEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onVolumeChange: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onWaiting: SyntheticEvent[
      Event_, 
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    onWheel: SyntheticWheelEvent[
      HTMLElement | typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
    ] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollbarVisibility: ScrollbarVisibility = null,
    security: String = null,
    slot: String = null,
    styles: IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles] = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    theme: ITheme = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (initialScrollPosition != null) __obj.updateDynamic("initialScrollPosition")(initialScrollPosition.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollbarVisibility != null) __obj.updateDynamic("scrollbarVisibility")(scrollbarVisibility.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IScrollablePaneProps
}

