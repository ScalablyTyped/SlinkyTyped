package typingsSlinky.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForcePort extends StObject {
  
  var forcePort: Boolean = js.native
}
object ForcePort {
  
  @scala.inline
  def apply(forcePort: Boolean): ForcePort = {
    val __obj = js.Dynamic.literal(forcePort = forcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePort]
  }
  
  @scala.inline
  implicit class ForcePortMutableBuilder[Self <: ForcePort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForcePort(value: Boolean): Self = StObject.set(x, "forcePort", value.asInstanceOf[js.Any])
  }
}
