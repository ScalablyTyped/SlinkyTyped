package typingsSlinky.angularCompiler.viewCompilerMod

import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.r3TemplateTransformMod.Render3ParseResult
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
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

