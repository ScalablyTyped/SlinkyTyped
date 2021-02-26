package typingsSlinky.nwmatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Document extends StObject {
    
    var document: org.scalajs.dom.raw.Document = js.native
  }
  object Document {
    
    @scala.inline
    def apply(document: org.scalajs.dom.raw.Document): Document = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: org.scalajs.dom.raw.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
}
