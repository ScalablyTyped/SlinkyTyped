package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonComments
import typingsSlinky.astTypes.kindsMod.ProgramKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBuilder extends js.Object {
  def apply(program: ProgramKind): File = js.native
  def apply(program: ProgramKind, name: String): File = js.native
  def from(params: AnonComments): File = js.native
}

