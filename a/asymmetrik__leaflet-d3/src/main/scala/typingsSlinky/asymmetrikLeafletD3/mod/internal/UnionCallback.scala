package typingsSlinky.asymmetrikLeafletD3.mod.internal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.SimpleCallback
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.ObjectCallback
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.ObjectContextCallback
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.DoubleObjectContextCallback
*/
trait UnionCallback extends js.Object

object UnionCallback {
  @scala.inline
  implicit def apply(value: DoubleObjectContextCallback): UnionCallback = value.asInstanceOf[UnionCallback]
  @scala.inline
  implicit def apply(value: ObjectCallback): UnionCallback = value.asInstanceOf[UnionCallback]
  @scala.inline
  implicit def apply(value: ObjectContextCallback): UnionCallback = value.asInstanceOf[UnionCallback]
  @scala.inline
  implicit def apply(value: SimpleCallback): UnionCallback = value.asInstanceOf[UnionCallback]
}

