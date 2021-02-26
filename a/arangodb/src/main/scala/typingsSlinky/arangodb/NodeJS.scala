package typingsSlinky.arangodb

import typingsSlinky.arangodb.Foxx.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  @js.native
  trait Module extends StObject {
    
    var context: Context = js.native
  }
  object Module {
    
    @scala.inline
    def apply(context: Context): Module = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
