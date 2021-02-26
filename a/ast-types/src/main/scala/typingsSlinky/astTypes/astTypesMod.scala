package typingsSlinky.astTypes

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astTypesMod {
  
  type Def = Plugin[Unit]
  
  @js.native
  trait Fork extends StObject {
    
    def use[T](plugin: Plugin[T]): T = js.native
  }
  object Fork {
    
    @scala.inline
    def apply(use: Plugin[js.Any] => js.Any): Fork = {
      val __obj = js.Dynamic.literal(use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[Fork]
    }
    
    @scala.inline
    implicit class ForkMutableBuilder[Self <: Fork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUse(value: Plugin[js.Any] => js.Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Plugin[T] = js.Function1[/* fork */ Fork, T]
}
