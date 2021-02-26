package typingsSlinky.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrationresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait RegistrationResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
          
          def serialize(`type`: String, resource: js.Object, properties: js.Array[String]): String = js.native
        }
        object RegistrationResult {
          
          @scala.inline
          def apply(
            parse: js.Object => js.Object | js.Array[js.Object],
            serialize: (String, js.Object, js.Array[String]) => String
          ): RegistrationResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction3(serialize))
            __obj.asInstanceOf[RegistrationResult]
          }
          
          @scala.inline
          implicit class RegistrationResultMutableBuilder[Self <: RegistrationResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSerialize(value: (String, js.Object, js.Array[String]) => String): Self = StObject.set(x, "serialize", js.Any.fromFunction3(value))
          }
        }
      }
    }
  }
}
