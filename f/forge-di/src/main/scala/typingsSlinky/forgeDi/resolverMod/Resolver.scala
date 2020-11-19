package typingsSlinky.forgeDi.resolverMod

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinding(value: typingsSlinky.forgeDi.bindingMod.default): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: Dependency*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForge(value: typingsSlinky.forgeDi.forgeMod.default): Self = this.set("forge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: (typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Self = this.set("resolve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveDependencies(value: (typingsSlinky.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any): Self = this.set("resolveDependencies", js.Any.fromFunction3(value))
  }
}
