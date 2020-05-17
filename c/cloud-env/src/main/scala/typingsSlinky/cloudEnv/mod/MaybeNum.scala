package typingsSlinky.cloudEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Unit
*/
trait MaybeNum extends js.Object

object MaybeNum {
  @scala.inline
  implicit def apply(value: Double): MaybeNum = value.asInstanceOf[MaybeNum]
  @scala.inline
  implicit def apply(value: Unit): MaybeNum = value.asInstanceOf[MaybeNum]
}

