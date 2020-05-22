package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object Factory {
  @scala.inline
  def apply[T](
    factory: () => T,
    token: js.Any,
    providedIn: js.UndefOr[Null | Type[_] | root | any] = js.undefined
  ): Factory[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    if (!js.isUndefined(providedIn)) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory[T]]
  }
}

