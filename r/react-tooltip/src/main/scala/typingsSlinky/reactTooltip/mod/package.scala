package typingsSlinky.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
    * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
    * type this.
    */
  type ElementEvents = java.lang.String
  type GetContent = typingsSlinky.reactTooltip.mod.GetContentCallback | (js.Tuple2[typingsSlinky.reactTooltip.mod.GetContentCallback, scala.Double])
  type GetContentCallback = js.Function1[/* dataTip */ java.lang.String, slinky.core.TagMod[scala.Any]]
  type ReactTooltip = slinky.core.ReactComponentClass[typingsSlinky.reactTooltip.mod.Props]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactTooltip.reactTooltipStrings.abort
    - typingsSlinky.reactTooltip.reactTooltipStrings.afterprint
    - typingsSlinky.reactTooltip.reactTooltipStrings.beforeprint
    - typingsSlinky.reactTooltip.reactTooltipStrings.beforeunload
    - typingsSlinky.reactTooltip.reactTooltipStrings.blur
    - typingsSlinky.reactTooltip.reactTooltipStrings.canplay
    - typingsSlinky.reactTooltip.reactTooltipStrings.canplaythrough
    - typingsSlinky.reactTooltip.reactTooltipStrings.change
    - typingsSlinky.reactTooltip.reactTooltipStrings.click
    - typingsSlinky.reactTooltip.reactTooltipStrings.compassneedscalibration
    - typingsSlinky.reactTooltip.reactTooltipStrings.contextmenu
    - typingsSlinky.reactTooltip.reactTooltipStrings.dblclick
    - typingsSlinky.reactTooltip.reactTooltipStrings.devicelight
    - typingsSlinky.reactTooltip.reactTooltipStrings.devicemotion
    - typingsSlinky.reactTooltip.reactTooltipStrings.deviceorientation
    - typingsSlinky.reactTooltip.reactTooltipStrings.deviceorientationabsolute
    - typingsSlinky.reactTooltip.reactTooltipStrings.drag
    - typingsSlinky.reactTooltip.reactTooltipStrings.dragend
    - typingsSlinky.reactTooltip.reactTooltipStrings.dragenter
    - typingsSlinky.reactTooltip.reactTooltipStrings.dragleave
    - typingsSlinky.reactTooltip.reactTooltipStrings.dragover
    - typingsSlinky.reactTooltip.reactTooltipStrings.dragstart
    - typingsSlinky.reactTooltip.reactTooltipStrings.drop
    - typingsSlinky.reactTooltip.reactTooltipStrings.durationchange
    - typingsSlinky.reactTooltip.reactTooltipStrings.emptied
    - typingsSlinky.reactTooltip.reactTooltipStrings.ended
    - typingsSlinky.reactTooltip.reactTooltipStrings.error
    - typingsSlinky.reactTooltip.reactTooltipStrings.focus
    - typingsSlinky.reactTooltip.reactTooltipStrings.hashchange
    - typingsSlinky.reactTooltip.reactTooltipStrings.input
    - typingsSlinky.reactTooltip.reactTooltipStrings.invalid
    - typingsSlinky.reactTooltip.reactTooltipStrings.keydown
    - typingsSlinky.reactTooltip.reactTooltipStrings.keypress
    - typingsSlinky.reactTooltip.reactTooltipStrings.keyup
    - typingsSlinky.reactTooltip.reactTooltipStrings.load
    - typingsSlinky.reactTooltip.reactTooltipStrings.loadeddata
    - typingsSlinky.reactTooltip.reactTooltipStrings.loadedmetadata
    - typingsSlinky.reactTooltip.reactTooltipStrings.loadstart
    - typingsSlinky.reactTooltip.reactTooltipStrings.message
    - typingsSlinky.reactTooltip.reactTooltipStrings.mousedown
    - typingsSlinky.reactTooltip.reactTooltipStrings.mouseenter
    - typingsSlinky.reactTooltip.reactTooltipStrings.mouseleave
    - typingsSlinky.reactTooltip.reactTooltipStrings.mousemove
    - typingsSlinky.reactTooltip.reactTooltipStrings.mouseout
    - typingsSlinky.reactTooltip.reactTooltipStrings.mouseover
    - typingsSlinky.reactTooltip.reactTooltipStrings.mouseup
    - typingsSlinky.reactTooltip.reactTooltipStrings.mousewheel
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureChange
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureDoubleTap
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureEnd
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureHold
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureStart
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSGestureTap
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSInertiaStart
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerCancel
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerDown
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerEnter
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerLeave
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerMove
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerOut
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerOver
    - typingsSlinky.reactTooltip.reactTooltipStrings.MSPointerUp
    - typingsSlinky.reactTooltip.reactTooltipStrings.offline
    - typingsSlinky.reactTooltip.reactTooltipStrings.online
    - typingsSlinky.reactTooltip.reactTooltipStrings.orientationchange
    - typingsSlinky.reactTooltip.reactTooltipStrings.pagehide
    - typingsSlinky.reactTooltip.reactTooltipStrings.pageshow
    - typingsSlinky.reactTooltip.reactTooltipStrings.pause
    - typingsSlinky.reactTooltip.reactTooltipStrings.play
    - typingsSlinky.reactTooltip.reactTooltipStrings.playing
    - typingsSlinky.reactTooltip.reactTooltipStrings.popstate
    - typingsSlinky.reactTooltip.reactTooltipStrings.progress
    - typingsSlinky.reactTooltip.reactTooltipStrings.ratechange
    - typingsSlinky.reactTooltip.reactTooltipStrings.readystatechange
    - typingsSlinky.reactTooltip.reactTooltipStrings.reset
    - typingsSlinky.reactTooltip.reactTooltipStrings.resize
    - typingsSlinky.reactTooltip.reactTooltipStrings.scroll
    - typingsSlinky.reactTooltip.reactTooltipStrings.seeked
    - typingsSlinky.reactTooltip.reactTooltipStrings.seeking
    - typingsSlinky.reactTooltip.reactTooltipStrings.select
    - typingsSlinky.reactTooltip.reactTooltipStrings.stalled
    - typingsSlinky.reactTooltip.reactTooltipStrings.storage
    - typingsSlinky.reactTooltip.reactTooltipStrings.submit
    - typingsSlinky.reactTooltip.reactTooltipStrings.suspend
    - typingsSlinky.reactTooltip.reactTooltipStrings.timeupdate
    - typingsSlinky.reactTooltip.reactTooltipStrings.unload
    - typingsSlinky.reactTooltip.reactTooltipStrings.volumechange
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplayactivate
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplayblur
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplayconnect
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplaydeactivate
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplaydisconnect
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplayfocus
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplaypointerrestricted
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplaypointerunrestricted
    - typingsSlinky.reactTooltip.reactTooltipStrings.vrdisplaypresentchange
    - typingsSlinky.reactTooltip.reactTooltipStrings.waiting
    - java.lang.String
  */
  type WindowEvents = typingsSlinky.reactTooltip.mod._WindowEvents | java.lang.String
}
