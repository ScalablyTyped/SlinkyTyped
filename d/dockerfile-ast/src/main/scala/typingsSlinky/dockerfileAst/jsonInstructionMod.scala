package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.argumentMod.Argument
import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.jsonArgumentMod.JSONArgument
import typingsSlinky.dockerfileAst.modifiableInstructionMod.ModifiableInstruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/jsonInstruction", JSImport.Namespace)
@js.native
object jsonInstructionMod extends js.Object {
  @js.native
  class JSONInstruction protected () extends ModifiableInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    val closingBracket: js.Any = js.native
    val jsonStrings: js.Any = js.native
    val openingBracket: js.Any = js.native
    def getClosingBracket(): Argument | Null = js.native
    def getJSONStrings(): js.Array[JSONArgument] = js.native
    def getOpeningBracket(): Argument | Null = js.native
  }
  
}

