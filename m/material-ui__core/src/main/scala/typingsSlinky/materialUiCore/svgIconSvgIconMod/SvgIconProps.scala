package typingsSlinky.materialUiCore.svgIconSvgIconMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
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
import typingsSlinky.materialUiCore.anon.PartialClassNameMapSvgIco
import typingsSlinky.materialUiCore.materialUiCoreStrings._empty
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions removals`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`after-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`before-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`inline`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`removals additions`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`removals text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text additions`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text removals`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text-after-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text-before-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`use-credentials`
import typingsSlinky.materialUiCore.materialUiCoreStrings.action
import typingsSlinky.materialUiCore.materialUiCoreStrings.additions
import typingsSlinky.materialUiCore.materialUiCoreStrings.all
import typingsSlinky.materialUiCore.materialUiCoreStrings.alphabetic
import typingsSlinky.materialUiCore.materialUiCoreStrings.anonymous
import typingsSlinky.materialUiCore.materialUiCoreStrings.ascending
import typingsSlinky.materialUiCore.materialUiCoreStrings.assertive
import typingsSlinky.materialUiCore.materialUiCoreStrings.auto
import typingsSlinky.materialUiCore.materialUiCoreStrings.baseline
import typingsSlinky.materialUiCore.materialUiCoreStrings.bevel
import typingsSlinky.materialUiCore.materialUiCoreStrings.both
import typingsSlinky.materialUiCore.materialUiCoreStrings.butt
import typingsSlinky.materialUiCore.materialUiCoreStrings.central
import typingsSlinky.materialUiCore.materialUiCoreStrings.copy
import typingsSlinky.materialUiCore.materialUiCoreStrings.date
import typingsSlinky.materialUiCore.materialUiCoreStrings.descending
import typingsSlinky.materialUiCore.materialUiCoreStrings.dialog
import typingsSlinky.materialUiCore.materialUiCoreStrings.disabled
import typingsSlinky.materialUiCore.materialUiCoreStrings.error
import typingsSlinky.materialUiCore.materialUiCoreStrings.evenodd
import typingsSlinky.materialUiCore.materialUiCoreStrings.execute
import typingsSlinky.materialUiCore.materialUiCoreStrings.grammar
import typingsSlinky.materialUiCore.materialUiCoreStrings.grid
import typingsSlinky.materialUiCore.materialUiCoreStrings.hanging
import typingsSlinky.materialUiCore.materialUiCoreStrings.horizontal
import typingsSlinky.materialUiCore.materialUiCoreStrings.ideographic
import typingsSlinky.materialUiCore.materialUiCoreStrings.inherit
import typingsSlinky.materialUiCore.materialUiCoreStrings.initial
import typingsSlinky.materialUiCore.materialUiCoreStrings.isolated
import typingsSlinky.materialUiCore.materialUiCoreStrings.large
import typingsSlinky.materialUiCore.materialUiCoreStrings.linearRGB
import typingsSlinky.materialUiCore.materialUiCoreStrings.link
import typingsSlinky.materialUiCore.materialUiCoreStrings.list
import typingsSlinky.materialUiCore.materialUiCoreStrings.listbox
import typingsSlinky.materialUiCore.materialUiCoreStrings.location
import typingsSlinky.materialUiCore.materialUiCoreStrings.mathematical
import typingsSlinky.materialUiCore.materialUiCoreStrings.medial
import typingsSlinky.materialUiCore.materialUiCoreStrings.menu
import typingsSlinky.materialUiCore.materialUiCoreStrings.middle
import typingsSlinky.materialUiCore.materialUiCoreStrings.miter
import typingsSlinky.materialUiCore.materialUiCoreStrings.mixed
import typingsSlinky.materialUiCore.materialUiCoreStrings.move
import typingsSlinky.materialUiCore.materialUiCoreStrings.no
import typingsSlinky.materialUiCore.materialUiCoreStrings.none
import typingsSlinky.materialUiCore.materialUiCoreStrings.nonzero
import typingsSlinky.materialUiCore.materialUiCoreStrings.off
import typingsSlinky.materialUiCore.materialUiCoreStrings.other
import typingsSlinky.materialUiCore.materialUiCoreStrings.page
import typingsSlinky.materialUiCore.materialUiCoreStrings.polite
import typingsSlinky.materialUiCore.materialUiCoreStrings.popup
import typingsSlinky.materialUiCore.materialUiCoreStrings.removals
import typingsSlinky.materialUiCore.materialUiCoreStrings.replace
import typingsSlinky.materialUiCore.materialUiCoreStrings.round
import typingsSlinky.materialUiCore.materialUiCoreStrings.sRGB
import typingsSlinky.materialUiCore.materialUiCoreStrings.small
import typingsSlinky.materialUiCore.materialUiCoreStrings.spelling
import typingsSlinky.materialUiCore.materialUiCoreStrings.square
import typingsSlinky.materialUiCore.materialUiCoreStrings.step
import typingsSlinky.materialUiCore.materialUiCoreStrings.sum
import typingsSlinky.materialUiCore.materialUiCoreStrings.terminal
import typingsSlinky.materialUiCore.materialUiCoreStrings.text
import typingsSlinky.materialUiCore.materialUiCoreStrings.time
import typingsSlinky.materialUiCore.materialUiCoreStrings.tree
import typingsSlinky.materialUiCore.materialUiCoreStrings.vertical
import typingsSlinky.materialUiCore.materialUiCoreStrings.yes
import typingsSlinky.materialUiCore.mod.PropTypes.Color
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
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<react.react.SVGProps<std.SVGSVGElement>, @material-ui/core.@material-ui/core/SvgIcon/SvgIcon.SvgIconClassKey, never> */
@js.native
trait SvgIconProps extends js.Object {
  
