package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphqlToolsWrap.transformObjectFieldsMod.default
import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "TransformObjectFields")
@js.native
class TransformObjectFields protected () extends default {
  def this(objectFieldTransformer: FieldTransformer) = this()
  def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

