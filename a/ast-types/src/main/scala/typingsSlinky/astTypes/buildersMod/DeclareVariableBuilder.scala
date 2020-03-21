package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsIdLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareVariableBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareVariable = js.native
  def from(params: AnonCommentsIdLoc): DeclareVariable = js.native
}

