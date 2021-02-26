package typingsSlinky.pdfkit

import typingsSlinky.pdfkit.PDFKit.PDFRadialGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradientMod {
  
  @JSImport("pdfkit/js/gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  class PDFGradient protected ()
    extends typingsSlinky.pdfkit.PDFKit.PDFGradient {
    def this(document: js.Any) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  def PDFGradient: typingsSlinky.pdfkit.PDFKit.PDFGradient = js.native
  @scala.inline
  def PDFGradient_=(x: typingsSlinky.pdfkit.PDFKit.PDFGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  class PDFLinearGradient protected ()
    extends typingsSlinky.pdfkit.PDFKit.PDFLinearGradient {
    def this(document: js.Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  def PDFLinearGradient: typingsSlinky.pdfkit.PDFKit.PDFLinearGradient = js.native
  @scala.inline
  def PDFLinearGradient_=(x: typingsSlinky.pdfkit.PDFKit.PDFLinearGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFLinearGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  class PDFRadialGradiant protected () extends PDFRadialGradient {
    def this(document: js.Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  def PDFRadialGradiant: PDFRadialGradient = js.native
  @scala.inline
  def PDFRadialGradiant_=(x: PDFRadialGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFRadialGradiant")(x.asInstanceOf[js.Any])
}
