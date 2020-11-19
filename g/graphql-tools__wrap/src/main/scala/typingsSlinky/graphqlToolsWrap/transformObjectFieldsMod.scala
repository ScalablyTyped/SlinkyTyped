package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.FieldTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/TransformObjectFields", JSImport.Namespace)
@js.native
object transformObjectFieldsMod extends js.Object {
  
  @js.native
  trait TransformObjectFields
    extends Transform[Record[String, js.Any]] {
    
    val fieldNodeTransformer: js.Any = js.native
    
    val objectFieldTransformer: js.Any = js.native
    
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MTransformObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
    
    var transformer: js.Any = js.native
  }
  
  @js.native
  class default protected () extends TransformObjectFields {
    def this(objectFieldTransformer: FieldTransformer) = this()
    def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  }
}
