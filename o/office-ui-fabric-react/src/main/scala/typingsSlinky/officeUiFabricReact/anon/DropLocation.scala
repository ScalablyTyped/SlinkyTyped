package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropLocation extends StObject {
  
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.native
}
object DropLocation {
  
  @scala.inline
  def apply(): DropLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropLocation]
  }
  
  @scala.inline
  implicit class DropLocationMutableBuilder[Self <: DropLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropLocation(value: ColumnDragEndLocation): Self = StObject.set(x, "dropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLocationUndefined: Self = StObject.set(x, "dropLocation", js.undefined)
  }
}
