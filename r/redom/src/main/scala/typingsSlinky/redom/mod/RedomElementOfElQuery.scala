package typingsSlinky.redom.mod

import typingsSlinky.std.InstanceType
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.redom.mod.HTMLElementOfStringLiteral[Q]
  - typingsSlinky.std.ReturnType[Q]
  - typingsSlinky.std.InstanceType[Q]
  - Q
*/
trait RedomElementOfElQuery[Q /* <: RedomElQuery */] extends js.Object

object RedomElementOfElQuery {
  @scala.inline
  implicit def apply[Q](value: InstanceType[Q] | ReturnType[Q]): RedomElementOfElQuery[Q] = value.asInstanceOf[RedomElementOfElQuery[Q]]
  @scala.inline
  implicit def apply[Q](value: HTMLElementOfStringLiteral[Q]): RedomElementOfElQuery[Q] = value.asInstanceOf[RedomElementOfElQuery[Q]]
  @scala.inline
  implicit def apply[Q](value: Q): RedomElementOfElQuery[Q] = value.asInstanceOf[RedomElementOfElQuery[Q]]
}

