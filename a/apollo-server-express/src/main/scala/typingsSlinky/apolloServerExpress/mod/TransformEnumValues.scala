package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphqlToolsWrap.typesMod.EnumValueTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.LeafValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "TransformEnumValues")
@js.native
class TransformEnumValues protected ()
  extends typingsSlinky.graphqlTools.mod.TransformEnumValues {
  def this(enumValueTransformer: EnumValueTransformer) = this()
  def this(enumValueTransformer: EnumValueTransformer, inputValueTransformer: LeafValueTransformer) = this()
  def this(
    enumValueTransformer: EnumValueTransformer,
    inputValueTransformer: js.UndefOr[scala.Nothing],
    outputValueTransformer: LeafValueTransformer
  ) = this()
  def this(
    enumValueTransformer: EnumValueTransformer,
    inputValueTransformer: LeafValueTransformer,
    outputValueTransformer: LeafValueTransformer
  ) = this()
}

