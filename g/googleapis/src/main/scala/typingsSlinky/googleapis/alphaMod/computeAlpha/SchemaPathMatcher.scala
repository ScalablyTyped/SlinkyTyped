package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A matcher for the path portion of the URL. The BackendService from the
  * longest-matched rule will serve the URL. If no rule was matched, the
  * default service will be used.
  */
@js.native
trait SchemaPathMatcher extends StObject {
  
  /**
    * defaultRouteAction takes effect when none of the  pathRules or routeRules
    * match. The load balancer performs advanced routing actions like URL
    * rewrites, header transformations, etc. prior to forwarding the request to
    * the selected backend. If defaultRouteAction specifies any
    * weightedBackendServices, defaultService must not be set. Conversely if
    * defaultService is set, defaultRouteAction cannot contain any
    * weightedBackendServices. Only one of defaultRouteAction or
    * defaultUrlRedirect must be set.
    */
  var defaultRouteAction: js.UndefOr[SchemaHttpRouteAction] = js.native
  
  /**
    * The full or partial URL to the BackendService resource. This will be used
    * if none of the pathRules or routeRules defined by this PathMatcher are
    * matched. For example, the following are all valid URLs to a
    * BackendService resource:   -
    * https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
    * - compute/v1/projects/project/global/backendServices/backendService  -
    * global/backendServices/backendService  If defaultRouteAction is
    * additionally specified, advanced routing actions like URL Rewrites, etc.
    * take effect prior to sending the request to the backend. However, if
    * defaultService is specified, defaultRouteAction cannot contain any
    * weightedBackendServices. Conversely, if defaultRouteAction specifies any
    * weightedBackendServices, defaultService must not be specified. Only one
    * of defaultService, defaultUrlRedirect  or
    * defaultRouteAction.weightedBackendService must be set. Authorization
    * requires one or more of the following Google IAM permissions on the
    * specified resource default_service:   - compute.backendBuckets.use  -
    * compute.backendServices.use
    */
  var defaultService: js.UndefOr[String] = js.native
  
  /**
    * When when none of the specified pathRules or routeRules match, the
    * request is redirected to a URL specified by defaultUrlRedirect. If
    * defaultUrlRedirect is specified, defaultService or defaultRouteAction
    * must not be set.
    */
  var defaultUrlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. HeaderAction specified here are
    * applied after the matching HttpRouteRule HeaderAction and before the
    * HeaderAction in the UrlMap
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.native
  
  /**
    * The name to which this PathMatcher is referred by the HostRule.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of path rules. Use this list instead of routeRules when routing
    * based on simple path matching is all that&#39;s required. The order by
    * which path rules are specified does not matter. Matches are always done
    * on the longest-path-first basis. For example: a pathRule with a path
    * /a/b/c/ * will match before /a/b/ * irrespective of the order in which
    * those paths appear in this list. Only one of pathRules or routeRules must
    * be set.
    */
  var pathRules: js.UndefOr[js.Array[SchemaPathRule]] = js.native
  
  /**
    * The list of ordered HTTP route rules. Use this list instead of pathRules
    * when advanced route matching and routing actions are desired. The order
    * of specifying routeRules matters: the first rule that matches will cause
    * its specified routing action to take effect. Only one of pathRules or
    * routeRules must be set.
    */
  var routeRules: js.UndefOr[js.Array[SchemaHttpRouteRule]] = js.native
}
object SchemaPathMatcher {
  
  @scala.inline
  def apply(): SchemaPathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathMatcher]
  }
  
  @scala.inline
  implicit class SchemaPathMatcherMutableBuilder[Self <: SchemaPathMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "defaultRouteAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRouteActionUndefined: Self = StObject.set(x, "defaultRouteAction", js.undefined)
    
    @scala.inline
    def setDefaultService(value: String): Self = StObject.set(x, "defaultService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultServiceUndefined: Self = StObject.set(x, "defaultService", js.undefined)
    
    @scala.inline
    def setDefaultUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "defaultUrlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUrlRedirectUndefined: Self = StObject.set(x, "defaultUrlRedirect", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPathRules(value: js.Array[SchemaPathRule]): Self = StObject.set(x, "pathRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathRulesUndefined: Self = StObject.set(x, "pathRules", js.undefined)
    
    @scala.inline
    def setPathRulesVarargs(value: SchemaPathRule*): Self = StObject.set(x, "pathRules", js.Array(value :_*))
    
    @scala.inline
    def setRouteRules(value: js.Array[SchemaHttpRouteRule]): Self = StObject.set(x, "routeRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteRulesUndefined: Self = StObject.set(x, "routeRules", js.undefined)
    
    @scala.inline
    def setRouteRulesVarargs(value: SchemaHttpRouteRule*): Self = StObject.set(x, "routeRules", js.Array(value :_*))
  }
}
