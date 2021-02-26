package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ModifyPdfDocument extends StObject {
    
    var modifyPdfDocument: js.UndefOr[js.Function1[/* pdfDocument */ js.Any, Unit]] = js.native
    
    var modifyPdfPage: js.UndefOr[js.Function1[/* pdfDocument */ js.Any, Unit]] = js.native
  }
  object ModifyPdfDocument {
    
    @scala.inline
    def apply(): ModifyPdfDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyPdfDocument]
    }
    
    @scala.inline
    implicit class ModifyPdfDocumentMutableBuilder[Self <: ModifyPdfDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifyPdfDocument(value: /* pdfDocument */ js.Any => Unit): Self = StObject.set(x, "modifyPdfDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModifyPdfDocumentUndefined: Self = StObject.set(x, "modifyPdfDocument", js.undefined)
      
      @scala.inline
      def setModifyPdfPage(value: /* pdfDocument */ js.Any => Unit): Self = StObject.set(x, "modifyPdfPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModifyPdfPageUndefined: Self = StObject.set(x, "modifyPdfPage", js.undefined)
    }
  }
}
