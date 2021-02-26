package typingsSlinky.onesignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var plugins: CordovaPlugins = js.native
}
object Window {
  
  @scala.inline
  def apply(plugins: CordovaPlugins): Window = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlugins(value: CordovaPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
