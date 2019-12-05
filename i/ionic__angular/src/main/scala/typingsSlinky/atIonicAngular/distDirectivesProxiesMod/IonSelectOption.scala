package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSelectOption")
@js.native
class IonSelectOption protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonSelectOption {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the select option.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * If `true`, the element is selected.
    */
  /* CompleteClass */
  override var selected: Boolean = js.native
  var z: NgZone = js.native
}

