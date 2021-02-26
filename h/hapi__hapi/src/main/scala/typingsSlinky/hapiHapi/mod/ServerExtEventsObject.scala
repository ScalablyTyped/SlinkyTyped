package typingsSlinky.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerExtEventsObject extends StObject {
  
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: ServerExtPointFunction | js.Array[ServerExtPointFunction] = js.native
  
  var options: js.UndefOr[ServerExtOptions] = js.native
  
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    */
  var `type`: ServerExtType = js.native
}
object ServerExtEventsObject {
  
  @scala.inline
  def apply(method: ServerExtPointFunction | js.Array[ServerExtPointFunction], `type`: ServerExtType): ServerExtEventsObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtEventsObject]
  }
  
  @scala.inline
  implicit class ServerExtEventsObjectMutableBuilder[Self <: ServerExtEventsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: ServerExtPointFunction | js.Array[ServerExtPointFunction]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodFunction1(value: /* server */ Server_ => Unit): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethodVarargs(value: ServerExtPointFunction*): Self = StObject.set(x, "method", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setType(value: ServerExtType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
