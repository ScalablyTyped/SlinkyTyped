package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Thenable[scala.Unit]
  - typingsSlinky.ava.mod.ObservableLike
  - scala.Unit
*/
trait ImplementationResult extends js.Object

object ImplementationResult {
  @scala.inline
  implicit def apply(value: ObservableLike): ImplementationResult = value.asInstanceOf[ImplementationResult]
  @scala.inline
  implicit def apply(value: js.Thenable[Unit]): ImplementationResult = value.asInstanceOf[ImplementationResult]
  @scala.inline
  implicit def apply(value: Unit): ImplementationResult = value.asInstanceOf[ImplementationResult]
}

