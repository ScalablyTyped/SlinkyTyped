package typingsSlinky.oracleOraclejet.ojdatagridMod

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
trait ojDataGridEventMap[K, D] extends baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
  
  var bandingIntervalChanged: CustomEvent = js.native
  
  var cellChanged: CustomEvent = js.native
  
  var currentCellChanged: CustomEvent = js.native
  
  var dataChanged: CustomEvent = js.native
  
  var dndChanged: CustomEvent = js.native
  
  var editModeChanged: CustomEvent = js.native
  
  var gridlinesChanged: CustomEvent = js.native
  
  var headerChanged: CustomEvent = js.native
  
  var ojBeforeCurrentCell: CustomEvent = js.native
  
  var ojBeforeEdit: CustomEvent = js.native
  
  var ojBeforeEditEnd: CustomEvent = js.native
  
  var ojResize: CustomEvent = js.native
  
  var ojScroll: CustomEvent = js.native
  
  var ojSort: CustomEvent = js.native
  
  var scrollPolicyChanged: CustomEvent = js.native
  
  var scrollPolicyOptionsChanged: CustomEvent = js.native
  
  var scrollPositionChanged: CustomEvent = js.native
  
  var selectionChanged: CustomEvent = js.native
  
  var selectionModeChanged: CustomEvent = js.native
}
object ojDataGridEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    bandingIntervalChanged: CustomEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    cellChanged: CustomEvent,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentCellChanged: CustomEvent,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
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
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: CustomEvent,
    headerChanged: CustomEvent,
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
    ojBeforeCurrentCell: CustomEvent,
    ojBeforeEdit: CustomEvent,
    ojBeforeEditEnd: CustomEvent,
    ojResize: CustomEvent,
    ojScroll: CustomEvent,
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojDataGridEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], bandingIntervalChanged = bandingIntervalChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellChanged = cellChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentCellChanged = currentCellChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], headerChanged = headerChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCurrentCell = ojBeforeCurrentCell.asInstanceOf[js.Any], ojBeforeEdit = ojBeforeEdit.asInstanceOf[js.Any], ojBeforeEditEnd = ojBeforeEditEnd.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojScroll = ojScroll.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojDataGridEventMapOps[Self <: ojDataGridEventMap[_, _], K, D] (val x: Self with (ojDataGridEventMap[K, D])) extends AnyVal {
    
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
    def setBandingIntervalChanged(value: CustomEvent): Self = this.set("bandingIntervalChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellChanged(value: CustomEvent): Self = this.set("cellChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCellChanged(value: CustomEvent): Self = this.set("currentCellChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: CustomEvent): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndChanged(value: CustomEvent): Self = this.set("dndChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditModeChanged(value: CustomEvent): Self = this.set("editModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridlinesChanged(value: CustomEvent): Self = this.set("gridlinesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderChanged(value: CustomEvent): Self = this.set("headerChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCurrentCell(value: CustomEvent): Self = this.set("ojBeforeCurrentCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeEdit(value: CustomEvent): Self = this.set("ojBeforeEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeEditEnd(value: CustomEvent): Self = this.set("ojBeforeEditEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjResize(value: CustomEvent): Self = this.set("ojResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjScroll(value: CustomEvent): Self = this.set("ojScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjSort(value: CustomEvent): Self = this.set("ojSort", value.asInstanceOf[js.Any])
    
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
  }
}
