package typingsSlinky.actionsOnGoogle.argumentArgumentMod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Location
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Location
  - typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any]
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
*/
trait Argument extends js.Object

object Argument {
  @scala.inline
  implicit def apply(value: ApiClientObjectMap[js.Any]): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: Boolean): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: Double): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: GoogleActionsV2DateTime): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: GoogleActionsV2Location): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: GoogleRpcStatus): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def apply(value: String): Argument = value.asInstanceOf[Argument]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Argument): Argument = value.asInstanceOf[Argument]
}

