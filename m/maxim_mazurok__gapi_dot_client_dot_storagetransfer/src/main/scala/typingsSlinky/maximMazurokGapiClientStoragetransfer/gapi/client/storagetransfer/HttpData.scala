package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpData extends StObject {
  
  /** Required. The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported. */
  var listUrl: js.UndefOr[String] = js.native
}
object HttpData {
  
  @scala.inline
  def apply(): HttpData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpData]
  }
  
  @scala.inline
  implicit class HttpDataMutableBuilder[Self <: HttpData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListUrl(value: String): Self = StObject.set(x, "listUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUrlUndefined: Self = StObject.set(x, "listUrl", js.undefined)
  }
}
