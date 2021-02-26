package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionOption extends StObject {
  
  var option: typingsSlinky.baseui.selectMod.Option = js.native
}
object OptionOption {
  
  @scala.inline
  def apply(option: typingsSlinky.baseui.selectMod.Option): OptionOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionOption]
  }
  
  @scala.inline
  implicit class OptionOptionMutableBuilder[Self <: OptionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: typingsSlinky.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
