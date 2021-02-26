package typingsSlinky.adobeNodeFetchRetry

import typingsSlinky.nodeFetch.mod.Request
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/node-fetch-retry", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options): js.Promise[Response] = js.native
  @JSImport("@adobe/node-fetch-retry", JSImport.Namespace)
  @js.native
  def apply(url: Request, options: Options): js.Promise[Response] = js.native
  
  /**
    * options for fetch-retry
    */
  @js.native
  trait Options extends RequestInit {
    
    /**
      * options for retry or false if want to disable retry
      * ... other options for fetch call (method, headers, etc...)
      */
    var retryOptions: js.UndefOr[RetryOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    }
  }
  
  /**
    * options for retry or false if want to disable retry
    */
  @js.native
  trait RetryOptions extends StObject {
    
    /**
      * If true, socket timeout will be forced to use `socketTimeout` property declared (defaults to false)
      */
    var forceSocketTimeout: js.UndefOr[Boolean] = js.native
    
    /**
      * backoff factor for wait time between retries (defaults to 2.0)
      */
    var retryBackoff: js.UndefOr[Double] = js.native
    
    /**
      * time to wait between retries in milliseconds
      */
    var retryInitialDelay: js.UndefOr[Double] = js.native
    
    /**
      * time (in milliseconds) to retry until throwing an error
      */
    var retryMaxDuration: js.UndefOr[Double] = js.native
    
    /**
      * a function determining whether to retry on a specific HTTP code
      */
    var retryOnHttpResponse: js.UndefOr[js.Function1[/* response */ Response, Boolean]] = js.native
    
    /**
      * Optional socket timeout in milliseconds (defaults to 60000ms)
      */
    var socketTimeout: js.UndefOr[Double] = js.native
  }
  object RetryOptions {
    
    @scala.inline
    def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceSocketTimeout(value: Boolean): Self = StObject.set(x, "forceSocketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSocketTimeoutUndefined: Self = StObject.set(x, "forceSocketTimeout", js.undefined)
      
      @scala.inline
      def setRetryBackoff(value: Double): Self = StObject.set(x, "retryBackoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryBackoffUndefined: Self = StObject.set(x, "retryBackoff", js.undefined)
      
      @scala.inline
      def setRetryInitialDelay(value: Double): Self = StObject.set(x, "retryInitialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryInitialDelayUndefined: Self = StObject.set(x, "retryInitialDelay", js.undefined)
      
      @scala.inline
      def setRetryMaxDuration(value: Double): Self = StObject.set(x, "retryMaxDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryMaxDurationUndefined: Self = StObject.set(x, "retryMaxDuration", js.undefined)
      
      @scala.inline
      def setRetryOnHttpResponse(value: /* response */ Response => Boolean): Self = StObject.set(x, "retryOnHttpResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetryOnHttpResponseUndefined: Self = StObject.set(x, "retryOnHttpResponse", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
