package typingsSlinky.forgeDashDi.distLifecyclesLifecycleMod

import typingsSlinky.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typingsSlinky.forgeDashDi.distResolversResolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle extends js.Object {
  def resolve(
    resolver: default,
    context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default,
    args: Arguments
  ): js.Any
}

object Lifecycle {
  @scala.inline
  def apply(resolve: (default, typingsSlinky.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any): Lifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
  
    __obj.asInstanceOf[Lifecycle]
  }
}

