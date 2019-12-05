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
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentEventMap
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartEventMap[K, D] extends dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  var animationOnDataChangeChanged: CustomEvent
  var animationOnDisplayChanged: CustomEvent
  var asChanged: CustomEvent
  var coordinateSystemChanged: CustomEvent
  var dataChanged: CustomEvent
  var dataCursorBehaviorChanged: CustomEvent
  var dataCursorChanged: CustomEvent
  var dataCursorPositionChanged: CustomEvent
  var dataLabelChanged: CustomEvent
  var dndChanged: CustomEvent
  var dragModeChanged: CustomEvent
  var drillingChanged: CustomEvent
  var groupComparatorChanged: CustomEvent
  var hiddenCategoriesChanged: CustomEvent
  var hideAndShowBehaviorChanged: CustomEvent
  var highlightMatchChanged: CustomEvent
  var highlightedCategoriesChanged: CustomEvent
  var hoverBehaviorChanged: CustomEvent
  var initialZoomingChanged: CustomEvent
  var legendChanged: CustomEvent
  var ojDrill: CustomEvent
  var ojSelectInput: CustomEvent
  var ojViewportChange: CustomEvent
  var ojViewportChangeInput: CustomEvent
  var orientationChanged: CustomEvent
  var otherThresholdChanged: CustomEvent
  var overviewChanged: CustomEvent
  var pieCenterChanged: CustomEvent
  var plotAreaChanged: CustomEvent
  var polarGridShapeChanged: CustomEvent
  var selectionChanged: CustomEvent
  var selectionModeChanged: CustomEvent
  var seriesComparatorChanged: CustomEvent
  var sortingChanged: CustomEvent
  var splitDualYChanged: CustomEvent
  var splitterPositionChanged: CustomEvent
  var stackChanged: CustomEvent
  var stackLabelChanged: CustomEvent
  var styleDefaultsChanged: CustomEvent
  var timeAxisTypeChanged: CustomEvent
  var tooltipChanged: CustomEvent
  var touchResponseChanged: CustomEvent
  var typeChanged: CustomEvent
  var valueFormatsChanged: CustomEvent
  var xAxisChanged: CustomEvent
  var y2AxisChanged: CustomEvent
  var yAxisChanged: CustomEvent
  var zoomAndScrollChanged: CustomEvent
  var zoomDirectionChanged: CustomEvent
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
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    coordinateSystemChanged: CustomEvent,
    copy: ClipboardEvent,
    cuechange: Event,
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
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: CustomEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupComparatorChanged: CustomEvent,
    hiddenCategoriesChanged: CustomEvent,
    hideAndShowBehaviorChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    initialZoomingChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    legendChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent,
    loadstart: Event,
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
    pause: Event,
    pieCenterChanged: CustomEvent,
    play: Event,
    playing: Event,
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
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    seriesComparatorChanged: CustomEvent,
    sortingChanged: CustomEvent,
    splitDualYChanged: CustomEvent,
    splitterPositionChanged: CustomEvent,
    stackChanged: CustomEvent,
    stackLabelChanged: CustomEvent,
    stalled: Event,
    styleDefaultsChanged: CustomEvent,
    submit: Event,
    suspend: Event,
    timeAxisTypeChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    xAxisChanged: CustomEvent,
    y2AxisChanged: CustomEvent,
    yAxisChanged: CustomEvent,
    zoomAndScrollChanged: CustomEvent,
    zoomDirectionChanged: CustomEvent
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], coordinateSystemChanged = coordinateSystemChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dataCursorBehaviorChanged = dataCursorBehaviorChanged.asInstanceOf[js.Any], dataCursorChanged = dataCursorChanged.asInstanceOf[js.Any], dataCursorPositionChanged = dataCursorPositionChanged.asInstanceOf[js.Any], dataLabelChanged = dataLabelChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragModeChanged = dragModeChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupComparatorChanged = groupComparatorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], legendChanged = legendChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojSelectInput = ojSelectInput.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], ojViewportChangeInput = ojViewportChangeInput.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieCenterChanged = pieCenterChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], polarGridShapeChanged = polarGridShapeChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesComparatorChanged = seriesComparatorChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], splitDualYChanged = splitDualYChanged.asInstanceOf[js.Any], splitterPositionChanged = splitterPositionChanged.asInstanceOf[js.Any], stackChanged = stackChanged.asInstanceOf[js.Any], stackLabelChanged = stackLabelChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeAxisTypeChanged = timeAxisTypeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xAxisChanged = xAxisChanged.asInstanceOf[js.Any], y2AxisChanged = y2AxisChanged.asInstanceOf[js.Any], yAxisChanged = yAxisChanged.asInstanceOf[js.Any], zoomAndScrollChanged = zoomAndScrollChanged.asInstanceOf[js.Any], zoomDirectionChanged = zoomDirectionChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
}

