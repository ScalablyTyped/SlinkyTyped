package typingsSlinky.forgeDashDi.distResolversResolverMod

import typingsSlinky.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typingsSlinky.forgeDashDi.distFrameworkDependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  var binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default
  var dependencies: js.Array[Dependency]
  var forge: typingsSlinky.forgeDashDi.distForgeMod.default
  def resolve(context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default, args: Arguments): js.Any
  /* protected */ def resolveDependencies(
    context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any
}

object Resolver {
  @scala.inline
  def apply(
    binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
    dependencies: js.Array[Dependency],
    forge: typingsSlinky.forgeDashDi.distForgeMod.default,
    resolve: (typingsSlinky.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any,
    resolveDependencies: (typingsSlinky.forgeDashDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => js.Any
  ): Resolver = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
  
    __obj.asInstanceOf[Resolver]
  }
}

