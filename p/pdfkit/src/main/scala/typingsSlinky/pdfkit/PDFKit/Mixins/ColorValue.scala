package typingsSlinky.pdfkit.PDFKit.Mixins

import typingsSlinky.pdfkit.PDFKit.PDFGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The color forms accepted by PDFKit:
//     example:   "red"                  [R, G, B]                  [C, M, Y, K]
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pdfkit.PDFKit.PDFGradient
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
*/
trait ColorValue extends js.Object

object ColorValue {
  @scala.inline
  implicit def apply(value: PDFGradient): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: String): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): ColorValue = value.asInstanceOf[ColorValue]
}

