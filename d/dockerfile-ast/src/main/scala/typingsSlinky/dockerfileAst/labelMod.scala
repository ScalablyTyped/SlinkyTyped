package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.propertyInstructionMod.PropertyInstruction
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  @js.native
  class Label protected () extends PropertyInstruction {
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

