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
trait ojChartSeriesEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var areaColorChanged: CustomEvent = js.native
  var areaSvgClassNameChanged: CustomEvent = js.native
  var areaSvgStyleChanged: CustomEvent = js.native
  var assignedToY2Changed: CustomEvent = js.native
  var borderColorChanged: CustomEvent = js.native
  var borderWidthChanged: CustomEvent = js.native
  var boxPlotChanged: CustomEvent = js.native
  var categoriesChanged: CustomEvent = js.native
  var colorChanged: CustomEvent = js.native
  var displayInLegendChanged: CustomEvent = js.native
  var drillingChanged: CustomEvent = js.native
  var lineStyleChanged: CustomEvent = js.native
  var lineTypeChanged: CustomEvent = js.native
  var lineWidthChanged: CustomEvent = js.native
  var markerColorChanged: CustomEvent = js.native
  var markerDisplayedChanged: CustomEvent = js.native
  var markerShapeChanged: CustomEvent = js.native
  var markerSizeChanged: CustomEvent = js.native
  var markerSvgClassNameChanged: CustomEvent = js.native
  var markerSvgStyleChanged: CustomEvent = js.native
  var nameChanged: CustomEvent = js.native
  var patternChanged: CustomEvent = js.native
  var pieSliceExplodeChanged: CustomEvent = js.native
  var shortDescChanged: CustomEvent = js.native
  var sourceChanged: CustomEvent = js.native
  var sourceHoverChanged: CustomEvent = js.native
  var sourceHoverSelectedChanged: CustomEvent = js.native
  var sourceSelectedChanged: CustomEvent = js.native
  var stackCategoryChanged: CustomEvent = js.native
  var svgClassNameChanged: CustomEvent = js.native
  var svgStyleChanged: CustomEvent = js.native
  var typeChanged: CustomEvent = js.native
}

object ojChartSeriesEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: CustomEvent,
    areaSvgClassNameChanged: CustomEvent,
    areaSvgStyleChanged: CustomEvent,
    assignedToY2Changed: CustomEvent,
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
    colorChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    displayInLegendChanged: CustomEvent,
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
    input: Event_,
    invalid: Event_,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lineStyleChanged: CustomEvent,
    lineTypeChanged: CustomEvent,
    lineWidthChanged: CustomEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    markerColorChanged: CustomEvent,
    markerDisplayedChanged: CustomEvent,
    markerShapeChanged: CustomEvent,
    markerSizeChanged: CustomEvent,
    markerSvgClassNameChanged: CustomEvent,
    markerSvgStyleChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nameChanged: CustomEvent,
    paste: ClipboardEvent,
    patternChanged: CustomEvent,
    pause: Event_,
    pieSliceExplodeChanged: CustomEvent,
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
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionchange: Event_,
    selectstart: Event_,
    shortDescChanged: CustomEvent,
    sourceChanged: CustomEvent,
    sourceHoverChanged: CustomEvent,
    sourceHoverSelectedChanged: CustomEvent,
    sourceSelectedChanged: CustomEvent,
    stackCategoryChanged: CustomEvent,
    stalled: Event_,
    submit: Event_,
    suspend: Event_,
    svgClassNameChanged: CustomEvent,
    svgStyleChanged: CustomEvent,
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
    typeChanged: CustomEvent,
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent
  ): ojChartSeriesEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaColorChanged = areaColorChanged.asInstanceOf[js.Any], areaSvgClassNameChanged = areaSvgClassNameChanged.asInstanceOf[js.Any], areaSvgStyleChanged = areaSvgStyleChanged.asInstanceOf[js.Any], assignedToY2Changed = assignedToY2Changed.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], boxPlotChanged = boxPlotChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayInLegendChanged = displayInLegendChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], lineStyleChanged = lineStyleChanged.asInstanceOf[js.Any], lineTypeChanged = lineTypeChanged.asInstanceOf[js.Any], lineWidthChanged = lineWidthChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], markerColorChanged = markerColorChanged.asInstanceOf[js.Any], markerDisplayedChanged = markerDisplayedChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], markerSvgClassNameChanged = markerSvgClassNameChanged.asInstanceOf[js.Any], markerSvgStyleChanged = markerSvgStyleChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nameChanged = nameChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieSliceExplodeChanged = pieSliceExplodeChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stackCategoryChanged = stackCategoryChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSeriesEventMap]
  }
  @scala.inline
  implicit class ojChartSeriesEventMapOps[Self <: ojChartSeriesEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaColorChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaColorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaSvgClassNameChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaSvgClassNameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaSvgStyleChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaSvgStyleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignedToY2Changed(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedToY2Changed")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withColorChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayInLegendChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInLegendChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillingChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyleChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineTypeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTypeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidthChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidthChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerColorChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColorChanged")(value.asInstanceOf[js.Any])
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
    def withMarkerSvgClassNameChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSvgClassNameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerSvgStyleChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSvgStyleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPieSliceExplodeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieSliceExplodeChanged")(value.asInstanceOf[js.Any])
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
    def withStackCategoryChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackCategoryChanged")(value.asInstanceOf[js.Any])
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
    def withTypeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

