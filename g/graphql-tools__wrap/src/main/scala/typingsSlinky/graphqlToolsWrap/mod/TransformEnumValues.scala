package typingsSlinky.graphqlToolsWrap.mod

import typingsSlinky.graphqlToolsWrap.typesMod.EnumValueTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.LeafValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap", "TransformEnumValues")
@js.native
class TransformEnumValues protected ()
  extends typingsSlinky.graphqlToolsWrap.transformsMod.TransformEnumValues {
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
