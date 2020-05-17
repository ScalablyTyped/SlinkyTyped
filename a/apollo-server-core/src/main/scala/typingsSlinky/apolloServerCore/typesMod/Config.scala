package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloServerCore.anon.PartialSubscriptionServer
import typingsSlinky.apolloServerCore.anon.TypeofSchemaDirectiveVisi
import typingsSlinky.apolloServerCore.apolloServerCoreBooleans.`false`
import typingsSlinky.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsSlinky.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlTools.interfacesMod.IMocks
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends BaseConfig {
  var cacheControl: js.UndefOr[CacheControlExtensionOptions | Boolean] = js.native
  var context: js.UndefOr[Context[js.Object] | (ContextFunction[_, js.Object])] = js.native
  var engine: js.UndefOr[Boolean | EngineReportingOptions[Context[js.Object]]] = js.native
  var experimental_approximateDocumentStoreMiB: js.UndefOr[Double] = js.native
  var extensions: js.UndefOr[js.Array[js.Function0[typingsSlinky.graphqlExtensions.mod.GraphQLExtension[_]]]] = js.native
  var gateway: js.UndefOr[GraphQLService] = js.native
  var introspection: js.UndefOr[Boolean] = js.native
  var mockEntireSchema: js.UndefOr[Boolean] = js.native
  var mocks: js.UndefOr[Boolean | IMocks] = js.native
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.native
  var playground: js.UndefOr[PlaygroundConfig] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var resolvers: js.UndefOr[(IResolvers[_, _]) | (js.Array[IResolvers[_, _]])] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var schemaDirectives: js.UndefOr[Record[String, TypeofSchemaDirectiveVisi]] = js.native
  var subscriptions: js.UndefOr[PartialSubscriptionServer | String | `false`] = js.native
  var typeDefs: js.UndefOr[DocumentNode | (js.Array[DocumentNode | String]) | String] = js.native
  var uploads: js.UndefOr[Boolean | FileUploadOptions] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheControl(value: CacheControlExtensionOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFunction1(value: _ => ValueOrPromise[Context[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: Context[js.Object] | (ContextFunction[_, js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Boolean | EngineReportingOptions[Context[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental_approximateDocumentStoreMiB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental_approximateDocumentStoreMiB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental_approximateDocumentStoreMiB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental_approximateDocumentStoreMiB")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[js.Function0[typingsSlinky.graphqlExtensions.mod.GraphQLExtension[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGateway(value: GraphQLService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withIntrospection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntrospection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(js.undefined)
        ret
    }
    @scala.inline
    def withMockEntireSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockEntireSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockEntireSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockEntireSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withMocks(value: Boolean | IMocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[GraphQLSchemaModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOptions(value: GraphQLParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueries(value: PersistedQueryOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayground(value: PlaygroundConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playground")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: (IResolvers[_, _]) | (js.Array[IResolvers[_, _]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDirectives(value: Record[String, TypeofSchemaDirectiveVisi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: PartialSubscriptionServer | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDefs(value: DocumentNode | (js.Array[DocumentNode | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: Boolean | FileUploadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(js.undefined)
        ret
    }
  }
  
}

