package typingsSlinky.oracleOraclejet.ojpictochartMod

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
import typingsSlinky.std.DocumentAndElementEventHandlersEventMap
import typingsSlinky.std.ElementEventMap
import typingsSlinky.std.GlobalEventHandlersEventMap
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPictoChartItemEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var borderColorChanged: CustomEvent = js.native
  var borderWidthChanged: CustomEvent = js.native
  var categoriesChanged: CustomEvent = js.native
  var colorChanged: CustomEvent = js.native
  var columnSpanChanged: CustomEvent = js.native
  var countChanged: CustomEvent = js.native
  var drillingChanged: CustomEvent = js.native
  var nameChanged: CustomEvent = js.native
  var rowSpanChanged: CustomEvent = js.native
  var shapeChanged: CustomEvent = js.native
  var shortDescChanged: CustomEvent = js.native
  var sourceChanged: CustomEvent = js.native
  var sourceHoverChanged: CustomEvent = js.native
  var sourceHoverSelectedChanged: CustomEvent = js.native
  var sourceSelectedChanged: CustomEvent = js.native
  var svgClassNameChanged: CustomEvent = js.native
  var svgStyleChanged: CustomEvent = js.native
}

object ojPictoChartItemEventMap {
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
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: CustomEvent,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: CustomEvent,
    columnSpanChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    countChanged: CustomEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
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
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nameChanged: CustomEvent,
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
    reset: Event,
    resize: UIEvent,
    rowSpanChanged: CustomEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shapeChanged: CustomEvent,
    shortDescChanged: CustomEvent,
    sourceChanged: CustomEvent,
    sourceHoverChanged: CustomEvent,
    sourceHoverSelectedChanged: CustomEvent,
    sourceSelectedChanged: CustomEvent,
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: CustomEvent,
    svgStyleChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojPictoChartItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], columnSpanChanged = columnSpanChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], countChanged = countChanged.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nameChanged = nameChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowSpanChanged = rowSpanChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shapeChanged = shapeChanged.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartItemEventMap]
  }
  @scala.inline
  implicit class ojPictoChartItemEventMapOps[Self <: ojPictoChartItemEventMap] (val x: Self) extends AnyVal {
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
    def withColumnSpanChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpanChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrillingChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillingChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpanChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpanChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeChanged(value: CustomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeChanged")(value.asInstanceOf[js.Any])
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
  }
  
}

