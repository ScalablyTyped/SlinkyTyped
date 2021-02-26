package typingsSlinky.baseui.datepickerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerState extends StObject {
  
  var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
}
object ContainerState {
  
  @scala.inline
  def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
