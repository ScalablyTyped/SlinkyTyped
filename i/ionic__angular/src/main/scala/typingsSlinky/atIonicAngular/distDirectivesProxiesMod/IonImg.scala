package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.EventEmitter
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionError: EventEmitter[CustomEvent] = js.native
  var ionImgDidLoad: EventEmitter[CustomEvent] = js.native
  var ionImgWillLoad: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

