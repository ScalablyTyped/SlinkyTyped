package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.circusMod.TestFn
  - typingsSlinky.jestTypes.circusMod.HookFn
*/
trait AsyncFn extends js.Object

object AsyncFn {
  @scala.inline
  implicit def apply(value: HookFn | TestFn): AsyncFn = value.asInstanceOf[AsyncFn]
}

