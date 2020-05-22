package typingsSlinky.rebassForms.mod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.csstype.mod.AlignSelfProperty
import typingsSlinky.csstype.mod.DisplayProperty
import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.OverflowProperty
import typingsSlinky.csstype.mod.OverflowXProperty
import typingsSlinky.csstype.mod.OverflowYProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.csstype.mod.WidthProperty
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
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.rebass.mod.SxStyleProp
import typingsSlinky.rebassForms.rebassFormsStrings.`additions text`
import typingsSlinky.rebassForms.rebassFormsStrings.`inline`
import typingsSlinky.rebassForms.rebassFormsStrings.additions
import typingsSlinky.rebassForms.rebassFormsStrings.all
import typingsSlinky.rebassForms.rebassFormsStrings.ascending
import typingsSlinky.rebassForms.rebassFormsStrings.assertive
import typingsSlinky.rebassForms.rebassFormsStrings.both
import typingsSlinky.rebassForms.rebassFormsStrings.colors
import typingsSlinky.rebassForms.rebassFormsStrings.copy
import typingsSlinky.rebassForms.rebassFormsStrings.date
import typingsSlinky.rebassForms.rebassFormsStrings.decimal
import typingsSlinky.rebassForms.rebassFormsStrings.descending
import typingsSlinky.rebassForms.rebassFormsStrings.dialog
import typingsSlinky.rebassForms.rebassFormsStrings.email
import typingsSlinky.rebassForms.rebassFormsStrings.execute
import typingsSlinky.rebassForms.rebassFormsStrings.fontSizes
import typingsSlinky.rebassForms.rebassFormsStrings.grammar
import typingsSlinky.rebassForms.rebassFormsStrings.grid
import typingsSlinky.rebassForms.rebassFormsStrings.horizontal
import typingsSlinky.rebassForms.rebassFormsStrings.inherit
import typingsSlinky.rebassForms.rebassFormsStrings.link
import typingsSlinky.rebassForms.rebassFormsStrings.list
import typingsSlinky.rebassForms.rebassFormsStrings.listbox
import typingsSlinky.rebassForms.rebassFormsStrings.location
import typingsSlinky.rebassForms.rebassFormsStrings.menu
import typingsSlinky.rebassForms.rebassFormsStrings.mixed
import typingsSlinky.rebassForms.rebassFormsStrings.move
import typingsSlinky.rebassForms.rebassFormsStrings.no
import typingsSlinky.rebassForms.rebassFormsStrings.none
import typingsSlinky.rebassForms.rebassFormsStrings.numeric
import typingsSlinky.rebassForms.rebassFormsStrings.off
import typingsSlinky.rebassForms.rebassFormsStrings.on
import typingsSlinky.rebassForms.rebassFormsStrings.other
import typingsSlinky.rebassForms.rebassFormsStrings.page
import typingsSlinky.rebassForms.rebassFormsStrings.polite
import typingsSlinky.rebassForms.rebassFormsStrings.popup
import typingsSlinky.rebassForms.rebassFormsStrings.removals
import typingsSlinky.rebassForms.rebassFormsStrings.search
import typingsSlinky.rebassForms.rebassFormsStrings.space
import typingsSlinky.rebassForms.rebassFormsStrings.spelling
import typingsSlinky.rebassForms.rebassFormsStrings.step
import typingsSlinky.rebassForms.rebassFormsStrings.tel
import typingsSlinky.rebassForms.rebassFormsStrings.text
import typingsSlinky.rebassForms.rebassFormsStrings.time
import typingsSlinky.rebassForms.rebassFormsStrings.tree
import typingsSlinky.rebassForms.rebassFormsStrings.url
import typingsSlinky.rebassForms.rebassFormsStrings.vertical
import typingsSlinky.rebassForms.rebassFormsStrings.yes
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.TLengthStyledSystem
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
/* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
trait InputProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty, RequiredTheme]] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[ReactElement] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[ResponsiveValue[DisplayProperty, RequiredTheme]] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[GlobalsNumber, RequiredTheme]] = js.undefined
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[ResponsiveValue[GlobalsNumber, RequiredTheme]] = js.undefined
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[OverflowProperty, RequiredTheme]] = js.undefined
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[ResponsiveValue[OverflowXProperty, RequiredTheme]] = js.undefined
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[ResponsiveValue[OverflowYProperty, RequiredTheme]] = js.undefined
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  /**
    * The sx prop lets you style elements inline, using values from your theme.
    */
  var sx: js.UndefOr[SxStyleProp] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var tx: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
}

