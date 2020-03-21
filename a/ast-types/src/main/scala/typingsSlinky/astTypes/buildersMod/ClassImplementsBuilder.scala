package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypeParameters
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassImplementsBuilder extends js.Object {
  def apply(id: IdentifierKind): ClassImplements = js.native
  def from(params: AnonTypeParameters): ClassImplements = js.native
}

