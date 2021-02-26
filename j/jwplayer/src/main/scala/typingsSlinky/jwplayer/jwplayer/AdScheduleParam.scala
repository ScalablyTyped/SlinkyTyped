package typingsSlinky.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdScheduleParam extends StObject {
  
  var adbreaks: js.Array[js.Object] = js.native
  
  var client: String = js.native
  
  var tag: String = js.native
}
object AdScheduleParam {
  
  @scala.inline
  def apply(adbreaks: js.Array[js.Object], client: String, tag: String): AdScheduleParam = {
    val __obj = js.Dynamic.literal(adbreaks = adbreaks.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdScheduleParam]
  }
  
  @scala.inline
  implicit class AdScheduleParamMutableBuilder[Self <: AdScheduleParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdbreaks(value: js.Array[js.Object]): Self = StObject.set(x, "adbreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdbreaksVarargs(value: js.Object*): Self = StObject.set(x, "adbreaks", js.Array(value :_*))
    
    @scala.inline
    def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
