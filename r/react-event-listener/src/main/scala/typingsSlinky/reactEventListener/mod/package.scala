package typingsSlinky.reactEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventListener[T /* <: org.scalajs.dom.raw.EventTarget | typingsSlinky.reactEventListener.mod.WindowEventTargets */] = slinky.core.ReactComponentClass[typingsSlinky.reactEventListener.mod.EventListenerProps[T]]
  
  type EventListenerThisType[T /* <: org.scalajs.dom.raw.EventTarget | typingsSlinky.reactEventListener.mod.WindowEventTargets */] = T | (/* import warning: importer.ImportType#apply Failed type conversion: std.Window[T] */ js.Any)
  
  type OnErrorEventHandlerArgs = js.Array[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactEventListener.reactEventListenerStrings.locationbar
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerleave
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.reactEventListener.reactEventListenerStrings.opener
    - typingsSlinky.reactEventListener.reactEventListenerStrings.window
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplayactivate
    - typingsSlinky.reactEventListener.reactEventListenerStrings.speechSynthesis
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgesturechange
    - typingsSlinky.reactEventListener.reactEventListenerStrings.styleMedia
    - typingsSlinky.reactEventListener.reactEventListenerStrings.scrollX
    - typingsSlinky.reactEventListener.reactEventListenerStrings.defaultStatus
    - typingsSlinky.reactEventListener.reactEventListenerStrings.ondevicelight
    - typingsSlinky.reactEventListener.reactEventListenerStrings.innerHeight
    - typingsSlinky.reactEventListener.reactEventListenerStrings.screen
    - typingsSlinky.reactEventListener.reactEventListenerStrings.statusbar
    - typingsSlinky.reactEventListener.reactEventListenerStrings.location
    - typingsSlinky.reactEventListener.reactEventListenerStrings.history
    - typingsSlinky.reactEventListener.reactEventListenerStrings.status
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onreadystatechange
    - typingsSlinky.reactEventListener.reactEventListenerStrings.screenTop
    - typingsSlinky.reactEventListener.reactEventListenerStrings.offscreenBuffering
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerdown
    - typingsSlinky.reactEventListener.reactEventListenerStrings.name
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerout
    - typingsSlinky.reactEventListener.reactEventListenerStrings.menubar
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointermove
    - typingsSlinky.reactEventListener.reactEventListenerStrings.doNotTrack
    - typingsSlinky.reactEventListener.reactEventListenerStrings.oncompassneedscalibration
    - typingsSlinky.reactEventListener.reactEventListenerStrings.self
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplaypointerrestricted
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplaypresentchange
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerup
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplaydeactivate
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplaypointerunrestricted
    - typingsSlinky.reactEventListener.reactEventListenerStrings.outerWidth
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplayfocus
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgesturedoubletap
    - typingsSlinky.reactEventListener.reactEventListenerStrings.msContentScript
    - typingsSlinky.reactEventListener.reactEventListenerStrings.ondevicemotion
    - typingsSlinky.reactEventListener.reactEventListenerStrings.outerHeight
    - typingsSlinky.reactEventListener.reactEventListenerStrings.scrollbars
    - typingsSlinky.reactEventListener.reactEventListenerStrings.frameElement
    - typingsSlinky.reactEventListener.reactEventListenerStrings.clientInformation
    - typingsSlinky.reactEventListener.reactEventListenerStrings.devicePixelRatio
    - typingsSlinky.reactEventListener.reactEventListenerStrings.pageXOffset
    - typingsSlinky.reactEventListener.reactEventListenerStrings.pageYOffset
    - typingsSlinky.reactEventListener.reactEventListenerStrings.length
    - typingsSlinky.reactEventListener.reactEventListenerStrings.toolbar
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgesturestart
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsinertiastart
    - typingsSlinky.reactEventListener.reactEventListenerStrings.visualViewport
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplayconnect
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onorientationchange
    - typingsSlinky.reactEventListener.reactEventListenerStrings.scrollY
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerenter
    - typingsSlinky.reactEventListener.reactEventListenerStrings.navigator
    - typingsSlinky.reactEventListener.reactEventListenerStrings.orientation
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointerover
    - typingsSlinky.reactEventListener.reactEventListenerStrings.event
    - typingsSlinky.reactEventListener.reactEventListenerStrings.top
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplaydisconnect
    - typingsSlinky.reactEventListener.reactEventListenerStrings.screenY
    - typingsSlinky.reactEventListener.reactEventListenerStrings.innerWidth
    - typingsSlinky.reactEventListener.reactEventListenerStrings.applicationCache
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgesturehold
    - typingsSlinky.reactEventListener.reactEventListenerStrings.parent
    - typingsSlinky.reactEventListener.reactEventListenerStrings.customElements
    - typingsSlinky.reactEventListener.reactEventListenerStrings.document
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmousewheel
    - typingsSlinky.reactEventListener.reactEventListenerStrings.screenX
    - typingsSlinky.reactEventListener.reactEventListenerStrings.external
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onvrdisplayblur
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgesturetap
    - typingsSlinky.reactEventListener.reactEventListenerStrings.frames
    - typingsSlinky.reactEventListener.reactEventListenerStrings.ondeviceorientation
    - typingsSlinky.reactEventListener.reactEventListenerStrings.closed
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmspointercancel
    - typingsSlinky.reactEventListener.reactEventListenerStrings.personalbar
    - typingsSlinky.reactEventListener.reactEventListenerStrings.onmsgestureend
    - typingsSlinky.reactEventListener.reactEventListenerStrings.ondeviceorientationabsolute
    - typingsSlinky.reactEventListener.reactEventListenerStrings.screenLeft
  */
  type WindowEventTargets = js.UndefOr[typingsSlinky.reactEventListener.mod._WindowEventTargets]
}
