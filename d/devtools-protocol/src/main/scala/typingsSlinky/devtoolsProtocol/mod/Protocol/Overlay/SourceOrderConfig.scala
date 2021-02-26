package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceOrderConfig extends StObject {
  
  /**
    * the color to outline the child elements in.
    */
  var childOutlineColor: RGBA = js.native
  
  /**
    * the color to outline the givent element in.
    */
  var parentOutlineColor: RGBA = js.native
}
object SourceOrderConfig {
  
  @scala.inline
  def apply(childOutlineColor: RGBA, parentOutlineColor: RGBA): SourceOrderConfig = {
    val __obj = js.Dynamic.literal(childOutlineColor = childOutlineColor.asInstanceOf[js.Any], parentOutlineColor = parentOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOrderConfig]
  }
  
  @scala.inline
  implicit class SourceOrderConfigMutableBuilder[Self <: SourceOrderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildOutlineColor(value: RGBA): Self = StObject.set(x, "childOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOutlineColor(value: RGBA): Self = StObject.set(x, "parentOutlineColor", value.asInstanceOf[js.Any])
  }
}
