package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.stepper.StepOptions
import typingsSlinky.kendoUi.kendoUiStrings.horizontal
import typingsSlinky.kendoUi.kendoUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ StepperActivateEvent, Unit]] = js.native
  
  var indicator: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[Boolean] = js.native
  
  var linear: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String | horizontal | vertical] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ StepperSelectEvent, Unit]] = js.native
  
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  
  var steps: js.Array[StepOptions | String] = js.native
}
object StepperOptions {
  
  @scala.inline
  def apply(steps: js.Array[StepOptions | String]): StepperOptions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
  
  @scala.inline
  implicit class StepperOptionsMutableBuilder[Self <: StepperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: /* e */ StepperActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String | horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ StepperSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[StepOptions | String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: (StepOptions | String)*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
