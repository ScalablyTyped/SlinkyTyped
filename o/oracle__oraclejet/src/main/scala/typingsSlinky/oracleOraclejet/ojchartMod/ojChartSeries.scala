package typingsSlinky.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.oracleOraclejet.anon.Q2Color
import typingsSlinky.oracleOraclejet.mod.JetElement
import typingsSlinky.oracleOraclejet.mod.JetSetPropertyType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.abort
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationcancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationiteration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaSvgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.assignedToY2
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.assignedToY2Changed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auxclick
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.blur
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderWidth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.borderWidthChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.boxPlotChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.candlestick
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.canplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.canplaythrough
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.categories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.categoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.change
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.click
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.contextmenu
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.copy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cuechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.curved
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cut
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dblclick
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayInLegend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayInLegendChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drag
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragexit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drop
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.durationchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.emptied
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ended
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.error
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusin
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fullscreenchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fullscreenerror
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gotpointercapture
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.input
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keydown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keypress
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keyup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWidth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWidthChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.load
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadeddata
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadedmetadata
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lostpointercapture
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerDisplayed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerDisplayedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerShape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerShapeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSvgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSvgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSvgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerSvgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mousedown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mousemove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.name
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.paste
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pattern
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.patternChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pause
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pieSliceExplode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pieSliceExplodeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.play
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.playing
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointercancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerdown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointermove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.progress
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ratechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.reset
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.resize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.securitypolicyviolation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seeked
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seeking
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDescChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.source
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceHover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceHoverChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceHoverSelected
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceHoverSelectedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceSelected
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sourceSelectedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stackCategory
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stackCategoryChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stalled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.straight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.submit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.suspend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timeupdate
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.toggle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchcancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchmove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchstart_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitioncancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionrun
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.volumechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.waiting
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wheel
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChartSeries extends JetElement[ojChartSeriesSettableProperties] {
  
  def addEventListener(`type`: assignedToY2Changed, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: assignedToY2Changed,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: displayInLegendChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: displayInLegendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: drillingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: markerDisplayedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: markerDisplayedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: markerShapeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: patternChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: patternChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(`type`: areaColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgStyleChanged(`type`: areaSvgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgStyleChanged(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(`type`: borderColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(`type`: borderWidthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(
    `type`: borderWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(`type`: boxPlotChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(
    `type`: boxPlotChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(`type`: categoriesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(`type`: colorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(`type`: lineWidthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerColorChanged(`type`: markerColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerColorChanged(
    `type`: markerColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(`type`: markerSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgClassNameChanged(
    `type`: markerSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgClassNameChanged(
    `type`: markerSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgStyleChanged(`type`: markerSvgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgStyleChanged(
    `type`: markerSvgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nameChanged(`type`: nameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nameChanged(
    `type`: nameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieSliceExplodeChanged(`type`: pieSliceExplodeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieSliceExplodeChanged(
    `type`: pieSliceExplodeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(`type`: shortDescChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(`type`: sourceChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(
    `type`: sourceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(`type`: sourceHoverChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(
    `type`: sourceHoverChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: sourceHoverSelectedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: sourceHoverSelectedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(`type`: sourceSelectedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(
    `type`: sourceSelectedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stackCategoryChanged(`type`: stackCategoryChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stackCategoryChanged(
    `type`: stackCategoryChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(`type`: svgClassNameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var areaColor: js.UndefOr[String] = js.native
  
  var areaSvgClassName: js.UndefOr[String] = js.native
  
  var areaSvgStyle: js.UndefOr[js.Object] = js.native
  
  var assignedToY2: js.UndefOr[on | off] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var boxPlot: js.UndefOr[Q2Color] = js.native
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var displayInLegend: js.UndefOr[on | off | auto] = js.native
  
  var drilling: js.UndefOr[on | off | inherit] = js.native
  
  def getProperty(property: String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_areaColor(property: areaColor): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_areaSvgClassName(property: areaSvgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_areaSvgStyle(property: areaSvgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_assignedToY2(property: assignedToY2): js.UndefOr[on | off] = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_borderWidth(property: borderWidth): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_boxPlot(property: boxPlot): js.UndefOr[Q2Color] = js.native
  @JSName("getProperty")
  def getProperty_categories(property: categories): js.UndefOr[js.Array[String]] = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_displayInLegend(property: displayInLegend): js.UndefOr[on | off | auto] = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): js.UndefOr[on | off | inherit] = js.native
  @JSName("getProperty")
  def getProperty_lineStyle(property: lineStyle): js.UndefOr[dotted | dashed | solid] = js.native
  @JSName("getProperty")
  def getProperty_lineType(property: lineType): js.UndefOr[
    straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_lineWidth(property: lineWidth): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_markerColor(property: markerColor): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_markerDisplayed(property: markerDisplayed): js.UndefOr[on | off | auto] = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: markerShape): js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: markerSize): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_markerSvgClassName(property: markerSvgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_markerSvgStyle(property: markerSvgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_name(property: name): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_pattern(property: pattern): js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_pieSliceExplode(property: pieSliceExplode): js.UndefOr[Double] = js.native
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
  def getProperty_stackCategory(property: stackCategory): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto] = js.native
  
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.native
  
  var lineType: js.UndefOr[
    straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  ] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var markerColor: js.UndefOr[String] = js.native
  
  var markerDisplayed: js.UndefOr[on | off | auto] = js.native
  
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.native
  
  var markerSize: js.UndefOr[Double] = js.native
  
  var markerSvgClassName: js.UndefOr[String] = js.native
  
  var markerSvgStyle: js.UndefOr[js.Object] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onAreaColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAssignedToY2Changed: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBorderColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBorderWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onBoxPlotChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDisplayInLegendChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLineWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerDisplayedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPatternChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPieSliceExplodeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onShortDescChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSourceChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSourceHoverChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSourceHoverSelectedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSourceSelectedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStackCategoryChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.native
  
  var pieSliceExplode: js.UndefOr[Double] = js.native
  
  def setProperties(properties: ojChartSeriesSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: auto): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: boxPlot): Unit = js.native
  def setProperty(property: `type`, value: candlestick): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: assignedToY2, value: off): Unit = js.native
  def setProperty(property: assignedToY2, value: on): Unit = js.native
  def setProperty(property: displayInLegend, value: auto): Unit = js.native
  def setProperty(property: displayInLegend, value: off): Unit = js.native
  def setProperty(property: displayInLegend, value: on): Unit = js.native
  def setProperty(property: drilling, value: inherit): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: lineStyle, value: dashed): Unit = js.native
  def setProperty(property: lineStyle, value: dotted): Unit = js.native
  def setProperty(property: lineStyle, value: solid): Unit = js.native
  def setProperty(property: lineType, value: auto): Unit = js.native
  def setProperty(property: lineType, value: centeredSegmented): Unit = js.native
  def setProperty(property: lineType, value: centeredStepped): Unit = js.native
  def setProperty(property: lineType, value: curved): Unit = js.native
  def setProperty(property: lineType, value: none): Unit = js.native
  def setProperty(property: lineType, value: segmented): Unit = js.native
  def setProperty(property: lineType, value: stepped): Unit = js.native
  def setProperty(property: lineType, value: straight): Unit = js.native
  def setProperty(property: markerDisplayed, value: auto): Unit = js.native
  def setProperty(property: markerDisplayed, value: off): Unit = js.native
  def setProperty(property: markerDisplayed, value: on): Unit = js.native
  def setProperty(property: markerShape, value: auto): Unit = js.native
  def setProperty(property: markerShape, value: circle): Unit = js.native
  def setProperty(property: markerShape, value: diamond): Unit = js.native
  def setProperty(property: markerShape, value: human): Unit = js.native
  def setProperty(property: markerShape, value: plus): Unit = js.native
  def setProperty(property: markerShape, value: square): Unit = js.native
  def setProperty(property: markerShape, value: star): Unit = js.native
  def setProperty(property: markerShape, value: triangleDown): Unit = js.native
  def setProperty(property: markerShape, value: triangleUp): Unit = js.native
  def setProperty(property: pattern, value: auto): Unit = js.native
  def setProperty(property: pattern, value: largeChecker): Unit = js.native
  def setProperty(property: pattern, value: largeCrosshatch): Unit = js.native
  def setProperty(property: pattern, value: largeDiagonalLeft): Unit = js.native
  def setProperty(property: pattern, value: largeDiagonalRight): Unit = js.native
  def setProperty(property: pattern, value: largeDiamond): Unit = js.native
  def setProperty(property: pattern, value: largeTriangle): Unit = js.native
  def setProperty(property: pattern, value: smallChecker): Unit = js.native
  def setProperty(property: pattern, value: smallCrosshatch): Unit = js.native
  def setProperty(property: pattern, value: smallDiagonalLeft): Unit = js.native
  def setProperty(property: pattern, value: smallDiagonalRight): Unit = js.native
  def setProperty(property: pattern, value: smallDiamond): Unit = js.native
  def setProperty(property: pattern, value: smallTriangle): Unit = js.native
  def setProperty[T /* <: String */](property: T, value: JetSetPropertyType[T, ojChartSeriesSettableProperties]): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaColor(property: areaColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaColor(property: areaColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgClassName(property: areaSvgClassName): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgClassName(property: areaSvgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgStyle(property: areaSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgStyle(property: areaSvgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_assignedToY2(property: assignedToY2): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderWidth(property: borderWidth): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderWidth(property: borderWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_boxPlot(property: boxPlot): Unit = js.native
  @JSName("setProperty")
  def setProperty_boxPlot(property: boxPlot, value: Q2Color): Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(property: categories): Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(property: categories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayInLegend(property: displayInLegend): Unit = js.native
  @JSName("setProperty")
  def setProperty_drilling(property: drilling): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineStyle(property: lineStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineType(property: lineType): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: lineWidth): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: lineWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerColor(property: markerColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerColor(property: markerColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerDisplayed(property: markerDisplayed): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerShape(property: markerShape): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerShape(property: markerShape, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgClassName(property: markerSvgClassName): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgClassName(property: markerSvgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgStyle(property: markerSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgStyle(property: markerSvgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_name(property: name): Unit = js.native
  @JSName("setProperty")
  def setProperty_name(property: name, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pattern(property: pattern): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieSliceExplode(property: pieSliceExplode): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieSliceExplode(property: pieSliceExplode, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: shortDesc): Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: shortDesc, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_source(property: source): Unit = js.native
  @JSName("setProperty")
  def setProperty_source(property: source, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHover(property: sourceHover): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHover(property: sourceHover, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHoverSelected(property: sourceHoverSelected): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHoverSelected(property: sourceHoverSelected, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceSelected(property: sourceSelected): Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceSelected(property: sourceSelected, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_stackCategory(property: stackCategory): Unit = js.native
  @JSName("setProperty")
  def setProperty_stackCategory(property: stackCategory, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_type(property: `type`): Unit = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceHover: js.UndefOr[String] = js.native
  
  var sourceHoverSelected: js.UndefOr[String] = js.native
  
  var sourceSelected: js.UndefOr[String] = js.native
  
  var stackCategory: js.UndefOr[String] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var `type`: js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto] = js.native
}
