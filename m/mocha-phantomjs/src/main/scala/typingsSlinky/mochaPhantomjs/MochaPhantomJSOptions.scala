package typingsSlinky.mochaPhantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MochaPhantomJSOptions extends StObject {
  
  var cookies: js.UndefOr[js.Array[_]] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var viewportSize: js.UndefOr[Double] = js.native
}
object MochaPhantomJSOptions {
  
  @scala.inline
  def apply(): MochaPhantomJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaPhantomJSOptions]
  }
  
  @scala.inline
  implicit class MochaPhantomJSOptionsMutableBuilder[Self <: MochaPhantomJSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: js.Array[_]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    @scala.inline
    def setCookiesVarargs(value: js.Any*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setViewportSize(value: Double): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
  }
}
