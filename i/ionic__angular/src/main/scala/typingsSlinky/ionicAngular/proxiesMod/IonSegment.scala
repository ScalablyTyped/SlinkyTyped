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

@JSImport("@ionic/angular/dist/directives/proxies", "IonSegment")
@js.native
class IonSegment protected ()
  extends typingsSlinky.ionicCore.componentsMod.Components.IonSegment {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the segment.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionChange: EventEmitter[CustomEvent] = js.native
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them.
    */
  /* CompleteClass */
  override var scrollable: Boolean = js.native
  var z: NgZone = js.native
}

