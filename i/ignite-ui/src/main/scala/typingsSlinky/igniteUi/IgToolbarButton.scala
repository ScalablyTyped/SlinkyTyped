package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgToolbarButton
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activated: js.UndefOr[ActivatedEvent] = js.native
  
  /**
    * Event fired before the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activating: js.UndefOr[ActivatingEvent] = js.native
  
  /**
    * Enable/Disable the "Toggling" of a button.
    *
    */
  var allowToggling: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.native
  
  /**
    * Event fired before the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.native
  
  /**
    * Get/Set whether the toolbar button is selected.
    *
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}
object IgToolbarButton {
  
  @scala.inline
  def apply(): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarButton]
  }
  
  @scala.inline
  implicit class IgToolbarButtonMutableBuilder[Self <: IgToolbarButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivated(value: (/* event */ Event, /* ui */ ActivatedEventUIParam) => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    @scala.inline
    def setActivating(value: (/* event */ Event, /* ui */ ActivatingEventUIParam) => Unit): Self = StObject.set(x, "activating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivatingUndefined: Self = StObject.set(x, "activating", js.undefined)
    
    @scala.inline
    def setAllowToggling(value: Boolean): Self = StObject.set(x, "allowToggling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTogglingUndefined: Self = StObject.set(x, "allowToggling", js.undefined)
    
    @scala.inline
    def setDeactivated(value: (/* event */ Event, /* ui */ DeactivatedEventUIParam) => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    @scala.inline
    def setDeactivating(value: (/* event */ Event, /* ui */ DeactivatingEventUIParam) => Unit): Self = StObject.set(x, "deactivating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivatingUndefined: Self = StObject.set(x, "deactivating", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
  }
}
