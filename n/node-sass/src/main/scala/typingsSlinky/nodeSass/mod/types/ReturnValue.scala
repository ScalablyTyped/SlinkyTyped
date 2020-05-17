package typingsSlinky.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.mod.types.Value
  - typingsSlinky.nodeSass.mod.types.Error
*/
trait ReturnValue extends js.Object

object ReturnValue {
  @scala.inline
  implicit def apply(value: Error): ReturnValue = value.asInstanceOf[ReturnValue]
  @scala.inline
  implicit def apply(value: Value): ReturnValue = value.asInstanceOf[ReturnValue]
}

