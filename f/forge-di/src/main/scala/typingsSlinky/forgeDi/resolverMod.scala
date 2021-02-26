package typingsSlinky.forgeDi

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.dependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
  @js.native
  abstract class default protected () extends Resolver {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, binding: typingsSlinky.forgeDi.bindingMod.default) = this()
  }
  
  @js.native
  trait Resolver extends StObject {
    
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
    implicit class ResolverMutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinding(value: typingsSlinky.forgeDi.bindingMod.default): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setForge(value: typingsSlinky.forgeDi.forgeMod.default): Self = StObject.set(x, "forge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: (typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveDependencies(value: (typingsSlinky.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    }
  }
}
