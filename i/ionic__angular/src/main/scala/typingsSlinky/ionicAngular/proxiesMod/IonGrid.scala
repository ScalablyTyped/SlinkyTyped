package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonGrid")
@js.native
class IonGrid protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonGrid {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  /* CompleteClass */
  override var fixed: Boolean = js.native
  var z: NgZone = js.native
}