  var accentHeight: js.UndefOr[Double | String] = js.native
  
  var accumulate: js.UndefOr[none | sum] = js.native
  
  var additive: js.UndefOr[replace | sum] = js.native
  
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  
  var allowReorder: js.UndefOr[no | yes] = js.native
  
  var alphabetic: js.UndefOr[Double | String] = js.native
  
  var amplitude: js.UndefOr[Double | String] = js.native
  
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  
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
  
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
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
  
  var ascent: js.UndefOr[Double | String] = js.native
  
  var attributeName: js.UndefOr[String] = js.native
  
  var attributeType: js.UndefOr[String] = js.native
  
  var autoReverse: js.UndefOr[Booleanish] = js.native
  
  var azimuth: js.UndefOr[Double | String] = js.native
  
  var baseFrequency: js.UndefOr[Double | String] = js.native
  
  var baseProfile: js.UndefOr[Double | String] = js.native
  
  var baselineShift: js.UndefOr[Double | String] = js.native
  
  var bbox: js.UndefOr[Double | String] = js.native
  
  var begin: js.UndefOr[Double | String] = js.native
  
  var bias: js.UndefOr[Double | String] = js.native
  
  var by: js.UndefOr[Double | String] = js.native
  
  var calcMode: js.UndefOr[Double | String] = js.native
  
  var capHeight: js.UndefOr[Double | String] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[PartialClassNameMapSvgIco] = js.native
  
  var clip: js.UndefOr[Double | String] = js.native
  
  var clipPath: js.UndefOr[String] = js.native
  
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  
  var clipRule: js.UndefOr[Double | String] = js.native
  
  var color: js.UndefOr[Color | action | disabled | error] = js.native
  
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  
  var colorProfile: js.UndefOr[Double | String] = js.native
  
  var colorRendering: js.UndefOr[Double | String] = js.native
  
  var component: js.UndefOr[ReactType[SvgIconProps]] = js.native
  
  var contentScriptType: js.UndefOr[Double | String] = js.native
  
  var contentStyleType: js.UndefOr[Double | String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var cursor: js.UndefOr[Double | String] = js.native
  
  var cx: js.UndefOr[Double | String] = js.native
  
  var cy: js.UndefOr[Double | String] = js.native
  
  var d: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var decelerate: js.UndefOr[Double | String] = js.native
  
  var descent: js.UndefOr[Double | String] = js.native
  
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  
  var direction: js.UndefOr[Double | String] = js.native
  
  var display: js.UndefOr[Double | String] = js.native
  
  var divisor: js.UndefOr[Double | String] = js.native
  
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  
  var dur: js.UndefOr[Double | String] = js.native
  
  var dx: js.UndefOr[Double | String] = js.native
  
  var dy: js.UndefOr[Double | String] = js.native
  
  var edgeMode: js.UndefOr[Double | String] = js.native
  
  var elevation: js.UndefOr[Double | String] = js.native
  
  var enableBackground: js.UndefOr[Double | String] = js.native
  
  var end: js.UndefOr[Double | String] = js.native
  
  var exponent: js.UndefOr[Double | String] = js.native
  
  var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double | String] = js.native
  
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var filterRes: js.UndefOr[Double | String] = js.native
  
