package typingsSlinky.oracleOraclejet.ojganttMod

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
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGanttEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChangeChanged: CustomEvent = js.native
  var animationOnDisplayChanged: CustomEvent = js.native
  var asChanged: CustomEvent = js.native
  var axisPositionChanged: CustomEvent = js.native
  var dependencyDataChanged: CustomEvent = js.native
  var dndChanged: CustomEvent = js.native
  var endChanged: CustomEvent = js.native
  var gridlinesChanged: CustomEvent = js.native
  var majorAxisChanged: CustomEvent = js.native
  var minorAxisChanged: CustomEvent = js.native
  var ojMove: CustomEvent = js.native
  var ojViewportChange: CustomEvent = js.native
  var referenceObjectsChanged: CustomEvent = js.native
  var rowAxisChanged: CustomEvent = js.native
  var rowDefaultsChanged: CustomEvent = js.native
  var scrollPositionChanged: CustomEvent = js.native
  var selectionChanged: CustomEvent = js.native
  var selectionModeChanged: CustomEvent = js.native
  var startChanged: CustomEvent = js.native
  var taskDataChanged: CustomEvent = js.native
  var taskDefaultsChanged: CustomEvent = js.native
  var tooltipChanged: CustomEvent = js.native
  var valueFormatsChanged: CustomEvent = js.native
  var viewportEndChanged: CustomEvent = js.native
  var viewportStartChanged: CustomEvent = js.native
}

object ojGanttEventMap {
  @scala.inline
  def apply[K1, K2, D1, D2](
    abort: UIEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: CustomEvent,
    auxclick: MouseEvent,
    axisPositionChanged: CustomEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dependencyDataChanged: CustomEvent,
    dndChanged: CustomEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    endChanged: CustomEvent,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    majorAxisChanged: CustomEvent,
    minorAxisChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojMove: CustomEvent,
    ojViewportChange: CustomEvent,
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent,
    ratechange: Event,
    referenceObjectsChanged: CustomEvent,
    reset: Event,
    resize: UIEvent,
    rowAxisChanged: CustomEvent,
    rowDefaultsChanged: CustomEvent,
    scroll: Event,
    scrollPositionChanged: CustomEvent,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    startChanged: CustomEvent,
    submit: Event,
    suspend: Event,
    taskDataChanged: CustomEvent,
    taskDefaultsChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: CustomEvent,
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
    valueFormatsChanged: CustomEvent,
    viewportEndChanged: CustomEvent,
    viewportStartChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], axisPositionChanged = axisPositionChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dependencyDataChanged = dependencyDataChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], majorAxisChanged = majorAxisChanged.asInstanceOf[js.Any], minorAxisChanged = minorAxisChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojMove = ojMove.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowAxisChanged = rowAxisChanged.asInstanceOf[js.Any], rowDefaultsChanged = rowDefaultsChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], taskDataChanged = taskDataChanged.asInstanceOf[js.Any], taskDefaultsChanged = taskDefaultsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], viewportEndChanged = viewportEndChanged.asInstanceOf[js.Any], viewportStartChanged = viewportStartChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojGanttEventMapOps[Self <: ojGanttEventMap[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojGanttEventMap[K1, K2, D1, D2])) extends AnyVal {
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
    def setAnimationOnDataChangeChanged(value: CustomEvent): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplayChanged(value: CustomEvent): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsChanged(value: CustomEvent): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisPositionChanged(value: CustomEvent): Self = this.set("axisPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyDataChanged(value: CustomEvent): Self = this.set("dependencyDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDndChanged(value: CustomEvent): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndChanged(value: CustomEvent): Self = this.set("endChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridlinesChanged(value: CustomEvent): Self = this.set("gridlinesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorAxisChanged(value: CustomEvent): Self = this.set("majorAxisChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorAxisChanged(value: CustomEvent): Self = this.set("minorAxisChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjMove(value: CustomEvent): Self = this.set("ojMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjViewportChange(value: CustomEvent): Self = this.set("ojViewportChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceObjectsChanged(value: CustomEvent): Self = this.set("referenceObjectsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowAxisChanged(value: CustomEvent): Self = this.set("rowAxisChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowDefaultsChanged(value: CustomEvent): Self = this.set("rowDefaultsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPositionChanged(value: CustomEvent): Self = this.set("scrollPositionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: CustomEvent): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionModeChanged(value: CustomEvent): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartChanged(value: CustomEvent): Self = this.set("startChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskDataChanged(value: CustomEvent): Self = this.set("taskDataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskDefaultsChanged(value: CustomEvent): Self = this.set("taskDefaultsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipChanged(value: CustomEvent): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueFormatsChanged(value: CustomEvent): Self = this.set("valueFormatsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportEndChanged(value: CustomEvent): Self = this.set("viewportEndChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportStartChanged(value: CustomEvent): Self = this.set("viewportStartChanged", value.asInstanceOf[js.Any])
  }
  
}

