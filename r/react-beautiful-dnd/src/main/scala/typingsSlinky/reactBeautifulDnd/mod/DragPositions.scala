package typingsSlinky.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragPositions extends StObject {
  
  var client: ClientPositions = js.native
  
  var page: PagePositions = js.native
}
object DragPositions {
  
  @scala.inline
  def apply(client: ClientPositions, page: PagePositions): DragPositions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPositions]
  }
  
  @scala.inline
  implicit class DragPositionsMutableBuilder[Self <: DragPositions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: ClientPositions): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: PagePositions): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
