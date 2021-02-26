package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Resource class.
  */
@js.native
trait ASPxClientResource extends StObject {
  
  /**
    * Returns the resource's caption.
    */
  def GetCaption(): String = js.native
  
  /**
    * Gets the resource's color.
    */
  def GetColor(): String = js.native
  
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String = js.native
  
  /**
    * Returns the resource's caption.
    */
  var caption: String = js.native
  
  /**
    * Gets the resource's color.
    */
  var color: String = js.native
  
  /**
    * Gets the resource ID.
    */
  var resourceId: String = js.native
}
object ASPxClientResource {
  
  @scala.inline
  def apply(
    GetCaption: () => String,
    GetColor: () => String,
    GetId: () => String,
    caption: String,
    color: String,
    resourceId: String
  ): ASPxClientResource = {
    val __obj = js.Dynamic.literal(GetCaption = js.Any.fromFunction0(GetCaption), GetColor = js.Any.fromFunction0(GetColor), GetId = js.Any.fromFunction0(GetId), caption = caption.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientResource]
  }
  
  @scala.inline
  implicit class ASPxClientResourceMutableBuilder[Self <: ASPxClientResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCaption(value: () => String): Self = StObject.set(x, "GetCaption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColor(value: () => String): Self = StObject.set(x, "GetColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "GetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
