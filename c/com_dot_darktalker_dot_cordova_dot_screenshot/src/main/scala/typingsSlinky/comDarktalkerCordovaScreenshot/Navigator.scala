package typingsSlinky.comDarktalkerCordovaScreenshot

import typingsSlinky.comDarktalkerCordovaScreenshot.com_.darktalker.cordova.screenshot.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  var screenshot: Plugin = js.native
}
object Navigator {
  
  @scala.inline
  def apply(screenshot: Plugin): Navigator = {
    val __obj = js.Dynamic.literal(screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreenshot(value: Plugin): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
  }
}
