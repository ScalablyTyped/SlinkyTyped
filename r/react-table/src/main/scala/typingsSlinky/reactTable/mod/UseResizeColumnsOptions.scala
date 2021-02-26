package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseResizeColumnsOptions[D /* <: js.Object */] extends StObject {
  
  var disableResizing: js.UndefOr[Boolean] = js.native
}
object UseResizeColumnsOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseResizeColumnsOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsOptions[D]]
  }
  
  @scala.inline
  implicit class UseResizeColumnsOptionsMutableBuilder[Self <: UseResizeColumnsOptions[_], D /* <: js.Object */] (val x: Self with UseResizeColumnsOptions[D]) extends AnyVal {
    
    @scala.inline
    def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
  }
}
