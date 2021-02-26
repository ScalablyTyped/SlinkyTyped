package typingsSlinky.igniteUi

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the grid's table body.
    */
  var tbody: js.UndefOr[Element] = js.native
}
object RowsRenderedEventUIParam {
  
  @scala.inline
  def apply(): RowsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class RowsRenderedEventUIParamMutableBuilder[Self <: RowsRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTbody(value: Element): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
  }
}
