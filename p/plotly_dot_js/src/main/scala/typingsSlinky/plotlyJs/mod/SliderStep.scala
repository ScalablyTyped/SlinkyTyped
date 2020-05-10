package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.animate
import typingsSlinky.plotlyJs.plotlyJsStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderStep extends js.Object {
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
  implicit class SliderStepOps[Self <: SliderStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(
      value: animate | typingsSlinky.plotlyJs.plotlyJsStrings.relayout | typingsSlinky.plotlyJs.plotlyJsStrings.restyle | skip | typingsSlinky.plotlyJs.plotlyJsStrings.update
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

