package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typingsSlinky.graphqlToolsWrap.mapFieldsMod.default
import typingsSlinky.graphqlToolsWrap.typesMod.ErrorsTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "MapFields")
@js.native
class MapFields protected () extends default {
  def this(fieldNodeTransformerMap: FieldNodeMappers) = this()
  def this(fieldNodeTransformerMap: FieldNodeMappers, objectValueTransformerMap: ObjectValueTransformerMap) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: ObjectValueTransformerMap,
    errorsTransformer: ErrorsTransformer
  ) = this()
}

