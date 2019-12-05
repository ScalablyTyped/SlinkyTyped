package typingsSlinky.domDashHelpers

import typingsSlinky.domDashHelpers.cjsAddEventListenerMod.EventHandler
import typingsSlinky.domDashHelpers.domDashHelpersStrings.abort
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationcancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationiteration
import typingsSlinky.domDashHelpers.domDashHelpersStrings.animationstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.auxclick
import typingsSlinky.domDashHelpers.domDashHelpersStrings.blur
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.canplay
import typingsSlinky.domDashHelpers.domDashHelpersStrings.canplaythrough
import typingsSlinky.domDashHelpers.domDashHelpersStrings.change
import typingsSlinky.domDashHelpers.domDashHelpersStrings.click
import typingsSlinky.domDashHelpers.domDashHelpersStrings.close
import typingsSlinky.domDashHelpers.domDashHelpersStrings.contextmenu
import typingsSlinky.domDashHelpers.domDashHelpersStrings.copy
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cuechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.cut
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dblclick
import typingsSlinky.domDashHelpers.domDashHelpersStrings.drag
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragexit
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.dragstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.drop
import typingsSlinky.domDashHelpers.domDashHelpersStrings.durationchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.emptied
import typingsSlinky.domDashHelpers.domDashHelpersStrings.ended
import typingsSlinky.domDashHelpers.domDashHelpersStrings.error
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focus
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focusin
import typingsSlinky.domDashHelpers.domDashHelpersStrings.focusout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.fullscreenchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.fullscreenerror
import typingsSlinky.domDashHelpers.domDashHelpersStrings.gotpointercapture
import typingsSlinky.domDashHelpers.domDashHelpersStrings.input
import typingsSlinky.domDashHelpers.domDashHelpersStrings.invalid
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keydown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keypress
import typingsSlinky.domDashHelpers.domDashHelpersStrings.keyup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.load
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadeddata
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadedmetadata
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.loadstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.lostpointercapture
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mousedown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mousemove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.mouseup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.paste
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pause
import typingsSlinky.domDashHelpers.domDashHelpersStrings.play
import typingsSlinky.domDashHelpers.domDashHelpersStrings.playing
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointercancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerdown
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerenter
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerleave
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointermove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerout
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerover
import typingsSlinky.domDashHelpers.domDashHelpersStrings.pointerup
import typingsSlinky.domDashHelpers.domDashHelpersStrings.progress
import typingsSlinky.domDashHelpers.domDashHelpersStrings.ratechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.reset
import typingsSlinky.domDashHelpers.domDashHelpersStrings.resize
import typingsSlinky.domDashHelpers.domDashHelpersStrings.scroll
import typingsSlinky.domDashHelpers.domDashHelpersStrings.securitypolicyviolation
import typingsSlinky.domDashHelpers.domDashHelpersStrings.seeked
import typingsSlinky.domDashHelpers.domDashHelpersStrings.seeking
import typingsSlinky.domDashHelpers.domDashHelpersStrings.select
import typingsSlinky.domDashHelpers.domDashHelpersStrings.selectionchange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.selectstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.stalled
import typingsSlinky.domDashHelpers.domDashHelpersStrings.submit
import typingsSlinky.domDashHelpers.domDashHelpersStrings.suspend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.timeupdate
import typingsSlinky.domDashHelpers.domDashHelpersStrings.toggle
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchcancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchmove
import typingsSlinky.domDashHelpers.domDashHelpersStrings.touchstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitioncancel
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionend
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionrun
import typingsSlinky.domDashHelpers.domDashHelpersStrings.transitionstart
import typingsSlinky.domDashHelpers.domDashHelpersStrings.volumechange
import typingsSlinky.domDashHelpers.domDashHelpersStrings.waiting
import typingsSlinky.domDashHelpers.domDashHelpersStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Namespace)
@js.native
object cjsFilterEventHandlerMod extends js.Object {
  @JSName("default")
  def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSName("default")
  def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSName("default")
  def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSName("default")
  def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSName("default")
  def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSName("default")
  def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSName("default")
  def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSName("default")
  def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSName("default")
  def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSName("default")
  def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSName("default")
  def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSName("default")
  def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSName("default")
  def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSName("default")
  def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSName("default")
  def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSName("default")
  def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSName("default")
  def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSName("default")
  def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSName("default")
  def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSName("default")
  def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSName("default")
  def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSName("default")
  def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSName("default")
  def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSName("default")
  def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSName("default")
  def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSName("default")
  def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSName("default")
  def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSName("default")
  def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSName("default")
  def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSName("default")
  def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSName("default")
  def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSName("default")
  def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSName("default")
  def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSName("default")
  def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSName("default")
  def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSName("default")
  def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSName("default")
  def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSName("default")
  def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSName("default")
  def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSName("default")
  def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSName("default")
  def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSName("default")
  def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSName("default")
  def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSName("default")
  def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSName("default")
  def default_loadend(selector: String, handler: EventHandler[loadend]): EventHandler[loadend] = js.native
  @JSName("default")
  def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSName("default")
  def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSName("default")
  def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSName("default")
  def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSName("default")
  def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSName("default")
  def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSName("default")
  def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSName("default")
  def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSName("default")
  def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSName("default")
  def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSName("default")
  def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSName("default")
  def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSName("default")
  def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSName("default")
  def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSName("default")
  def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSName("default")
  def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSName("default")
  def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSName("default")
  def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSName("default")
  def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSName("default")
  def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSName("default")
  def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSName("default")
  def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSName("default")
  def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSName("default")
  def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSName("default")
  def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSName("default")
  def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSName("default")
  def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSName("default")
  def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSName("default")
  def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSName("default")
  def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSName("default")
  def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSName("default")
  def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSName("default")
  def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSName("default")
  def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSName("default")
  def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSName("default")
  def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSName("default")
  def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSName("default")
  def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSName("default")
  def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSName("default")
  def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSName("default")
  def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSName("default")
  def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSName("default")
  def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSName("default")
  def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSName("default")
  def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSName("default")
  def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSName("default")
  def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSName("default")
  def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
}

