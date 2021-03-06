package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellBorder extends StObject {
  
  /** The color of the border. This color cannot be transparent. */
  var color: js.UndefOr[OptionalColor] = js.native
  
  /** The dash style of the border. */
  var dashStyle: js.UndefOr[String] = js.native
  
  /** The width of the border. */
  var width: js.UndefOr[Dimension] = js.native
}
object TableCellBorder {
  
  @scala.inline
  def apply(): TableCellBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellBorder]
  }
  
  @scala.inline
  implicit class TableCellBorderMutableBuilder[Self <: TableCellBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
