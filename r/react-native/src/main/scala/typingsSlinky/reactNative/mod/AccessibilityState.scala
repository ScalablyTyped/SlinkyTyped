package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityState extends StObject {
  
  /**
    *  When present, informs accessible tools if the element is busy
    */
  var busy: js.UndefOr[Boolean] = js.native
  
  /**
    * For items like Checkboxes and Toggle switches, reports their state to accessible tools
    */
  var checked: js.UndefOr[Boolean | mixed] = js.native
  
  /**
    * When true, informs accessible tools if the element is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  When present, informs accessible tools the element is expanded or collapsed
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, informs accessible tools if the element is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
}
object AccessibilityState {
  
  @scala.inline
  def apply(): AccessibilityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityState]
  }
  
  @scala.inline
  implicit class AccessibilityStateMutableBuilder[Self <: AccessibilityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean | mixed): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
