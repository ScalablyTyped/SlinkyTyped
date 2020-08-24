package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typingsSlinky.graphqlToolsWrap.typesMod.ErrorsTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "MapFields")
@js.native
class MapFields protected ()
  extends typingsSlinky.graphqlTools.mod.MapFields {
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

