package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsWrap.typesMod.DataTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.ErrorsTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "TransformCompositeFields")
@js.native
class TransformCompositeFields protected ()
  extends typingsSlinky.graphqlTools.mod.TransformCompositeFields {
  def this(fieldTransformer: FieldTransformer) = this()
  def this(fieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: DataTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: DataTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: js.UndefOr[scala.Nothing],
    dataTransformer: DataTransformer,
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldTransformer: FieldTransformer,
    fieldNodeTransformer: FieldNodeTransformer,
    dataTransformer: DataTransformer,
    errorsTransformer: ErrorsTransformer
  ) = this()
}
