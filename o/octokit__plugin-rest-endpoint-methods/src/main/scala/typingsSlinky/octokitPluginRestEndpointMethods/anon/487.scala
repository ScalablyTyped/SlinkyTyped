package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.body
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.method
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.request
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.url
import typingsSlinky.octokitTypes.anon.Method
import typingsSlinky.octokitTypes.anon.UrlString
import typingsSlinky.octokitTypes.endpointInterfaceMod.EndpointInterface
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.requestOptionsMod.RequestOptions
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import typingsSlinky.std.Omit
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `487` extends js.Object {
  
  def apply(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/teams/:team_slug/repos/:owner/:repo']['response'] */ js.Any
  ] = js.native
  def apply(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/teams/:team_slug/repos/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/teams/:team_slug/repos/:owner/:repo']['response'] */ js.Any
  ] = js.native
  
  def defaults[O /* <: RequestParameters */](newDefaults: O): RequestInterface[js.Object with O] = js.native
  @JSName("defaults")
  var defaults_Original: js.Function1[
    /* newDefaults */ RequestParameters, 
    RequestInterface[js.Object with RequestParameters]
  ] = js.native
  
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: R): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: R, parameters: P): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  def endpoint[R /* <: Route */, P /* <: RequestParameters */](
    route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
    parameters: P
  ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
    P, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
  @JSName("endpoint")
  var endpoint_Original: EndpointInterface[Url] = js.native
  /**
    * Transforms a GitHub REST API endpoint into generic request options
    *
    * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  @JSName("endpoint")
  def endpoint_url[O /* <: RequestParameters */](options: O with Method with (UrlString | typingsSlinky.octokitTypes.anon.Url)): RequestOptions with (Pick[
    Url with O, 
    /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
  ]) = js.native
}
