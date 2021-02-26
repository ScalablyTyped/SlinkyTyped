package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolScreenCapture extends StObject {
  
  /**
    * Take a screenshot of the current page.
    */
  def screenshot(log_screenshot_data: Boolean): this.type = js.native
  def screenshot(log_screenshot_data: Boolean, callback: js.Function1[/* screenshotEncoded */ String, Unit]): this.type = js.native
}
