package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupExpandingEventUIParam extends StObject {
  
  /**
    * Gets the column object for the current group that is expanding.
    */
  var column: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the jQuery object for the column being expanded (th).
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object GroupExpandingEventUIParam {
  
  @scala.inline
  def apply(): GroupExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandingEventUIParam]
  }
  
  @scala.inline
  implicit class GroupExpandingEventUIParamMutableBuilder[Self <: GroupExpandingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
