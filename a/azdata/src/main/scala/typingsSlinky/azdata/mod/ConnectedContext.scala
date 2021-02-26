package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedContext extends StObject {
  
  /**
    * The connection information for the selected object.
    * Note that the connection is not guaranteed to be in a connected
    * state on click.
    */
  var connectionProfile: IConnectionProfile = js.native
}
object ConnectedContext {
  
  @scala.inline
  def apply(connectionProfile: IConnectionProfile): ConnectedContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedContext]
  }
  
  @scala.inline
  implicit class ConnectedContextMutableBuilder[Self <: ConnectedContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionProfile(value: IConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
  }
}
