package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIndexDocumentMod {
  
  @js.native
  trait IndexDocument extends StObject {
    
    /**
      * <p>A suffix that is appended to a request that is for a directory on the website endpoint (e.g. if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.</p>
      */
    var Suffix: String = js.native
  }
  object IndexDocument {
    
    @scala.inline
    def apply(Suffix: String): IndexDocument = {
      val __obj = js.Dynamic.literal(Suffix = Suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexDocument]
    }
    
    @scala.inline
    implicit class IndexDocumentMutableBuilder[Self <: IndexDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "Suffix", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledIndexDocument = IndexDocument
}
