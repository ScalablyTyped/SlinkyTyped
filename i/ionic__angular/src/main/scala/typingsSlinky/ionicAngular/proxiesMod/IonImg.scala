package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionError: EventEmitter[CustomEvent] = js.native
  var ionImgDidLoad: EventEmitter[CustomEvent] = js.native
  var ionImgWillLoad: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

