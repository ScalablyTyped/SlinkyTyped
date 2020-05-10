package typingsSlinky.forgeDi.resolverMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  var binding: typingsSlinky.forgeDi.bindingMod.default = js.native
  var dependencies: js.Array[Dependency] = js.native
  var forge: typingsSlinky.forgeDi.forgeMod.default = js.native
  def resolve(context: typingsSlinky.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  /* protected */ def resolveDependencies(
    context: typingsSlinky.forgeDi.contextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any = js.native
}

object Resolver {
  @scala.inline
  def apply(
    binding: typingsSlinky.forgeDi.bindingMod.default,
    dependencies: js.Array[Dependency],
    forge: typingsSlinky.forgeDi.forgeMod.default,
    resolve: (typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any,
    resolveDependencies: (typingsSlinky.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any
  ): Resolver = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
    __obj.asInstanceOf[Resolver]
  }
  @scala.inline
  implicit class ResolverOps[Self <: Resolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: typingsSlinky.forgeDi.bindingMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[Dependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForge(value: typingsSlinky.forgeDi.forgeMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: (typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolveDependencies(value: (typingsSlinky.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDependencies")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

