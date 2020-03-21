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

@JSImport("@ionic/angular/dist/directives/proxies", "IonToggle")
@js.native
class IonToggle protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonToggle {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the toggle is selected.
    */
  /* CompleteClass */
  override var checked: Boolean = js.native
  /**
    * If `true`, the user cannot interact with the toggle.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent] = js.native
  var ionChange: EventEmitter[CustomEvent] = js.native
  var ionFocus: EventEmitter[CustomEvent] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  var z: NgZone = js.native
}

