package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonNavLink")
@js.native
class IonNavLink protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonNavLink {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * The transition direction when navigating to another page.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  var z: NgZone = js.native
}

