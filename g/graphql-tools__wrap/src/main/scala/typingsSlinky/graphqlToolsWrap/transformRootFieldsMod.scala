package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.RootFieldTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/TransformRootFields", JSImport.Namespace)
@js.native
object transformRootFieldsMod extends js.Object {
  
  @js.native
  trait TransformRootFields
    extends Transform[Record[String, js.Any]] {
    
    val fieldNodeTransformer: js.Any = js.native
    
    val rootFieldTransformer: js.Any = js.native
    
    @JSName("transformRequest")
    def transformRequest_MTransformRootFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformRootFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformRootFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformRootFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MTransformRootFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformRootFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformRootFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformRootFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MTransformRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
    
    var transformer: js.Any = js.native
  }
  
  @js.native
  class default protected () extends TransformRootFields {
    def this(rootFieldTransformer: RootFieldTransformer) = this()
    def this(rootFieldTransformer: RootFieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  }
}
