package typingsSlinky.actionsOnGoogle.placeMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Location
  - js.UndefOr[scala.Nothing]
*/
trait PlaceArgument extends js.Object

object PlaceArgument {
  @scala.inline
  implicit def apply(value: GoogleActionsV2Location): PlaceArgument = value.asInstanceOf[PlaceArgument]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PlaceArgument): PlaceArgument = value.asInstanceOf[PlaceArgument]
}

