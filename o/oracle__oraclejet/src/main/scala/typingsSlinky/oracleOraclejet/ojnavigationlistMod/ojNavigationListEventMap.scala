package typingsSlinky.oracleOraclejet.ojnavigationlistMod

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
trait ojNavigationListEventMap[K, D] extends baseComponentEventMap[ojNavigationListSettableProperties[K, D]] {
  
  var asChanged: CustomEvent = js.native
  
  var currentItemChanged: CustomEvent = js.native
  
  var dataChanged: CustomEvent = js.native
  
  var displayChanged: CustomEvent = js.native
  
  var drillModeChanged: CustomEvent = js.native
  
  var edgeChanged: CustomEvent = js.native
  
  var expandedChanged: CustomEvent = js.native
  
  var hierarchyMenuThresholdChanged: CustomEvent = js.native
  
  var itemChanged: CustomEvent = js.native
  
  var ojAnimateEnd: CustomEvent = js.native
  
  var ojAnimateStart: CustomEvent = js.native
  
  var ojBeforeCollapse: CustomEvent = js.native
  
  var ojBeforeCurrentItem: CustomEvent = js.native
  
  var ojBeforeExpand: CustomEvent = js.native
  
  var ojBeforeSelect: CustomEvent = js.native
  
  var ojCollapse: CustomEvent = js.native
  
  var ojExpand: CustomEvent = js.native
  
  var overflowChanged: CustomEvent = js.native
  
  var rootLabelChanged: CustomEvent = js.native
  
  var selectionChanged: CustomEvent = js.native
}
object ojNavigationListEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
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
    copy: ClipboardEvent,
    cuechange: Event,
    currentItemChanged: CustomEvent,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
    displayChanged: CustomEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillModeChanged: CustomEvent,
    drop: DragEvent,
    durationchange: Event,
    edgeChanged: CustomEvent,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    expandedChanged: CustomEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hierarchyMenuThresholdChanged: CustomEvent,
    input: Event,
    invalid: Event,
    itemChanged: CustomEvent,
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
    ojBeforeCollapse: CustomEvent,
    ojBeforeCurrentItem: CustomEvent,
    ojBeforeExpand: CustomEvent,
    ojBeforeSelect: CustomEvent,
    ojCollapse: CustomEvent,
    ojExpand: CustomEvent,
    overflowChanged: CustomEvent,
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
    rootLabelChanged: CustomEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
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
  ): ojNavigationListEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillModeChanged = drillModeChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], edgeChanged = edgeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hierarchyMenuThresholdChanged = hierarchyMenuThresholdChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemChanged = itemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeCurrentItem = ojBeforeCurrentItem.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojBeforeSelect = ojBeforeSelect.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], overflowChanged = overflowChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rootLabelChanged = rootLabelChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojNavigationListEventMapOps[Self <: ojNavigationListEventMap[_, _], K, D] (val x: Self with (ojNavigationListEventMap[K, D])) extends AnyVal {
    
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
    def setAsChanged(value: CustomEvent): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemChanged(value: CustomEvent): Self = this.set("currentItemChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: CustomEvent): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayChanged(value: CustomEvent): Self = this.set("displayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillModeChanged(value: CustomEvent): Self = this.set("drillModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeChanged(value: CustomEvent): Self = this.set("edgeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanged(value: CustomEvent): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyMenuThresholdChanged(value: CustomEvent): Self = this.set("hierarchyMenuThresholdChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChanged(value: CustomEvent): Self = this.set("itemChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateEnd(value: CustomEvent): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateStart(value: CustomEvent): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCollapse(value: CustomEvent): Self = this.set("ojBeforeCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCurrentItem(value: CustomEvent): Self = this.set("ojBeforeCurrentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeExpand(value: CustomEvent): Self = this.set("ojBeforeExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeSelect(value: CustomEvent): Self = this.set("ojBeforeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjCollapse(value: CustomEvent): Self = this.set("ojCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjExpand(value: CustomEvent): Self = this.set("ojExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowChanged(value: CustomEvent): Self = this.set("overflowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootLabelChanged(value: CustomEvent): Self = this.set("rootLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: CustomEvent): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
  }
}
