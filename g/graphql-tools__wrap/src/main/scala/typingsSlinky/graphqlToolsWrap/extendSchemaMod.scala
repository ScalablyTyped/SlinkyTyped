package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsWrap.anon.DefaultFieldResolver
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms/ExtendSchema", JSImport.Namespace)
@js.native
object extendSchemaMod extends js.Object {
  
  @js.native
  trait ExtendSchema
    extends Transform[Record[String, js.Any]] {
    
    val defaultFieldResolver: js.Any = js.native
    
    val resolvers: js.Any = js.native
    
    @JSName("transformRequest")
    def transformRequest_MExtendSchema(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MExtendSchema(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MExtendSchema(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MExtendSchema(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    
    @JSName("transformResult")
    def transformResult_MExtendSchema(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MExtendSchema(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MExtendSchema(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MExtendSchema(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    
    @JSName("transformSchema")
    def transformSchema_MExtendSchema(schema: GraphQLSchema): GraphQLSchema = js.native
    
    val transformer: js.Any = js.native
    
    val typeDefs: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ExtendSchema {
    def this(hasTypeDefsResolversDefaultFieldResolverFieldNodeTransformerMapObjectValueTransformerMapErrorsTransformer: DefaultFieldResolver) = this()
  }
}
