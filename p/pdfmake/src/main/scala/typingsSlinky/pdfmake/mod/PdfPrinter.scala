package typingsSlinky.pdfmake.mod

import typingsSlinky.pdfkit.PDFKit.PDFDocument
import typingsSlinky.pdfmake.interfacesMod.BufferOptions
import typingsSlinky.pdfmake.interfacesMod.TDocumentDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfPrinter extends js.Object {
  
  def createPdfKitDocument(docDefinition: TDocumentDefinitions): PDFDocument = js.native
  def createPdfKitDocument(docDefinition: TDocumentDefinitions, options: BufferOptions): PDFDocument = js.native
}
