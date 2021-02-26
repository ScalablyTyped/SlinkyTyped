package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptionsModel extends StObject {
  
  /** The position about which to zoom. */
  var position: Position = js.native
}
object ZoomOptionsModel {
  
  @scala.inline
  def apply(position: Position): ZoomOptionsModel = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsModel]
  }
  
  @scala.inline
  implicit class ZoomOptionsModelMutableBuilder[Self <: ZoomOptionsModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