  var filterUnits: js.UndefOr[Double | String] = js.native
  
  var floodColor: js.UndefOr[Double | String] = js.native
  
  var floodOpacity: js.UndefOr[Double | String] = js.native
  
  var focusable: js.UndefOr[Booleanish | auto] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[
    inherit | typingsSlinky.materialUiCore.materialUiCoreStrings.default | small | large
  ] = js.native
  
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  
  var fontStretch: js.UndefOr[Double | String] = js.native
  
  var fontStyle: js.UndefOr[Double | String] = js.native
  
  var fontVariant: js.UndefOr[Double | String] = js.native
  
  var fontWeight: js.UndefOr[Double | String] = js.native
  
  var format: js.UndefOr[Double | String] = js.native
  
  var from: js.UndefOr[Double | String] = js.native
  
  var fx: js.UndefOr[Double | String] = js.native
  
  var fy: js.UndefOr[Double | String] = js.native
  
  var g1: js.UndefOr[Double | String] = js.native
  
  var g2: js.UndefOr[Double | String] = js.native
  
  var glyphName: js.UndefOr[Double | String] = js.native
  
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  
  var glyphRef: js.UndefOr[Double | String] = js.native
  
  var gradientTransform: js.UndefOr[String] = js.native
  
  var gradientUnits: js.UndefOr[String] = js.native
  
