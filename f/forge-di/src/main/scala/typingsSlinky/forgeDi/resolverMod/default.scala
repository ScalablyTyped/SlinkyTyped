package typingsSlinky.forgeDi.resolverMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
@js.native
abstract class default protected () extends Resolver {
  def this(forge: typingsSlinky.forgeDi.forgeMod.default, binding: typingsSlinky.forgeDi.bindingMod.default) = this()
  /* CompleteClass */
  override var binding: typingsSlinky.forgeDi.bindingMod.default = js.native
  /* CompleteClass */
  override var dependencies: js.Array[Dependency] = js.native
  /* CompleteClass */
  override var forge: typingsSlinky.forgeDi.forgeMod.default = js.native
  /* CompleteClass */
  override def resolve(context: typingsSlinky.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  /* CompleteClass */
  /* protected */ override def resolveDependencies(
    context: typingsSlinky.forgeDi.contextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any = js.native
}

