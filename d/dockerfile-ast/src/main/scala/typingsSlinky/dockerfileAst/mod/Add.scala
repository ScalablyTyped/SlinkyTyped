package typingsSlinky.dockerfileAst.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Add")
@js.native
class Add protected ()
  extends typingsSlinky.dockerfileAst.addMod.Add {
  def this(
    document: TextDocument,
    range: Range,
    dockerfile: typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile,
    escapeChar: String,
    instruction: String,
    instructionRange: Range
  ) = this()
}

