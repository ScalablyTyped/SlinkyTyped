package typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.RepaintsOnScroll
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.TouchEventHandler
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.WheelEventHandler
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollRect extends StObject {
  
  /**
    * Rectangle itself.
    */
  var rect: Rect = js.native
  
  /**
    * Reason for rectangle to force scrolling on the main thread (ScrollRectType enum)
    */
  var `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler = js.native
}
object ScrollRect {
  
  @scala.inline
  def apply(rect: Rect, `type`: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): ScrollRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRect]
  }
  
  @scala.inline
  implicit class ScrollRectMutableBuilder[Self <: ScrollRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RepaintsOnScroll | TouchEventHandler | WheelEventHandler): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
