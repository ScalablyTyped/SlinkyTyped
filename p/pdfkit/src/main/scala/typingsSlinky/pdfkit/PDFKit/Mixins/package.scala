package typingsSlinky.pdfkit.PDFKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Mixins {
  
  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = java.lang.String | typingsSlinky.pdfkit.PDFKit.PDFGradient | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  
  type PDFFontSource = java.lang.String | typingsSlinky.node.Buffer | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
}
