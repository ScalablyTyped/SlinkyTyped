package typingsSlinky.oracleOraclejet.ojsunburstMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSunburstEventMap[K, D] extends dvtBaseComponentEventMap[ojSunburstSettableProperties[K, D]] {
  
  var animationDurationChanged: CustomEvent = js.native
  
  var animationOnDataChangeChanged: CustomEvent = js.native
  
  var animationOnDisplayChanged: CustomEvent = js.native
  
  var animationUpdateColorChanged: CustomEvent = js.native
  
  var asChanged: CustomEvent = js.native
  
  var colorLabelChanged: CustomEvent = js.native
  
  var dataChanged: CustomEvent = js.native
  
  var displayLevelsChanged: CustomEvent = js.native
  
  var drillingChanged: CustomEvent = js.native
  
  var expandedChanged: CustomEvent = js.native
  
  var hiddenCategoriesChanged: CustomEvent = js.native
  
  var highlightMatchChanged: CustomEvent = js.native
  
  var highlightedCategoriesChanged: CustomEvent = js.native
  
  var hoverBehaviorChanged: CustomEvent = js.native
  
  var hoverBehaviorDelayChanged: CustomEvent = js.native
  
  var nodeDefaultsChanged: CustomEvent = js.native
  
  var ojBeforeCollapse: CustomEvent = js.native
  
  var ojBeforeDrill: CustomEvent = js.native
  
  var ojBeforeExpand: CustomEvent = js.native
  
  var ojCollapse: CustomEvent = js.native
  
  var ojDrill: CustomEvent = js.native
  
  var ojExpand: CustomEvent = js.native
  
  var ojRotateInput: CustomEvent = js.native
  
  var rootNodeChanged: CustomEvent = js.native
  
  var rootNodeContentChanged: CustomEvent = js.native
  
  var rotationChanged: CustomEvent = js.native
  
  var selectionChanged: CustomEvent = js.native
  
  var selectionModeChanged: CustomEvent = js.native
  
  var sizeLabelChanged: CustomEvent = js.native
  
  var sortingChanged: CustomEvent = js.native
  
  var startAngleChanged: CustomEvent = js.native
  
  var tooltipChanged: CustomEvent = js.native
  
  var touchResponseChanged: CustomEvent = js.native
}
object ojSunburstEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: CustomEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationUpdateColorChanged: CustomEvent,
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
    colorLabelChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
    displayLevelsChanged: CustomEvent,
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
    expandedChanged: CustomEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    hoverBehaviorDelayChanged: CustomEvent,
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
    nodeDefaultsChanged: CustomEvent,
    ojBeforeCollapse: CustomEvent,
    ojBeforeDrill: CustomEvent,
    ojBeforeExpand: CustomEvent,
    ojCollapse: CustomEvent,
    ojDrill: CustomEvent,
    ojExpand: CustomEvent,
    ojRotateInput: CustomEvent,
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
    rootNodeChanged: CustomEvent,
    rootNodeContentChanged: CustomEvent,
    rotationChanged: CustomEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    sizeLabelChanged: CustomEvent,
    sortingChanged: CustomEvent,
    stalled: Event,
    startAngleChanged: CustomEvent,
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
  ): ojSunburstEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationUpdateColorChanged = animationUpdateColorChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorLabelChanged = colorLabelChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayLevelsChanged = displayLevelsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverBehaviorDelayChanged = hoverBehaviorDelayChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeDefaultsChanged = nodeDefaultsChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeDrill = ojBeforeDrill.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], ojRotateInput = ojRotateInput.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rootNodeChanged = rootNodeChanged.asInstanceOf[js.Any], rootNodeContentChanged = rootNodeContentChanged.asInstanceOf[js.Any], rotationChanged = rotationChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizeLabelChanged = sizeLabelChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startAngleChanged = startAngleChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojSunburstEventMapOps[Self <: ojSunburstEventMap[_, _], K, D] (val x: Self with (ojSunburstEventMap[K, D])) extends AnyVal {
    
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
    def setAnimationDurationChanged(value: CustomEvent): Self = this.set("animationDurationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeChanged(value: CustomEvent): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayChanged(value: CustomEvent): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUpdateColorChanged(value: CustomEvent): Self = this.set("animationUpdateColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsChanged(value: CustomEvent): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorLabelChanged(value: CustomEvent): Self = this.set("colorLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: CustomEvent): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLevelsChanged(value: CustomEvent): Self = this.set("displayLevelsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingChanged(value: CustomEvent): Self = this.set("drillingChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanged(value: CustomEvent): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesChanged(value: CustomEvent): Self = this.set("hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatchChanged(value: CustomEvent): Self = this.set("highlightMatchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesChanged(value: CustomEvent): Self = this.set("highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorChanged(value: CustomEvent): Self = this.set("hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelayChanged(value: CustomEvent): Self = this.set("hoverBehaviorDelayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaultsChanged(value: CustomEvent): Self = this.set("nodeDefaultsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCollapse(value: CustomEvent): Self = this.set("ojBeforeCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeDrill(value: CustomEvent): Self = this.set("ojBeforeDrill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeExpand(value: CustomEvent): Self = this.set("ojBeforeExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjCollapse(value: CustomEvent): Self = this.set("ojCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjDrill(value: CustomEvent): Self = this.set("ojDrill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjExpand(value: CustomEvent): Self = this.set("ojExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjRotateInput(value: CustomEvent): Self = this.set("ojRotateInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeChanged(value: CustomEvent): Self = this.set("rootNodeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeContentChanged(value: CustomEvent): Self = this.set("rootNodeContentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationChanged(value: CustomEvent): Self = this.set("rotationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: CustomEvent): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeChanged(value: CustomEvent): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLabelChanged(value: CustomEvent): Self = this.set("sizeLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingChanged(value: CustomEvent): Self = this.set("sortingChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleChanged(value: CustomEvent): Self = this.set("startAngleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipChanged(value: CustomEvent): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponseChanged(value: CustomEvent): Self = this.set("touchResponseChanged", value.asInstanceOf[js.Any])
  }
}
