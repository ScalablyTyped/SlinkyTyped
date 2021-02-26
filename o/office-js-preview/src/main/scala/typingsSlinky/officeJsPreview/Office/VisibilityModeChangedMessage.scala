package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message used in the `onVisibilityModeChanged` invocation.
  */
@js.native
trait VisibilityModeChangedMessage extends StObject {
  
  /**
    * Visibility changed state.
    */
  var visibilityMode: VisibilityMode = js.native
}
object VisibilityModeChangedMessage {
  
  @scala.inline
  def apply(visibilityMode: VisibilityMode): VisibilityModeChangedMessage = {
    val __obj = js.Dynamic.literal(visibilityMode = visibilityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityModeChangedMessage]
  }
  
  @scala.inline
  implicit class VisibilityModeChangedMessageMutableBuilder[Self <: VisibilityModeChangedMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibilityMode(value: VisibilityMode): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
  }
}
