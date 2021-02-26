package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoboStartingIntent extends StObject {
  
  /** An intent that starts the main launcher activity. */
  var launcherActivity: js.UndefOr[js.Any] = js.native
  
  /** An intent that starts an activity with specific details. */
  var startActivity: js.UndefOr[StartActivityIntent] = js.native
  
  /** Timeout in seconds for each intent. */
  var timeout: js.UndefOr[String] = js.native
}
object RoboStartingIntent {
  
  @scala.inline
  def apply(): RoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboStartingIntent]
  }
  
  @scala.inline
  implicit class RoboStartingIntentMutableBuilder[Self <: RoboStartingIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLauncherActivity(value: js.Any): Self = StObject.set(x, "launcherActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLauncherActivityUndefined: Self = StObject.set(x, "launcherActivity", js.undefined)
    
    @scala.inline
    def setStartActivity(value: StartActivityIntent): Self = StObject.set(x, "startActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartActivityUndefined: Self = StObject.set(x, "startActivity", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
