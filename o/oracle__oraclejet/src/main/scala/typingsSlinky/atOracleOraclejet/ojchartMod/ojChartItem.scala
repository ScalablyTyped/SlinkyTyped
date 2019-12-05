package typingsSlinky.atOracleOraclejet.ojchartMod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.atOracleOraclejet.Anon_MedianSvgClassNameMedianSvgStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElement
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSetPropertyType
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.abort
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.aboveMarker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.afterMarker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationcancel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationiteration
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationstart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auxclick
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.beforeMarker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.belowMarker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.blur
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.borderColor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.borderColorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.borderWidth
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.borderWidthChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.boxPlot
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.boxPlotChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cancel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.canplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.canplaythrough
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.categories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.categoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.change
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.click
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.close
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.closeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.color
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.colorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.contextmenu
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.copy
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cuechange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cut
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dblclick
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drag
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragenter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragexit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragleave
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragover
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragstart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drilling
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drillingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drop
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.durationchange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.emptied
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ended
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.error
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusin
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusout
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.fullscreenchange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.fullscreenerror
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.gotpointercapture
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupId
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupIdChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.high
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.input
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.insideBarEdge
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.items
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.itemsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.keydown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.keypress
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.keyup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.label
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelPosition
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelPositionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.load
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadeddata
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadedmetadata
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadstart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lostpointercapture
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.low
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lowChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerDisplayed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerDisplayedChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerShape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerShapeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerSize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerSizeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mousedown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mouseenter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mouseleave
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mousemove
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mouseout
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mouseover
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mouseup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.open
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.openChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outsideBarEdge
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outsideSlice
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.paste
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pattern
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.patternChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pause
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.play
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.playing
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointercancel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerdown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerenter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerleave
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointermove
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerout
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerover
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pointerup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.progress
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q1
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q1Changed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q2
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q2Changed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q3
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.q3Changed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ratechange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.reset
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.resize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.securitypolicyviolation
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seeked
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seeking
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.select
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionchange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectstart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesId
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesIdChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.shortDesc
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.shortDescChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.source
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceHover
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceHoverChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceHoverSelected
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceHoverSelectedChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceSelected
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sourceSelectedChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stalled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.submit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.suspend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgClassName
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.svgStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.targetValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.targetValueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.timeupdate
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.toggle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchcancel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchmove
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchstart_
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transitioncancel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transitionend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transitionrun
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transitionstart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.value
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.volume
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.volumeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.volumechange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.waiting
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.wheel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.x
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.y
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.yChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.z
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zChanged
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartItem extends JetElement[ojChartItemSettableProperties] {
  var borderColor: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var boxPlot: js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyle] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var close: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var drilling: js.UndefOr[on | off | inherit] = js.native
  var groupId: js.Array[String | Double] = js.native
  var high: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[Double | js.Object]] = js.native
  var label: js.UndefOr[String | js.Array[String]] = js.native
  var labelPosition: js.UndefOr[
    center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  ] = js.native
  var labelStyle: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  var low: js.UndefOr[Double] = js.native
  var markerDisplayed: js.UndefOr[on | off | auto] = js.native
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.native
  var markerSize: js.UndefOr[Double] = js.native
  var onBorderColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onBorderWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onBoxPlotChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCloseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupIdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onItemsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerDisplayedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOpenChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPatternChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onQ1Changed: (js.Function1[CustomEvent, _]) | Null = js.native
  var onQ2Changed: (js.Function1[CustomEvent, _]) | Null = js.native
  var onQ3Changed: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSeriesIdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onShortDescChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSourceChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSourceHoverChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSourceHoverSelectedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSourceSelectedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTargetValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVolumeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onXChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onYChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var open: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.native
  var q1: js.UndefOr[Double] = js.native
  var q2: js.UndefOr[Double] = js.native
  var q3: js.UndefOr[Double] = js.native
  var seriesId: String | Double = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var sourceHover: js.UndefOr[String] = js.native
  var sourceHoverSelected: js.UndefOr[String] = js.native
  var sourceSelected: js.UndefOr[String] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var targetValue: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
  var volume: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var y: js.UndefOr[Double] = js.native
  var z: js.UndefOr[Double] = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | inherit]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | inherit]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelPositionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
        ]
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: labelPositionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
        ]
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerDisplayedChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | auto]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: markerDisplayedChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | auto]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
        ]
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
        ]
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: patternChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
        ]
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: patternChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
        ]
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(
    `type`: borderWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(
    `type`: borderWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(
    `type`: boxPlotChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(
    `type`: boxPlotChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closeChanged(
    `type`: closeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closeChanged(
    `type`: closeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupIdChanged(
    `type`: groupIdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupIdChanged(
    `type`: groupIdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highChanged(
    `type`: highChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highChanged(
    `type`: highChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemsChanged(
    `type`: itemsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemsChanged(
    `type`: itemsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: labelStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: labelStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowChanged(
    `type`: lowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowChanged(
    `type`: lowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openChanged(
    `type`: openChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openChanged(
    `type`: openChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q1Changed(
    `type`: q1Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q1Changed(
    `type`: q1Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q2Changed(
    `type`: q2Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q2Changed(
    `type`: q2Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q3Changed(
    `type`: q3Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q3Changed(
    `type`: q3Changed,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesIdChanged(
    `type`: seriesIdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesIdChanged(
    `type`: seriesIdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(
    `type`: sourceChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(
    `type`: sourceChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(
    `type`: sourceHoverChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(
    `type`: sourceHoverChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: sourceHoverSelectedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: sourceHoverSelectedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(
    `type`: sourceSelectedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(
    `type`: sourceSelectedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetValueChanged(
    `type`: targetValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetValueChanged(
    `type`: targetValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumeChanged(
    `type`: volumeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumeChanged(
    `type`: volumeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xChanged(
    `type`: xChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xChanged(
    `type`: xChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yChanged(
    `type`: yChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yChanged(
    `type`: yChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zChanged(
    `type`: zChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zChanged(
    `type`: zChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getProperty(property: String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_borderWidth(property: borderWidth): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_boxPlot(property: boxPlot): js.UndefOr[Anon_MedianSvgClassNameMedianSvgStyle] = js.native
  @JSName("getProperty")
  def getProperty_categories(property: categories): js.UndefOr[js.Array[String]] = js.native
  @JSName("getProperty")
  def getProperty_close(property: close): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): js.UndefOr[on | off | inherit] = js.native
  @JSName("getProperty")
  def getProperty_groupId(property: groupId): js.Array[String | Double] = js.native
  @JSName("getProperty")
  def getProperty_high(property: high): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_items(property: items): js.UndefOr[js.Array[Double | js.Object]] = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): js.UndefOr[String | js.Array[String]] = js.native
  @JSName("getProperty")
  def getProperty_labelPosition(property: labelPosition): js.UndefOr[
    center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_labelStyle(property: labelStyle): js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  @JSName("getProperty")
  def getProperty_low(property: low): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_markerDisplayed(property: markerDisplayed): js.UndefOr[on | off | auto] = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: markerShape): js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: markerSize): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_open(property: open): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_pattern(property: pattern): js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_q1(property: q1): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_q2(property: q2): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_q3(property: q3): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_seriesId(property: seriesId): String | Double = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: shortDesc): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_source(property: source): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_sourceHover(property: sourceHover): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_sourceHoverSelected(property: sourceHoverSelected): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_sourceSelected(property: sourceSelected): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_targetValue(property: targetValue): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_volume(property: volume): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_x(property: x): js.UndefOr[Double | String] = js.native
  @JSName("getProperty")
  def getProperty_y(property: y): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_z(property: z): js.UndefOr[Double] = js.native
  def setProperties(properties: ojChartItemSettablePropertiesLenient): Unit = js.native
  def setProperty(property: drilling, value: inherit): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(
    property: labelPosition,
    value: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  ): Unit = js.native
  def setProperty(property: markerDisplayed, value: auto): Unit = js.native
  def setProperty(property: markerDisplayed, value: off): Unit = js.native
  def setProperty(property: markerDisplayed, value: on): Unit = js.native
  def setProperty(
    property: markerShape,
    value: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ): Unit = js.native
  def setProperty(
    property: pattern,
    value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ): Unit = js.native
  def setProperty[T /* <: String */](property: T, value: JetSetPropertyType[T, ojChartItemSettableProperties]): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderWidth(property: borderWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_boxPlot(property: boxPlot, value: Anon_MedianSvgClassNameMedianSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(property: categories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_close(property: close, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupId(property: groupId, value: js.Array[String | Double]): Unit = js.native
  @JSName("setProperty")
  def setProperty_high(property: high, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_items(property: items, value: js.Array[Double | js.Object]): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: labelStyle, value: js.Array[js.Object]): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: labelStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_low(property: low, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_open(property: open, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_q1(property: q1, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_q2(property: q2, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_q3(property: q3, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesId(property: seriesId, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesId(property: seriesId, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: shortDesc, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_source(property: source, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHover(property: sourceHover, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHoverSelected(property: sourceHoverSelected, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceSelected(property: sourceSelected, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_targetValue(property: targetValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_volume(property: volume, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_x(property: x, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_x(property: x, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_y(property: y, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_z(property: z, value: Double): Unit = js.native
}

