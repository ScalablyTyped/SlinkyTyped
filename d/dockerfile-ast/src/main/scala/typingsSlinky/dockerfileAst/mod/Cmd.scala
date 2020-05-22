package typingsSlinky.dockerfileAst.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Cmd")
@js.native
class Cmd protected ()
  extends typingsSlinky.dockerfileAst.cmdMod.Cmd {
  def this(
    document: TextDocument,
    range: Range,
    dockerfile: typingsSlinky.dockerfileAst.dockerfileMod.Dockerfile,
    escapeChar: String,
    instruction: String,
    instructionRange: Range
  ) = this()
}

