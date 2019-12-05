package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonMenuToggle")
@js.native
class IonMenuToggle protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonMenuToggle {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * Automatically hides the content when the corresponding menu is not active.  By default, it's `true`. Change it to `false` in order to keep `ion-menu-toggle` always visible regardless the state of the menu.
    */
  /* CompleteClass */
  override var autoHide: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

