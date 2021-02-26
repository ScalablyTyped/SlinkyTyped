package typingsSlinky.logrocket

import typingsSlinky.logrocket.mod.LR.IRequest
import typingsSlinky.logrocket.mod.LR.IResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BaseHref extends StObject {
    
    var baseHref: js.UndefOr[String] = js.native
    
    var inputSanitizer: js.UndefOr[Boolean | String] = js.native
    
    var isEnabled: js.UndefOr[Boolean] = js.native
    
    var textSanitizer: js.UndefOr[Boolean | String] = js.native
  }
  object BaseHref {
    
    @scala.inline
    def apply(): BaseHref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHref]
    }
    
    @scala.inline
    implicit class BaseHrefMutableBuilder[Self <: BaseHref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      @scala.inline
      def setInputSanitizer(value: Boolean | String): Self = StObject.set(x, "inputSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSanitizerUndefined: Self = StObject.set(x, "inputSanitizer", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setTextSanitizer(value: Boolean | String): Self = StObject.set(x, "textSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSanitizerUndefined: Self = StObject.set(x, "textSanitizer", js.undefined)
    }
  }
  
  @js.native
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var info: js.UndefOr[Boolean] = js.native
    
    var log: js.UndefOr[Boolean] = js.native
    
    var warn: js.UndefOr[Boolean] = js.native
  }
  object Debug {
    
    @scala.inline
    def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  @js.native
  trait IsEnabled extends StObject {
    
    var isEnabled: js.UndefOr[Boolean | Debug] = js.native
    
    var shouldAggregateConsoleErrors: js.UndefOr[Boolean] = js.native
  }
  object IsEnabled {
    
    @scala.inline
    def apply(): IsEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsEnabled]
    }
    
    @scala.inline
    implicit class IsEnabledMutableBuilder[Self <: IsEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean | Debug): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setShouldAggregateConsoleErrors(value: Boolean): Self = StObject.set(x, "shouldAggregateConsoleErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldAggregateConsoleErrorsUndefined: Self = StObject.set(x, "shouldAggregateConsoleErrors", js.undefined)
    }
  }
  
  @js.native
  trait RequestSanitizer extends StObject {
    
    var isEnabled: js.UndefOr[Boolean] = js.native
    
    var requestSanitizer: js.UndefOr[js.Function1[/* request */ IRequest, Null | IRequest]] = js.native
    
    var responseSanitizer: js.UndefOr[js.Function1[/* response */ IResponse, Null | IResponse]] = js.native
  }
  object RequestSanitizer {
    
    @scala.inline
    def apply(): RequestSanitizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestSanitizer]
    }
    
    @scala.inline
    implicit class RequestSanitizerMutableBuilder[Self <: RequestSanitizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setRequestSanitizer(value: /* request */ IRequest => Null | IRequest): Self = StObject.set(x, "requestSanitizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestSanitizerUndefined: Self = StObject.set(x, "requestSanitizer", js.undefined)
      
      @scala.inline
      def setResponseSanitizer(value: /* response */ IResponse => Null | IResponse): Self = StObject.set(x, "responseSanitizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseSanitizerUndefined: Self = StObject.set(x, "responseSanitizer", js.undefined)
    }
  }
  
  @js.native
  trait UrlSanitizer extends StObject {
    
    var urlSanitizer: js.UndefOr[js.Function1[/* url */ String, Null | String]] = js.native
  }
  object UrlSanitizer {
    
    @scala.inline
    def apply(): UrlSanitizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlSanitizer]
    }
    
    @scala.inline
    implicit class UrlSanitizerMutableBuilder[Self <: UrlSanitizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrlSanitizer(value: /* url */ String => Null | String): Self = StObject.set(x, "urlSanitizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlSanitizerUndefined: Self = StObject.set(x, "urlSanitizer", js.undefined)
    }
  }
}
