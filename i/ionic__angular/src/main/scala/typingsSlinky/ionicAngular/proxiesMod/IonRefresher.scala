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

@JSImport("@ionic/angular/directives/proxies", "IonRefresher")
@js.native
class IonRefresher protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonRefresher {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionPull: EventEmitter[CustomEvent] = js.native
  
  var ionRefresh: EventEmitter[CustomEvent] = js.native
  
  var ionStart: EventEmitter[CustomEvent] = js.native
  
  var z: NgZone = js.native
}
