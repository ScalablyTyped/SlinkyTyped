package typingsSlinky.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuploadParams extends StObject {
  
  var name: js.Any = js.native
  
  var ruploadParams: js.Any = js.native
  
  var waterfallId: js.Any = js.native
}
object RuploadParams {
  
  @scala.inline
  def apply(name: js.Any, ruploadParams: js.Any, waterfallId: js.Any): RuploadParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ruploadParams = ruploadParams.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuploadParams]
  }
  
  @scala.inline
  implicit class RuploadParamsMutableBuilder[Self <: RuploadParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallId(value: js.Any): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
  }
}
