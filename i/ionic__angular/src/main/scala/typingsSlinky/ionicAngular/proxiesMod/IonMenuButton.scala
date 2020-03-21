package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.ionicCore.ionicCoreStrings.button
import typingsSlinky.ionicCore.ionicCoreStrings.reset
import typingsSlinky.ionicCore.ionicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonMenuButton")
@js.native
class IonMenuButton protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonMenuButton {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * Automatically hides the menu button when the corresponding menu is not active
    */
  /* CompleteClass */
  override var autoHide: Boolean = js.native
  /**
    * If `true`, the user cannot interact with the menu button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  var z: NgZone = js.native
}

