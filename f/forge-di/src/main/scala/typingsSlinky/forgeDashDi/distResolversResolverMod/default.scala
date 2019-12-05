package typingsSlinky.forgeDashDi.distResolversResolverMod

import typingsSlinky.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typingsSlinky.forgeDashDi.distFrameworkDependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
@js.native
abstract class default protected () extends Resolver {
  def this(
    forge: typingsSlinky.forgeDashDi.distForgeMod.default,
    binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default
  ) = this()
  /* CompleteClass */
  override var binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default = js.native
  /* CompleteClass */
  override var dependencies: js.Array[Dependency] = js.native
  /* CompleteClass */
  override var forge: typingsSlinky.forgeDashDi.distForgeMod.default = js.native
  /* CompleteClass */
  override def resolve(context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default, args: Arguments): js.Any = js.native
  /* CompleteClass */
  /* protected */ override def resolveDependencies(
    context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any = js.native
}

