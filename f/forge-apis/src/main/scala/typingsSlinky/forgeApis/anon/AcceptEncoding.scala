package typingsSlinky.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptEncoding extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.native
  
  var ifModifiedSince: js.UndefOr[js.Date] = js.native
}
object AcceptEncoding {
  
  @scala.inline
  def apply(): AcceptEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptEncoding]
  }
  
  @scala.inline
  implicit class AcceptEncodingMutableBuilder[Self <: AcceptEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: js.Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
  }
}
