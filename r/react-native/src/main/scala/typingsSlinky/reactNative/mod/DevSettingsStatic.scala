package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevSettingsStatic extends NativeEventEmitter {
  
  /**
    * Adds a custom menu item to the developer menu.
    *
    * @param title - The title of the menu item. Is internally used as id and should therefore be unique.
    * @param handler - The callback invoked when pressing the menu item.
    */
  def addMenuItem(title: String, handler: js.Function0[_]): Unit = js.native
  
  /**
    * Reload the application.
    *
    * @param reason
    */
  def reload(): Unit = js.native
  def reload(reason: String): Unit = js.native
}
