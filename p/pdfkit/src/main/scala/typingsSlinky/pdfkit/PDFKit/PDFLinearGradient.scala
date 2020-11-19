package typingsSlinky.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFLinearGradient
  extends PDFGradient
     with Instantiable5[
      /* document */ js.Any, 
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      PDFLinearGradient
    ] {
  
  def opacityGradient(): PDFLinearGradient = js.native
  
  def shader(fn: js.Function0[_]): js.Any = js.native
}
