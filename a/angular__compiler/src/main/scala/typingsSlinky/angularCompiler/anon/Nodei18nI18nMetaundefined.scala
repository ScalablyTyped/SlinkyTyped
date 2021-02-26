package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.r3AstMod.Visitor
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler.@angular/compiler/src/render3/r3_ast.Node & {  i18n :@angular/compiler.@angular/compiler/src/i18n/i18n_ast.I18nMeta | undefined} */
@js.native
trait Nodei18nI18nMetaundefined extends StObject {
  
  var i18n: js.UndefOr[I18nMeta] = js.native
  
  var sourceSpan: ParseSourceSpan = js.native
  
  def visit[Result](visitor: Visitor[Result]): Result = js.native
}
object Nodei18nI18nMetaundefined {
  
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any): Nodei18nI18nMetaundefined = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Nodei18nI18nMetaundefined]
  }
  
  @scala.inline
  implicit class Nodei18nI18nMetaundefinedMutableBuilder[Self <: Nodei18nI18nMetaundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI18n(value: I18nMeta): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisit(value: Visitor[js.Any] => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
  }
}
