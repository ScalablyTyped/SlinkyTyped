package typingsSlinky.reactElemental.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.textarea.tag
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
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

object TextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-elemental", "TextArea")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, cols, dangerouslySetInnerHTML, defaultValue, dir, disabled, draggable, form, hidden, id, lang, name, placeholder, required, rows, spellCheck, style, suppressContentEditableWarning, tabIndex, title, value, wrap */
  def apply(
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    alt: String = null,
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
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    crossOrigin: String = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    dirName: String = null,
    error: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    height: Double | String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    list: String = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onAnimationEnd: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAnimationIteration: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAnimationStart: AnimationEventHandler[HTMLTextAreaElement] with AnimationEventHandler[HTMLInputElement] = null,
    onAuxClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onBeforeInput: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onBlur: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement] = null,
    onCanPlay: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onCanPlayThrough: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onChange: ChangeEventHandler[HTMLTextAreaElement] with ChangeEventHandler[HTMLInputElement] = null,
    onClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onCompositionEnd: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onCompositionStart: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onCompositionUpdate: CompositionEventHandler[HTMLTextAreaElement] with CompositionEventHandler[HTMLInputElement] = null,
    onContextMenu: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onCopy: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onCut: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onDoubleClick: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onDrag: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragEnd: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragEnter: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragExit: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragLeave: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragOver: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDragStart: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDrop: DragEventHandler[HTMLTextAreaElement] with DragEventHandler[HTMLInputElement] = null,
    onDurationChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEmptied: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEncrypted: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onEnded: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onError: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onFocus: FocusEventHandler[HTMLTextAreaElement] with FocusEventHandler[HTMLInputElement] = null,
    onInput: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onInvalid: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] with KeyboardEventHandler[HTMLInputElement] = null,
    onLoad: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadStart: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadedData: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onLoadedMetadata: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onMouseDown: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseEnter: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseLeave: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseMove: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseOut: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseOver: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onMouseUp: MouseEventHandler[HTMLTextAreaElement] with MouseEventHandler[HTMLInputElement] = null,
    onPaste: ClipboardEventHandler[HTMLTextAreaElement] with ClipboardEventHandler[HTMLInputElement] = null,
    onPause: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPlay: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPlaying: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onPointerCancel: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerDown: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerEnter: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerLeave: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerMove: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerOut: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerOver: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onPointerUp: PointerEventHandler[HTMLTextAreaElement] with PointerEventHandler[HTMLInputElement] = null,
    onProgress: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onRateChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onReset: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onScroll: UIEventHandler[HTMLTextAreaElement] with UIEventHandler[HTMLInputElement] = null,
    onSeeked: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSeeking: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSelect: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onStalled: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onSubmit: FormEventHandler[HTMLTextAreaElement] with FormEventHandler[HTMLInputElement] = null,
    onSuspend: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onTimeUpdate: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onTouchCancel: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchEnd: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchMove: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTouchStart: TouchEventHandler[HTMLTextAreaElement] with TouchEventHandler[HTMLInputElement] = null,
    onTransitionEnd: TransitionEventHandler[HTMLTextAreaElement] with TransitionEventHandler[HTMLInputElement] = null,
    onVolumeChange: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onWaiting: ReactEventHandler[HTMLTextAreaElement] with ReactEventHandler[HTMLInputElement] = null,
    onWheel: WheelEventHandler[HTMLTextAreaElement] with WheelEventHandler[HTMLInputElement] = null,
    pattern: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    size: Int | Double = null,
    slot: String = null,
    src: String = null,
    step: Double | String = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    textarea: js.UndefOr[Boolean] = js.undefined,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    width: Double | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (dirName != null) __obj.updateDynamic("dirName")(dirName.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(onAnimationIteration.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(onAuxClick.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(onBeforeInput.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(onCut.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(onPause.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(onPointerCancel.asInstanceOf[js.Any])
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(onPointerDown.asInstanceOf[js.Any])
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(onPointerEnter.asInstanceOf[js.Any])
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(onPointerLeave.asInstanceOf[js.Any])
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(onPointerMove.asInstanceOf[js.Any])
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(onPointerOut.asInstanceOf[js.Any])
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(onPointerOver.asInstanceOf[js.Any])
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(onPointerUp.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked.asInstanceOf[js.Any])
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend.asInstanceOf[js.Any])
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd.asInstanceOf[js.Any])
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange.asInstanceOf[js.Any])
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting.asInstanceOf[js.Any])
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.textarea.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TextAreaProps
}

