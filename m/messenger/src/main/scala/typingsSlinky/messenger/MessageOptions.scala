package typingsSlinky.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageOptions extends StObject {
  
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[Double] = js.native
  
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[Boolean] = js.native
  
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The text of the message.
    */
  var message: String = js.native
  
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[Boolean] = js.native
  
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MessageOptions {
  
  @scala.inline
  def apply(message: String): MessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideAfter(value: Double): Self = StObject.set(x, "hideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAfterUndefined: Self = StObject.set(x, "hideAfter", js.undefined)
    
    @scala.inline
    def setHideOnNavigate(value: Boolean): Self = StObject.set(x, "hideOnNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnNavigateUndefined: Self = StObject.set(x, "hideOnNavigate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
