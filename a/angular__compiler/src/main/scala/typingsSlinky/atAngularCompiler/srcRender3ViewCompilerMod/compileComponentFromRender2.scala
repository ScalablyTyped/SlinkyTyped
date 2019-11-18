package typingsSlinky.atAngularCompiler.srcRender3ViewCompilerMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreTemplateUnderscoreTransformMod.Render3ParseResult
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromRender2")
@js.native
object compileComponentFromRender2 extends js.Object {
  def apply(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, _],
    pipeTypeByName: Map[String, _]
  ): Unit = js.native
}

