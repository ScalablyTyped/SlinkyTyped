package typingsSlinky.octokitCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.beforeAfterHook.mod.HookCollection
import typingsSlinky.beforeAfterHook.mod.HookMethod
import typingsSlinky.octokitCore.anon.Dictkey
import typingsSlinky.octokitCore.anon.Instantiable
import typingsSlinky.octokitCore.anon.InstantiablePlugins
import typingsSlinky.octokitCore.anon.Plugins
import typingsSlinky.octokitCore.typesMod.Constructor
import typingsSlinky.octokitCore.typesMod.OctokitOptions
import typingsSlinky.octokitCore.typesMod.OctokitPlugin
import typingsSlinky.octokitCore.typesMod.ReturnTypeOf
import typingsSlinky.octokitCore.typesMod.UnionToIntersection
import typingsSlinky.octokitGraphql.typesMod.GraphQlResponse
import typingsSlinky.octokitGraphql.typesMod.Query
import typingsSlinky.octokitGraphql.typesMod.RequestParameters
import typingsSlinky.octokitGraphql.typesMod.graphql
import typingsSlinky.octokitTypes.anon.Method
import typingsSlinky.octokitTypes.anon.Url
import typingsSlinky.octokitTypes.anon.UrlString
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/core", "Octokit")
  @js.native
  class Octokit ()
    extends /* key */ StringDictionary[js.Any] {
    def this(options: OctokitOptions) = this()
    
    def auth(args: js.Any*): js.Promise[_] = js.native
    
    /**
      * Sends a GraphQL query request based on endpoint options
      * The GraphQL query must be specified in `options`.
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql[ResponseData](options: RequestParameters): GraphQlResponse[ResponseData] = js.native
    /**
      * Sends a GraphQL query request based on endpoint options
      *
      * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql[ResponseData](query: Query): GraphQlResponse[ResponseData] = js.native
    def graphql[ResponseData](query: Query, parameters: RequestParameters): GraphQlResponse[ResponseData] = js.native
    @JSName("graphql")
    var graphql_Original: graphql = js.native
    
    /**
      * Invoke before and after hooks
      */
    def hook(name: String, hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def hook(name: String, hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
    @JSName("hook")
    var hook_Original: HookCollection = js.native
    
    var log: Dictkey = js.native
    
    def request[R /* <: Route */](route: R): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    def request[R /* <: Route */](
      route: R,
      options: typingsSlinky.octokitTypes.requestParametersMod.RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) with typingsSlinky.octokitTypes.requestParametersMod.RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def request[R /* <: Route */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    def request[R /* <: Route */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      options: typingsSlinky.octokitTypes.requestParametersMod.RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) with typingsSlinky.octokitTypes.requestParametersMod.RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[_]
      ] = js.native
    @JSName("request")
    var request_Original: RequestInterface[js.Object] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    @JSName("request")
    def request_url[T, O /* <: typingsSlinky.octokitTypes.requestParametersMod.RequestParameters */](options: O with Method with (UrlString | Url)): js.Promise[OctokitResponse[T]] = js.native
  }
  /* static members */
  object Octokit {
    
    @JSImport("@octokit/core", "Octokit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/core", "Octokit.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@octokit/core", "Octokit.defaults")
    @js.native
    def defaults[S /* <: Constructor[_] */](defaults: js.Function): Instantiable with S = js.native
    @JSImport("@octokit/core", "Octokit.defaults")
    @js.native
    def defaults[S /* <: Constructor[_] */](defaults: OctokitOptions): Instantiable with S = js.native
    
    /**
      * Attach a plugin (or many) to your Octokit instance.
      *
      * @example
      * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
      */
    @JSImport("@octokit/core", "Octokit.plugin")
    @js.native
    def plugin[S /* <: Constructor[_] with Plugins */, T /* <: js.Array[OctokitPlugin] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param newPlugins because its type T is not an array type */ newPlugins: T
    ): InstantiablePlugins with S with Constructor[UnionToIntersection[ReturnTypeOf[T]]] = js.native
    
    @JSImport("@octokit/core", "Octokit.plugins")
    @js.native
    def plugins: js.Array[OctokitPlugin] = js.native
    @scala.inline
    def plugins_=(x: js.Array[OctokitPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  }
}
