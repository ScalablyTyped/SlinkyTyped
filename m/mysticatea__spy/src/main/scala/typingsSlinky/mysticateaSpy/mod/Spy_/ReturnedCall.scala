package typingsSlinky.mysticateaSpy.mod.Spy_

import typingsSlinky.mysticateaSpy.mod.This
import typingsSlinky.mysticateaSpy.mysticateaSpyStrings.`return`
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each returned call. */
trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: Parameters[T]
  var `return`: ReturnType[T]
  var `this`: This[T]
  var `type`: `return`
}

object ReturnedCall {
  @scala.inline
  def apply[T](
    arguments: Parameters[T],
    `return`: ReturnType[T],
    `type`: `return`,
    `this`: js.UndefOr[This[T]] = js.undefined
  ): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedCall[T]]
  }
}

