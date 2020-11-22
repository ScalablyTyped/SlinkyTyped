package typingsSlinky.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ErrorHandler = js.Function2[/* e */ js.Error, /* raw_code */ js.UndefOr[java.lang.String], js.Any]
  
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
