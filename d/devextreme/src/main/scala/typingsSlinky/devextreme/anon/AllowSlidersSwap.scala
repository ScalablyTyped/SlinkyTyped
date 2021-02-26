package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.onMoving
import typingsSlinky.devextreme.devextremeStrings.onMovingComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowSlidersSwap extends StObject {
  
  var allowSlidersSwap: js.UndefOr[Boolean] = js.native
  
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  var callValueChanged: js.UndefOr[onMoving | onMovingComplete] = js.native
  
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.native
  
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.native
  
  var snapToTicks: js.UndefOr[Boolean] = js.native
}
object AllowSlidersSwap {
  
  @scala.inline
  def apply(): AllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowSlidersSwap]
  }
  
  @scala.inline
  implicit class AllowSlidersSwapMutableBuilder[Self <: AllowSlidersSwap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSlidersSwap(value: Boolean): Self = StObject.set(x, "allowSlidersSwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSlidersSwapUndefined: Self = StObject.set(x, "allowSlidersSwap", js.undefined)
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    @scala.inline
    def setCallValueChanged(value: onMoving | onMovingComplete): Self = StObject.set(x, "callValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallValueChangedUndefined: Self = StObject.set(x, "callValueChanged", js.undefined)
    
    @scala.inline
    def setManualRangeSelectionEnabled(value: Boolean): Self = StObject.set(x, "manualRangeSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRangeSelectionEnabledUndefined: Self = StObject.set(x, "manualRangeSelectionEnabled", js.undefined)
    
    @scala.inline
    def setMoveSelectedRangeByClick(value: Boolean): Self = StObject.set(x, "moveSelectedRangeByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveSelectedRangeByClickUndefined: Self = StObject.set(x, "moveSelectedRangeByClick", js.undefined)
    
    @scala.inline
    def setSnapToTicks(value: Boolean): Self = StObject.set(x, "snapToTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToTicksUndefined: Self = StObject.set(x, "snapToTicks", js.undefined)
  }
}
