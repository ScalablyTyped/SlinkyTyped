package typingsSlinky.octokitTypes

import typingsSlinky.octokitTypes.anon.Method
import typingsSlinky.octokitTypes.anon.Url
import typingsSlinky.octokitTypes.anon.UrlString
import typingsSlinky.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typingsSlinky.octokitTypes.octokitTypesStrings.body
import typingsSlinky.octokitTypes.octokitTypesStrings.headers
import typingsSlinky.octokitTypes.octokitTypesStrings.method
import typingsSlinky.octokitTypes.octokitTypesStrings.request
import typingsSlinky.octokitTypes.octokitTypesStrings.url
import typingsSlinky.octokitTypes.requestOptionsMod.RequestOptions
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/types/dist-types/EndpointInterface", JSImport.Namespace)
@js.native
object endpointInterfaceMod extends js.Object {
  
  @js.native
  trait EndpointInterface[D /* <: js.Object */] extends js.Object {
    
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[O /* <: RequestParameters */](options: O with Method with (UrlString | Url)): RequestOptions with (Pick[
        D with O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    def apply[R /* <: Route */, P /* <: RequestParameters */](route: R, parameters: P): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[R /* <: Route */, P /* <: RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    def apply[R /* <: Route */, P /* <: RequestParameters */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      parameters: P
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    
    /**
      * Object with current default route and parameters
      */
    var DEFAULTS: D with EndpointDefaults = js.native
    
    /**
      * Returns a new `endpoint` interface with new defaults
      */
    def defaults[O /* <: RequestParameters */](newDefaults: O): EndpointInterface[D with O] = js.native
    
    def merge(): D with EndpointDefaults = js.native
    def merge[P /* <: RequestParameters */](options: P): EndpointDefaults with D with P = js.native
    def merge[R /* <: Route */, P /* <: RequestParameters */](route: R, parameters: P): D with (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with P = js.native
    def merge[R /* <: Route */, P /* <: RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): D with (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with P = js.native
    def merge[R /* <: Route */, P /* <: RequestParameters */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      parameters: P
    ): D with (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with P = js.native
    @JSName("merge")
    def merge_R_RouteP_RequestParameters[R /* <: Route */, P /* <: RequestParameters */](route: R): D with (EndpointDefaults | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with P = js.native
    
    /**
      * Stateless method to turn endpoint options into request options.
      * Calling `endpoint(options)` is the same as calling `endpoint.parse(endpoint.merge(options))`.
      *
      * @param {object} options `method`, `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def parse[O /* <: EndpointDefaults */](options: O): RequestOptions with (Pick[
        O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
  }
}
