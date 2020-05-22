package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.propertyInstructionMod.PropertyInstruction
import typingsSlinky.dockerfileAst.propertyMod.Property
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/arg", JSImport.Namespace)
@js.native
object argMod extends js.Object {
  @js.native
  class Arg protected () extends PropertyInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    var property: js.Any = js.native
    /**
      * Returns the variable defined by this ARG. This may be null if
      * this ARG instruction is malformed and has no variable
      * declaration.
      */
    def getProperty(): Property | Null = js.native
  }
  
}

