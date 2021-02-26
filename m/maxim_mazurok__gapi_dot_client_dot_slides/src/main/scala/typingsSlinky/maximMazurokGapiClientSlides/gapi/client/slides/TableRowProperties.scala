package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowProperties extends StObject {
  
  /** Minimum height of the row. The row will be rendered in the Slides editor at a height equal to or greater than this value in order to show all the text in the row's cell(s). */
  var minRowHeight: js.UndefOr[Dimension] = js.native
}
object TableRowProperties {
  
  @scala.inline
  def apply(): TableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProperties]
  }
  
  @scala.inline
  implicit class TableRowPropertiesMutableBuilder[Self <: TableRowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
  }
}
