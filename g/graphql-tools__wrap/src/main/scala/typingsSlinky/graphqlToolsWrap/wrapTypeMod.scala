package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/WrapType", JSImport.Namespace)
@js.native
object wrapTypeMod extends js.Object {
  
  @js.native
  trait WrapType
    extends Transform[Record[String, js.Any]] {
    
    @JSName("transformRequest")
    def transformRequest_MWrapType(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MWrapType(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MWrapType(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MWrapType(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MWrapType(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MWrapType(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MWrapType(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MWrapType(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MWrapType(schema: GraphQLSchema): GraphQLSchema = js.native
    
    val transformer: js.Any = js.native
  }
  
  @js.native
  class default protected () extends WrapType {
    def this(outerTypeName: String, innerTypeName: String, fieldName: String) = this()
  }
}
