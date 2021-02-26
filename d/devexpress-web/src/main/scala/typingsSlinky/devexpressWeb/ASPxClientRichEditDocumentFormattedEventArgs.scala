package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
@js.native
trait ASPxClientRichEditDocumentFormattedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double = js.native
}
object ASPxClientRichEditDocumentFormattedEventArgs {
  
  @scala.inline
  def apply(pageCount: Double): ASPxClientRichEditDocumentFormattedEventArgs = {
    val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditDocumentFormattedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditDocumentFormattedEventArgsMutableBuilder[Self <: ASPxClientRichEditDocumentFormattedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
  }
}
