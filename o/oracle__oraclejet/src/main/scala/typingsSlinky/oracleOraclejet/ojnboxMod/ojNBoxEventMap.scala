package typingsSlinky.oracleOraclejet.ojnboxMod

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
trait ojNBoxEventMap[K, D] extends dvtBaseComponentEventMap[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChangeChanged: CustomEvent = js.native
  var animationOnDisplayChanged: CustomEvent = js.native
  var asChanged: CustomEvent = js.native
  var cellContentChanged: CustomEvent = js.native
  var cellMaximizeChanged: CustomEvent = js.native
  var cellsChanged: CustomEvent = js.native
  var columnsChanged: CustomEvent = js.native
  var columnsTitleChanged: CustomEvent = js.native
  var countLabelChanged: CustomEvent = js.native
  var dataChanged: CustomEvent = js.native
  var groupAttributesChanged: CustomEvent = js.native
  var groupBehaviorChanged: CustomEvent = js.native
  var hiddenCategoriesChanged: CustomEvent = js.native
  var highlightMatchChanged: CustomEvent = js.native
  var highlightedCategoriesChanged: CustomEvent = js.native
  var hoverBehaviorChanged: CustomEvent = js.native
  var labelTruncationChanged: CustomEvent = js.native
  var maximizedColumnChanged: CustomEvent = js.native
  var maximizedRowChanged: CustomEvent = js.native
  var otherColorChanged: CustomEvent = js.native
  var otherThresholdChanged: CustomEvent = js.native
  var rowsChanged: CustomEvent = js.native
  var rowsTitleChanged: CustomEvent = js.native
  var selectionChanged: CustomEvent = js.native
  var selectionModeChanged: CustomEvent = js.native
  var styleDefaultsChanged: CustomEvent = js.native
  var tooltipChanged: CustomEvent = js.native
  var touchResponseChanged: CustomEvent = js.native
}

object ojNBoxEventMap {
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
    cellContentChanged: CustomEvent,
    cellMaximizeChanged: CustomEvent,
    cellsChanged: CustomEvent,
    change: Event,
    click: MouseEvent,
    close: Event,
    columnsChanged: CustomEvent,
    columnsTitleChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    countLabelChanged: CustomEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
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
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupAttributesChanged: CustomEvent,
    groupBehaviorChanged: CustomEvent,
    hiddenCategoriesChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelTruncationChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maximizedColumnChanged: CustomEvent,
    maximizedRowChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    otherColorChanged: CustomEvent,
    otherThresholdChanged: CustomEvent,
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
    rowsChanged: CustomEvent,
    rowsTitleChanged: CustomEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    styleDefaultsChanged: CustomEvent,
    submit: Event,
    suspend: Event,
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojNBoxEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellContentChanged = cellContentChanged.asInstanceOf[js.Any], cellMaximizeChanged = cellMaximizeChanged.asInstanceOf[js.Any], cellsChanged = cellsChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsTitleChanged = columnsTitleChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], countLabelChanged = countLabelChanged.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupAttributesChanged = groupAttributesChanged.asInstanceOf[js.Any], groupBehaviorChanged = groupBehaviorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelTruncationChanged = labelTruncationChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maximizedColumnChanged = maximizedColumnChanged.asInstanceOf[js.Any], maximizedRowChanged = maximizedRowChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], otherColorChanged = otherColorChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowsChanged = rowsChanged.asInstanceOf[js.Any], rowsTitleChanged = rowsTitleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxEventMap[K, D]]
  }
  @scala.inline
  implicit class ojNBoxEventMapOps[Self[k, d] <: ojNBoxEventMap[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withCellContentChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContentChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellMaximizeChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMaximizeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsTitleChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsTitleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountLabelChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countLabelChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupAttributesChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAttributesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBehaviorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBehaviorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategoriesChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategoriesChanged")(value.asInstanceOf[js.Any])
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
    def withLabelTruncationChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTruncationChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizedColumnChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedColumnChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizedRowChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedRowChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherColorChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherColorChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherThresholdChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThresholdChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsTitleChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsTitleChanged")(value.asInstanceOf[js.Any])
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
    def withStyleDefaultsChanged(value: CustomEvent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaultsChanged")(value.asInstanceOf[js.Any])
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
  }
  
}

