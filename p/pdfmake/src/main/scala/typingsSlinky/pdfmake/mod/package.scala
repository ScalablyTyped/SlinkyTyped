package typingsSlinky.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pdfmake.pdfmakeStrings.left
    - typingsSlinky.pdfmake.pdfmakeStrings.right
    - typingsSlinky.pdfmake.pdfmakeStrings.justify
    - typingsSlinky.pdfmake.pdfmakeStrings.center
    - java.lang.String
  */
  type Alignment = typingsSlinky.pdfmake.mod._Alignment | java.lang.String
  type CreatedPdfBufferParams = js.Function2[
    /* cb */ js.Function2[
      /* result */ js.Any, 
      /* pages */ js.Array[typingsSlinky.pdfmake.mod.Page], 
      scala.Unit
    ], 
    /* options */ js.UndefOr[typingsSlinky.pdfmake.mod.BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfDownloadParams = js.Function3[
    /* defaultFileName */ js.UndefOr[java.lang.String], 
    /* cb */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[typingsSlinky.pdfmake.mod.BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfOpenPrintParams = js.Function2[
    /* options */ js.UndefOr[typingsSlinky.pdfmake.mod.BufferOptions], 
    /* win */ js.UndefOr[typingsSlinky.std.Window_ | scala.Null], 
    scala.Unit
  ]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type TDocumentHeaderFooterFunction = js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ js.UndefOr[typingsSlinky.pdfmake.AnonHeight], 
    js.Any
  ]
  type TFontFamily = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableRowFunction = js.Function1[/* row */ scala.Double, scala.Double]
}
