package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[typingsSlinky.angularCompiler.templateAstMod.BoundDirectivePropertyAst],
    hostProperties: js.Array[typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst],
    hostEvents: js.Array[typingsSlinky.angularCompiler.templateAstMod.BoundEventAst],
    contentQueryStartId: Double,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
