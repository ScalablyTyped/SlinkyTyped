package typingsSlinky.awsSdkSmithyClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentTypeMod {
  
  object DocumentType {
    
    @js.native
    trait List
      extends Array[Value]
         with _Value
    
    type Scalar = String | Double | Boolean | Null
    
    @js.native
    trait Structure
      extends /* member */ StringDictionary[Value]
         with _Value
    object Structure {
      
      @scala.inline
      def apply(): Structure = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Structure]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.awsSdkSmithyClient.documentTypeMod.DocumentType.Scalar
      - typingsSlinky.awsSdkSmithyClient.documentTypeMod.DocumentType.Structure
      - typingsSlinky.awsSdkSmithyClient.documentTypeMod.DocumentType.List
    */
    type Value = _Value | Scalar
    
    trait _Value extends StObject
  }
}
