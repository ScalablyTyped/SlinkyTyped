package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowingEventUIParam extends StObject {
  
  /**
    * Gets or set the content to be shown as a string.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Gets the element the popover will show for.
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the %%WidgetName%% widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the popover element showing.
    */
  var popover: js.UndefOr[String] = js.native
}
object ShowingEventUIParam {
  
  @scala.inline
  def apply(): ShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowingEventUIParam]
  }
  
  @scala.inline
  implicit class ShowingEventUIParamMutableBuilder[Self <: ShowingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPopover(value: String): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
  }
}
