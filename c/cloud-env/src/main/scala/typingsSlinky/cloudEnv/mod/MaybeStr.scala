package typingsSlinky.cloudEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Unit
*/
trait MaybeStr extends js.Object

object MaybeStr {
  @scala.inline
  implicit def apply(value: String): MaybeStr = value.asInstanceOf[MaybeStr]
  @scala.inline
  implicit def apply(value: Unit): MaybeStr = value.asInstanceOf[MaybeStr]
}

