package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonProperties
import typingsSlinky.astTypes.kindsMod.ObjectMethodKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
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
  def from(params: AnonProperties): ObjectExpression = js.native
}

