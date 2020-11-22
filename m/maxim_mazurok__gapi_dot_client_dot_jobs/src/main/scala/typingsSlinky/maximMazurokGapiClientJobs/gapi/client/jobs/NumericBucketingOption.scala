package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericBucketingOption extends js.Object {
  
  /**
    * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10),
    * [10, 15), [15, inf). At most 20 [buckets_bound is supported.
    */
  var bucketBounds: js.UndefOr[js.Array[Double]] = js.native
  
  /** Optional. If set to true, the histogram result includes minimum/maximum value of the numeric field. */
  var requiresMinMax: js.UndefOr[Boolean] = js.native
}
object NumericBucketingOption {
  
  @scala.inline
  def apply(): NumericBucketingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericBucketingOption]
  }
  
  @scala.inline
  implicit class NumericBucketingOptionOps[Self <: NumericBucketingOption] (val x: Self) extends AnyVal {
    
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
    def setBucketBoundsVarargs(value: Double*): Self = this.set("bucketBounds", js.Array(value :_*))
    
    @scala.inline
    def setBucketBounds(value: js.Array[Double]): Self = this.set("bucketBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketBounds: Self = this.set("bucketBounds", js.undefined)
    
    @scala.inline
    def setRequiresMinMax(value: Boolean): Self = this.set("requiresMinMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresMinMax: Self = this.set("requiresMinMax", js.undefined)
  }
}
