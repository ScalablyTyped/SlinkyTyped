package typingsSlinky.pdfkit

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.pdfkit.PDFKit.PDFData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/data", JSImport.Namespace)
  @js.native
  class ^ protected () extends PDFData {
    def this(data: js.Array[_]) = this()
  }
  @JSImport("pdfkit/js/data", JSImport.Namespace)
  @js.native
  val ^ : PDFData = js.native
  
  type _To = PDFData
  
  /* This means you don't have to write `^`, but can instead just say `dataMod.foo` */
  override def _to: PDFData = ^
}
