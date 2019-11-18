package typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProviderAstType extends js.Object

@JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAstType")
@js.native
object ProviderAstType extends js.Object {
  @js.native
  sealed trait Builtin extends ProviderAstType
  
  @js.native
  sealed trait Component extends ProviderAstType
  
  @js.native
  sealed trait Directive extends ProviderAstType
  
  @js.native
  sealed trait PrivateService extends ProviderAstType
  
  @js.native
  sealed trait PublicService extends ProviderAstType
  
  /* 4 */ val Builtin: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType.Builtin with Double = js.native
  /* 2 */ val Component: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType.Component with Double = js.native
  /* 3 */ val Directive: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType.Directive with Double = js.native
  /* 1 */ val PrivateService: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType.PrivateService with Double = js.native
  /* 0 */ val PublicService: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType.PublicService with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProviderAstType with Double] = js.native
}

