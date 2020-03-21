package typingsSlinky.forgeDi.singletonLifecycleMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/lifecycles/SingletonLifecycle", JSImport.Default)
@js.native
class default () extends SingletonLifecycle {
  /* CompleteClass */
  override var instance: js.Any = js.native
  /* CompleteClass */
  override def resolve(
    resolver: typingsSlinky.forgeDi.resolverMod.default,
    context: typingsSlinky.forgeDi.contextMod.default,
    args: Arguments
  ): js.Any = js.native
}

