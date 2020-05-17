package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Comments
import typingsSlinky.astTypes.kindsMod.ProgramKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBuilder extends js.Object {
  def apply(program: ProgramKind): File = js.native
  def apply(program: ProgramKind, name: String): File = js.native
  def from(params: Comments): File = js.native
}

