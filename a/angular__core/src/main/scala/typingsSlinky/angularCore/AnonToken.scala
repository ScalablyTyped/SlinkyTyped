package typingsSlinky.angularCore

import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.r3SymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToken[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object AnonToken {
  @scala.inline
  def apply[T](factory: () => T, token: js.Any, providedIn: Type[_] | root | any = null): AnonToken[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToken[T]]
  }
}

