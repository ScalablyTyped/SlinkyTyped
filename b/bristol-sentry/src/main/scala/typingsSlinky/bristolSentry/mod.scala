package typingsSlinky.bristolSentry

import typingsSlinky.raven.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bristol-sentry", JSImport.Namespace)
  @js.native
  def apply(config: SentryConfig): js.Function0[Unit] = js.native
  
  @JSImport("bristol-sentry", "formatter")
  @js.native
  def formatter(opts: js.Object, severity: String, date: js.Date, elems: js.Array[_]): FormattedLog = js.native
  
  @js.native
  trait FormattedLog extends StObject {
    
    var error: js.UndefOr[js.Error] = js.native
    
    var extra: js.Array[js.Object] = js.native
    
    var message: String = js.native
  }
  object FormattedLog {
    
    @scala.inline
    def apply(extra: js.Array[js.Object], message: String): FormattedLog = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedLog]
    }
    
    @scala.inline
    implicit class FormattedLogMutableBuilder[Self <: FormattedLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtra(value: js.Array[js.Object]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraVarargs(value: js.Object*): Self = StObject.set(x, "extra", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SentryConfig extends StObject {
    
    var client: js.UndefOr[js.Object | Client] = js.native
  }
  object SentryConfig {
    
    @scala.inline
    def apply(): SentryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryConfig]
    }
    
    @scala.inline
    implicit class SentryConfigMutableBuilder[Self <: SentryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Object | Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    }
  }
}
