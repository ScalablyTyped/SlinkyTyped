package typingsSlinky.forgeDi.lifecycleMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle extends js.Object {
  def resolve(resolver: default, context: typingsSlinky.forgeDi.contextMod.default, args: Arguments): js.Any
}

object Lifecycle {
  @scala.inline
  def apply(resolve: (default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Lifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
  
    __obj.asInstanceOf[Lifecycle]
  }
}

