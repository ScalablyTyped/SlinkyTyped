package typingsSlinky.ltijs

import typingsSlinky.ltijs.anon.Context
import typingsSlinky.ltijs.databaseMod.DatabaseOptions
import typingsSlinky.ltijs.providerMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ltijs", "Provider")
  @js.native
  class Provider protected ()
    extends typingsSlinky.ltijs.providerMod.Provider {
    def this(encryptionKey: String, database: DatabaseOptions) = this()
    def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
  }
  
  object expressAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      var locals: Context = js.native
    }
    object Response {
      
      @scala.inline
      def apply(locals: Context): Response = {
        val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocals(value: Context): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      }
    }
  }
}
