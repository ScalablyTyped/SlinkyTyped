package typingsSlinky.domHelpers

import typingsSlinky.domHelpers.addEventListenerMod.EventHandler
import typingsSlinky.domHelpers.domHelpersStrings.abort
import typingsSlinky.domHelpers.domHelpersStrings.animationcancel
import typingsSlinky.domHelpers.domHelpersStrings.animationend
import typingsSlinky.domHelpers.domHelpersStrings.animationiteration
import typingsSlinky.domHelpers.domHelpersStrings.animationstart
import typingsSlinky.domHelpers.domHelpersStrings.auxclick
import typingsSlinky.domHelpers.domHelpersStrings.blur
import typingsSlinky.domHelpers.domHelpersStrings.cancel
import typingsSlinky.domHelpers.domHelpersStrings.canplay
import typingsSlinky.domHelpers.domHelpersStrings.canplaythrough
import typingsSlinky.domHelpers.domHelpersStrings.change
import typingsSlinky.domHelpers.domHelpersStrings.click
import typingsSlinky.domHelpers.domHelpersStrings.close
import typingsSlinky.domHelpers.domHelpersStrings.contextmenu
import typingsSlinky.domHelpers.domHelpersStrings.copy
import typingsSlinky.domHelpers.domHelpersStrings.cuechange
import typingsSlinky.domHelpers.domHelpersStrings.cut
import typingsSlinky.domHelpers.domHelpersStrings.dblclick
import typingsSlinky.domHelpers.domHelpersStrings.drag
import typingsSlinky.domHelpers.domHelpersStrings.dragend
import typingsSlinky.domHelpers.domHelpersStrings.dragenter
import typingsSlinky.domHelpers.domHelpersStrings.dragexit
import typingsSlinky.domHelpers.domHelpersStrings.dragleave
import typingsSlinky.domHelpers.domHelpersStrings.dragover
import typingsSlinky.domHelpers.domHelpersStrings.dragstart
import typingsSlinky.domHelpers.domHelpersStrings.drop
import typingsSlinky.domHelpers.domHelpersStrings.durationchange
import typingsSlinky.domHelpers.domHelpersStrings.emptied
import typingsSlinky.domHelpers.domHelpersStrings.ended
import typingsSlinky.domHelpers.domHelpersStrings.error
import typingsSlinky.domHelpers.domHelpersStrings.focus
import typingsSlinky.domHelpers.domHelpersStrings.focusin
import typingsSlinky.domHelpers.domHelpersStrings.focusout
import typingsSlinky.domHelpers.domHelpersStrings.fullscreenchange
import typingsSlinky.domHelpers.domHelpersStrings.fullscreenerror
import typingsSlinky.domHelpers.domHelpersStrings.gotpointercapture
import typingsSlinky.domHelpers.domHelpersStrings.input
import typingsSlinky.domHelpers.domHelpersStrings.invalid
import typingsSlinky.domHelpers.domHelpersStrings.keydown
import typingsSlinky.domHelpers.domHelpersStrings.keypress
import typingsSlinky.domHelpers.domHelpersStrings.keyup
import typingsSlinky.domHelpers.domHelpersStrings.load
import typingsSlinky.domHelpers.domHelpersStrings.loadeddata
import typingsSlinky.domHelpers.domHelpersStrings.loadedmetadata
import typingsSlinky.domHelpers.domHelpersStrings.loadstart
import typingsSlinky.domHelpers.domHelpersStrings.lostpointercapture
import typingsSlinky.domHelpers.domHelpersStrings.mousedown
import typingsSlinky.domHelpers.domHelpersStrings.mouseenter
import typingsSlinky.domHelpers.domHelpersStrings.mouseleave
import typingsSlinky.domHelpers.domHelpersStrings.mousemove
import typingsSlinky.domHelpers.domHelpersStrings.mouseout
import typingsSlinky.domHelpers.domHelpersStrings.mouseover
import typingsSlinky.domHelpers.domHelpersStrings.mouseup
import typingsSlinky.domHelpers.domHelpersStrings.paste
import typingsSlinky.domHelpers.domHelpersStrings.pause
import typingsSlinky.domHelpers.domHelpersStrings.play
import typingsSlinky.domHelpers.domHelpersStrings.playing
import typingsSlinky.domHelpers.domHelpersStrings.pointercancel
import typingsSlinky.domHelpers.domHelpersStrings.pointerdown
import typingsSlinky.domHelpers.domHelpersStrings.pointerenter
import typingsSlinky.domHelpers.domHelpersStrings.pointerleave
import typingsSlinky.domHelpers.domHelpersStrings.pointermove
import typingsSlinky.domHelpers.domHelpersStrings.pointerout
import typingsSlinky.domHelpers.domHelpersStrings.pointerover
import typingsSlinky.domHelpers.domHelpersStrings.pointerup
import typingsSlinky.domHelpers.domHelpersStrings.progress
import typingsSlinky.domHelpers.domHelpersStrings.ratechange
import typingsSlinky.domHelpers.domHelpersStrings.reset
import typingsSlinky.domHelpers.domHelpersStrings.resize
import typingsSlinky.domHelpers.domHelpersStrings.scroll
import typingsSlinky.domHelpers.domHelpersStrings.securitypolicyviolation
import typingsSlinky.domHelpers.domHelpersStrings.seeked
import typingsSlinky.domHelpers.domHelpersStrings.seeking
import typingsSlinky.domHelpers.domHelpersStrings.select
import typingsSlinky.domHelpers.domHelpersStrings.selectionchange
import typingsSlinky.domHelpers.domHelpersStrings.selectstart
import typingsSlinky.domHelpers.domHelpersStrings.stalled
import typingsSlinky.domHelpers.domHelpersStrings.submit
import typingsSlinky.domHelpers.domHelpersStrings.suspend
import typingsSlinky.domHelpers.domHelpersStrings.timeupdate
import typingsSlinky.domHelpers.domHelpersStrings.toggle
import typingsSlinky.domHelpers.domHelpersStrings.touchcancel
import typingsSlinky.domHelpers.domHelpersStrings.touchend
import typingsSlinky.domHelpers.domHelpersStrings.touchmove
import typingsSlinky.domHelpers.domHelpersStrings.touchstart
import typingsSlinky.domHelpers.domHelpersStrings.transitioncancel
import typingsSlinky.domHelpers.domHelpersStrings.transitionend
import typingsSlinky.domHelpers.domHelpersStrings.transitionrun
import typingsSlinky.domHelpers.domHelpersStrings.transitionstart
import typingsSlinky.domHelpers.domHelpersStrings.volumechange
import typingsSlinky.domHelpers.domHelpersStrings.waiting
import typingsSlinky.domHelpers.domHelpersStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterEventHandlerMod {
  
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Default)
  @js.native
  def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
}
