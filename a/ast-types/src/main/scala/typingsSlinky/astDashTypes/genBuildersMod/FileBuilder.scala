package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_Comments
import typingsSlinky.astDashTypes.genKindsMod.ProgramKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBuilder extends js.Object {
  def apply(program: ProgramKind): File = js.native
  def apply(program: ProgramKind, name: String): File = js.native
  def from(params: Anon_Comments): File = js.native
}

