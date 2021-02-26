package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Left extends StObject {
  
  var left: typingsSlinky.baseui.baseuiNumbers.`0` = js.native
  
  var top: typingsSlinky.baseui.baseuiNumbers.`0` = js.native
}
object Left {
  
  @scala.inline
  def apply(left: typingsSlinky.baseui.baseuiNumbers.`0`, top: typingsSlinky.baseui.baseuiNumbers.`0`): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: typingsSlinky.baseui.baseuiNumbers.`0`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: typingsSlinky.baseui.baseuiNumbers.`0`): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
