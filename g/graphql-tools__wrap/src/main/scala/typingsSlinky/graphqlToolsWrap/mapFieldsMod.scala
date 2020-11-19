package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.ErrorsTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/MapFields", JSImport.Namespace)
@js.native
object mapFieldsMod extends js.Object {
  
  @js.native
  trait MapFields
    extends Transform[Record[String, js.Any]] {
    
    @JSName("transformRequest")
    def transformRequest_MMapFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MMapFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MMapFields(schema: GraphQLSchema): GraphQLSchema = js.native
    
    val transformer: js.Any = js.native
  }
  
  @js.native
  class default protected () extends MapFields {
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
}
