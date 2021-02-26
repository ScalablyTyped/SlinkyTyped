package typingsSlinky.oJs

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.ohandlerMod.OHandler
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odataConfigMod {
  
  @js.native
  trait OdataBatchConfig extends StObject {
    
    var boundaryPrefix: js.UndefOr[String] = js.native
    
    var changsetBoundaryPrefix: js.UndefOr[String] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var useChangset: Boolean = js.native
    
    /**
      * When truthy, relative URL's will be used in batch elements
      */
    var useRelativeURLs: Boolean = js.native
  }
  object OdataBatchConfig {
    
    @scala.inline
    def apply(useChangset: Boolean, useRelativeURLs: Boolean): OdataBatchConfig = {
      val __obj = js.Dynamic.literal(useChangset = useChangset.asInstanceOf[js.Any], useRelativeURLs = useRelativeURLs.asInstanceOf[js.Any])
      __obj.asInstanceOf[OdataBatchConfig]
    }
    
    @scala.inline
    implicit class OdataBatchConfigMutableBuilder[Self <: OdataBatchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundaryPrefix(value: String): Self = StObject.set(x, "boundaryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryPrefixUndefined: Self = StObject.set(x, "boundaryPrefix", js.undefined)
      
      @scala.inline
      def setChangsetBoundaryPrefix(value: String): Self = StObject.set(x, "changsetBoundaryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangsetBoundaryPrefixUndefined: Self = StObject.set(x, "changsetBoundaryPrefix", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setUseChangset(value: Boolean): Self = StObject.set(x, "useChangset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRelativeURLs(value: Boolean): Self = StObject.set(x, "useRelativeURLs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.RequestInit & {  rootUrl :std.URL,   query :std.URLSearchParams | undefined,   fragment :string,   batch :o.js.o.js/dist/types/OdataConfig.OdataBatchConfig | undefined,   disablePolyfill :boolean, onStart (oHandler : o.js.o.js/dist/types/OHandler.OHandler): void, onFinish (oHandler : o.js.o.js/dist/types/OHandler.OHandler, res : std.Response | undefined): void, onError (oHandler : o.js.o.js/dist/types/OHandler.OHandler, res : std.Response): void} */
  @js.native
  trait OdataConfig extends StObject {
    
    /**
      * Batch configuration (experimental)
      */
    var batch: js.UndefOr[OdataBatchConfig] = js.native
    
    /**
      * A BodyInit object or null to set request's body.
      */
    var body: js.UndefOr[BodyInit | Null] = js.native
    
    /**
      * A string indicating how the request will interact with the browser's cache to set request's cache.
      */
    var cache: js.UndefOr[RequestCache] = js.native
    
    /**
      * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
      */
    var credentials: js.UndefOr[RequestCredentials] = js.native
    
    /**
      * Set to true to disable auto polyfilling
      */
    var disablePolyfill: Boolean = js.native
    
    /**
      * The fragment to parse data from
      * Default is: value
      */
    var fragment: String = js.native
    
    /**
      * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
      */
    var headers: js.UndefOr[HeadersInit] = js.native
    
    /**
      * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
      */
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * A boolean to set request's keepalive.
      */
    var keepalive: js.UndefOr[Boolean] = js.native
    
    /**
      * A string to set request's method.
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
      */
    var mode: js.UndefOr[RequestMode] = js.native
    
    /**
      * A function which is called when a request has a error
      */
    def onError(oHandler: OHandler, res: Response): Unit = js.native
    
    /**
      * A function which is called when a request has finished
      */
    def onFinish(oHandler: OHandler): Unit = js.native
    def onFinish(oHandler: OHandler, res: Response): Unit = js.native
    
    /**
      * A function which is called on each start of a request
      */
    def onStart(oHandler: OHandler): Unit = js.native
    
    /**
      * An default query
      */
    var query: js.UndefOr[URLSearchParams] = js.native
    
    /**
      * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
      */
    var redirect: js.UndefOr[RequestRedirect] = js.native
    
    /**
      * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
      */
    var referrer: js.UndefOr[String] = js.native
    
    /**
      * A referrer policy to set request's referrerPolicy.
      */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
    
    /**
      * The URL to request data from
      */
    var rootUrl: URL = js.native
    
    /**
      * An AbortSignal to set request's signal.
      */
    var signal: js.UndefOr[AbortSignal | Null] = js.native
    
    /**
      * Can only be null. Used to disassociate request from any Window.
      */
    var window: js.UndefOr[js.Any] = js.native
  }
}
