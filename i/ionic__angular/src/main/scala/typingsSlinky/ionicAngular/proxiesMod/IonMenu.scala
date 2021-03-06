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

@JSImport("@ionic/angular/directives/proxies", "IonMenu")
@js.native
class IonMenu protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonMenu {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionDidClose: EventEmitter[CustomEvent] = js.native
  
  var ionDidOpen: EventEmitter[CustomEvent] = js.native
  
  var ionWillClose: EventEmitter[CustomEvent] = js.native
  
  var ionWillOpen: EventEmitter[CustomEvent] = js.native
  
  var z: NgZone = js.native
}
