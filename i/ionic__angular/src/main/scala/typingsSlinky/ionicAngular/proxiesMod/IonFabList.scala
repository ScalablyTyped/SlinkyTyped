package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFabList")
@js.native
class IonFabList protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonFabList {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  /* CompleteClass */
  override var activated: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  /* CompleteClass */
  override var side: start | end | top | bottom = js.native
  var z: NgZone = js.native
}

