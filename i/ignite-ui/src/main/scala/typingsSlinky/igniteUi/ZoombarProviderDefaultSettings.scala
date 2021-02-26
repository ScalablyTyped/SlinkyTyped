package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoombarProviderDefaultSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Contains the target component's instance
    */
  var targetObject: js.UndefOr[js.Any] = js.native
  
  /**
    * Expects two parameters
    * a jQuery Event to pass as original for Zoombar's own zoomChanged event
    * an object with the following structure:
    * {
    * oldLeft: number,
    * oldWidth: number,
    * newLeft: number,
    * newWdith: number
    * }
    * The values should represent the fractions of the total width of the zoomed component in a number ranging from 0 to 1
    */
  var zoomChangedCallback: js.UndefOr[js.Any] = js.native
}
object ZoombarProviderDefaultSettings {
  
  @scala.inline
  def apply(): ZoombarProviderDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoombarProviderDefaultSettings]
  }
  
  @scala.inline
  implicit class ZoombarProviderDefaultSettingsMutableBuilder[Self <: ZoombarProviderDefaultSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetObject(value: js.Any): Self = StObject.set(x, "targetObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetObjectUndefined: Self = StObject.set(x, "targetObject", js.undefined)
    
    @scala.inline
    def setZoomChangedCallback(value: js.Any): Self = StObject.set(x, "zoomChangedCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomChangedCallbackUndefined: Self = StObject.set(x, "zoomChangedCallback", js.undefined)
  }
}
