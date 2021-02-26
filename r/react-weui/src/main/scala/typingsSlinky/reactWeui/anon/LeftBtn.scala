package typingsSlinky.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftBtn extends StObject {
  
  var leftBtn: String = js.native
  
  var rightBtn: String = js.native
}
object LeftBtn {
  
  @scala.inline
  def apply(leftBtn: String, rightBtn: String): LeftBtn = {
    val __obj = js.Dynamic.literal(leftBtn = leftBtn.asInstanceOf[js.Any], rightBtn = rightBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftBtn]
  }
  
  @scala.inline
  implicit class LeftBtnMutableBuilder[Self <: LeftBtn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftBtn(value: String): Self = StObject.set(x, "leftBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBtn(value: String): Self = StObject.set(x, "rightBtn", value.asInstanceOf[js.Any])
  }
}
