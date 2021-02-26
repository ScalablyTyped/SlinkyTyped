package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
@js.native
trait ASPxClientPopupWindow extends StObject {
  
  /**
    * Returns the URL pointing to the image displayed within the window footer.
    */
  def GetFooterImageUrl(): String = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    */
  def GetFooterNavigateUrl(): String = js.native
  
  /**
    * Returns the text displayed within the popup window's footer.
    */
  def GetFooterText(): String = js.native
  
  /**
    * Returns the URL pointing to the image displayed within the window header.
    */
  def GetHeaderImageUrl(): String = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    */
  def GetHeaderNavigateUrl(): String = js.native
  
  /**
    * Returns the text displayed within the window's header.
    */
  def GetHeaderText(): String = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the window footer.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit = js.native
  
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the window's footer.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit = js.native
  
  /**
    * Specifies the URL which points to the image displayed within the window header.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit = js.native
  
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit = js.native
  
  /**
    * Specifies the text displayed within the window's header.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit = js.native
  
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double = js.native
  
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String = js.native
  
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl = js.native
}
object ASPxClientPopupWindow {
  
  @scala.inline
  def apply(
    GetFooterImageUrl: () => String,
    GetFooterNavigateUrl: () => String,
    GetFooterText: () => String,
    GetHeaderImageUrl: () => String,
    GetHeaderNavigateUrl: () => String,
    GetHeaderText: () => String,
    SetFooterImageUrl: String => Unit,
    SetFooterNavigateUrl: String => Unit,
    SetFooterText: String => Unit,
    SetHeaderImageUrl: String => Unit,
    SetHeaderNavigateUrl: String => Unit,
    SetHeaderText: String => Unit,
    index: Double,
    name: String,
    popupControl: ASPxClientPopupControl
  ): ASPxClientPopupWindow = {
    val __obj = js.Dynamic.literal(GetFooterImageUrl = js.Any.fromFunction0(GetFooterImageUrl), GetFooterNavigateUrl = js.Any.fromFunction0(GetFooterNavigateUrl), GetFooterText = js.Any.fromFunction0(GetFooterText), GetHeaderImageUrl = js.Any.fromFunction0(GetHeaderImageUrl), GetHeaderNavigateUrl = js.Any.fromFunction0(GetHeaderNavigateUrl), GetHeaderText = js.Any.fromFunction0(GetHeaderText), SetFooterImageUrl = js.Any.fromFunction1(SetFooterImageUrl), SetFooterNavigateUrl = js.Any.fromFunction1(SetFooterNavigateUrl), SetFooterText = js.Any.fromFunction1(SetFooterText), SetHeaderImageUrl = js.Any.fromFunction1(SetHeaderImageUrl), SetHeaderNavigateUrl = js.Any.fromFunction1(SetHeaderNavigateUrl), SetHeaderText = js.Any.fromFunction1(SetHeaderText), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindow]
  }
  
  @scala.inline
  implicit class ASPxClientPopupWindowMutableBuilder[Self <: ASPxClientPopupWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFooterImageUrl(value: () => String): Self = StObject.set(x, "GetFooterImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooterNavigateUrl(value: () => String): Self = StObject.set(x, "GetFooterNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFooterText(value: () => String): Self = StObject.set(x, "GetFooterText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderImageUrl(value: () => String): Self = StObject.set(x, "GetHeaderImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderNavigateUrl(value: () => String): Self = StObject.set(x, "GetHeaderNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderText(value: () => String): Self = StObject.set(x, "GetHeaderText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupControl(value: ASPxClientPopupControl): Self = StObject.set(x, "popupControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFooterImageUrl(value: String => Unit): Self = StObject.set(x, "SetFooterImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFooterNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetFooterNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFooterText(value: String => Unit): Self = StObject.set(x, "SetFooterText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderImageUrl(value: String => Unit): Self = StObject.set(x, "SetHeaderImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetHeaderNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderText(value: String => Unit): Self = StObject.set(x, "SetHeaderText", js.Any.fromFunction1(value))
  }
}
