package typingsSlinky.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFAnnotation
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFColor
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFFont
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFImage
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFText
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFVector
import typingsSlinky.pdfkit.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFDocument
  extends ReadableStream
     with PDFAnnotation
     with PDFColor
     with PDFImage
     with PDFText
     with PDFVector
     with PDFFont
     with Instantiable0[PDFDocument]
     with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
  
  def addContent(data: js.Any): PDFDocument = js.native
  
  def addPage(): PDFDocument = js.native
  def addPage(options: PDFDocumentOptions): PDFDocument = js.native
  
  def bufferedPageRange(): Count = js.native
  
  /**
    * Wheter streams should be compressed
    */
  var compress: Boolean = js.native
  
  def end(): Unit = js.native
  
  def flushPages(): Unit = js.native
  
  /**
    * PDF document Metadata
    */
  var info: DocumentInfo = js.native
  
  /**
    * Options for the document
    */
  var options: PDFDocumentOptions = js.native
  
  /**
    * Deprecated. Throws exception
    */
  def output(fn: js.Any): Unit = js.native
  
  /**
    * Represent the current page.
    */
  var page: PDFPage = js.native
  
  def ref(data: js.Object): PDFKitReference = js.native
  
  def switchToPage(): PDFPage = js.native
  def switchToPage(n: Double): PDFPage = js.native
  
  /**
    * PDF Version
    */
  var version: Double = js.native
  
  /**
    * Deprecated
    */
  def write(fileName: String, fn: js.Any): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
