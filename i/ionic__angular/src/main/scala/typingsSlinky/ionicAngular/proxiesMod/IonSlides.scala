package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSlides")
@js.native
class IonSlides protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonSlides {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionSlideDidChange: EventEmitter[CustomEvent] = js.native
  
  var ionSlideDoubleTap: EventEmitter[CustomEvent] = js.native
  
  var ionSlideDrag: EventEmitter[CustomEvent] = js.native
  
  var ionSlideNextEnd: EventEmitter[CustomEvent] = js.native
  
  var ionSlideNextStart: EventEmitter[CustomEvent] = js.native
  
  var ionSlidePrevEnd: EventEmitter[CustomEvent] = js.native
  
  var ionSlidePrevStart: EventEmitter[CustomEvent] = js.native
  
  var ionSlideReachEnd: EventEmitter[CustomEvent] = js.native
  
  var ionSlideReachStart: EventEmitter[CustomEvent] = js.native
  
  var ionSlideTap: EventEmitter[CustomEvent] = js.native
  
  var ionSlideTouchEnd: EventEmitter[CustomEvent] = js.native
  
  var ionSlideTouchStart: EventEmitter[CustomEvent] = js.native
  
  var ionSlideTransitionEnd: EventEmitter[CustomEvent] = js.native
  
  var ionSlideTransitionStart: EventEmitter[CustomEvent] = js.native
  
  var ionSlideWillChange: EventEmitter[CustomEvent] = js.native
  
  var ionSlidesDidLoad: EventEmitter[CustomEvent] = js.native
  
  var z: NgZone = js.native
}
