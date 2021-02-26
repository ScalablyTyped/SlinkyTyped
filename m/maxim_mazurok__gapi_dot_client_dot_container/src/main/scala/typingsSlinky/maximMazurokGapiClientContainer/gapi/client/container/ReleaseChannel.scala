package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseChannel extends StObject {
  
  /** channel specifies which release channel the cluster is subscribed to. */
  var channel: js.UndefOr[String] = js.native
}
object ReleaseChannel {
  
  @scala.inline
  def apply(): ReleaseChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseChannel]
  }
  
  @scala.inline
  implicit class ReleaseChannelMutableBuilder[Self <: ReleaseChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
