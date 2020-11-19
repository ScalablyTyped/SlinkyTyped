package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonRadio")
@js.native
class IonRadio protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonRadio {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  var z: NgZone = js.native
}
