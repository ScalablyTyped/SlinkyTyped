package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsExpressionLoc
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExternalModuleReferenceBuilder extends js.Object {
  def apply(expression: StringLiteralKind): TSExternalModuleReference = js.native
  def from(params: AnonCommentsExpressionLoc): TSExternalModuleReference = js.native
}

