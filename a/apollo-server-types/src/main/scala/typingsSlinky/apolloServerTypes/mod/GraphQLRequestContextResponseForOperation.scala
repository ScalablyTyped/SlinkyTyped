package typingsSlinky.apolloServerTypes.mod

import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined apollo-server-types.apollo-server-types.WithRequired<apollo-server-types.apollo-server-types.GraphQLRequestContext<TContext>, 'metrics' | 'source' | 'document' | 'operation' | 'operationName'> */
@js.native
trait GraphQLRequestContextResponseForOperation[TContext] extends js.Object {
  
  val cache: KeyValueCache[String] = js.native
  
  val context: TContext = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  val document: js.UndefOr[DocumentNode] with DocumentNode = js.native
  
  val errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  
  var logger: Logger = js.native
  
  val metrics: GraphQLRequestMetrics = js.native
  
  val operation: js.UndefOr[OperationDefinitionNode] with OperationDefinitionNode = js.native
  
  val operationName: (js.UndefOr[String | Null]) with String = js.native
  
  val queryHash: js.UndefOr[String] = js.native
  
  val request: GraphQLRequest = js.native
  
  val response: js.UndefOr[GraphQLResponse] = js.native
  
  val schema: GraphQLSchema = js.native
  
  val schemaHash: SchemaHash = js.native
  
  val source: js.UndefOr[String] with String = js.native
}
object GraphQLRequestContextResponseForOperation {
  
  @scala.inline
  def apply[TContext](
    cache: KeyValueCache[String],
    context: TContext,
    document: js.UndefOr[DocumentNode] with DocumentNode,
    logger: Logger,
    metrics: GraphQLRequestMetrics,
    operation: js.UndefOr[OperationDefinitionNode] with OperationDefinitionNode,
    operationName: (js.UndefOr[String | Null]) with String,
    request: GraphQLRequest,
    schema: GraphQLSchema,
    schemaHash: SchemaHash,
    source: js.UndefOr[String] with String
  ): GraphQLRequestContextResponseForOperation[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestContextResponseForOperation[TContext]]
  }
  
  @scala.inline
  implicit class GraphQLRequestContextResponseForOperationOps[Self <: GraphQLRequestContextResponseForOperation[_], TContext] (val x: Self with GraphQLRequestContextResponseForOperation[TContext]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: KeyValueCache[String]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.UndefOr[DocumentNode] with DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: GraphQLRequestMetrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: js.UndefOr[OperationDefinitionNode] with OperationDefinitionNode): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationName(value: (js.UndefOr[String | Null]) with String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GraphQLRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaHash(value: SchemaHash): Self = this.set("schemaHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.UndefOr[String] with String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setQueryHash(value: String): Self = this.set("queryHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryHash: Self = this.set("queryHash", js.undefined)
    
    @scala.inline
    def setResponse(value: GraphQLResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
