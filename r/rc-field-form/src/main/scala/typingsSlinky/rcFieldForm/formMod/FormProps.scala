package typingsSlinky.rcFieldForm.formMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
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
import typingsSlinky.rcFieldForm.interfaceMod.FieldData
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.ValidateErrorEntity
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import typingsSlinky.rcFieldForm.rcFieldFormStrings.`additions text`
import typingsSlinky.rcFieldForm.rcFieldFormStrings.`inline`
import typingsSlinky.rcFieldForm.rcFieldFormStrings.additions
import typingsSlinky.rcFieldForm.rcFieldFormStrings.all
import typingsSlinky.rcFieldForm.rcFieldFormStrings.ascending
import typingsSlinky.rcFieldForm.rcFieldFormStrings.assertive
import typingsSlinky.rcFieldForm.rcFieldFormStrings.both
import typingsSlinky.rcFieldForm.rcFieldFormStrings.copy
import typingsSlinky.rcFieldForm.rcFieldFormStrings.date
import typingsSlinky.rcFieldForm.rcFieldFormStrings.decimal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.descending
import typingsSlinky.rcFieldForm.rcFieldFormStrings.dialog
import typingsSlinky.rcFieldForm.rcFieldFormStrings.email
import typingsSlinky.rcFieldForm.rcFieldFormStrings.execute
import typingsSlinky.rcFieldForm.rcFieldFormStrings.grammar
import typingsSlinky.rcFieldForm.rcFieldFormStrings.grid
import typingsSlinky.rcFieldForm.rcFieldFormStrings.horizontal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.inherit
import typingsSlinky.rcFieldForm.rcFieldFormStrings.link
import typingsSlinky.rcFieldForm.rcFieldFormStrings.list
import typingsSlinky.rcFieldForm.rcFieldFormStrings.listbox
import typingsSlinky.rcFieldForm.rcFieldFormStrings.location
import typingsSlinky.rcFieldForm.rcFieldFormStrings.menu
import typingsSlinky.rcFieldForm.rcFieldFormStrings.mixed
import typingsSlinky.rcFieldForm.rcFieldFormStrings.move
import typingsSlinky.rcFieldForm.rcFieldFormStrings.no
import typingsSlinky.rcFieldForm.rcFieldFormStrings.none
import typingsSlinky.rcFieldForm.rcFieldFormStrings.numeric
import typingsSlinky.rcFieldForm.rcFieldFormStrings.off
import typingsSlinky.rcFieldForm.rcFieldFormStrings.on
import typingsSlinky.rcFieldForm.rcFieldFormStrings.other
import typingsSlinky.rcFieldForm.rcFieldFormStrings.page
import typingsSlinky.rcFieldForm.rcFieldFormStrings.polite
import typingsSlinky.rcFieldForm.rcFieldFormStrings.popup
import typingsSlinky.rcFieldForm.rcFieldFormStrings.removals
import typingsSlinky.rcFieldForm.rcFieldFormStrings.search
import typingsSlinky.rcFieldForm.rcFieldFormStrings.spelling
import typingsSlinky.rcFieldForm.rcFieldFormStrings.step
import typingsSlinky.rcFieldForm.rcFieldFormStrings.tel
import typingsSlinky.rcFieldForm.rcFieldFormStrings.text
import typingsSlinky.rcFieldForm.rcFieldFormStrings.time
import typingsSlinky.rcFieldForm.rcFieldFormStrings.tree
import typingsSlinky.rcFieldForm.rcFieldFormStrings.url
import typingsSlinky.rcFieldForm.rcFieldFormStrings.vertical
import typingsSlinky.rcFieldForm.rcFieldFormStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends BaseFormProps {
  @JSName("children")
  var children_FormProps: js.UndefOr[RenderProps | TagMod[Any]] = js.undefined
  var component: js.UndefOr[`false` | String | ReactComponentClass[_]] = js.undefined
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  var form: js.UndefOr[FormInstance] = js.undefined
  var initialValues: js.UndefOr[Store] = js.undefined
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.undefined
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.undefined
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.undefined
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    about: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
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
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: RenderProps | TagMod[Any] = null,
    className: String = null,
    color: String = null,
    component: `false` | String | ReactComponentClass[_] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    encType: String = null,
    fields: js.Array[FieldData] = null,
    form: FormInstance = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    initialValues: Store = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    method: String = null,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLFormElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLFormElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLFormElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLFormElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLFormElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLFormElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLFormElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLFormElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLFormElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onDrag: DragEvent[HTMLFormElement] => Unit = null,
    onDragEnd: DragEvent[HTMLFormElement] => Unit = null,
    onDragEnter: DragEvent[HTMLFormElement] => Unit = null,
    onDragExit: DragEvent[HTMLFormElement] => Unit = null,
    onDragLeave: DragEvent[HTMLFormElement] => Unit = null,
    onDragOver: DragEvent[HTMLFormElement] => Unit = null,
    onDragStart: DragEvent[HTMLFormElement] => Unit = null,
    onDrop: DragEvent[HTMLFormElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onEnded: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onError: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onFieldsChange: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit = null,
    onFinish: /* values */ Store => Unit = null,
    onFinishFailed: /* errorInfo */ ValidateErrorEntity => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLFormElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLFormElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLFormElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLFormElement] => Unit = null,
    onLoad: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLFormElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLFormElement] => Unit = null,
    onPause: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onPlay: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLFormElement] => Unit = null,
    onProgress: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLFormElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onStalled: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onSuspend: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLFormElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLFormElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLFormElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLFormElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLFormElement] => Unit = null,
    onValuesChange: (/* changedValues */ Store, /* values */ Store) => Unit = null,
    onVolumeChange: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, HTMLFormElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLFormElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    target: String = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    validateMessages: ValidateMessages = null,
    vocab: String = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
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
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(js.Any.fromFunction2(onFieldsChange))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction1(onFinish))
    if (onFinishFailed != null) __obj.updateDynamic("onFinishFailed")(js.Any.fromFunction1(onFinishFailed))
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
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction2(onValuesChange))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

