package typingsSlinky.dockerfileAst.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "JSONInstruction")
@js.native
class JSONInstruction protected ()
  extends typingsSlinky.dockerfileAst.jsonInstructionMod.JSONInstruction {
  def this(
    document: TextDocument,
    range: Range,
    dockerfile: typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile,
    escapeChar: String,
    instruction: String,
    instructionRange: Range
  ) = this()
}

