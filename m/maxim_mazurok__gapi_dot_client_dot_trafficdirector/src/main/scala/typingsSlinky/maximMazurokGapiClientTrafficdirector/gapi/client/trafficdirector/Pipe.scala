package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipe extends StObject {
  
  /** The mode for the Pipe. Not applicable for abstract sockets. */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * Unix Domain Socket path. On Linux, paths starting with '@' will use the abstract namespace. The starting '@' is replaced by a null byte by Envoy. Paths starting with '@' will result
    * in an error in environments other than Linux.
    */
  var path: js.UndefOr[String] = js.native
}
object Pipe {
  
  @scala.inline
  def apply(): Pipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipe]
  }
  
  @scala.inline
  implicit class PipeMutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
