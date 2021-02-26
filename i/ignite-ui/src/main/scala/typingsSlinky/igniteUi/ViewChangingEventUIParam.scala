package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the currently selected view.
    */
  var currentSelectedView: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the newly selected view.
    */
  var newSelectedView: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ViewChangingEventUIParam {
  
  @scala.inline
  def apply(): ViewChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ViewChangingEventUIParamMutableBuilder[Self <: ViewChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSelectedView(value: String): Self = StObject.set(x, "currentSelectedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelectedViewUndefined: Self = StObject.set(x, "currentSelectedView", js.undefined)
    
    @scala.inline
    def setNewSelectedView(value: String): Self = StObject.set(x, "newSelectedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSelectedViewUndefined: Self = StObject.set(x, "newSelectedView", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
