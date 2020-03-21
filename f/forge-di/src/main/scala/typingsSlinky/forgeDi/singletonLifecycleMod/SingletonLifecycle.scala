package typingsSlinky.forgeDi.singletonLifecycleMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.lifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonLifecycle extends Lifecycle {
  var instance: js.Any
}

object SingletonLifecycle {
  @scala.inline
  def apply(
    instance: js.Any,
    resolve: (typingsSlinky.forgeDi.resolverMod.default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any
  ): SingletonLifecycle = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve))
  
    __obj.asInstanceOf[SingletonLifecycle]
  }
}

