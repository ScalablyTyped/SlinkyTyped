package typingsSlinky.baseui.selectMod

import typingsSlinky.baseui.baseuiStrings.clear
import typingsSlinky.baseui.baseuiStrings.remove
import typingsSlinky.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeParams extends StObject {
  
  var option: js.UndefOr[Option] = js.native
  
  var `type`: js.UndefOr[select | remove | clear] = js.native
  
  var value: Value = js.native
}
object OnChangeParams {
  
  @scala.inline
  def apply(value: Value): OnChangeParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  
  @scala.inline
  implicit class OnChangeParamsMutableBuilder[Self <: OnChangeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setType(value: select | remove | clear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
