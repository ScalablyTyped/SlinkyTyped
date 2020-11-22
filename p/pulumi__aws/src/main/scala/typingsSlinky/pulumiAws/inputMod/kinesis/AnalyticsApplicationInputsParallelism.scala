package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsParallelism extends js.Object {
  
  /**
    * The Count of streams.
    */
  var count: js.UndefOr[Input[Double]] = js.native
}
object AnalyticsApplicationInputsParallelism {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsParallelismOps[Self <: AnalyticsApplicationInputsParallelism] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Input[Double]): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
  }
}
