package typingsSlinky.forgeDi.transientLifecycleMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.lifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransientLifecycle extends Lifecycle
object TransientLifecycle {
  
  @scala.inline
  def apply(
    resolve: (typingsSlinky.forgeDi.resolverMod.default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any
  ): TransientLifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
    __obj.asInstanceOf[TransientLifecycle]
  }
}
