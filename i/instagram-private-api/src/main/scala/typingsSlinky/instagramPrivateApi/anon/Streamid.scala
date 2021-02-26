package typingsSlinky.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Streamid extends StObject {
  
  var stream_id: String = js.native
}
object Streamid {
  
  @scala.inline
  def apply(stream_id: String): Streamid = {
    val __obj = js.Dynamic.literal(stream_id = stream_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Streamid]
  }
  
  @scala.inline
  implicit class StreamidMutableBuilder[Self <: Streamid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream_id(value: String): Self = StObject.set(x, "stream_id", value.asInstanceOf[js.Any])
  }
}
