package typingsSlinky.materialUiIcons.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.svg.svg.tag
import typingsSlinky.materialUiCore.PartialClassNameMapSvgIco
import typingsSlinky.materialUiCore.materialUiCoreStrings._empty
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`after-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`before-edge`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`inline`
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
import typingsSlinky.materialUiCore.materialUiCoreStrings.default
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
import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SvgIconProps1442979138[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: accentHeight, alphabetic, amplitude, ascent, attributeName, attributeType, azimuth, baseFrequency, baseProfile, baselineShift, bbox, begin, bias, by, calcMode, capHeight, clip, clipPath, clipPathUnits, clipRule, colorInterpolation, colorProfile, colorRendering, contentScriptType, contentStyleType, cursor, cx, cy, d, dangerouslySetInnerHTML, descent, diffuseConstant, direction, display, divisor, dominantBaseline, dur, dx, dy, edgeMode, elevation, enableBackground, end, exponent, externalResourcesRequired, fill, fillOpacity, filter, filterRes, filterUnits, floodColor, floodOpacity, fontFamily, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, format, from, fx, fy, g1, g2, glyphName, glyphOrientationHorizontal, glyphOrientationVertical, glyphRef, gradientTransform, gradientUnits, hanging, height, horizAdvX, horizOriginX, id, ideographic, imageRendering, in, in2, intercept, k, k1, k2, k3, k4, kernelMatrix, kernelUnitLength, kerning, key, keyPoints, keySplines, keyTimes, lang, lengthAdjust, letterSpacing, lightingColor, limitingConeAngle, local, markerEnd, markerHeight, markerMid, markerStart, markerUnits, markerWidth, mask, maskContentUnits, maskUnits, mathematical, max, media, method, min, mode, name, numOctaves, offset, onAbort, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onContextMenu, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPause, onPlay, onPlaying, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onVolumeChange, onWaiting, opacity, operator, order, orient, orientation, origin, overflow, overlinePosition, overlineThickness, panose1, pathLength, patternContentUnits, patternTransform, patternUnits, pointerEvents, points, pointsAtX, pointsAtY, pointsAtZ, preserveAlpha, preserveAspectRatio, primitiveUnits, r, radius, refX, refY, renderingIntent, repeatCount, repeatDur, requiredExtensions, requiredFeatures, restart, result, rotate, rx, ry, scale, seed, slope, spacing, specularConstant, specularExponent, spreadMethod, startOffset, stdDeviation, stemh, stemv, stitchTiles, stopColor, stopOpacity, strikethroughPosition, strikethroughThickness, string, stroke, strokeDasharray, strokeDashoffset, strokeMiterlimit, strokeOpacity, strokeWidth, style, surfaceScale, systemLanguage, tableValues, target, targetX, targetY, textAnchor, textDecoration, textLength, textRendering, to, transform, type, u1, u2, underlinePosition, underlineThickness, unicode, unicodeBidi, unicodeRange, unitsPerEm, vAlphabetic, vHanging, vIdeographic, vMathematical, values, version, vertAdvY, vertOriginX, vertOriginY, viewBox, viewTarget, visibility, width, widths, wordSpacing, writingMode, x, x1, x2, xChannelSelector, xHeight, y, y1, y2, yChannelSelector, z, zoomAndPan */
  def apply(
    accumulate: none | sum = null,
    additive: replace | sum = null,
    alignmentBaseline: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = null,
    allowReorder: no | yes = null,
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
    autoReverse: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classes: PartialClassNameMapSvgIco = null,
    color: Color | action | disabled | error = null,
    colorInterpolationFilters: auto | sRGB | linearRGB | inherit = null,
    component: ReactComponentClass[SvgIconProps] = null,
    crossOrigin: anonymous | `use-credentials` | _empty = null,
    decelerate: Double | String = null,
    fillRule: nonzero | evenodd | inherit = null,
    focusable: Booleanish | auto = null,
    fontSize: inherit | default | small | large = null,
    href: String = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    nativeColor: String = null,
    onAnimationEnd: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with SVGSVGElement, Event_] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onCut: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, SVGSVGElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[SVGSVGElement] => Unit = null,
    onWheel: SyntheticWheelEvent[SVGSVGElement] => Unit = null,
    paintOrder: Double | String = null,
    path: String = null,
    role: String = null,
    shapeRendering: String = null,
    speed: Double | String = null,
    strokeLinecap: butt | round | square | inherit = null,
    strokeLinejoin: miter | round | bevel | inherit = null,
    tabIndex: Int | Double = null,
    titleAccess: String = null,
    vectorEffect: Double | String = null,
    xlinkActuate: String = null,
    xlinkArcrole: String = null,
    xlinkHref: String = null,
    xlinkRole: String = null,
    xlinkShow: String = null,
    xlinkTitle: String = null,
    xlinkType: String = null,
    xmlBase: String = null,
    xmlLang: String = null,
    xmlSpace: String = null,
    xmlns: String = null,
    xmlnsXlink: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (accumulate != null) __obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (allowReorder != null) __obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
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
    if (!js.isUndefined(autoReverse)) __obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (decelerate != null) __obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (nativeColor != null) __obj.updateDynamic("nativeColor")(nativeColor.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (paintOrder != null) __obj.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (titleAccess != null) __obj.updateDynamic("titleAccess")(titleAccess.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    if (xlinkActuate != null) __obj.updateDynamic("xlinkActuate")(xlinkActuate.asInstanceOf[js.Any])
    if (xlinkArcrole != null) __obj.updateDynamic("xlinkArcrole")(xlinkArcrole.asInstanceOf[js.Any])
    if (xlinkHref != null) __obj.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
    if (xlinkRole != null) __obj.updateDynamic("xlinkRole")(xlinkRole.asInstanceOf[js.Any])
    if (xlinkShow != null) __obj.updateDynamic("xlinkShow")(xlinkShow.asInstanceOf[js.Any])
    if (xlinkTitle != null) __obj.updateDynamic("xlinkTitle")(xlinkTitle.asInstanceOf[js.Any])
    if (xlinkType != null) __obj.updateDynamic("xlinkType")(xlinkType.asInstanceOf[js.Any])
    if (xmlBase != null) __obj.updateDynamic("xmlBase")(xmlBase.asInstanceOf[js.Any])
    if (xmlLang != null) __obj.updateDynamic("xmlLang")(xmlLang.asInstanceOf[js.Any])
    if (xmlSpace != null) __obj.updateDynamic("xmlSpace")(xmlSpace.asInstanceOf[js.Any])
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    if (xmlnsXlink != null) __obj.updateDynamic("xmlnsXlink")(xmlnsXlink.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.svg.svg.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SvgIconProps
}

