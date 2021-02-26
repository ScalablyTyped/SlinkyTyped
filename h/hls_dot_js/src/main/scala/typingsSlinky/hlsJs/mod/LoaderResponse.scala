package typingsSlinky.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderResponse extends StObject {
  
  var data: String | js.typedarray.ArrayBuffer = js.native
  
  var url: String = js.native
}
object LoaderResponse {
  
  @scala.inline
  def apply(data: String | js.typedarray.ArrayBuffer, url: String): LoaderResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderResponse]
  }
  
  @scala.inline
  implicit class LoaderResponseMutableBuilder[Self <: LoaderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
