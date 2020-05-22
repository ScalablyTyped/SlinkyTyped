package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.argumentMod.Argument
import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.lineMod.Line
import typingsSlinky.dockerfileAst.variableMod.Variable
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instruction", JSImport.Namespace)
@js.native
object instructionMod extends js.Object {
  @js.native
  class Instruction protected () extends Line {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    val dockerfile: Dockerfile = js.native
    val escapeChar: String = js.native
    val instruction: js.Any = js.native
    val instructionRange: js.Any = js.native
    var isBuildVariable: js.Any = js.native
    var parseVariables: js.Any = js.native
    def getArguments(): js.Array[Argument] = js.native
    def getArgumentsContent(): String | Null = js.native
    def getArgumentsRange(): Range | Null = js.native
    def getArgumentsRanges(): js.Array[Range] = js.native
    def getExpandedArguments(): js.Array[Argument] = js.native
    def getInstruction(): String = js.native
    def getInstructionRange(): Range = js.native
    def getKeyword(): String = js.native
    /* protected */ def getRangeContent(): String | Null = js.native
    /* protected */ def getRangeContent(range: Range): String | Null = js.native
    def getRawArgumentsContent(): String | Null = js.native
    def getVariables(): js.Array[Variable] = js.native
  }
  
}

