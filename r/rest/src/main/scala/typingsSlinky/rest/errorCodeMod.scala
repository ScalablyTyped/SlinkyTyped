package typingsSlinky.rest

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorCodeMod extends Shortcut {
  
  @JSImport("rest/interceptor/errorCode", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var code: js.UndefOr[Double] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `errorCodeMod.foo` */
  override def _to: Interceptor[Config] = ^
}
