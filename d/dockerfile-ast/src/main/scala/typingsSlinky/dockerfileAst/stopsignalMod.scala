package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.instructionMod.Instruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/stopsignal", JSImport.Namespace)
@js.native
object stopsignalMod extends js.Object {
  @js.native
  class Stopsignal protected () extends Instruction {
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

