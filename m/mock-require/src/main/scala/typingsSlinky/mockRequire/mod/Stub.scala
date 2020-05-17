package typingsSlinky.mockRequire.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.mockRequire.mod.StubFunction
*/
trait Stub extends js.Object

object Stub {
  @scala.inline
  implicit def apply(value: js.Object): Stub = value.asInstanceOf[Stub]
  @scala.inline
  implicit def apply(value: StubFunction): Stub = value.asInstanceOf[Stub]
}

