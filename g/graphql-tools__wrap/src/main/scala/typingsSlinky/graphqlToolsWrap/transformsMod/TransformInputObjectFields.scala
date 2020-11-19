package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphqlToolsWrap.transformInputObjectFieldsMod.default
import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms", "TransformInputObjectFields")
@js.native
class TransformInputObjectFields protected () extends default {
  def this(inputFieldTransformer: InputFieldTransformer) = this()
  def this(inputFieldTransformer: InputFieldTransformer, inputFieldNodeTransformer: InputFieldNodeTransformer) = this()
  def this(
    inputFieldTransformer: InputFieldTransformer,
    inputFieldNodeTransformer: js.UndefOr[scala.Nothing],
    inputObjectNodeTransformer: InputObjectNodeTransformer
  ) = this()
  def this(
    inputFieldTransformer: InputFieldTransformer,
    inputFieldNodeTransformer: InputFieldNodeTransformer,
    inputObjectNodeTransformer: InputObjectNodeTransformer
  ) = this()
}
