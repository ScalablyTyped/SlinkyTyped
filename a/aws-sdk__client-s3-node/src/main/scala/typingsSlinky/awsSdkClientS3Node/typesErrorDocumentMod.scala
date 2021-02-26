package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorDocumentMod {
  
  @js.native
  trait ErrorDocument extends StObject {
    
    /**
      * <p>The object key name to use when a 4XX class error occurs.</p>
      */
    var Key: String = js.native
  }
  object ErrorDocument {
    
    @scala.inline
    def apply(Key: String): ErrorDocument = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDocument]
    }
    
    @scala.inline
    implicit class ErrorDocumentMutableBuilder[Self <: ErrorDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledErrorDocument = ErrorDocument
}
