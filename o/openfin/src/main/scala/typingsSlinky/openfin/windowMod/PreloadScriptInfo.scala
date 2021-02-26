package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.openfinStrings.`load-failed`
import typingsSlinky.openfin.openfinStrings.failed
import typingsSlinky.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadScriptInfo extends StObject {
  
  var state: `load-failed` | failed | succeeded = js.native
}
object PreloadScriptInfo {
  
  @scala.inline
  def apply(state: `load-failed` | failed | succeeded): PreloadScriptInfo = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfo]
  }
  
  @scala.inline
  implicit class PreloadScriptInfoMutableBuilder[Self <: PreloadScriptInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: `load-failed` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
