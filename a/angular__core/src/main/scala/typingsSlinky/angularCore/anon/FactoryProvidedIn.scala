package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | Null] = js.undefined
  def factory(): T
}

object FactoryProvidedIn {
  @scala.inline
  def apply[T](factory: () => T, providedIn: js.UndefOr[Null | Type[_] | root] = js.undefined): FactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (!js.isUndefined(providedIn)) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryProvidedIn[T]]
  }
}

