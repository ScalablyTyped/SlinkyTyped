package typingsSlinky.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadObjectOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object HeadObjectOptions {
  
  @scala.inline
  def apply(): HeadObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadObjectOptions]
  }
  
  @scala.inline
  implicit class HeadObjectOptionsMutableBuilder[Self <: HeadObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
