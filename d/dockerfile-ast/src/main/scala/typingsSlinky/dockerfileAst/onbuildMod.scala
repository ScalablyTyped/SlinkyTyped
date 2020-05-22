package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.instructionMod.Instruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/onbuild", JSImport.Namespace)
@js.native
object onbuildMod extends js.Object {
  @js.native
  class Onbuild protected () extends Instruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    def getTrigger(): String | Null = js.native
    def getTriggerInstruction(): Instruction | Null = js.native
    def getTriggerRange(): Range | Null = js.native
    def getTriggerWord(): String | Null = js.native
  }
  
}

