package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonTabButton")
@js.native
class IonTabButton protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonTabButton {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the tab button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * The selected tab component
    */
  /* CompleteClass */
  override var selected: Boolean = js.native
  var z: NgZone = js.native
}

