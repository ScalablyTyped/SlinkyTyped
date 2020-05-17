package typingsSlinky.prettyFormat.reactTestComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.prettyFormat.reactTestComponentMod.ReactTestObject
  - java.lang.String
  - scala.Double
*/
trait ReactTestChild extends js.Object

object ReactTestChild {
  @scala.inline
  implicit def apply(value: Double): ReactTestChild = value.asInstanceOf[ReactTestChild]
  @scala.inline
  implicit def apply(value: ReactTestObject): ReactTestChild = value.asInstanceOf[ReactTestChild]
  @scala.inline
  implicit def apply(value: String): ReactTestChild = value.asInstanceOf[ReactTestChild]
}

