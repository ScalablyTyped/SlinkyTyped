package typingsSlinky.pdfmake

import typingsSlinky.pdfkit.PDFKit.PDFDocument
import typingsSlinky.pdfmake.interfacesMod.BufferOptions
import typingsSlinky.pdfmake.interfacesMod.TDocumentDefinitions
import typingsSlinky.pdfmake.interfacesMod.TFontDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdfmake", JSImport.Namespace)
  @js.native
  class ^ protected () extends PdfPrinter {
    def this(fontDescriptors: TFontDictionary) = this()
  }
  
  @js.native
  trait PdfPrinter extends StObject {
    
    def createPdfKitDocument(docDefinition: TDocumentDefinitions): PDFDocument = js.native
    def createPdfKitDocument(docDefinition: TDocumentDefinitions, options: BufferOptions): PDFDocument = js.native
  }
}
