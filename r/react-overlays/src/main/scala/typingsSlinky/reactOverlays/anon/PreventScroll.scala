package typingsSlinky.reactOverlays.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreventScroll extends StObject {
  
  var preventScroll: Boolean = js.native
}
object PreventScroll {
  
  @scala.inline
  def apply(preventScroll: Boolean): PreventScroll = {
    val __obj = js.Dynamic.literal(preventScroll = preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventScroll]
  }
  
  @scala.inline
  implicit class PreventScrollMutableBuilder[Self <: PreventScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
  }
}
