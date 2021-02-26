package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.app.ChromeAppWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofapp extends StObject {
  
  /**
    * @enum
    * @internal
    * @private
    */
  val _State: FULLSCREEN = js.native
  
  // #endregion
  // #region chrome.app.*
  /////////////////
  // App Runtime //
  /////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.runtime API to manage the app lifecycle.
    * The app runtime manages app installation, controls the event page,
    * and can shut down the app at anytime.
    */
  val runtime: Typeofruntime = js.native
  
  val window: ChromeAppWindow = js.native
}
object Typeofapp {
  
  @scala.inline
  def apply(_State: FULLSCREEN, runtime: Typeofruntime, window: ChromeAppWindow): Typeofapp = {
    val __obj = js.Dynamic.literal(_State = _State.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofapp]
  }
  
  @scala.inline
  implicit class TypeofappMutableBuilder[Self <: Typeofapp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuntime(value: Typeofruntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: ChromeAppWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_State(value: FULLSCREEN): Self = StObject.set(x, "_State", value.asInstanceOf[js.Any])
  }
}
