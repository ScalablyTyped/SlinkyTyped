package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonParameters
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSFunctionTypeBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  def from(params: AnonParameters): TSFunctionType = js.native
}

