package typingsSlinky.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridHeaderFilter extends StObject {
  
  var `type`: String = js.native
}
object GridHeaderFilter {
  
  @scala.inline
  def apply(`type`: String): GridHeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridHeaderFilter]
  }
  
  @scala.inline
  implicit class GridHeaderFilterMutableBuilder[Self <: GridHeaderFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
