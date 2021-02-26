package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetSearchApplicationRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
}
object ResetSearchApplicationRequest {
  
  @scala.inline
  def apply(): ResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetSearchApplicationRequest]
  }
  
  @scala.inline
  implicit class ResetSearchApplicationRequestMutableBuilder[Self <: ResetSearchApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
  }
}
