package typingsSlinky.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsSlinky.std.Event_
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartEventMap[K, D] extends dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  var animationOnDataChangeChanged: CustomEvent = js.native
  var animationOnDisplayChanged: CustomEvent = js.native
  var asChanged: CustomEvent = js.native
  var coordinateSystemChanged: CustomEvent = js.native
  var dataChanged: CustomEvent = js.native
  var dataCursorBehaviorChanged: CustomEvent = js.native
  var dataCursorChanged: CustomEvent = js.native
  var dataCursorPositionChanged: CustomEvent = js.native
  var dataLabelChanged: CustomEvent = js.native
  var dndChanged: CustomEvent = js.native
  var dragModeChanged: CustomEvent = js.native
  var drillingChanged: CustomEvent = js.native
  var groupComparatorChanged: CustomEvent = js.native
  var hiddenCategoriesChanged: CustomEvent = js.native
  var hideAndShowBehaviorChanged: CustomEvent = js.native
  var highlightMatchChanged: CustomEvent = js.native
  var highlightedCategoriesChanged: CustomEvent = js.native
  var hoverBehaviorChanged: CustomEvent = js.native
  var initialZoomingChanged: CustomEvent = js.native
  var legendChanged: CustomEvent = js.native
  var ojDrill: CustomEvent = js.native
  var ojSelectInput: CustomEvent = js.native
  var ojViewportChange: CustomEvent = js.native
  var ojViewportChangeInput: CustomEvent = js.native
  var orientationChanged: CustomEvent = js.native
  var otherThresholdChanged: CustomEvent = js.native
  var overviewChanged: CustomEvent = js.native
  var pieCenterChanged: CustomEvent = js.native
  var plotAreaChanged: CustomEvent = js.native
  var polarGridShapeChanged: CustomEvent = js.native
  var selectionChanged: CustomEvent = js.native
  var selectionModeChanged: CustomEvent = js.native
  var seriesComparatorChanged: CustomEvent = js.native
  var sortingChanged: CustomEvent = js.native
  var splitDualYChanged: CustomEvent = js.native
  var splitterPositionChanged: CustomEvent = js.native
  var stackChanged: CustomEvent = js.native
  var stackLabelChanged: CustomEvent = js.native
  var styleDefaultsChanged: CustomEvent = js.native
  var timeAxisTypeChanged: CustomEvent = js.native
  var tooltipChanged: CustomEvent = js.native
  var touchResponseChanged: CustomEvent = js.native
  var typeChanged: CustomEvent = js.native
  var valueFormatsChanged: CustomEvent = js.native
  var xAxisChanged: CustomEvent = js.native
  var y2AxisChanged: CustomEvent = js.native
  var yAxisChanged: CustomEvent = js.native
  var zoomAndScrollChanged: CustomEvent = js.native
  var zoomDirectionChanged: CustomEvent = js.native
}

object ojChartEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: CustomEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    coordinateSystemChanged: CustomEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dataCursorBehaviorChanged: CustomEvent,
    dataCursorChanged: CustomEvent,
    dataCursorPositionChanged: CustomEvent,
    dataLabelChanged: CustomEvent,
    dblclick: MouseEvent,
    dndChanged: CustomEvent,
    drag: DragEvent,
    dragModeChanged: CustomEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: CustomEvent,
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    groupComparatorChanged: CustomEvent,
    hiddenCategoriesChanged: CustomEvent,
    hideAndShowBehaviorChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    initialZoomingChanged: CustomEvent,
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    legendChanged: CustomEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojDrill: CustomEvent,
    ojSelectInput: CustomEvent,
    ojViewportChange: CustomEvent,
    ojViewportChangeInput: CustomEvent,
    orientationChanged: CustomEvent,
    otherThresholdChanged: CustomEvent,
    overviewChanged: CustomEvent,
    paste: ClipboardEvent,
    pause: Event_,
    pieCenterChanged: CustomEvent,
    play: Event_,
    playing: Event_,
    plotAreaChanged: CustomEvent,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    polarGridShapeChanged: CustomEvent,
    progress: ProgressEvent,
    ratechange: Event_,
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event_,
    selectstart: Event_,
    seriesComparatorChanged: CustomEvent,
    sortingChanged: CustomEvent,
    splitDualYChanged: CustomEvent,
    splitterPositionChanged: CustomEvent,
    stackChanged: CustomEvent,
    stackLabelChanged: CustomEvent,
    stalled: Event_,
    styleDefaultsChanged: CustomEvent,
    submit: Event_,
    suspend: Event_,
    timeAxisTypeChanged: CustomEvent,
    timeupdate: Event_,
    toggle: Event_,
    tooltipChanged: CustomEvent,
    touchResponseChanged: CustomEvent,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: CustomEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: CustomEvent,
    typeChanged: CustomEvent,
    valueFormatsChanged: CustomEvent,
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent,
    xAxisChanged: CustomEvent,
    y2AxisChanged: CustomEvent,
    yAxisChanged: CustomEvent,
    zoomAndScrollChanged: CustomEvent,
    zoomDirectionChanged: CustomEvent
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], coordinateSystemChanged = coordinateSystemChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dataCursorBehaviorChanged = dataCursorBehaviorChanged.asInstanceOf[js.Any], dataCursorChanged = dataCursorChanged.asInstanceOf[js.Any], dataCursorPositionChanged = dataCursorPositionChanged.asInstanceOf[js.Any], dataLabelChanged = dataLabelChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragModeChanged = dragModeChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupComparatorChanged = groupComparatorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], legendChanged = legendChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojSelectInput = ojSelectInput.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], ojViewportChangeInput = ojViewportChangeInput.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieCenterChanged = pieCenterChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], polarGridShapeChanged = polarGridShapeChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesComparatorChanged = seriesComparatorChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], splitDualYChanged = splitDualYChanged.asInstanceOf[js.Any], splitterPositionChanged = splitterPositionChanged.asInstanceOf[js.Any], stackChanged = stackChanged.asInstanceOf[js.Any], stackLabelChanged = stackLabelChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeAxisTypeChanged = timeAxisTypeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xAxisChanged = xAxisChanged.asInstanceOf[js.Any], y2AxisChanged = y2AxisChanged.asInstanceOf[js.Any], yAxisChanged = yAxisChanged.asInstanceOf[js.Any], zoomAndScrollChanged = zoomAndScrollChanged.asInstanceOf[js.Any], zoomDirectionChanged = zoomDirectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
  @scala.inline
  implicit class ojChartEventMapOps[Self[k, d] <: ojChartEventMap[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAnimationOnDataChangeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChangeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplayChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplayChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinateSystemChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystemChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursorBehaviorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursorBehaviorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursorPositionChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursorPositionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLabelChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDndChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dndChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragModeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragModeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillingChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupComparatorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComparatorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategoriesChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategoriesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideAndShowBehaviorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAndShowBehaviorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatchChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatchChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategoriesChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategoriesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehaviorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialZoomingChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjDrill(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojDrill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjSelectInput(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojSelectInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjViewportChange(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojViewportChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjViewportChangeInput(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojViewportChangeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientationChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherThresholdChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThresholdChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverviewChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPieCenterChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCenterChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotAreaChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolarGridShapeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polarGridShapeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionModeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionModeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesComparatorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesComparatorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortingChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitDualYChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitDualYChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterPositionChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterPositionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackLabelChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLabelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleDefaultsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaultsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeAxisTypeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAxisTypeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponseChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponseChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormatsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAxisChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2AxisChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2AxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxisChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomAndScrollChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndScrollChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomDirectionChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDirectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

