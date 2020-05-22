package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.instructionMod.Instruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class Parser () extends js.Object {
    var escapeChar: js.Any = js.native
    var getDirectiveSymbol: js.Any = js.native
    def parse(buffer: String): Dockerfile = js.native
  }
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    def createInstruction(
      document: TextDocument,
      dockerfile: Dockerfile,
      escapeChar: String,
      lineRange: Range,
      instruction: String,
      instructionRange: Range
    ): Instruction = js.native
  }
  
}

