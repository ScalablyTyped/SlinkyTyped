package typingsSlinky.atMaterialDashUiCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticUIEvent
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypes.Color
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`after-edge`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`before-edge`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`text-after-edge`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`text-before-edge`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.action
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.alphabetic
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.baseline
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bevel
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.butt
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.central
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.default
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.disabled
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.error
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.evenodd
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.hanging
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ideographic
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.inherit
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.initial
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.isolated
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.large
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.linearRGB
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mathematical
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.medial
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.middle
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.miter
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.nonzero
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.replace
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.round
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.sRGB
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.small
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.square
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.sum
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.terminal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsSlinky.atMaterialDashUiCore.svgIconSvgIconMod.SvgIconProps
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.AnimationEventHandler
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ClipboardEventHandler
import typingsSlinky.react.reactMod.CompositionEventHandler
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.DragEventHandler
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.FormEventHandler
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.PointerEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.react.reactMod.TouchEventHandler
import typingsSlinky.react.reactMod.TransitionEventHandler
import typingsSlinky.react.reactMod.UIEventHandler
import typingsSlinky.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/SvgIcon.SvgIconProps> */
trait PartialSvgIconProps extends js.Object {
  var accentHeight: js.UndefOr[Double | String] = js.undefined
  var accumulate: js.UndefOr[none | sum] = js.undefined
  var additive: js.UndefOr[replace | sum] = js.undefined
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.undefined
  var allowReorder: js.UndefOr[no | yes] = js.undefined
  var alphabetic: js.UndefOr[Double | String] = js.undefined
  var amplitude: js.UndefOr[Double | String] = js.undefined
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.undefined
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
  var ascent: js.UndefOr[Double | String] = js.undefined
  var attributeName: js.UndefOr[String] = js.undefined
  var attributeType: js.UndefOr[String] = js.undefined
  var autoReverse: js.UndefOr[Double | String] = js.undefined
  var azimuth: js.UndefOr[Double | String] = js.undefined
  var baseFrequency: js.UndefOr[Double | String] = js.undefined
  var baseProfile: js.UndefOr[Double | String] = js.undefined
  var baselineShift: js.UndefOr[Double | String] = js.undefined
  var bbox: js.UndefOr[Double | String] = js.undefined
  var begin: js.UndefOr[Double | String] = js.undefined
  var bias: js.UndefOr[Double | String] = js.undefined
  var by: js.UndefOr[Double | String] = js.undefined
  var calcMode: js.UndefOr[Double | String] = js.undefined
  var capHeight: js.UndefOr[Double | String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapSvgIconClassKey] = js.undefined
  var clip: js.UndefOr[Double | String] = js.undefined
  var clipPath: js.UndefOr[String] = js.undefined
  var clipPathUnits: js.UndefOr[Double | String] = js.undefined
  var clipRule: js.UndefOr[Double | String] = js.undefined
  var color: js.UndefOr[Color | action | disabled | error] = js.undefined
  var colorInterpolation: js.UndefOr[Double | String] = js.undefined
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.undefined
  var colorProfile: js.UndefOr[Double | String] = js.undefined
  var colorRendering: js.UndefOr[Double | String] = js.undefined
  var component: js.UndefOr[ReactComponentClass[SvgIconProps]] = js.undefined
  var contentScriptType: js.UndefOr[Double | String] = js.undefined
  var contentStyleType: js.UndefOr[Double | String] = js.undefined
  var cursor: js.UndefOr[Double | String] = js.undefined
  var cx: js.UndefOr[Double | String] = js.undefined
  var cy: js.UndefOr[Double | String] = js.undefined
  var d: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var decelerate: js.UndefOr[Double | String] = js.undefined
  var descent: js.UndefOr[Double | String] = js.undefined
  var diffuseConstant: js.UndefOr[Double | String] = js.undefined
  var direction: js.UndefOr[Double | String] = js.undefined
  var display: js.UndefOr[Double | String] = js.undefined
  var divisor: js.UndefOr[Double | String] = js.undefined
  var dominantBaseline: js.UndefOr[Double | String] = js.undefined
  var dur: js.UndefOr[Double | String] = js.undefined
  var dx: js.UndefOr[Double | String] = js.undefined
  var dy: js.UndefOr[Double | String] = js.undefined
  var edgeMode: js.UndefOr[Double | String] = js.undefined
  var elevation: js.UndefOr[Double | String] = js.undefined
  var enableBackground: js.UndefOr[Double | String] = js.undefined
  var end: js.UndefOr[Double | String] = js.undefined
  var exponent: js.UndefOr[Double | String] = js.undefined
  var externalResourcesRequired: js.UndefOr[Double | String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double | String] = js.undefined
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterRes: js.UndefOr[Double | String] = js.undefined
  var filterUnits: js.UndefOr[Double | String] = js.undefined
  var floodColor: js.UndefOr[Double | String] = js.undefined
  var floodOpacity: js.UndefOr[Double | String] = js.undefined
  var focusable: js.UndefOr[Double | String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[inherit | default | small | large] = js.undefined
  var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
  var fontStretch: js.UndefOr[Double | String] = js.undefined
  var fontStyle: js.UndefOr[Double | String] = js.undefined
  var fontVariant: js.UndefOr[Double | String] = js.undefined
  var fontWeight: js.UndefOr[Double | String] = js.undefined
  var format: js.UndefOr[Double | String] = js.undefined
  var from: js.UndefOr[Double | String] = js.undefined
  var fx: js.UndefOr[Double | String] = js.undefined
  var fy: js.UndefOr[Double | String] = js.undefined
  var g1: js.UndefOr[Double | String] = js.undefined
  var g2: js.UndefOr[Double | String] = js.undefined
  var glyphName: js.UndefOr[Double | String] = js.undefined
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.undefined
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.undefined
  var glyphRef: js.UndefOr[Double | String] = js.undefined
  var gradientTransform: js.UndefOr[String] = js.undefined
  var gradientUnits: js.UndefOr[String] = js.undefined
  var hanging: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var horizAdvX: js.UndefOr[Double | String] = js.undefined
  var horizOriginX: js.UndefOr[Double | String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ideographic: js.UndefOr[Double | String] = js.undefined
  var imageRendering: js.UndefOr[Double | String] = js.undefined
  var in: js.UndefOr[String] = js.undefined
  var in2: js.UndefOr[Double | String] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.undefined
  var intercept: js.UndefOr[Double | String] = js.undefined
  var k: js.UndefOr[Double | String] = js.undefined
  var k1: js.UndefOr[Double | String] = js.undefined
  var k2: js.UndefOr[Double | String] = js.undefined
  var k3: js.UndefOr[Double | String] = js.undefined
  var k4: js.UndefOr[Double | String] = js.undefined
  var kernelMatrix: js.UndefOr[Double | String] = js.undefined
  var kernelUnitLength: js.UndefOr[Double | String] = js.undefined
  var kerning: js.UndefOr[Double | String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyPoints: js.UndefOr[Double | String] = js.undefined
  var keySplines: js.UndefOr[Double | String] = js.undefined
  var keyTimes: js.UndefOr[Double | String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lengthAdjust: js.UndefOr[Double | String] = js.undefined
  var letterSpacing: js.UndefOr[Double | String] = js.undefined
  var lightingColor: js.UndefOr[Double | String] = js.undefined
  var limitingConeAngle: js.UndefOr[Double | String] = js.undefined
  var local: js.UndefOr[Double | String] = js.undefined
  var markerEnd: js.UndefOr[String] = js.undefined
  var markerHeight: js.UndefOr[Double | String] = js.undefined
  var markerMid: js.UndefOr[String] = js.undefined
  var markerStart: js.UndefOr[String] = js.undefined
  var markerUnits: js.UndefOr[Double | String] = js.undefined
  var markerWidth: js.UndefOr[Double | String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var maskContentUnits: js.UndefOr[Double | String] = js.undefined
  var maskUnits: js.UndefOr[Double | String] = js.undefined
  var mathematical: js.UndefOr[Double | String] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var mode: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nativeColor: js.UndefOr[String] = js.undefined
  var numOctaves: js.UndefOr[Double | String] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.undefined
  var opacity: js.UndefOr[Double | String] = js.undefined
  var operator: js.UndefOr[Double | String] = js.undefined
  var order: js.UndefOr[Double | String] = js.undefined
  var orient: js.UndefOr[Double | String] = js.undefined
  var orientation: js.UndefOr[Double | String] = js.undefined
  var origin: js.UndefOr[Double | String] = js.undefined
  var overflow: js.UndefOr[Double | String] = js.undefined
  var overlinePosition: js.UndefOr[Double | String] = js.undefined
  var overlineThickness: js.UndefOr[Double | String] = js.undefined
  var paintOrder: js.UndefOr[Double | String] = js.undefined
  var panose1: js.UndefOr[Double | String] = js.undefined
  var pathLength: js.UndefOr[Double | String] = js.undefined
  var patternContentUnits: js.UndefOr[String] = js.undefined
  var patternTransform: js.UndefOr[Double | String] = js.undefined
  var patternUnits: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[Double | String] = js.undefined
  var points: js.UndefOr[String] = js.undefined
  var pointsAtX: js.UndefOr[Double | String] = js.undefined
  var pointsAtY: js.UndefOr[Double | String] = js.undefined
  var pointsAtZ: js.UndefOr[Double | String] = js.undefined
  var preserveAlpha: js.UndefOr[Double | String] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var primitiveUnits: js.UndefOr[Double | String] = js.undefined
  var r: js.UndefOr[Double | String] = js.undefined
  var radius: js.UndefOr[Double | String] = js.undefined
  var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.undefined
  var refX: js.UndefOr[Double | String] = js.undefined
  var refY: js.UndefOr[Double | String] = js.undefined
  var renderingIntent: js.UndefOr[Double | String] = js.undefined
  var repeatCount: js.UndefOr[Double | String] = js.undefined
  var repeatDur: js.UndefOr[Double | String] = js.undefined
  var requiredExtensions: js.UndefOr[Double | String] = js.undefined
  var requiredFeatures: js.UndefOr[Double | String] = js.undefined
  var restart: js.UndefOr[Double | String] = js.undefined
  var result: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double | String] = js.undefined
  var rx: js.UndefOr[Double | String] = js.undefined
  var ry: js.UndefOr[Double | String] = js.undefined
  var scale: js.UndefOr[Double | String] = js.undefined
  var seed: js.UndefOr[Double | String] = js.undefined
  var shapeRendering: js.UndefOr[String] = js.undefined
  var slope: js.UndefOr[Double | String] = js.undefined
  var spacing: js.UndefOr[Double | String] = js.undefined
  var specularConstant: js.UndefOr[Double | String] = js.undefined
  var specularExponent: js.UndefOr[Double | String] = js.undefined
  var speed: js.UndefOr[Double | String] = js.undefined
  var spreadMethod: js.UndefOr[String] = js.undefined
  var startOffset: js.UndefOr[Double | String] = js.undefined
  var stdDeviation: js.UndefOr[Double | String] = js.undefined
  var stemh: js.UndefOr[Double | String] = js.undefined
  var stemv: js.UndefOr[Double | String] = js.undefined
  var stitchTiles: js.UndefOr[Double | String] = js.undefined
  var stopColor: js.UndefOr[String] = js.undefined
  var stopOpacity: js.UndefOr[Double | String] = js.undefined
  var strikethroughPosition: js.UndefOr[Double | String] = js.undefined
  var strikethroughThickness: js.UndefOr[Double | String] = js.undefined
  var string: js.UndefOr[Double | String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[String | Double] = js.undefined
  var strokeDashoffset: js.UndefOr[String | Double] = js.undefined
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.undefined
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.undefined
  var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
  var strokeOpacity: js.UndefOr[Double | String] = js.undefined
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var surfaceScale: js.UndefOr[Double | String] = js.undefined
  var systemLanguage: js.UndefOr[Double | String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tableValues: js.UndefOr[Double | String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var targetX: js.UndefOr[Double | String] = js.undefined
  var targetY: js.UndefOr[Double | String] = js.undefined
  var textAnchor: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[Double | String] = js.undefined
  var textLength: js.UndefOr[Double | String] = js.undefined
  var textRendering: js.UndefOr[Double | String] = js.undefined
  var titleAccess: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[Double | String] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var u1: js.UndefOr[Double | String] = js.undefined
  var u2: js.UndefOr[Double | String] = js.undefined
  var underlinePosition: js.UndefOr[Double | String] = js.undefined
  var underlineThickness: js.UndefOr[Double | String] = js.undefined
  var unicode: js.UndefOr[Double | String] = js.undefined
  var unicodeBidi: js.UndefOr[Double | String] = js.undefined
  var unicodeRange: js.UndefOr[Double | String] = js.undefined
  var unitsPerEm: js.UndefOr[Double | String] = js.undefined
  var vAlphabetic: js.UndefOr[Double | String] = js.undefined
  var vHanging: js.UndefOr[Double | String] = js.undefined
  var vIdeographic: js.UndefOr[Double | String] = js.undefined
  var vMathematical: js.UndefOr[Double | String] = js.undefined
  var values: js.UndefOr[String] = js.undefined
  var vectorEffect: js.UndefOr[Double | String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var vertAdvY: js.UndefOr[Double | String] = js.undefined
  var vertOriginX: js.UndefOr[Double | String] = js.undefined
  var vertOriginY: js.UndefOr[Double | String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var viewTarget: js.UndefOr[Double | String] = js.undefined
  var visibility: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var widths: js.UndefOr[Double | String] = js.undefined
  var wordSpacing: js.UndefOr[Double | String] = js.undefined
  var writingMode: js.UndefOr[Double | String] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var x1: js.UndefOr[Double | String] = js.undefined
  var x2: js.UndefOr[Double | String] = js.undefined
  var xChannelSelector: js.UndefOr[String] = js.undefined
  var xHeight: js.UndefOr[Double | String] = js.undefined
  var xlinkActuate: js.UndefOr[String] = js.undefined
  var xlinkArcrole: js.UndefOr[String] = js.undefined
  var xlinkHref: js.UndefOr[String] = js.undefined
  var xlinkRole: js.UndefOr[String] = js.undefined
  var xlinkShow: js.UndefOr[String] = js.undefined
  var xlinkTitle: js.UndefOr[String] = js.undefined
  var xlinkType: js.UndefOr[String] = js.undefined
  var xmlBase: js.UndefOr[String] = js.undefined
  var xmlLang: js.UndefOr[String] = js.undefined
  var xmlSpace: js.UndefOr[String] = js.undefined
  var xmlns: js.UndefOr[String] = js.undefined
  var xmlnsXlink: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
  var y1: js.UndefOr[Double | String] = js.undefined
  var y2: js.UndefOr[Double | String] = js.undefined
  var yChannelSelector: js.UndefOr[String] = js.undefined
  var z: js.UndefOr[Double | String] = js.undefined
  var zoomAndPan: js.UndefOr[String] = js.undefined
}

object PartialSvgIconProps {
  @scala.inline
  def apply(
    accentHeight: Double | String = null,
    accumulate: none | sum = null,
    additive: replace | sum = null,
    alignmentBaseline: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = null,
    allowReorder: no | yes = null,
    alphabetic: Double | String = null,
    amplitude: Double | String = null,
    arabicForm: initial | medial | terminal | isolated = null,
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
    ascent: Double | String = null,
    attributeName: String = null,
    attributeType: String = null,
    autoReverse: Double | String = null,
    azimuth: Double | String = null,
    baseFrequency: Double | String = null,
    baseProfile: Double | String = null,
    baselineShift: Double | String = null,
    bbox: Double | String = null,
    begin: Double | String = null,
    bias: Double | String = null,
    by: Double | String = null,
    calcMode: Double | String = null,
    capHeight: Double | String = null,
    children: TagMod[Any] = null,
    className: String = null,
    classes: PartialClassNameMapSvgIconClassKey = null,
    clip: Double | String = null,
    clipPath: String = null,
    clipPathUnits: Double | String = null,
    clipRule: Double | String = null,
    color: Color | action | disabled | error = null,
    colorInterpolation: Double | String = null,
    colorInterpolationFilters: auto | sRGB | linearRGB | inherit = null,
    colorProfile: Double | String = null,
    colorRendering: Double | String = null,
    component: ReactComponentClass[SvgIconProps] = null,
    contentScriptType: Double | String = null,
    contentStyleType: Double | String = null,
    cursor: Double | String = null,
    cx: Double | String = null,
    cy: Double | String = null,
    d: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    decelerate: Double | String = null,
    descent: Double | String = null,
    diffuseConstant: Double | String = null,
    direction: Double | String = null,
    display: Double | String = null,
    divisor: Double | String = null,
    dominantBaseline: Double | String = null,
    dur: Double | String = null,
    dx: Double | String = null,
    dy: Double | String = null,
    edgeMode: Double | String = null,
    elevation: Double | String = null,
    enableBackground: Double | String = null,
    end: Double | String = null,
    exponent: Double | String = null,
    externalResourcesRequired: Double | String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: nonzero | evenodd | inherit = null,
    filter: String = null,
    filterRes: Double | String = null,
    filterUnits: Double | String = null,
    floodColor: Double | String = null,
    floodOpacity: Double | String = null,
    focusable: Double | String = null,
    fontFamily: String = null,
    fontSize: inherit | default | small | large = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: Double | String = null,
    fontStyle: Double | String = null,
    fontVariant: Double | String = null,
    fontWeight: Double | String = null,
    format: Double | String = null,
    from: Double | String = null,
    fx: Double | String = null,
    fy: Double | String = null,
    g1: Double | String = null,
    g2: Double | String = null,
    glyphName: Double | String = null,
    glyphOrientationHorizontal: Double | String = null,
    glyphOrientationVertical: Double | String = null,
    glyphRef: Double | String = null,
    gradientTransform: String = null,
    gradientUnits: String = null,
    hanging: Double | String = null,
    height: Double | String = null,
    horizAdvX: Double | String = null,
    horizOriginX: Double | String = null,
    href: String = null,
    id: String = null,
    ideographic: Double | String = null,
    imageRendering: Double | String = null,
    in: String = null,
    in2: Double | String = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    intercept: Double | String = null,
    k: Double | String = null,
    k1: Double | String = null,
    k2: Double | String = null,
    k3: Double | String = null,
    k4: Double | String = null,
    kernelMatrix: Double | String = null,
    kernelUnitLength: Double | String = null,
    kerning: Double | String = null,
    key: Key = null,
    keyPoints: Double | String = null,
    keySplines: Double | String = null,
    keyTimes: Double | String = null,
    lang: String = null,
    lengthAdjust: Double | String = null,
    letterSpacing: Double | String = null,
    lightingColor: Double | String = null,
    limitingConeAngle: Double | String = null,
    local: Double | String = null,
    markerEnd: String = null,
    markerHeight: Double | String = null,
    markerMid: String = null,
    markerStart: String = null,
    markerUnits: Double | String = null,
    markerWidth: Double | String = null,
    mask: String = null,
    maskContentUnits: Double | String = null,
    maskUnits: Double | String = null,
    mathematical: Double | String = null,
    max: Double | String = null,
    media: String = null,
    method: String = null,
    min: Double | String = null,
    mode: Double | String = null,
    name: String = null,
    nativeColor: String = null,
    numOctaves: Double | String = null,
    offset: Double | String = null,
    onAbort: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[SVGSVGElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onCut: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onDrag: DragEvent[SVGSVGElement] => Unit = null,
    onDragEnd: DragEvent[SVGSVGElement] => Unit = null,
    onDragEnter: DragEvent[SVGSVGElement] => Unit = null,
    onDragExit: DragEvent[SVGSVGElement] => Unit = null,
    onDragLeave: DragEvent[SVGSVGElement] => Unit = null,
    onDragOver: DragEvent[SVGSVGElement] => Unit = null,
    onDragStart: DragEvent[SVGSVGElement] => Unit = null,
    onDrop: DragEvent[SVGSVGElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEnded: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onError: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onFocus: SyntheticFocusEvent[SVGSVGElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onLoad: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onPause: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPlay: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onProgress: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[SVGSVGElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSelect: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onStalled: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, SVGSVGElement] => Unit = null
  ): PartialSvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (accentHeight != null) __obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
    if (accumulate != null) __obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (allowReorder != null) __obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
    if (alphabetic != null) __obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
    if (amplitude != null) __obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
    if (arabicForm != null) __obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
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
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeType != null) __obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
    if (autoReverse != null) __obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
    if (azimuth != null) __obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
    if (baseFrequency != null) __obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
    if (baseProfile != null) __obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (calcMode != null) __obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipPathUnits != null) __obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentScriptType != null) __obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
    if (contentStyleType != null) __obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (decelerate != null) __obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (diffuseConstant != null) __obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dur != null) __obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (edgeMode != null) __obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (externalResourcesRequired != null) __obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterRes != null) __obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
    if (filterUnits != null) __obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (g1 != null) __obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
    if (g2 != null) __obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
    if (glyphName != null) __obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (glyphRef != null) __obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (hanging != null) __obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizAdvX != null) __obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
    if (horizOriginX != null) __obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ideographic != null) __obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (in2 != null) __obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (k1 != null) __obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
    if (k2 != null) __obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
    if (k3 != null) __obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
    if (k4 != null) __obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
    if (kernelMatrix != null) __obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
    if (kernelUnitLength != null) __obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPoints != null) __obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
    if (keySplines != null) __obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
    if (keyTimes != null) __obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (limitingConeAngle != null) __obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskContentUnits != null) __obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
    if (maskUnits != null) __obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
    if (mathematical != null) __obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nativeColor != null) __obj.updateDynamic("nativeColor")(nativeColor.asInstanceOf[js.Any])
    if (numOctaves != null) __obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[PartialSvgIconProps]
  }
}

