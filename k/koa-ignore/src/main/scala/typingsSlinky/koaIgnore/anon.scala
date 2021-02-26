package typingsSlinky.koaIgnore

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait If extends StObject {
    
    def `if`(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext] = js.native
    
    def unless(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext] = js.native
  }
  object If {
    
    @scala.inline
    def apply(
      `if`: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext],
      unless: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]
    ): If = {
      val __obj = js.Dynamic.literal(unless = js.Any.fromFunction1(unless))
      __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
      __obj.asInstanceOf[If]
    }
    
    @scala.inline
    implicit class IfMutableBuilder[Self <: If] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIf(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = StObject.set(x, "if", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnless(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = StObject.set(x, "unless", js.Any.fromFunction1(value))
    }
  }
}
