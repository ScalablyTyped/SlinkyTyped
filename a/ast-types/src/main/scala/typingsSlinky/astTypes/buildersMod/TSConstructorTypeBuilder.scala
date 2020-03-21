package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonParameters
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConstructorTypeBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType = js.native
  def from(params: AnonParameters): TSConstructorType = js.native
}

