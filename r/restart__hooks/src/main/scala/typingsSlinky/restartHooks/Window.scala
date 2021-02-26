package typingsSlinky.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var ResizeObserver: typingsSlinky.restartHooks.ResizeObserver = js.native
}
object Window {
  
  @scala.inline
  def apply(ResizeObserver: ResizeObserver): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResizeObserver(value: ResizeObserver): Self = StObject.set(x, "ResizeObserver", value.asInstanceOf[js.Any])
  }
}
