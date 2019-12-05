package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.EventEmitter
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import typingsSlinky.atIonicCore.atIonicCoreStrings.button
import typingsSlinky.atIonicCore.atIonicCoreStrings.reset
import typingsSlinky.atIonicCore.atIonicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegmentButton")
@js.native
class IonSegmentButton protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonSegmentButton {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the segment button is selected.
    */
  /* CompleteClass */
  override var checked: Boolean = js.native
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionSelect: EventEmitter[CustomEvent] = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  /**
    * The value of the segment button.
    */
  /* CompleteClass */
  override var value: String = js.native
  var z: NgZone = js.native
}

