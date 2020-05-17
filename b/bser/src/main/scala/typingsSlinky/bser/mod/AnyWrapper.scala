package typingsSlinky.bser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.bser.mod.IntWrapper
  - scala.Null
  - java.lang.String
  - js.Object
*/
trait AnyWrapper extends js.Object

object AnyWrapper {
  @scala.inline
  implicit def apply(value: Boolean): AnyWrapper = value.asInstanceOf[AnyWrapper]
  @scala.inline
  implicit def apply(value: IntWrapper): AnyWrapper = value.asInstanceOf[AnyWrapper]
  @scala.inline
  implicit def apply(value: Null): AnyWrapper = value.asInstanceOf[AnyWrapper]
  @scala.inline
  implicit def apply(value: js.Object): AnyWrapper = value.asInstanceOf[AnyWrapper]
  @scala.inline
  implicit def apply(value: String): AnyWrapper = value.asInstanceOf[AnyWrapper]
}

