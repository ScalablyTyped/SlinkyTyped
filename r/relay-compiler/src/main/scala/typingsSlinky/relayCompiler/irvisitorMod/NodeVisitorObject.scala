package typingsSlinky.relayCompiler.irvisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.irvisitorMod.EnterLeave[typingsSlinky.relayCompiler.irvisitorMod.VisitFn[T]]
  - typingsSlinky.relayCompiler.irvisitorMod.VisitFn[T]
*/
trait NodeVisitorObject[T /* <: VisitNode */] extends js.Object

object NodeVisitorObject {
  @scala.inline
  implicit def apply[T](value: EnterLeave[VisitFn[T]]): NodeVisitorObject[T] = value.asInstanceOf[NodeVisitorObject[T]]
  @scala.inline
  implicit def apply[T](value: VisitFn[T]): NodeVisitorObject[T] = value.asInstanceOf[NodeVisitorObject[T]]
}

