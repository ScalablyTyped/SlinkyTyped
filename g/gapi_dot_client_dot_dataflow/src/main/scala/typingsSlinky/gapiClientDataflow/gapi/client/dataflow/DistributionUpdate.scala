package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionUpdate extends js.Object {
  
  /** The count of the number of elements present in the distribution. */
  var count: js.UndefOr[SplitInt64] = js.native
  
  /** (Optional) Histogram of value counts for the distribution. */
  var histogram: js.UndefOr[Histogram] = js.native
  
  /** The maximum value present in the distribution. */
  var max: js.UndefOr[SplitInt64] = js.native
  
  /** The minimum value present in the distribution. */
  var min: js.UndefOr[SplitInt64] = js.native
  
  /**
    * Use an int64 since we'd prefer the added precision. If overflow is a common
    * problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[SplitInt64] = js.native
  
  /** Use a double since the sum of squares is likely to overflow int64. */
  var sumOfSquares: js.UndefOr[Double] = js.native
}
object DistributionUpdate {
  
  @scala.inline
  def apply(): DistributionUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionUpdate]
  }
  
  @scala.inline
  implicit class DistributionUpdateOps[Self <: DistributionUpdate] (val x: Self) extends AnyVal {
    
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
    def setCount(value: SplitInt64): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setHistogram(value: Histogram): Self = this.set("histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram: Self = this.set("histogram", js.undefined)
    
    @scala.inline
    def setMax(value: SplitInt64): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: SplitInt64): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setSum(value: SplitInt64): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    
    @scala.inline
    def setSumOfSquares(value: Double): Self = this.set("sumOfSquares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSumOfSquares: Self = this.set("sumOfSquares", js.undefined)
  }
}
