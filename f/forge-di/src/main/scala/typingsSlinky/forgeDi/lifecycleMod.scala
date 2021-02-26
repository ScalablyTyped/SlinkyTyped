package typingsSlinky.forgeDi

import typingsSlinky.forgeDi.argumentsMod.Arguments
import typingsSlinky.forgeDi.resolverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleMod {
  
  @js.native
  trait Lifecycle extends StObject {
    
    def resolve(resolver: default, context: typingsSlinky.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  }
  object Lifecycle {
    
    @scala.inline
    def apply(resolve: (default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Lifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[Lifecycle]
    }
    
    @scala.inline
    implicit class LifecycleMutableBuilder[Self <: Lifecycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolve(value: (default, typingsSlinky.forgeDi.contextMod.default, Arguments) => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
    }
  }
}
