package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Body
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgramBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): Program = js.native
  def from(params: Body): Program = js.native
}

