package typingsSlinky.angularDesktopNotification

import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied
import typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default extends StObject {
    
    var default: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.default = js.native
    
    var denied: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.denied = js.native
    
    var granted: typingsSlinky.angularDesktopNotification.angularDesktopNotificationStrings.granted = js.native
  }
  object Default {
    
    @scala.inline
    def apply(default: default, denied: denied, granted: granted): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: default): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenied(value: denied): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranted(value: granted): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    }
  }
}
