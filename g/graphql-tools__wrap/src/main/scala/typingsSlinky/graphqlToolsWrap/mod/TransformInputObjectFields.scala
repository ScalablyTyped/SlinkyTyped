package typingsSlinky.graphqlToolsWrap.mod

import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputFieldTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap", "TransformInputObjectFields")
@js.native
class TransformInputObjectFields protected ()
  extends typingsSlinky.graphqlToolsWrap.transformsMod.TransformInputObjectFields {
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
