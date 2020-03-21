package typingsSlinky.angularCore

import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | Null] = js.undefined
  def factory(): T
}

object AnonFactoryProvidedIn {
  @scala.inline
  def apply[T](factory: () => T, providedIn: Type[_] | root = null): AnonFactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactoryProvidedIn[T]]
  }
}

