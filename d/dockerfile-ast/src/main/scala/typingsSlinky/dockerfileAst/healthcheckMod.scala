package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.argumentMod.Argument
import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.modifiableInstructionMod.ModifiableInstruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/healthcheck", JSImport.Namespace)
@js.native
object healthcheckMod extends js.Object {
  @js.native
  class Healthcheck protected () extends ModifiableInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    def getSubcommand(): Argument | Null = js.native
  }
  
}

