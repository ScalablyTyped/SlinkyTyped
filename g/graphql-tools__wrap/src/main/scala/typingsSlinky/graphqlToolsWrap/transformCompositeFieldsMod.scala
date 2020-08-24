package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.DataTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.ErrorsTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/TransformCompositeFields", JSImport.Namespace)
@js.native
object transformCompositeFieldsMod extends js.Object {
  @js.native
  trait TransformCompositeFields
    extends Transform[Record[String, js.Any]] {
    val dataTransformer: js.Any = js.native
    val errorsTransformer: js.Any = js.native
    val fieldNodeTransformer: js.Any = js.native
    val fieldTransformer: js.Any = js.native
    var mapping: js.Any = js.native
    var transformDocument: js.Any = js.native
    var transformSelectionSet: js.Any = js.native
    var transformedSchema: js.Any = js.native
    var typeInfo: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformCompositeFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformCompositeFields(
      originalRequest: Request,
      _delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformCompositeFields(originalRequest: Request, _delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformCompositeFields(
      originalRequest: Request,
      _delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MTransformCompositeFields(result: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformCompositeFields(
      result: ExecutionResult[Record[String, _]],
      _delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformCompositeFields(result: ExecutionResult[Record[String, _]], _delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformCompositeFields(
      result: ExecutionResult[Record[String, _]],
      _delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformCompositeFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformCompositeFields {
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
  
}

