package typingsSlinky.oracleOraclejet.ojtableMod

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
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTableEventMap[K, D] extends baseComponentEventMap[ojTableSettableProperties[K, D]] {
  
  var accessibilityChanged: CustomEvent = js.native
  
  var asChanged: CustomEvent = js.native
  
  var columnsChanged: CustomEvent = js.native
  
  var columnsDefaultChanged: CustomEvent = js.native
  
  var currentRowChanged: CustomEvent = js.native
  
  var dataChanged: CustomEvent = js.native
  
  var displayChanged: CustomEvent = js.native
  
  var dndChanged: CustomEvent = js.native
  
  var editModeChanged: CustomEvent = js.native
  
  var firstSelectedRowChanged: CustomEvent = js.native
  
  var horizontalGridVisibleChanged: CustomEvent = js.native
  
  var ojAnimateEnd: CustomEvent = js.native
  
  var ojAnimateStart: CustomEvent = js.native
  
  var ojBeforeCurrentRow: CustomEvent = js.native
  
  var ojBeforeRowEdit: CustomEvent = js.native
  
  var ojBeforeRowEditEnd: CustomEvent = js.native
  
  var ojSort: CustomEvent = js.native
  
  var rowRendererChanged: CustomEvent = js.native
  
  var scrollPolicyChanged: CustomEvent = js.native
  
  var scrollPolicyOptionsChanged: CustomEvent = js.native
  
  var scrollPositionChanged: CustomEvent = js.native
  
  var selectionChanged: CustomEvent = js.native
  
  var selectionModeChanged: CustomEvent = js.native
  
  var selectionRequiredChanged: CustomEvent = js.native
  
  var verticalGridVisibleChanged: CustomEvent = js.native
}
object ojTableEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    accessibilityChanged: CustomEvent,
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
    columnsChanged: CustomEvent,
    columnsDefaultChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentRowChanged: CustomEvent,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
    displayChanged: CustomEvent,
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
    editModeChanged: CustomEvent,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    firstSelectedRowChanged: CustomEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    horizontalGridVisibleChanged: CustomEvent,
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
    ojAnimateEnd: CustomEvent,
    ojAnimateStart: CustomEvent,
    ojBeforeCurrentRow: CustomEvent,
    ojBeforeRowEdit: CustomEvent,
    ojBeforeRowEditEnd: CustomEvent,
    ojSort: CustomEvent,
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
    rowRendererChanged: CustomEvent,
    scroll: Event,
    scrollPolicyChanged: CustomEvent,
    scrollPolicyOptionsChanged: CustomEvent,
    scrollPositionChanged: CustomEvent,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionRequiredChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
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
    translationsChanged: CustomEvent,
    verticalGridVisibleChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojTableEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], accessibilityChanged = accessibilityChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], columnsChanged = columnsChanged.asInstanceOf[js.Any], columnsDefaultChanged = columnsDefaultChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentRowChanged = currentRowChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstSelectedRowChanged = firstSelectedRowChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], horizontalGridVisibleChanged = horizontalGridVisibleChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentRow = ojBeforeCurrentRow.asInstanceOf[js.Any], ojBeforeRowEdit = ojBeforeRowEdit.asInstanceOf[js.Any], ojBeforeRowEditEnd = ojBeforeRowEditEnd.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowRendererChanged = rowRendererChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRequiredChanged = selectionRequiredChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], verticalGridVisibleChanged = verticalGridVisibleChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTableEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojTableEventMapOps[Self <: ojTableEventMap[_, _], K, D] (val x: Self with (ojTableEventMap[K, D])) extends AnyVal {
    
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
    def setAccessibilityChanged(value: CustomEvent): Self = this.set("accessibilityChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsChanged(value: CustomEvent): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsChanged(value: CustomEvent): Self = this.set("columnsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsDefaultChanged(value: CustomEvent): Self = this.set("columnsDefaultChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRowChanged(value: CustomEvent): Self = this.set("currentRowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: CustomEvent): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayChanged(value: CustomEvent): Self = this.set("displayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndChanged(value: CustomEvent): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditModeChanged(value: CustomEvent): Self = this.set("editModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSelectedRowChanged(value: CustomEvent): Self = this.set("firstSelectedRowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalGridVisibleChanged(value: CustomEvent): Self = this.set("horizontalGridVisibleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateEnd(value: CustomEvent): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateStart(value: CustomEvent): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCurrentRow(value: CustomEvent): Self = this.set("ojBeforeCurrentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeRowEdit(value: CustomEvent): Self = this.set("ojBeforeRowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeRowEditEnd(value: CustomEvent): Self = this.set("ojBeforeRowEditEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjSort(value: CustomEvent): Self = this.set("ojSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowRendererChanged(value: CustomEvent): Self = this.set("rowRendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicyChanged(value: CustomEvent): Self = this.set("scrollPolicyChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicyOptionsChanged(value: CustomEvent): Self = this.set("scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPositionChanged(value: CustomEvent): Self = this.set("scrollPositionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: CustomEvent): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeChanged(value: CustomEvent): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRequiredChanged(value: CustomEvent): Self = this.set("selectionRequiredChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalGridVisibleChanged(value: CustomEvent): Self = this.set("verticalGridVisibleChanged", value.asInstanceOf[js.Any])
  }
}
