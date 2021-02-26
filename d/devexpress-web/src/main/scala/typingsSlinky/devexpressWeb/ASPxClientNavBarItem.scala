package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
@js.native
trait ASPxClientNavBarItem extends StObject {
  
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): String = js.native
  
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): String = js.native
  
  /**
    * Returns text displayed within the item.
    */
  def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): Boolean = js.native
  
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: String): Unit = js.native
  
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
  
  /**
    * Gets the group to which the current item belongs.
    */
  var group: ASPxClientNavBarGroup = js.native
  
  /**
    * Gets the item's index within a collection of a group's items.
    */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the item.
    */
  var name: String = js.native
  
  /**
    * Gets the navbar to which the current item belongs.
    */
  var navBar: ASPxClientNavBar = js.native
}
object ASPxClientNavBarItem {
  
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    group: ASPxClientNavBarGroup,
    index: Double,
    name: String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItem]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarItemMutableBuilder[Self <: ASPxClientNavBarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "GetNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroup(value: ASPxClientNavBarGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBar(value: ASPxClientNavBar): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
