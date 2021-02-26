package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.openfinStrings.`load-failed`
import typingsSlinky.openfin.openfinStrings.`load-started`
import typingsSlinky.openfin.openfinStrings.`load-succeeded`
import typingsSlinky.openfin.openfinStrings.failed
import typingsSlinky.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadScriptInfoRunning extends StObject {
  
  var state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded = js.native
}
object PreloadScriptInfoRunning {
  
  @scala.inline
  def apply(state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): PreloadScriptInfoRunning = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfoRunning]
  }
  
  @scala.inline
  implicit class PreloadScriptInfoRunningMutableBuilder[Self <: PreloadScriptInfoRunning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
