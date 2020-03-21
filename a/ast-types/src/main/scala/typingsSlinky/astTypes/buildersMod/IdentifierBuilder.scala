package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLoc
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierBuilder extends js.Object {
  def apply(name: String): Identifier = js.native
  def from(params: AnonLoc): Identifier = js.native
}

