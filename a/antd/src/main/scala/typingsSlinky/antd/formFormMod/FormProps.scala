package typingsSlinky.antd.formFormMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
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
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.`additions text`
import typingsSlinky.antd.antdStrings.`inline`
import typingsSlinky.antd.antdStrings.additions
import typingsSlinky.antd.antdStrings.all
import typingsSlinky.antd.antdStrings.ascending
import typingsSlinky.antd.antdStrings.assertive
import typingsSlinky.antd.antdStrings.both
import typingsSlinky.antd.antdStrings.copy
import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.decimal
import typingsSlinky.antd.antdStrings.descending
import typingsSlinky.antd.antdStrings.dialog
import typingsSlinky.antd.antdStrings.email
import typingsSlinky.antd.antdStrings.execute
import typingsSlinky.antd.antdStrings.grammar
import typingsSlinky.antd.antdStrings.grid
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.inherit
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.list
import typingsSlinky.antd.antdStrings.listbox
import typingsSlinky.antd.antdStrings.location
import typingsSlinky.antd.antdStrings.menu
import typingsSlinky.antd.antdStrings.mixed
import typingsSlinky.antd.antdStrings.move
import typingsSlinky.antd.antdStrings.no
import typingsSlinky.antd.antdStrings.none
import typingsSlinky.antd.antdStrings.numeric
import typingsSlinky.antd.antdStrings.off
import typingsSlinky.antd.antdStrings.on
import typingsSlinky.antd.antdStrings.other
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.polite
import typingsSlinky.antd.antdStrings.popup
import typingsSlinky.antd.antdStrings.removals
import typingsSlinky.antd.antdStrings.search
import typingsSlinky.antd.antdStrings.spelling
import typingsSlinky.antd.antdStrings.step
import typingsSlinky.antd.antdStrings.tel
import typingsSlinky.antd.antdStrings.text
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.antd.antdStrings.tree
import typingsSlinky.antd.antdStrings.url
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.antdStrings.yes
import typingsSlinky.antd.formUtilMod.FormInstance
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.rcFieldForm.formMod.RenderProps
import typingsSlinky.rcFieldForm.interfaceMod.FieldData
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.ValidateErrorEntity
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-field-form.rc-field-form/lib/Form.FormProps, 'form'> */
@js.native
trait FormProps extends js.Object {
  var about: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[RenderProps | TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var colon: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var component: js.UndefOr[`false` | String | ReactComponentClass[_]] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var encType: js.UndefOr[String] = js.native
  var fields: js.UndefOr[js.Array[FieldData]] = js.native
  var form: js.UndefOr[FormInstance] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var hideRequiredMark: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var initialValues: js.UndefOr[Store] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  var labelCol: js.UndefOr[ColProps] = js.native
  var lang: js.UndefOr[String] = js.native
  var layout: js.UndefOr[FormLayout] = js.native
  var method: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.native
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.native
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLFormElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLFormElement]] = js.native
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLFormElement]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var scrollToFirstError: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[String] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
  var vocab: js.UndefOr[String] = js.native
  var wrapperCol: js.UndefOr[ColProps] = js.native
}

object FormProps {
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-activedescendant`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-activedescendant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-atomic`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-atomic`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-autocomplete`(value: none | `inline` | list | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-autocomplete`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-busy`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-busy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-checked`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-checked`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-controls`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-controls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-current`(value: Boolean | page | step | location | date | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-describedby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-describedby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-details`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-details`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-disabled`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-disabled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-dropeffect`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-errormessage`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-errormessage`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-expanded`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-expanded`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-flowto`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-flowto`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-grabbed`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-grabbed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-haspopup`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-hidden`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-hidden`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-invalid`(value: Boolean | grammar | spelling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-invalid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-keyshortcuts`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-keyshortcuts`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-level`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-level`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-live`(value: off | assertive | polite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-live`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-modal`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-modal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiline`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiselectable`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiselectable`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-orientation`(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-orientation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-owns`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-owns`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-placeholder`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-placeholder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-posinset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-posinset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-pressed`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-pressed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-relevant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-required`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-required`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-roledescription`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-roledescription`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-selected`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-selected`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-setsize`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-setsize`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-sort`(value: none | ascending | descending | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-sort`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemax`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemax`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuenow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuenow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuetext`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuetext`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction2(
      value: (/* values */ Store, /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance) => ReactElement | TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChildren(value: RenderProps | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: `false` | String | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEditable(value: Booleanish | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslySetInnerHTML(value: Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Booleanish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEncType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[FieldData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: FormInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRequiredMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRequiredMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRequiredMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRequiredMark")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValues(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(js.undefined)
        ret
    }
    @scala.inline
    def withInlist(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withItemID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: FormLabelAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCol(value: ColProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: FormLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: DragEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinish(value: /* values */ Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinishFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: SyntheticMouseEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUp(value: SyntheticPointerEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticUIEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: SyntheticTouchEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: SyntheticTouchEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: SyntheticTouchEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticTouchEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: SyntheticTransitionEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChange(value: (/* changedValues */ Store, /* values */ Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: SyntheticEvent[Event, HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: SyntheticWheelEvent[HTMLFormElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToFirstError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToFirstError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToFirstError")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSlot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheck(value: Booleanish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressContentEditableWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContentEditableWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressContentEditableWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContentEditableWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressHydrationWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHydrationWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressHydrationWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHydrationWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeof")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectable(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateMessages(value: ValidateMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withVocab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vocab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vocab")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperCol(value: ColProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCol")(js.undefined)
        ret
    }
  }
  
}

