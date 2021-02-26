package typingsSlinky.oracleOraclejet.ojdiagramMod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDiagramEventMap[K1, K2, D1, D2] extends dvtBaseComponentEventMap[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  
  var animationOnDataChangeChanged: CustomEvent = js.native
  
  var animationOnDisplayChanged: CustomEvent = js.native
  
  var asChanged: CustomEvent = js.native
  
  var dndChanged: CustomEvent = js.native
  
  var expandedChanged: CustomEvent = js.native
  
  var focusRendererChanged: CustomEvent = js.native
  
  var hiddenCategoriesChanged: CustomEvent = js.native
  
  var highlightMatchChanged: CustomEvent = js.native
  
  var highlightedCategoriesChanged: CustomEvent = js.native
  
  var hoverBehaviorChanged: CustomEvent = js.native
  
  var hoverRendererChanged: CustomEvent = js.native
  
  var layoutChanged: CustomEvent = js.native
  
  var linkDataChanged: CustomEvent = js.native
  
  var linkHighlightModeChanged: CustomEvent = js.native
  
  var maxZoomChanged: CustomEvent = js.native
  
  var minZoomChanged: CustomEvent = js.native
  
  var nodeDataChanged: CustomEvent = js.native
  
  var nodeHighlightModeChanged: CustomEvent = js.native
  
  var ojBeforeCollapse: CustomEvent = js.native
  
  var ojBeforeExpand: CustomEvent = js.native
  
  var ojCollapse: CustomEvent = js.native
  
  var ojExpand: CustomEvent = js.native
  
  var overviewChanged: CustomEvent = js.native
  
  var panDirectionChanged: CustomEvent = js.native
  
  var panningChanged: CustomEvent = js.native
  
  var promotedLinkBehaviorChanged: CustomEvent = js.native
  
  var rendererChanged: CustomEvent = js.native
  
  var selectionChanged: CustomEvent = js.native
  
  var selectionModeChanged: CustomEvent = js.native
  
  var selectionRendererChanged: CustomEvent = js.native
  
  var styleDefaultsChanged: CustomEvent = js.native
  
  var tooltipChanged: CustomEvent = js.native
  
  var touchResponseChanged: CustomEvent = js.native
  
  var zoomRendererChanged: CustomEvent = js.native
  
  var zoomingChanged: CustomEvent = js.native
}
object ojDiagramEventMap {
  
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
    ended: Event,
    error: ErrorEvent,
    expandedChanged: CustomEvent,
    focus: FocusEvent,
    focusRendererChanged: CustomEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    hoverRendererChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: CustomEvent,
    linkDataChanged: CustomEvent,
    linkHighlightModeChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxZoomChanged: CustomEvent,
    minZoomChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nodeDataChanged: CustomEvent,
    nodeHighlightModeChanged: CustomEvent,
    ojBeforeCollapse: CustomEvent,
    ojBeforeExpand: CustomEvent,
    ojCollapse: CustomEvent,
    ojExpand: CustomEvent,
    overviewChanged: CustomEvent,
    panDirectionChanged: CustomEvent,
    panningChanged: CustomEvent,
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
    promotedLinkBehaviorChanged: CustomEvent,
    ratechange: Event,
    rendererChanged: CustomEvent,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionRendererChanged: CustomEvent,
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
    wheel: WheelEvent,
    zoomRendererChanged: CustomEvent,
    zoomingChanged: CustomEvent
  ): ojDiagramEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], linkHighlightModeChanged = linkHighlightModeChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], minZoomChanged = minZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeDataChanged = nodeDataChanged.asInstanceOf[js.Any], nodeHighlightModeChanged = nodeHighlightModeChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], panDirectionChanged = panDirectionChanged.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], promotedLinkBehaviorChanged = promotedLinkBehaviorChanged.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomRendererChanged = zoomRendererChanged.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramEventMap[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit class ojDiagramEventMapMutableBuilder[Self <: ojDiagramEventMap[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojDiagramEventMap[K1, K2, D1, D2])) extends AnyVal {
    
    @scala.inline
    def setAnimationOnDataChangeChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsChanged(value: CustomEvent): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndChanged(value: CustomEvent): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanged(value: CustomEvent): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRendererChanged(value: CustomEvent): Self = StObject.set(x, "focusRendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatchChanged(value: CustomEvent): Self = StObject.set(x, "highlightMatchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverRendererChanged(value: CustomEvent): Self = StObject.set(x, "hoverRendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutChanged(value: CustomEvent): Self = StObject.set(x, "layoutChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDataChanged(value: CustomEvent): Self = StObject.set(x, "linkDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkHighlightModeChanged(value: CustomEvent): Self = StObject.set(x, "linkHighlightModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomChanged(value: CustomEvent): Self = StObject.set(x, "maxZoomChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomChanged(value: CustomEvent): Self = StObject.set(x, "minZoomChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDataChanged(value: CustomEvent): Self = StObject.set(x, "nodeDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeHighlightModeChanged(value: CustomEvent): Self = StObject.set(x, "nodeHighlightModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCollapse(value: CustomEvent): Self = StObject.set(x, "ojBeforeCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeExpand(value: CustomEvent): Self = StObject.set(x, "ojBeforeExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjCollapse(value: CustomEvent): Self = StObject.set(x, "ojCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjExpand(value: CustomEvent): Self = StObject.set(x, "ojExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewChanged(value: CustomEvent): Self = StObject.set(x, "overviewChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanDirectionChanged(value: CustomEvent): Self = StObject.set(x, "panDirectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningChanged(value: CustomEvent): Self = StObject.set(x, "panningChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotedLinkBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "promotedLinkBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererChanged(value: CustomEvent): Self = StObject.set(x, "rendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRendererChanged(value: CustomEvent): Self = StObject.set(x, "selectionRendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaultsChanged(value: CustomEvent): Self = StObject.set(x, "styleDefaultsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipChanged(value: CustomEvent): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponseChanged(value: CustomEvent): Self = StObject.set(x, "touchResponseChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomRendererChanged(value: CustomEvent): Self = StObject.set(x, "zoomRendererChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomingChanged(value: CustomEvent): Self = StObject.set(x, "zoomingChanged", value.asInstanceOf[js.Any])
  }
}
