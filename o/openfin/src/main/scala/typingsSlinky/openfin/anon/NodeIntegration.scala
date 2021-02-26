package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeIntegration extends StObject {
  
  var nodeIntegration: Boolean = js.native
  
  var plugins: Boolean = js.native
}
object NodeIntegration {
  
  @scala.inline
  def apply(nodeIntegration: Boolean, plugins: Boolean): NodeIntegration = {
    val __obj = js.Dynamic.literal(nodeIntegration = nodeIntegration.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIntegration]
  }
  
  @scala.inline
  implicit class NodeIntegrationMutableBuilder[Self <: NodeIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIntegration(value: Boolean): Self = StObject.set(x, "nodeIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
