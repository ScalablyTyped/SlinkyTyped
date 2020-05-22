package typingsSlinky.dockerfileAst

import typingsSlinky.dockerfileAst.argumentMod.Argument
import typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile
import typingsSlinky.dockerfileAst.instructionMod.Instruction
import typingsSlinky.dockerfileAst.propertyMod.Property
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/propertyInstruction", JSImport.Namespace)
@js.native
object propertyInstructionMod extends js.Object {
  @js.native
  abstract class PropertyInstruction protected () extends Instruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    /**
      * Goes from the back of the string and returns the first
      * non-whitespace character that is found. If an escape character
      * is found with newline characters, the escape character will
      * not be considered a non-whitespace character and its index in
      * the string will not be returned.
      *
      * @param content the string to search through
      * @return the index in the string for the first non-whitespace
      *         character when searching from the end of the string
      */
    var findTrailingNonWhitespace: js.Any = js.native
    var properties: js.Any = js.native
    def getProperties(): js.Array[Property] = js.native
    def getPropertyArguments(): js.Array[Argument] = js.native
  }
  
}

