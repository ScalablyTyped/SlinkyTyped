package typingsSlinky.antd.anon

import typingsSlinky.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Warning extends StObject {
  
  var error: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var info: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var success: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var warning: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
}
object Warning {
  
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[PickAntdIconPropschildren],
    info: ForwardRefExoticComponent[PickAntdIconPropschildren],
    success: ForwardRefExoticComponent[PickAntdIconPropschildren],
    warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
  ): Warning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
