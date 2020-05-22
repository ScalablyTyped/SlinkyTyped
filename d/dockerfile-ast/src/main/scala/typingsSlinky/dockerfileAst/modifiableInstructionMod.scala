package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.flagMod.Flag
import typingsSlinky.dockerfileAst.instructionMod.Instruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/modifiableInstruction", JSImport.Namespace)
@js.native
object modifiableInstructionMod extends js.Object {
  @js.native
  abstract class ModifiableInstruction protected () extends Instruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    var flags: js.Any = js.native
    def getFlags(): js.Array[Flag] = js.native
    /* protected */ def stopSearchingForFlags(value: String): Boolean = js.native
  }
  
}

