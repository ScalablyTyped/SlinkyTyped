package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonNavLink")
@js.native
class IonNavLink protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonNavLink {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * The transition direction when navigating to another page.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  var z: NgZone = js.native
}

