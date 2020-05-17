package typingsSlinky.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.nivoColors.mod.DatumIdentityFunction[D]
*/
trait DatumIdentity[D] extends js.Object

object DatumIdentity {
  @scala.inline
  implicit def apply[D](value: DatumIdentityFunction[D]): DatumIdentity[D] = value.asInstanceOf[DatumIdentity[D]]
  @scala.inline
  implicit def apply[D](value: String): DatumIdentity[D] = value.asInstanceOf[DatumIdentity[D]]
}

