package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.ionicCore.ionicCoreStrings.determinate
import typingsSlinky.ionicCore.ionicCoreStrings.indeterminate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonProgressBar")
@js.native
class IonProgressBar protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonProgressBar {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  override var buffer: Double = js.native
  var el: HTMLElement = js.native
  /**
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  override var reversed: Boolean = js.native
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  override var `type`: determinate | indeterminate = js.native
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  override var value: Double = js.native
  var z: NgZone = js.native
}

