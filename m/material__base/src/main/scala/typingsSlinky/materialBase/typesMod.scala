package typingsSlinky.materialBase

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialBase.materialBaseStrings.abort
    - typingsSlinky.materialBase.materialBaseStrings.animationcancel
    - typingsSlinky.materialBase.materialBaseStrings.animationend
    - typingsSlinky.materialBase.materialBaseStrings.animationiteration
    - typingsSlinky.materialBase.materialBaseStrings.animationstart
    - typingsSlinky.materialBase.materialBaseStrings.auxclick
    - typingsSlinky.materialBase.materialBaseStrings.blur
    - typingsSlinky.materialBase.materialBaseStrings.cancel
    - typingsSlinky.materialBase.materialBaseStrings.canplay
    - typingsSlinky.materialBase.materialBaseStrings.canplaythrough
    - typingsSlinky.materialBase.materialBaseStrings.change
    - typingsSlinky.materialBase.materialBaseStrings.click
    - typingsSlinky.materialBase.materialBaseStrings.close
    - typingsSlinky.materialBase.materialBaseStrings.contextmenu
    - typingsSlinky.materialBase.materialBaseStrings.cuechange
    - typingsSlinky.materialBase.materialBaseStrings.dblclick
    - typingsSlinky.materialBase.materialBaseStrings.drag
    - typingsSlinky.materialBase.materialBaseStrings.dragend
    - typingsSlinky.materialBase.materialBaseStrings.dragenter
    - typingsSlinky.materialBase.materialBaseStrings.dragexit
    - typingsSlinky.materialBase.materialBaseStrings.dragleave
    - typingsSlinky.materialBase.materialBaseStrings.dragover
    - typingsSlinky.materialBase.materialBaseStrings.dragstart
    - typingsSlinky.materialBase.materialBaseStrings.drop
    - typingsSlinky.materialBase.materialBaseStrings.durationchange
    - typingsSlinky.materialBase.materialBaseStrings.emptied
    - typingsSlinky.materialBase.materialBaseStrings.ended
    - typingsSlinky.materialBase.materialBaseStrings.error
    - typingsSlinky.materialBase.materialBaseStrings.focus
    - typingsSlinky.materialBase.materialBaseStrings.focusin
    - typingsSlinky.materialBase.materialBaseStrings.focusout
    - typingsSlinky.materialBase.materialBaseStrings.gotpointercapture
    - typingsSlinky.materialBase.materialBaseStrings.input
    - typingsSlinky.materialBase.materialBaseStrings.invalid
    - typingsSlinky.materialBase.materialBaseStrings.keydown
    - typingsSlinky.materialBase.materialBaseStrings.keypress
    - typingsSlinky.materialBase.materialBaseStrings.keyup
    - typingsSlinky.materialBase.materialBaseStrings.load
    - typingsSlinky.materialBase.materialBaseStrings.loadeddata
    - typingsSlinky.materialBase.materialBaseStrings.loadedmetadata
    - typingsSlinky.materialBase.materialBaseStrings.loadstart
    - typingsSlinky.materialBase.materialBaseStrings.lostpointercapture
    - typingsSlinky.materialBase.materialBaseStrings.mousedown
    - typingsSlinky.materialBase.materialBaseStrings.mouseenter
    - typingsSlinky.materialBase.materialBaseStrings.mouseleave
    - typingsSlinky.materialBase.materialBaseStrings.mousemove
    - typingsSlinky.materialBase.materialBaseStrings.mouseout
    - typingsSlinky.materialBase.materialBaseStrings.mouseover
    - typingsSlinky.materialBase.materialBaseStrings.mouseup
    - typingsSlinky.materialBase.materialBaseStrings.pause
    - typingsSlinky.materialBase.materialBaseStrings.play
    - typingsSlinky.materialBase.materialBaseStrings.playing
    - typingsSlinky.materialBase.materialBaseStrings.pointercancel
    - typingsSlinky.materialBase.materialBaseStrings.pointerdown
    - typingsSlinky.materialBase.materialBaseStrings.pointerenter
    - typingsSlinky.materialBase.materialBaseStrings.pointerleave
    - typingsSlinky.materialBase.materialBaseStrings.pointermove
    - typingsSlinky.materialBase.materialBaseStrings.pointerout
    - typingsSlinky.materialBase.materialBaseStrings.pointerover
    - typingsSlinky.materialBase.materialBaseStrings.pointerup
    - typingsSlinky.materialBase.materialBaseStrings.progress
    - typingsSlinky.materialBase.materialBaseStrings.ratechange
    - typingsSlinky.materialBase.materialBaseStrings.reset
    - typingsSlinky.materialBase.materialBaseStrings.resize
    - typingsSlinky.materialBase.materialBaseStrings.scroll
    - typingsSlinky.materialBase.materialBaseStrings.securitypolicyviolation
    - typingsSlinky.materialBase.materialBaseStrings.seeked
    - typingsSlinky.materialBase.materialBaseStrings.seeking
    - typingsSlinky.materialBase.materialBaseStrings.select
    - typingsSlinky.materialBase.materialBaseStrings.selectionchange
    - typingsSlinky.materialBase.materialBaseStrings.selectstart
    - typingsSlinky.materialBase.materialBaseStrings.stalled
    - typingsSlinky.materialBase.materialBaseStrings.submit
    - typingsSlinky.materialBase.materialBaseStrings.suspend
    - typingsSlinky.materialBase.materialBaseStrings.timeupdate
    - typingsSlinky.materialBase.materialBaseStrings.toggle
    - typingsSlinky.materialBase.materialBaseStrings.touchcancel
    - typingsSlinky.materialBase.materialBaseStrings.touchend
    - typingsSlinky.materialBase.materialBaseStrings.touchmove
    - typingsSlinky.materialBase.materialBaseStrings.touchstart
    - typingsSlinky.materialBase.materialBaseStrings.transitioncancel
    - typingsSlinky.materialBase.materialBaseStrings.transitionend
    - typingsSlinky.materialBase.materialBaseStrings.transitionrun
    - typingsSlinky.materialBase.materialBaseStrings.transitionstart
    - typingsSlinky.materialBase.materialBaseStrings.volumechange
    - typingsSlinky.materialBase.materialBaseStrings.waiting
    - typingsSlinky.materialBase.materialBaseStrings.wheel
  */
  trait EventType extends js.Object
  
  type CustomEventListener[E /* <: Event */] = js.Function1[/* evt */ E, Unit]
  type SpecificEventListener[K /* <: EventType */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.GlobalEventHandlersEventMap[K] */ /* evt */ js.Any, 
    Unit
  ]
}

