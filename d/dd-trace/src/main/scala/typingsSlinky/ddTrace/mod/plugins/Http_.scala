package typingsSlinky.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait Http_ extends Instrumentation {
  
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
  
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ Double, Boolean]] = js.native
  
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
}
object Http_ {
  
  @scala.inline
  def apply(): Http_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http_]
  }
  
  @scala.inline
  implicit class Http_MutableBuilder[Self <: Http_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlacklist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlacklistRegExp(value: js.RegExp): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setValidateStatus(value: /* code */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    
    @scala.inline
    def setWhitelist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelistRegExp(value: js.RegExp): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
