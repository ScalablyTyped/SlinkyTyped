package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.animate
import typingsSlinky.plotlyJs.plotlyJsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderStep extends StObject {
  
  /**
    * Sets the arguments values to be passed to the Plotly
    * method set in `method` on slide.
    */
  var args: js.Array[_] = js.native
  
  /**
    * When true, the API method is executed. When false, all other behaviors are the same
    * and command execution is skipped. This may be useful when hooking into, for example,
    * the `plotly_sliderchange` method and executing the API command manually without losing
    * the benefit of the slider automatically binding to the state of the plot through the
    * specification of `method` and `args`.
    */
  var execute: Boolean = js.native
  
  /**
    * Sets the text label to appear on the slider
    */
  var label: String = js.native
  
  /**
    * Sets the Plotly method to be called when the slider value is changed.
    * If the `skip` method is used, the API slider will function as normal
    * but will perform no API calls and will not bind automatically to state
    * updates. This may be used to create a component interface and attach to
    * slider events manually via JavaScript.
    */
  var method: animate | typingsSlinky.plotlyJs.plotlyJsStrings.relayout | typingsSlinky.plotlyJs.plotlyJsStrings.restyle | skip | typingsSlinky.plotlyJs.plotlyJsStrings.update = js.native
  
  /**
    * Sets the value of the slider step, used to refer to the step programatically.
    * Defaults to the slider label if not provided.
    */
  var value: String = js.native
  
  /**
    * Determines whether or not this step is included in the slider.
    */
  var visible: Boolean = js.native
}
object SliderStep {
  
  @scala.inline
  def apply(
    args: js.Array[_],
    execute: Boolean,
    label: String,
    method: animate | typingsSlinky.plotlyJs.plotlyJsStrings.relayout | typingsSlinky.plotlyJs.plotlyJsStrings.restyle | skip | typingsSlinky.plotlyJs.plotlyJsStrings.update,
    value: String,
    visible: Boolean
  ): SliderStep = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStep]
  }
  
  @scala.inline
  implicit class SliderStepMutableBuilder[Self <: SliderStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(
      value: animate | typingsSlinky.plotlyJs.plotlyJsStrings.relayout | typingsSlinky.plotlyJs.plotlyJsStrings.restyle | skip | typingsSlinky.plotlyJs.plotlyJsStrings.update
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
