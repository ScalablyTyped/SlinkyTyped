package typingsSlinky.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Query = java.lang.String
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[typingsSlinky.docxTemplates.mod.Query], 
    /* queryVars */ js.UndefOr[js.Any], 
    typingsSlinky.docxTemplates.mod.ReportData | js.Promise[typingsSlinky.docxTemplates.mod.ReportData]
  ]
  type ReportData = js.Any
}
