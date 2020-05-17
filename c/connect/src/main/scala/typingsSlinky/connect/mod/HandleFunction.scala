package typingsSlinky.connect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.connect.mod.SimpleHandleFunction
  - typingsSlinky.connect.mod.NextHandleFunction
  - typingsSlinky.connect.mod.ErrorHandleFunction
*/
trait HandleFunction extends ServerHandle

object HandleFunction {
  @scala.inline
  implicit def apply(value: ErrorHandleFunction): HandleFunction = value.asInstanceOf[HandleFunction]
  @scala.inline
  implicit def apply(value: NextHandleFunction): HandleFunction = value.asInstanceOf[HandleFunction]
  @scala.inline
  implicit def apply(value: SimpleHandleFunction): HandleFunction = value.asInstanceOf[HandleFunction]
}

