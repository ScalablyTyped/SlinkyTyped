package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
@js.native
trait ASPxClientRibbonItem extends StObject {
  
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the item value.
    */
  def GetValue(): js.Any = js.native
  
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): Boolean = js.native
  
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: js.Any): Unit = js.native
  
  /**
    * Gets the client group object to which the current item belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
  
  /**
    * Gets or sets the item's index within the collection.
    */
  var index: Double = js.native
  
  /**
    * Gets the name of the current ribbon item.
    */
  var name: String = js.native
  
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
}
object ASPxClientRibbonItem {
  
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetValue: js.Any => Unit,
    group: ASPxClientRibbonGroup,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetValue = js.Any.fromFunction1(SetValue), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonItemMutableBuilder[Self <: ASPxClientRibbonItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroup(value: ASPxClientRibbonGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRibbon(value: ASPxClientRibbon): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
  }
}
