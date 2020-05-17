package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.egg.mod.IgnoreItem
  - js.Array[typingsSlinky.egg.mod.IgnoreItem]
*/
trait IgnoreOrMatch extends js.Object

object IgnoreOrMatch {
  @scala.inline
  implicit def apply(value: js.Array[IgnoreItem]): IgnoreOrMatch = value.asInstanceOf[IgnoreOrMatch]
  @scala.inline
  implicit def apply(value: IgnoreItem): IgnoreOrMatch = value.asInstanceOf[IgnoreOrMatch]
}

