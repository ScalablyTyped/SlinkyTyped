package typingsSlinky.router5

import typingsSlinky.pathParser.encodingMod.URLParamsEncodingType
import typingsSlinky.routeNode.routeNodeMod.QueryParamsMode
import typingsSlinky.routeNode.routeNodeMod.TrailingSlashMode
import typingsSlinky.router5.baseMod.Params
import typingsSlinky.searchParams.encodeMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ErrorKey extends StObject {
    
    var errorKey: js.UndefOr[js.Any] = js.native
    
    var fromState: js.Any = js.native
    
    var isCancelled: js.Any = js.native
    
    var toState: js.Any = js.native
  }
  object ErrorKey {
    
    @scala.inline
    def apply(fromState: js.Any, isCancelled: js.Any, toState: js.Any): ErrorKey = {
      val __obj = js.Dynamic.literal(fromState = fromState.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorKey]
    }
    
    @scala.inline
    implicit class ErrorKeyMutableBuilder[Self <: ErrorKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorKey(value: js.Any): Self = StObject.set(x, "errorKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorKeyUndefined: Self = StObject.set(x, "errorKey", js.undefined)
      
      @scala.inline
      def setFromState(value: js.Any): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCancelled(value: js.Any): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToState(value: js.Any): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<router5.router5/dist/types/router.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var allowNotFound: js.UndefOr[Boolean] = js.native
    
    var autoCleanUp: js.UndefOr[Boolean] = js.native
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var defaultParams: js.UndefOr[Params] = js.native
    
    var defaultRoute: js.UndefOr[String] = js.native
    
    var queryParams: js.UndefOr[IOptions] = js.native
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
    
    var rewritePathOnMatch: js.UndefOr[Boolean] = js.native
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var strongMatching: js.UndefOr[Boolean] = js.native
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNotFound(value: Boolean): Self = StObject.set(x, "allowNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNotFoundUndefined: Self = StObject.set(x, "allowNotFound", js.undefined)
      
      @scala.inline
      def setAutoCleanUp(value: Boolean): Self = StObject.set(x, "autoCleanUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCleanUpUndefined: Self = StObject.set(x, "autoCleanUp", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDefaultParams(value: Params): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      @scala.inline
      def setDefaultRoute(value: String): Self = StObject.set(x, "defaultRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setRewritePathOnMatch(value: Boolean): Self = StObject.set(x, "rewritePathOnMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewritePathOnMatchUndefined: Self = StObject.set(x, "rewritePathOnMatch", js.undefined)
      
      @scala.inline
      def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
      
      @scala.inline
      def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongMatchingUndefined: Self = StObject.set(x, "strongMatching", js.undefined)
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
}
