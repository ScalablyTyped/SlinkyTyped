package typingsSlinky.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.identityMod.NativeIdOptional
  - typingsSlinky.openfin.identityMod.UuidOptional
*/
trait ExternalWindowIdentity extends js.Object

object ExternalWindowIdentity {
  @scala.inline
  implicit def apply(value: NativeIdOptional): ExternalWindowIdentity = value.asInstanceOf[ExternalWindowIdentity]
  @scala.inline
  implicit def apply(value: UuidOptional): ExternalWindowIdentity = value.asInstanceOf[ExternalWindowIdentity]
}

