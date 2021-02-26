package typingsSlinky.materialUi.MaterialUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactLink is from "react/addons"
@js.native
trait ReactLink[T] extends StObject {
  
  def requestChange(newValue: T): Unit = js.native
  
  var value: T = js.native
}
object ReactLink {
  
  @scala.inline
  def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
  
  @scala.inline
  implicit class ReactLinkMutableBuilder[Self <: ReactLink[_], T] (val x: Self with ReactLink[T]) extends AnyVal {
    
    @scala.inline
    def setRequestChange(value: T => Unit): Self = StObject.set(x, "requestChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
