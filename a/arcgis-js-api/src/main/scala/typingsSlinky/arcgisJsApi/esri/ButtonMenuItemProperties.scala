package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonMenuItemProperties extends StObject {
  
  /**
    * Indicates whether to automatically close the menu's item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#autoCloseMenu)
    */
  var autoCloseMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that executes on the ButtonMenuItem's `click` event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#clickFunction)
    */
  var clickFunction: js.UndefOr[ButtonMenuItemClickFunction] = js.native
  
  /**
    * Adds a CSS class to the menu button's DOM node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#items)
    */
  var items: js.UndefOr[js.Array[ButtonMenuItemProperties]] = js.native
  
  /**
    * The label of the menu item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#label)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#open)
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the menu item is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selected)
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether a toggled state should be applied to individual menu items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selectionEnabled)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.native
}
object ButtonMenuItemProperties {
  
  @scala.inline
  def apply(): ButtonMenuItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuItemProperties]
  }
  
  @scala.inline
  implicit class ButtonMenuItemPropertiesMutableBuilder[Self <: ButtonMenuItemProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCloseMenu(value: Boolean): Self = StObject.set(x, "autoCloseMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseMenuUndefined: Self = StObject.set(x, "autoCloseMenu", js.undefined)
    
    @scala.inline
    def setClickFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "clickFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickFunctionUndefined: Self = StObject.set(x, "clickFunction", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ButtonMenuItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ButtonMenuItemProperties*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
  }
}
