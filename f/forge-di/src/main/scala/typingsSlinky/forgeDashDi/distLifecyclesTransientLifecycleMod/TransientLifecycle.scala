package typingsSlinky.forgeDashDi.distLifecyclesTransientLifecycleMod

import typingsSlinky.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typingsSlinky.forgeDashDi.distLifecyclesLifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientLifecycle extends Lifecycle

object TransientLifecycle {
  @scala.inline
  def apply(
    resolve: (typingsSlinky.forgeDashDi.distResolversResolverMod.default, typingsSlinky.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any
  ): TransientLifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
  
    __obj.asInstanceOf[TransientLifecycle]
  }
}

