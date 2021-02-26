package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedNodes extends StObject {
  
  /** Whether Shielded Nodes features are enabled on all nodes in this cluster. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object ShieldedNodes {
  
  @scala.inline
  def apply(): ShieldedNodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedNodes]
  }
  
  @scala.inline
  implicit class ShieldedNodesMutableBuilder[Self <: ShieldedNodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
