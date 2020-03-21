package typingsSlinky.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonCheckbox")
@js.native
class IonCheckbox protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonCheckbox {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the checkbox is selected.
    */
  /* CompleteClass */
  override var checked: Boolean = js.native
  /**
    * If `true`, the user cannot interact with the checkbox.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * If `true`, the checkbox will visually appear as indeterminate.
    */
  /* CompleteClass */
  override var indeterminate: Boolean = js.native
  var ionBlur: EventEmitter[CustomEvent] = js.native
  var ionChange: EventEmitter[CustomEvent] = js.native
  var ionFocus: EventEmitter[CustomEvent] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * The value of the toggle does not mean if it's checked or not, use the `checked` property for that.  The value of a toggle is analogous to the value of a `<input type="checkbox">`, it's only used when the toggle participates in a native `<form>`.
    */
  /* CompleteClass */
  override var value: String = js.native
  var z: NgZone = js.native
}

