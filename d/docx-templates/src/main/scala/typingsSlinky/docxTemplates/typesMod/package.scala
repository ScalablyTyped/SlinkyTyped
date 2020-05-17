package typingsSlinky.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Htmls = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Images = org.scalablytyped.runtime.StringDictionary[typingsSlinky.docxTemplates.typesMod.Image]
  type Links = org.scalablytyped.runtime.StringDictionary[typingsSlinky.docxTemplates.typesMod.Link]
  type Query = java.lang.String
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[typingsSlinky.docxTemplates.typesMod.Query], 
    /* queryVars */ js.Any, 
    typingsSlinky.docxTemplates.typesMod.ReportData | js.Promise[typingsSlinky.docxTemplates.typesMod.ReportData]
  ]
  type ReportData = js.Any
  type RunJSFunc = js.Function1[
    /* o */ typingsSlinky.docxTemplates.anon.Ctx, 
    typingsSlinky.docxTemplates.anon.ModifiedSandbox
  ]
  type VarValue = js.Any
}
