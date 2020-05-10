package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

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
import typingsSlinky.oracleOraclejet.ojinputtextMod.inputBaseEventMap
import typingsSlinky.std.Event_
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDateEventMap[SP /* <: ojInputDateSettableProperties */] extends inputBaseEventMap[String, SP, String, String] {
  var converterChanged: CustomEvent = js.native
  var datePickerChanged: CustomEvent = js.native
  var dayFormatterChanged: CustomEvent = js.native
  var dayMetaDataChanged: CustomEvent = js.native
  var keyboardEditChanged: CustomEvent = js.native
  var maxChanged: CustomEvent = js.native
  var minChanged: CustomEvent = js.native
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputDateEventMap: CustomEvent = js.native
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputDateEventMap: CustomEvent = js.native
  var pickerAttributesChanged: CustomEvent = js.native
  var renderModeChanged: CustomEvent = js.native
}

object ojInputDateEventMap {
  @scala.inline
  def apply[SP](
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asyncValidatorsChanged: CustomEvent,
    autocompleteChanged: CustomEvent,
    autofocusChanged: CustomEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: MouseEvent,
    close: Event_,
    contextmenu: MouseEvent,
    converterChanged: CustomEvent,
    copy: ClipboardEvent,
    cuechange: Event_,
    cut: ClipboardEvent,
    datePickerChanged: CustomEvent,
    dayFormatterChanged: CustomEvent,
    dayMetaDataChanged: CustomEvent,
    dblclick: MouseEvent,
    describedByChanged: CustomEvent,
    disabledChanged: CustomEvent,
    displayOptionsChanged: CustomEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event_,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
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
    helpChanged: CustomEvent,
    helpHintsChanged: CustomEvent,
    input: Event_,
    invalid: Event_,
    keyboardEditChanged: CustomEvent,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelHintChanged: CustomEvent,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: PointerEvent,
    maxChanged: CustomEvent,
    messagesCustomChanged: CustomEvent,
    minChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: CustomEvent,
    ojAnimateStart: CustomEvent,
    paste: ClipboardEvent,
    pause: Event_,
    pickerAttributesChanged: CustomEvent,
    placeholderChanged: CustomEvent,
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
    rawValueChanged: CustomEvent,
    readonlyChanged: CustomEvent,
    renderModeChanged: CustomEvent,
    requiredChanged: CustomEvent,
    reset: Event_,
    resize: UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    submit: Event_,
    suspend: Event_,
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
    translationsChanged: CustomEvent,
    validChanged: CustomEvent,
    validatorsChanged: CustomEvent,
    valueChanged: CustomEvent,
    volumechange: Event_,
    waiting: Event_,
    wheel: WheelEvent
  ): ojInputDateEventMap[SP] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asyncValidatorsChanged = asyncValidatorsChanged.asInstanceOf[js.Any], autocompleteChanged = autocompleteChanged.asInstanceOf[js.Any], autofocusChanged = autofocusChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], datePickerChanged = datePickerChanged.asInstanceOf[js.Any], dayFormatterChanged = dayFormatterChanged.asInstanceOf[js.Any], dayMetaDataChanged = dayMetaDataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keyboardEditChanged = keyboardEditChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pickerAttributesChanged = pickerAttributesChanged.asInstanceOf[js.Any], placeholderChanged = placeholderChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rawValueChanged = rawValueChanged.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], renderModeChanged = renderModeChanged.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], validatorsChanged = validatorsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputDateEventMap[SP]]
  }
  @scala.inline
  implicit class ojInputDateEventMapOps[Self[sp] <: ojInputDateEventMap[sp], SP] (val x: Self[SP]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SP] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SP]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SP] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SP] with Other]
    @scala.inline
    def withConverterChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converterChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatePickerChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayFormatterChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormatterChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayMetaDataChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMetaDataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEditChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEditChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjAnimateEnd(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojAnimateEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOjAnimateStart(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojAnimateStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickerAttributesChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAttributesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderModeChanged(value: CustomEvent): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderModeChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

