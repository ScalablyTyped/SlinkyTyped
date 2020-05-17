package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Parameter
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSParameterPropertyBuilder extends js.Object {
  def apply(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def apply(parameter: IdentifierKind): TSParameterProperty = js.native
  def from(params: Parameter): TSParameterProperty = js.native
}

