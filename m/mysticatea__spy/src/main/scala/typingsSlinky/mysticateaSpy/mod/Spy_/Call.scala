package typingsSlinky.mysticateaSpy.mod.Spy_

import typingsSlinky.mysticateaSpy.mod.This
import typingsSlinky.mysticateaSpy.mysticateaSpyStrings.`return`
import typingsSlinky.mysticateaSpy.mysticateaSpyStrings.`throw`
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each call. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mysticateaSpy.mod.Spy_.ReturnedCall[T]
  - typingsSlinky.mysticateaSpy.mod.Spy_.ThrownCall[T]
*/
trait Call[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object

object Call {
  @scala.inline
  def ReturnedCall[T](
    arguments: Parameters[T],
    `return`: ReturnType[T],
    `type`: `return`,
    `this`: js.UndefOr[This[T]] = js.undefined
  ): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
  @scala.inline
  def ThrownCall[T](
    arguments: Parameters[T],
    `throw`: js.Any,
    `type`: `throw`,
    `this`: js.UndefOr[This[T]] = js.undefined
  ): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
}

