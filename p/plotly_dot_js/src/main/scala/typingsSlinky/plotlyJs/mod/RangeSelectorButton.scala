package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.backward
import typingsSlinky.plotlyJs.plotlyJsStrings.day
import typingsSlinky.plotlyJs.plotlyJsStrings.hour
import typingsSlinky.plotlyJs.plotlyJsStrings.minute
import typingsSlinky.plotlyJs.plotlyJsStrings.month
import typingsSlinky.plotlyJs.plotlyJsStrings.second
import typingsSlinky.plotlyJs.plotlyJsStrings.todate
import typingsSlinky.plotlyJs.plotlyJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorButton extends js.Object {
  
  var count: Double = js.native
  
  var label: String = js.native
  
  var step: second | minute | hour | day | month | year | all = js.native
  
  var stepmode: backward | todate = js.native
}
object RangeSelectorButton {
  
  @scala.inline
  def apply(
    count: Double,
    label: String,
    step: second | minute | hour | day | month | year | all,
    stepmode: backward | todate
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorButton]
  }
  
  @scala.inline
  implicit class RangeSelectorButtonOps[Self <: RangeSelectorButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: second | minute | hour | day | month | year | all): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepmode(value: backward | todate): Self = this.set("stepmode", value.asInstanceOf[js.Any])
  }
}
