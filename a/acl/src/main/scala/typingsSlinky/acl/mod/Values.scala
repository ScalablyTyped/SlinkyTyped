package typingsSlinky.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.acl.mod.Value
  - js.Array[typingsSlinky.acl.mod.Value]
*/
trait Values extends js.Object

object Values {
  @scala.inline
  implicit def apply(value: js.Array[Value]): Values = value.asInstanceOf[Values]
  @scala.inline
  implicit def apply(value: Value): Values = value.asInstanceOf[Values]
}

