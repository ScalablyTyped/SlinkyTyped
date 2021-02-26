package typingsSlinky.docxTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  @scala.inline
  def BUILT_IN_COMMANDS: js.Tuple12[
    typingsSlinky.docxTemplates.docxTemplatesStrings.QUERY, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.CMD_NODE, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.ALIAS, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.FOR, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.`END-FOR`, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.IF, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.`END-IF`, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.INS, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.EXEC, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.IMAGE, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.LINK, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.HTML
  ] = typingsSlinky.docxTemplates.typesMod.^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_COMMANDS").asInstanceOf[js.Tuple12[
    typingsSlinky.docxTemplates.docxTemplatesStrings.QUERY, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.CMD_NODE, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.ALIAS, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.FOR, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.`END-FOR`, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.IF, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.`END-IF`, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.INS, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.EXEC, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.IMAGE, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.LINK, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.HTML
  ]]
  
  type ErrorHandler = js.Function2[/* e */ js.Error, /* raw_code */ js.UndefOr[java.lang.String], js.Any]
  
  type Htmls = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def ImageExtensions: js.Tuple5[
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotpng, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotgif, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotjpg, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotjpeg, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotsvg
  ] = typingsSlinky.docxTemplates.typesMod.^.asInstanceOf[js.Dynamic].selectDynamic("ImageExtensions").asInstanceOf[js.Tuple5[
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotpng, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotgif, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotjpg, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotjpeg, 
    typingsSlinky.docxTemplates.docxTemplatesStrings.Dotsvg
  ]]
  
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
