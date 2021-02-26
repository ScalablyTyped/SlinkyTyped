package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetRemovedEvent extends StObject {
  
  /**
    * Identifier of the removed stylesheet.
    */
  var styleSheetId: StyleSheetId = js.native
}
object StyleSheetRemovedEvent {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId): StyleSheetRemovedEvent = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetRemovedEvent]
  }
  
  @scala.inline
  implicit class StyleSheetRemovedEventMutableBuilder[Self <: StyleSheetRemovedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
