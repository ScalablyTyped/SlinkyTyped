package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import typingsSlinky.atIonicCore.atIonicCoreStrings.bottom
import typingsSlinky.atIonicCore.atIonicCoreStrings.end
import typingsSlinky.atIonicCore.atIonicCoreStrings.start
import typingsSlinky.atIonicCore.atIonicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFabList")
@js.native
class IonFabList protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonFabList {
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

