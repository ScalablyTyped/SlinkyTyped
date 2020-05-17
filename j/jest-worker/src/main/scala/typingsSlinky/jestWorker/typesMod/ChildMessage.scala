package typingsSlinky.jestWorker.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestWorker.typesMod.ChildMessageInitialize
  - typingsSlinky.jestWorker.typesMod.ChildMessageCall
  - typingsSlinky.jestWorker.typesMod.ChildMessageEnd
*/
trait ChildMessage extends js.Object

object ChildMessage {
  @scala.inline
  implicit def apply(value: ChildMessageCall): ChildMessage = value.asInstanceOf[ChildMessage]
  @scala.inline
  implicit def apply(value: ChildMessageEnd): ChildMessage = value.asInstanceOf[ChildMessage]
  @scala.inline
  implicit def apply(value: ChildMessageInitialize): ChildMessage = value.asInstanceOf[ChildMessage]
}

