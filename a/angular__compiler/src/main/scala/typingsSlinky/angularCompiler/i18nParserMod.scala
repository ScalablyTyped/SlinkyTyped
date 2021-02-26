package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.mlParserAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nParserMod {
  
  @JSImport("@angular/compiler/src/i18n/i18n_parser", "createI18nMessageFactory")
  @js.native
  def createI18nMessageFactory(interpolationConfig: InterpolationConfig): I18nMessageFactory = js.native
  
  type I18nMessageFactory = js.Function5[
    /* nodes */ js.Array[Node], 
    /* meaning */ js.UndefOr[String], 
    /* description */ js.UndefOr[String], 
    /* customId */ js.UndefOr[String], 
    /* visitNodeFn */ js.UndefOr[VisitNodeFn], 
    Message
  ]
  
  type VisitNodeFn = js.Function2[
    /* html */ Node, 
    /* i18n */ typingsSlinky.angularCompiler.i18nAstMod.Node, 
    typingsSlinky.angularCompiler.i18nAstMod.Node
  ]
}
