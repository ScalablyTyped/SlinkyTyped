package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerCore.anon.PartialGraphQLServerOptio
import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerCore.typesMod.Config
import typingsSlinky.apolloServerCore.typesMod.FileUploadOptions
import typingsSlinky.apolloServerCore.typesMod.SubscriptionServerOptions
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.mod.BaseContext
import typingsSlinky.apolloServerTypes.mod.GraphQLRequest
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.node.httpMod.Server
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/ApolloServer", JSImport.Namespace)
@js.native
object apolloServerMod extends js.Object {
  
  @js.native
  class ApolloServerBase protected () extends js.Object {
    def this(config: Config) = this()
    
    var config: js.Any = js.native
    
    var context: js.Any = js.native
    
    var engineApiKeyHash: js.Any = js.native
    
    var engineReportingAgent: js.Any = js.native
    
    var engineServiceId: js.Any = js.native
    
    var ensurePluginInstantiation: js.Any = js.native
    
    def executeOperation(request: GraphQLRequest): js.Promise[GraphQLResponse] = js.native
    
    var experimental_approximateDocumentStoreMiB: js.Any = js.native
    
    var generateSchemaDerivedData: js.Any = js.native
    
    /* protected */ def graphQLServerOptions(): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
    /* protected */ def graphQLServerOptions(integrationContextArgument: Record[String, _]): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
    
    var graphqlPath: String = js.native
    
    var initSchema: js.Any = js.native
    
    var initializeDocumentStore: js.Any = js.native
    
    def installSubscriptionHandlers(server: Server): Unit = js.native
    def installSubscriptionHandlers(server: typingsSlinky.ws.mod.Server): Unit = js.native
    
    var logger: js.Any = js.native
    
    var parseOptions: js.Any = js.native
    
    var playgroundOptions: js.UndefOr[RenderPageOptions] = js.native
    
    var plugins: js.Array[ApolloServerPlugin[BaseContext]] = js.native
    
    var requestOptions: PartialGraphQLServerOptio = js.native
    
    var schema: js.UndefOr[GraphQLSchema] = js.native
    
    var schemaDerivedData: js.Any = js.native
    
    var schemaIsFederated: js.Any = js.native
    
    def setGraphQLPath(path: String): Unit = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    var subscriptionServer: js.Any = js.native
    
    var subscriptionServerOptions: js.UndefOr[SubscriptionServerOptions] = js.native
    
    var subscriptionsPath: js.UndefOr[String] = js.native
    
    /* protected */ def supportsSubscriptions(): Boolean = js.native
    
    /* protected */ def supportsUploads(): Boolean = js.native
    
    var toDispose: js.Any = js.native
    
    var uploadsConfig: js.UndefOr[FileUploadOptions] = js.native
    
    /* protected */ def willStart(): js.Promise[Unit] = js.native
  }
}
