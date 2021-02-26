package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.animate
import typingsSlinky.plotlyJs.plotlyJsStrings.relayout
import typingsSlinky.plotlyJs.plotlyJsStrings.restyle
import typingsSlinky.plotlyJs.plotlyJsStrings.skip
import typingsSlinky.plotlyJs.plotlyJsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.SliderStep> */
@js.native
trait PartialSliderStep extends StObject {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var execute: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[animate | relayout | restyle | skip | update] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object PartialSliderStep {
  
  @scala.inline
  def apply(): PartialSliderStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderStep]
  }
  
  @scala.inline
  implicit class PartialSliderStepMutableBuilder[Self <: PartialSliderStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMethod(value: animate | relayout | restyle | skip | update): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
