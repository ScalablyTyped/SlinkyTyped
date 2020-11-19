package typingsSlinky.oracleOraclejet.ojgaugeMod

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
trait ojLedGaugeEventMap extends dvtBaseComponentEventMap[ojLedGaugeSettableProperties] {
  
  var borderColorChanged: CustomEvent = js.native
  
  var colorChanged: CustomEvent = js.native
  
  var labelChanged: CustomEvent = js.native
  
  var maxChanged: CustomEvent = js.native
  
  var metricLabelChanged: CustomEvent = js.native
  
  var minChanged: CustomEvent = js.native
  
  var rotationChanged: CustomEvent = js.native
  
  var sizeChanged: CustomEvent = js.native
  
  var svgClassNameChanged: CustomEvent = js.native
  
  var svgStyleChanged: CustomEvent = js.native
  
  var thresholdsChanged: CustomEvent = js.native
  
  var tooltipChanged: CustomEvent = js.native
  
  var typeChanged: CustomEvent = js.native
  
  var valueChanged: CustomEvent = js.native
  
  var visualEffectsChanged: CustomEvent = js.native
}
object ojLedGaugeEventMap {
  
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
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: CustomEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
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
    labelChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    maxChanged: CustomEvent,
    metricLabelChanged: CustomEvent,
    minChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
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
    rotationChanged: CustomEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    sizeChanged: CustomEvent,
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: CustomEvent,
    svgStyleChanged: CustomEvent,
    thresholdsChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
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
    typeChanged: CustomEvent,
    valueChanged: CustomEvent,
    visualEffectsChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojLedGaugeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], metricLabelChanged = metricLabelChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotationChanged = rotationChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizeChanged = sizeChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], thresholdsChanged = thresholdsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeEventMap]
  }
  
  @scala.inline
  implicit class ojLedGaugeEventMapOps[Self <: ojLedGaugeEventMap] (val x: Self) extends AnyVal {
    
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
    def setBorderColorChanged(value: CustomEvent): Self = this.set("borderColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorChanged(value: CustomEvent): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelChanged(value: CustomEvent): Self = this.set("labelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChanged(value: CustomEvent): Self = this.set("maxChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricLabelChanged(value: CustomEvent): Self = this.set("metricLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChanged(value: CustomEvent): Self = this.set("minChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationChanged(value: CustomEvent): Self = this.set("rotationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeChanged(value: CustomEvent): Self = this.set("sizeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameChanged(value: CustomEvent): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleChanged(value: CustomEvent): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsChanged(value: CustomEvent): Self = this.set("thresholdsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipChanged(value: CustomEvent): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeChanged(value: CustomEvent): Self = this.set("typeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: CustomEvent): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffectsChanged(value: CustomEvent): Self = this.set("visualEffectsChanged", value.asInstanceOf[js.Any])
  }
}
