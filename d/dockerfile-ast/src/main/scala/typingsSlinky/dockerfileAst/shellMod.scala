package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.jsonInstructionMod.JSONInstruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/shell", JSImport.Namespace)
@js.native
object shellMod extends js.Object {
  @js.native
  class Shell protected () extends JSONInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
  }
  
}

