package typingsSlinky.oracleOraclejet.ojganttMod

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
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dependencyDataChanged: CustomEvent,
    dndChanged: CustomEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event_,
    emptied: Event_,
    endChanged: CustomEvent,
    ended: Event_,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event_,
    fullscreenerror: Event_,
    gotpointercapture: PointerEvent,
    gridlinesChanged: CustomEvent,
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
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
    pause: Event_,
    play: Event_,
    playing: Event_,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent,
    ratechange: Event_,
    referenceObjectsChanged: CustomEvent,
    reset: Event_,
    resize: UIEvent,
    rowAxisChanged: CustomEvent,
    rowDefaultsChanged: CustomEvent,
    scroll: Event_,
    scrollPositionChanged: CustomEvent,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    startChanged: CustomEvent,
    submit: Event_,
    suspend: Event_,
    taskDataChanged: CustomEvent,
    taskDefaultsChanged: CustomEvent,
    timeupdate: Event_,
    toggle: Event_,
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
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], axisPositionChanged = axisPositionChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dependencyDataChanged = dependencyDataChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], majorAxisChanged = majorAxisChanged.asInstanceOf[js.Any], minorAxisChanged = minorAxisChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojMove = ojMove.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowAxisChanged = rowAxisChanged.asInstanceOf[js.Any], rowDefaultsChanged = rowDefaultsChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], taskDataChanged = taskDataChanged.asInstanceOf[js.Any], taskDefaultsChanged = taskDefaultsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], viewportEndChanged = viewportEndChanged.asInstanceOf[js.Any], viewportStartChanged = viewportStartChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojGanttEventMapOps[Self[k1, k2, d1, d2] <: ojGanttEventMap[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, D1, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, D1, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, D1, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, D1, D2]) with Other]
    @scala.inline
    def withAnimationOnDataChangeChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChangeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplayChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplayChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisPositionChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPositionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyDataChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyDataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDndChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dndChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridlinesChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlinesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorAxisChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorAxisChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjMove(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjViewportChange(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojViewportChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceObjectsChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjectsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowAxisChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxisChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowDefaultsChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefaultsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPositionChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPositionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionModeChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionModeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDataChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefaultsChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefaultsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormatsChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportEndChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEndChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportStartChanged(value: CustomEvent): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStartChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

