package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreconnectOptions extends StObject {
  
  /**
    * number of sockets to preconnect. Must be between 1 and 6. Defaults to 1.
    */
  var numSockets: js.UndefOr[Double] = js.native
  
  /**
    * URL for preconnect. Only the origin is relevant for opening the socket.
    */
  var url: String = js.native
}
object PreconnectOptions {
  
  @scala.inline
  def apply(url: String): PreconnectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconnectOptions]
  }
  
  @scala.inline
  implicit class PreconnectOptionsMutableBuilder[Self <: PreconnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumSockets(value: Double): Self = StObject.set(x, "numSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSocketsUndefined: Self = StObject.set(x, "numSockets", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
