package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.DOCUMENT
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.LINES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJsoninputMod {
  
  @js.native
  trait JSONInput extends StObject {
    
    /**
      * <p>The type of JSON. Valid values: Document, Lines.</p>
      */
    var Type: js.UndefOr[DOCUMENT | LINES | String] = js.native
  }
  object JSONInput {
    
    @scala.inline
    def apply(): JSONInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONInput]
    }
    
    @scala.inline
    implicit class JSONInputMutableBuilder[Self <: JSONInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: DOCUMENT | LINES | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  type UnmarshalledJSONInput = JSONInput
}
