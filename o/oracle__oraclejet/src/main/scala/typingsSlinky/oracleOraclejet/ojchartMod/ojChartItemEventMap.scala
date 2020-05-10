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
import typingsSlinky.std.DocumentAndElementEventHandlersEventMap
import typingsSlinky.std.ElementEventMap
import typingsSlinky.std.Event_
import typingsSlinky.std.GlobalEventHandlersEventMap
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartItemEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var borderColorChanged: CustomEvent = js.native
  var borderWidthChanged: CustomEvent = js.native
  var boxPlotChanged: CustomEvent = js.native
  var categoriesChanged: CustomEvent = js.native
  var closeChanged: CustomEvent = js.native
  var colorChanged: CustomEvent = js.native
  var drillingChanged: CustomEvent = js.native
  var groupIdChanged: CustomEvent = js.native
  var highChanged: CustomEvent = js.native
  var itemsChanged: CustomEvent = js.native
  var labelChanged: CustomEvent = js.native
  var labelPositionChanged: CustomEvent = js.native
  var labelStyleChanged: CustomEvent = js.native
  var lowChanged: CustomEvent = js.native
  var markerDisplayedChanged: CustomEvent = js.native
  var markerShapeChanged: CustomEvent = js.native
  var markerSizeChanged: CustomEvent = js.native
  var openChanged: CustomEvent = js.native
  var patternChanged: CustomEvent = js.native
  var q1Changed: CustomEvent = js.native
  var q2Changed: CustomEvent = js.native
  var q3Changed: CustomEvent = js.native
  var seriesIdChanged: CustomEvent = js.native
  var shortDescChanged: CustomEvent = js.native
  var sourceChanged: CustomEvent = js.native
  var sourceHoverChanged: CustomEvent = js.native
  var sourceHoverSelectedChanged: CustomEvent = js.native
  var sourceSelectedChanged: CustomEvent = js.native
  var svgClassNameChanged: CustomEvent = js.native
  var svgStyleChanged: CustomEvent = js.native
  var targetValueChanged: CustomEvent = js.native
  var valueChanged: CustomEvent = js.native
  var volumeChanged: CustomEvent = js.native
  var xChanged: CustomEvent = js.native
  var yChanged: CustomEvent = js.native
  var zChanged: CustomEvent = js.native
}

object ojChartItemEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: CustomEvent,
    borderWidthChanged: CustomEvent,
    boxPlotChanged: CustomEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    categoriesChanged: CustomEvent,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    closeChanged: CustomEvent,
    colorChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
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
    groupIdChanged: CustomEvent,
    highChanged: CustomEvent,
    input: Event_,
    invalid: Event_,
    itemsChanged: CustomEvent,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: CustomEvent,
    labelPositionChanged: CustomEvent,
    labelStyleChanged: CustomEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    lowChanged: CustomEvent,
    markerDisplayedChanged: CustomEvent,
    markerShapeChanged: CustomEvent,
    markerSizeChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    openChanged: CustomEvent,
    paste: ClipboardEvent,
    patternChanged: CustomEvent,
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
    q1Changed: CustomEvent,
    q2Changed: CustomEvent,
    q3Changed: CustomEvent,
    ratechange: Event_,
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionchange: Event_,
    selectstart: Event_,
    seriesIdChanged: CustomEvent,
    shortDescChanged: CustomEvent,
    sourceChanged: CustomEvent,
    sourceHoverChanged: CustomEvent,
    sourceHoverSelectedChanged: CustomEvent,
    sourceSelectedChanged: CustomEvent,
    stalled: Event_,
    submit: Event_,
    suspend: Event_,
    svgClassNameChanged: CustomEvent,
    svgStyleChanged: CustomEvent,
    targetValueChanged: CustomEvent,
    timeupdate: Event_,
    toggle: Event_,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    valueChanged: CustomEvent,
    volumeChanged: CustomEvent,
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent,
    xChanged: CustomEvent,
    yChanged: CustomEvent,
    zChanged: CustomEvent
  ): ojChartItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], boxPlotChanged = boxPlotChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeChanged = closeChanged.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupIdChanged = groupIdChanged.asInstanceOf[js.Any], highChanged = highChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemsChanged = itemsChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelPositionChanged = labelPositionChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], lowChanged = lowChanged.asInstanceOf[js.Any], markerDisplayedChanged = markerDisplayedChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], openChanged = openChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q1Changed = q1Changed.asInstanceOf[js.Any], q2Changed = q2Changed.asInstanceOf[js.Any], q3Changed = q3Changed.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesIdChanged = seriesIdChanged.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], targetValueChanged = targetValueChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumeChanged = volumeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xChanged = xChanged.asInstanceOf[js.Any], yChanged = yChanged.asInstanceOf[js.Any], zChanged = zChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemEventMap]
  }
  @scala.inline
  implicit class ojChartItemEventMapOps[Self <: ojChartItemEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColorChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidthChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidthChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxPlotChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPlotChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoriesChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoriesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillingChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupIdChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIdChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelPositionChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPositionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyleChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerDisplayedChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerDisplayedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerShapeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerShapeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerSizeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSizeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ1Changed(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ2Changed(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q2Changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ3Changed(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesIdChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIdChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDescChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceHoverChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceHoverChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceHoverSelectedChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceHoverSelectedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSelectedChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelectedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgClassNameChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassNameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyleChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetValueChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

