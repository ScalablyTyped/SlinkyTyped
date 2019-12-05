package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLocProperties
import typingsSlinky.astDashTypes.genKindsMod.ObjectMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.PropertyKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadPropertyKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExpressionBuilder extends js.Object {
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  def from(params: Anon_CommentsLocProperties): ObjectExpression = js.native
}

