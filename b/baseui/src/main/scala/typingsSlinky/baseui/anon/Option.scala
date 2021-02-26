package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  var option: js.UndefOr[typingsSlinky.baseui.selectMod.Option] = js.native
  
  var optionState: Disabled = js.native
}
object Option {
  
  @scala.inline
  def apply(optionState: Disabled): Option = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: typingsSlinky.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionState(value: Disabled): Self = StObject.set(x, "optionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