  var hanging: js.UndefOr[Double | String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var horizAdvX: js.UndefOr[Double | String] = js.native
  
  var horizOriginX: js.UndefOr[Double | String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ideographic: js.UndefOr[Double | String] = js.native
  
  var imageRendering: js.UndefOr[Double | String] = js.native
  
  var in: js.UndefOr[String] = js.native
  
  var in2: js.UndefOr[Double | String] = js.native
  
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  
  var intercept: js.UndefOr[Double | String] = js.native
  
  var k: js.UndefOr[Double | String] = js.native
  
  var k1: js.UndefOr[Double | String] = js.native
  
  var k2: js.UndefOr[Double | String] = js.native
  
  var k3: js.UndefOr[Double | String] = js.native
  
  var k4: js.UndefOr[Double | String] = js.native
  
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  
  var kerning: js.UndefOr[Double | String] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var keyPoints: js.UndefOr[Double | String] = js.native
  
  var keySplines: js.UndefOr[Double | String] = js.native
  
  var keyTimes: js.UndefOr[Double | String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  
  var letterSpacing: js.UndefOr[Double | String] = js.native
  
  var lightingColor: js.UndefOr[Double | String] = js.native
  
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  
  var local: js.UndefOr[Double | String] = js.native
  
  var markerEnd: js.UndefOr[String] = js.native
  
  var markerHeight: js.UndefOr[Double | String] = js.native
  
  var markerMid: js.UndefOr[String] = js.native
  
  var markerStart: js.UndefOr[String] = js.native
  
  var markerUnits: js.UndefOr[Double | String] = js.native
  
  var markerWidth: js.UndefOr[Double | String] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  
  var maskUnits: js.UndefOr[Double | String] = js.native
  
  var mathematical: js.UndefOr[Double | String] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var mode: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nativeColor: js.UndefOr[String] = js.native
  
  var numOctaves: js.UndefOr[Double | String] = js.native
  
  var offset: js.UndefOr[Double | String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.native
  
  var opacity: js.UndefOr[Double | String] = js.native
  
  var operator: js.UndefOr[Double | String] = js.native
  
  var order: js.UndefOr[Double | String] = js.native
  
  var orient: js.UndefOr[Double | String] = js.native
  
  var orientation: js.UndefOr[Double | String] = js.native
  
  var origin: js.UndefOr[Double | String] = js.native
  
  var overflow: js.UndefOr[Double | String] = js.native
  
  var overlinePosition: js.UndefOr[Double | String] = js.native
  
  var overlineThickness: js.UndefOr[Double | String] = js.native
  
  var paintOrder: js.UndefOr[Double | String] = js.native
  
  var panose1: js.UndefOr[Double | String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pathLength: js.UndefOr[Double | String] = js.native
  
  var patternContentUnits: js.UndefOr[String] = js.native
  
  var patternTransform: js.UndefOr[Double | String] = js.native
  
  var patternUnits: js.UndefOr[String] = js.native
  
  var pointerEvents: js.UndefOr[Double | String] = js.native
  
  var points: js.UndefOr[String] = js.native
  
  var pointsAtX: js.UndefOr[Double | String] = js.native
  
  var pointsAtY: js.UndefOr[Double | String] = js.native
  
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  
  var preserveAlpha: js.UndefOr[Booleanish] = js.native
  
  var preserveAspectRatio: js.UndefOr[String] = js.native
  
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  
  var r: js.UndefOr[Double | String] = js.native
  
  var radius: js.UndefOr[Double | String] = js.native
  
  var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.native
  
  var refX: js.UndefOr[Double | String] = js.native
  
  var refY: js.UndefOr[Double | String] = js.native
  
  var renderingIntent: js.UndefOr[Double | String] = js.native
  
  var repeatCount: js.UndefOr[Double | String] = js.native
  
  var repeatDur: js.UndefOr[Double | String] = js.native
  
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  
  var restart: js.UndefOr[Double | String] = js.native
  
  var result: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[Double | String] = js.native
  
  var rx: js.UndefOr[Double | String] = js.native
  
  var ry: js.UndefOr[Double | String] = js.native
  
  var scale: js.UndefOr[Double | String] = js.native
  
  var seed: js.UndefOr[Double | String] = js.native
  
  var shapeRendering: js.UndefOr[String] = js.native
  
  var slope: js.UndefOr[Double | String] = js.native
  
  var spacing: js.UndefOr[Double | String] = js.native
  
  var specularConstant: js.UndefOr[Double | String] = js.native
  
  var specularExponent: js.UndefOr[Double | String] = js.native
  
  var speed: js.UndefOr[Double | String] = js.native
  
  var spreadMethod: js.UndefOr[String] = js.native
  
  var startOffset: js.UndefOr[Double | String] = js.native
  
  var stdDeviation: js.UndefOr[Double | String] = js.native
  
  var stemh: js.UndefOr[Double | String] = js.native
  
  var stemv: js.UndefOr[Double | String] = js.native
  
  var stitchTiles: js.UndefOr[Double | String] = js.native
  
  var stopColor: js.UndefOr[String] = js.native
  
  var stopOpacity: js.UndefOr[Double | String] = js.native
  
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  
  var string: js.UndefOr[Double | String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  
  var strokeWidth: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var surfaceScale: js.UndefOr[Double | String] = js.native
  
  var systemLanguage: js.UndefOr[Double | String] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tableValues: js.UndefOr[Double | String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var targetX: js.UndefOr[Double | String] = js.native
  
  var targetY: js.UndefOr[Double | String] = js.native
  
  var textAnchor: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[Double | String] = js.native
  
  var textLength: js.UndefOr[Double | String] = js.native
  
  var textRendering: js.UndefOr[Double | String] = js.native
  
  var titleAccess: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[Double | String] = js.native
  
  var transform: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var u1: js.UndefOr[Double | String] = js.native
  
  var u2: js.UndefOr[Double | String] = js.native
  
  var underlinePosition: js.UndefOr[Double | String] = js.native
  
  var underlineThickness: js.UndefOr[Double | String] = js.native
  
  var unicode: js.UndefOr[Double | String] = js.native
  
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  
  var unicodeRange: js.UndefOr[Double | String] = js.native
  
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  
  var vHanging: js.UndefOr[Double | String] = js.native
  
  var vIdeographic: js.UndefOr[Double | String] = js.native
  
  var vMathematical: js.UndefOr[Double | String] = js.native
  
  var values: js.UndefOr[String] = js.native
  
  var vectorEffect: js.UndefOr[Double | String] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var vertAdvY: js.UndefOr[Double | String] = js.native
  
  var vertOriginX: js.UndefOr[Double | String] = js.native
  
  var vertOriginY: js.UndefOr[Double | String] = js.native
  
  var viewBox: js.UndefOr[String] = js.native
  
  var viewTarget: js.UndefOr[Double | String] = js.native
  
  var visibility: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var widths: js.UndefOr[Double | String] = js.native
  
  var wordSpacing: js.UndefOr[Double | String] = js.native
  
  var writingMode: js.UndefOr[Double | String] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var x1: js.UndefOr[Double | String] = js.native
  
  var x2: js.UndefOr[Double | String] = js.native
  
  var xChannelSelector: js.UndefOr[String] = js.native
  
  var xHeight: js.UndefOr[Double | String] = js.native
  
  var xlinkActuate: js.UndefOr[String] = js.native
  
  var xlinkArcrole: js.UndefOr[String] = js.native
  
  var xlinkHref: js.UndefOr[String] = js.native
  
  var xlinkRole: js.UndefOr[String] = js.native
  
  var xlinkShow: js.UndefOr[String] = js.native
  
  var xlinkTitle: js.UndefOr[String] = js.native
  
  var xlinkType: js.UndefOr[String] = js.native
  
  var xmlBase: js.UndefOr[String] = js.native
  
  var xmlLang: js.UndefOr[String] = js.native
  
  var xmlSpace: js.UndefOr[String] = js.native
  
  var xmlns: js.UndefOr[String] = js.native
  
  var xmlnsXlink: js.UndefOr[String] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
  
  var y1: js.UndefOr[Double | String] = js.native
  
  var y2: js.UndefOr[Double | String] = js.native
  
  var yChannelSelector: js.UndefOr[String] = js.native
  
  var z: js.UndefOr[Double | String] = js.native
  
  var zoomAndPan: js.UndefOr[String] = js.native
}
object SvgIconProps {
  
  @scala.inline
  def apply(): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconProps]
  }
  
  @scala.inline
  implicit class SvgIconPropsOps[Self <: SvgIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccentHeight(value: Double | String): Self = this.set("accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentHeight: Self = this.set("accentHeight", js.undefined)
    
    @scala.inline
    def setAccumulate(value: none | sum): Self = this.set("accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccumulate: Self = this.set("accumulate", js.undefined)
    
    @scala.inline
    def setAdditive(value: replace | sum): Self = this.set("additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditive: Self = this.set("additive", js.undefined)
    
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: no | yes): Self = this.set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReorder: Self = this.set("allowReorder", js.undefined)
    
    @scala.inline
    def setAlphabetic(value: Double | String): Self = this.set("alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphabetic: Self = this.set("alphabetic", js.undefined)
    
    @scala.inline
    def setAmplitude(value: Double | String): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("amplitude", js.undefined)
    
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = this.set("arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArabicForm: Self = this.set("arabicForm", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAscent(value: Double | String): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscent: Self = this.set("ascent", js.undefined)
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: String): Self = this.set("attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("attributeType", js.undefined)
    
    @scala.inline
    def setAutoReverse(value: Booleanish): Self = this.set("autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReverse: Self = this.set("autoReverse", js.undefined)
    
    @scala.inline
    def setAzimuth(value: Double | String): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzimuth: Self = this.set("azimuth", js.undefined)
    
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = this.set("baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFrequency: Self = this.set("baseFrequency", js.undefined)
    
    @scala.inline
    def setBaseProfile(value: Double | String): Self = this.set("baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseProfile: Self = this.set("baseProfile", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: Double | String): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setBbox(value: Double | String): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    
    @scala.inline
    def setBegin(value: Double | String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setBias(value: Double | String): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setBy(value: Double | String): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setCalcMode(value: Double | String): Self = this.set("calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalcMode: Self = this.set("calcMode", js.undefined)
    
    @scala.inline
    def setCapHeight(value: Double | String): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapSvgIco): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setClip(value: Double | String): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = this.set("clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPathUnits: Self = this.set("clipPathUnits", js.undefined)
    
    @scala.inline
    def setClipRule(value: Double | String): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColor(value: Color | action | disabled | error): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = this.set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolationFilters: Self = this.set("colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorProfile(value: Double | String): Self = this.set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorProfile: Self = this.set("colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: Double | String): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[SvgIconProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[SvgIconProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactType[SvgIconProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setContentScriptType(value: Double | String): Self = this.set("contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptType: Self = this.set("contentScriptType", js.undefined)
    
    @scala.inline
    def setContentStyleType(value: Double | String): Self = this.set("contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyleType: Self = this.set("contentStyleType", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setCursor(value: Double | String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double | String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double | String): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDecelerate(value: Double | String): Self = this.set("decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecelerate: Self = this.set("decelerate", js.undefined)
    
    @scala.inline
    def setDescent(value: Double | String): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescent: Self = this.set("descent", js.undefined)
    
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = this.set("diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffuseConstant: Self = this.set("diffuseConstant", js.undefined)
    
    @scala.inline
    def setDirection(value: Double | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: Double | String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDivisor(value: Double | String): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setDur(value: Double | String): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDur: Self = this.set("dur", js.undefined)
    
    @scala.inline
    def setDx(value: Double | String): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double | String): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setEdgeMode(value: Double | String): Self = this.set("edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeMode: Self = this.set("edgeMode", js.undefined)
    
    @scala.inline
    def setElevation(value: Double | String): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setEnableBackground(value: Double | String): Self = this.set("enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBackground: Self = this.set("enableBackground", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setExponent(value: Double | String): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    
    @scala.inline
    def setExternalResourcesRequired(value: Booleanish): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalResourcesRequired: Self = this.set("externalResourcesRequired", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterRes(value: Double | String): Self = this.set("filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRes: Self = this.set("filterRes", js.undefined)
    
    @scala.inline
    def setFilterUnits(value: Double | String): Self = this.set("filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterUnits: Self = this.set("filterUnits", js.undefined)
    
    @scala.inline
    def setFloodColor(value: Double | String): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setFocusable(value: Booleanish | auto): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: inherit | typingsSlinky.materialUiCore.materialUiCoreStrings.default | small | large): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontStretch(value: Double | String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: Double | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: Double | String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFormat(value: Double | String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrom(value: Double | String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFx(value: Double | String): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setFy(value: Double | String): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    
    @scala.inline
    def setG1(value: Double | String): Self = this.set("g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG1: Self = this.set("g1", js.undefined)
    
    @scala.inline
    def setG2(value: Double | String): Self = this.set("g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG2: Self = this.set("g2", js.undefined)
    
    @scala.inline
    def setGlyphName(value: Double | String): Self = this.set("glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphName: Self = this.set("glyphName", js.undefined)
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = this.set("glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationHorizontal: Self = this.set("glyphOrientationHorizontal", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setGlyphRef(value: Double | String): Self = this.set("glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphRef: Self = this.set("glyphRef", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: String): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: String): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    
    @scala.inline
    def setHanging(value: Double | String): Self = this.set("hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHanging: Self = this.set("hanging", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = this.set("horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizAdvX: Self = this.set("horizAdvX", js.undefined)
    
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = this.set("horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizOriginX: Self = this.set("horizOriginX", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdeographic(value: Double | String): Self = this.set("ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeographic: Self = this.set("ideographic", js.undefined)
    
    @scala.inline
    def setImageRendering(value: Double | String): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    
    @scala.inline
    def setIn(value: String): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setIn2(value: Double | String): Self = this.set("in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn2: Self = this.set("in2", js.undefined)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_] | ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setIntercept(value: Double | String): Self = this.set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    
    @scala.inline
    def setK(value: Double | String): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    
    @scala.inline
    def setK1(value: Double | String): Self = this.set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK1: Self = this.set("k1", js.undefined)
    
    @scala.inline
    def setK2(value: Double | String): Self = this.set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK2: Self = this.set("k2", js.undefined)
    
    @scala.inline
    def setK3(value: Double | String): Self = this.set("k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK3: Self = this.set("k3", js.undefined)
    
    @scala.inline
    def setK4(value: Double | String): Self = this.set("k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK4: Self = this.set("k4", js.undefined)
    
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = this.set("kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelMatrix: Self = this.set("kernelMatrix", js.undefined)
    
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = this.set("kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelUnitLength: Self = this.set("kernelUnitLength", js.undefined)
    
    @scala.inline
    def setKerning(value: Double | String): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setKeyPoints(value: Double | String): Self = this.set("keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPoints: Self = this.set("keyPoints", js.undefined)
    
    @scala.inline
    def setKeySplines(value: Double | String): Self = this.set("keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySplines: Self = this.set("keySplines", js.undefined)
    
    @scala.inline
    def setKeyTimes(value: Double | String): Self = this.set("keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTimes: Self = this.set("keyTimes", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: Double | String): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = this.set("limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitingConeAngle: Self = this.set("limitingConeAngle", js.undefined)
    
    @scala.inline
    def setLocal(value: Double | String): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerUnits: Self = this.set("markerUnits", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = this.set("maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskContentUnits: Self = this.set("maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: Double | String): Self = this.set("maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskUnits: Self = this.set("maskUnits", js.undefined)
    
    @scala.inline
    def setMathematical(value: Double | String): Self = this.set("mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathematical: Self = this.set("mathematical", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNativeColor(value: String): Self = this.set("nativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeColor: Self = this.set("nativeColor", js.undefined)
    
    @scala.inline
    def setNumOctaves(value: Double | String): Self = this.set("numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumOctaves: Self = this.set("numOctaves", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[SVGSVGElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[SVGSVGElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[SVGSVGElement] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[SVGSVGElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[SVGSVGElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[SVGSVGElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[SVGSVGElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[SVGSVGElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[SVGSVGElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOperator(value: Double | String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setOrder(value: Double | String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrient(value: Double | String): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double | String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setOverflow(value: Double | String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = this.set("overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlinePosition: Self = this.set("overlinePosition", js.undefined)
    
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = this.set("overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlineThickness: Self = this.set("overlineThickness", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: Double | String): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    
    @scala.inline
    def setPanose1(value: Double | String): Self = this.set("panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanose1: Self = this.set("panose1", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathLength(value: Double | String): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathLength: Self = this.set("pathLength", js.undefined)
    
    @scala.inline
    def setPatternContentUnits(value: String): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: Double | String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    
    @scala.inline
    def setPatternUnits(value: String): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: Double | String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPoints(value: String): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setPointsAtX(value: Double | String): Self = this.set("pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtX: Self = this.set("pointsAtX", js.undefined)
    
    @scala.inline
    def setPointsAtY(value: Double | String): Self = this.set("pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtY: Self = this.set("pointsAtY", js.undefined)
    
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = this.set("pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtZ: Self = this.set("pointsAtZ", js.undefined)
    
    @scala.inline
    def setPreserveAlpha(value: Booleanish): Self = this.set("preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAlpha: Self = this.set("preserveAlpha", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = this.set("primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveUnits: Self = this.set("primitiveUnits", js.undefined)
    
    @scala.inline
    def setR(value: Double | String): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[SVGSVGElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ SVGSVGElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: LegacyRef[SVGSVGElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setRefX(value: Double | String): Self = this.set("refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefX: Self = this.set("refX", js.undefined)
    
    @scala.inline
    def setRefY(value: Double | String): Self = this.set("refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefY: Self = this.set("refY", js.undefined)
    
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = this.set("renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingIntent: Self = this.set("renderingIntent", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: Double | String): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatCount: Self = this.set("repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDur(value: Double | String): Self = this.set("repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDur: Self = this.set("repeatDur", js.undefined)
    
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredExtensions: Self = this.set("requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", js.undefined)
    
    @scala.inline
    def setRestart(value: Double | String): Self = this.set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRx(value: Double | String): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double | String): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setScale(value: Double | String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: String): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setSlope(value: Double | String): Self = this.set("slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlope: Self = this.set("slope", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double | String): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = this.set("specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularConstant: Self = this.set("specularConstant", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = this.set("specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularExponent: Self = this.set("specularExponent", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double | String): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setSpreadMethod(value: String): Self = this.set("spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadMethod: Self = this.set("spreadMethod", js.undefined)
    
    @scala.inline
    def setStartOffset(value: Double | String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: Double | String): Self = this.set("stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdDeviation: Self = this.set("stdDeviation", js.undefined)
    
    @scala.inline
    def setStemh(value: Double | String): Self = this.set("stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemh: Self = this.set("stemh", js.undefined)
    
    @scala.inline
    def setStemv(value: Double | String): Self = this.set("stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemv: Self = this.set("stemv", js.undefined)
    
    @scala.inline
    def setStitchTiles(value: Double | String): Self = this.set("stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStitchTiles: Self = this.set("stitchTiles", js.undefined)
    
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = this.set("strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughPosition: Self = this.set("strikethroughPosition", js.undefined)
    
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = this.set("strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughThickness: Self = this.set("strikethroughThickness", js.undefined)
    
    @scala.inline
    def setString(value: Double | String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = this.set("surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurfaceScale: Self = this.set("surfaceScale", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLanguage: Self = this.set("systemLanguage", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTableValues(value: Double | String): Self = this.set("tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableValues: Self = this.set("tableValues", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetX(value: Double | String): Self = this.set("targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetX: Self = this.set("targetX", js.undefined)
    
    @scala.inline
    def setTargetY(value: Double | String): Self = this.set("targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetY: Self = this.set("targetY", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: Double | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextLength(value: Double | String): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    
    @scala.inline
    def setTextRendering(value: Double | String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setTitleAccess(value: String): Self = this.set("titleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAccess: Self = this.set("titleAccess", js.undefined)
    
    @scala.inline
    def setTo(value: Double | String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setU1(value: Double | String): Self = this.set("u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU1: Self = this.set("u1", js.undefined)
    
    @scala.inline
    def setU2(value: Double | String): Self = this.set("u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU2: Self = this.set("u2", js.undefined)
    
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlinePosition: Self = this.set("underlinePosition", js.undefined)
    
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineThickness: Self = this.set("underlineThickness", js.undefined)
    
    @scala.inline
    def setUnicode(value: Double | String): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsPerEm: Self = this.set("unitsPerEm", js.undefined)
    
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = this.set("vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAlphabetic: Self = this.set("vAlphabetic", js.undefined)
    
    @scala.inline
    def setVHanging(value: Double | String): Self = this.set("vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVHanging: Self = this.set("vHanging", js.undefined)
    
    @scala.inline
    def setVIdeographic(value: Double | String): Self = this.set("vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVIdeographic: Self = this.set("vIdeographic", js.undefined)
    
    @scala.inline
    def setVMathematical(value: Double | String): Self = this.set("vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVMathematical: Self = this.set("vMathematical", js.undefined)
    
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: Double | String): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVertAdvY(value: Double | String): Self = this.set("vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAdvY: Self = this.set("vertAdvY", js.undefined)
    
    @scala.inline
    def setVertOriginX(value: Double | String): Self = this.set("vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginX: Self = this.set("vertOriginX", js.undefined)
    
    @scala.inline
    def setVertOriginY(value: Double | String): Self = this.set("vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginY: Self = this.set("vertOriginY", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    
    @scala.inline
    def setViewTarget(value: Double | String): Self = this.set("viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTarget: Self = this.set("viewTarget", js.undefined)
    
    @scala.inline
    def setVisibility(value: Double | String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidths(value: Double | String): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: Double | String): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setX1(value: Double | String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double | String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setXChannelSelector(value: String): Self = this.set("xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXChannelSelector: Self = this.set("xChannelSelector", js.undefined)
    
    @scala.inline
    def setXHeight(value: Double | String): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXHeight: Self = this.set("xHeight", js.undefined)
    
    @scala.inline
    def setXlinkActuate(value: String): Self = this.set("xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkActuate: Self = this.set("xlinkActuate", js.undefined)
    
    @scala.inline
    def setXlinkArcrole(value: String): Self = this.set("xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkArcrole: Self = this.set("xlinkArcrole", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: String): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", js.undefined)
    
    @scala.inline
    def setXlinkRole(value: String): Self = this.set("xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkRole: Self = this.set("xlinkRole", js.undefined)
    
    @scala.inline
    def setXlinkShow(value: String): Self = this.set("xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkShow: Self = this.set("xlinkShow", js.undefined)
    
    @scala.inline
    def setXlinkTitle(value: String): Self = this.set("xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkTitle: Self = this.set("xlinkTitle", js.undefined)
    
    @scala.inline
    def setXlinkType(value: String): Self = this.set("xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkType: Self = this.set("xlinkType", js.undefined)
    
    @scala.inline
    def setXmlBase(value: String): Self = this.set("xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlBase: Self = this.set("xmlBase", js.undefined)
    
    @scala.inline
    def setXmlLang(value: String): Self = this.set("xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlLang: Self = this.set("xmlLang", js.undefined)
    
    @scala.inline
    def setXmlSpace(value: String): Self = this.set("xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlSpace: Self = this.set("xmlSpace", js.undefined)
    
    @scala.inline
    def setXmlns(value: String): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
    
    @scala.inline
    def setXmlnsXlink(value: String): Self = this.set("xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlnsXlink: Self = this.set("xmlnsXlink", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setY1(value: Double | String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double | String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
    
    @scala.inline
    def setYChannelSelector(value: String): Self = this.set("yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYChannelSelector: Self = this.set("yChannelSelector", js.undefined)
    
    @scala.inline
    def setZ(value: Double | String): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZoomAndPan(value: String): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAndPan: Self = this.set("zoomAndPan", js.undefined)
  }
}
