package typingsSlinky.ionicCore.pointerEventsMod

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Node
import typingsSlinky.ionicCore.AnonDestroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/gesture/pointer-events", "createPointerEvents")
@js.native
object createPointerEvents extends js.Object {
  def apply(
    el: Node,
    pointerDown: js.Any,
    pointerMove: js.Any,
    pointerUp: js.Any,
    options: EventListenerOptions
  ): AnonDestroy = js.native
}

