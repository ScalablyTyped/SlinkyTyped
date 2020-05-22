package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.r3SymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object Token {
  @scala.inline
  def apply[T](
    factory: () => T,
    token: js.Any,
    providedIn: js.UndefOr[Null | Type[_] | root | any] = js.undefined
  ): Token[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    if (!js.isUndefined(providedIn)) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[T]]
  }
}

