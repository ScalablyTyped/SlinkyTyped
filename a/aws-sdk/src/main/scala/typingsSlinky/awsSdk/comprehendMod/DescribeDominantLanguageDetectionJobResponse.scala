package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties] = js.native
}

object DescribeDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeDominantLanguageDetectionJobResponseOps[Self <: DescribeDominantLanguageDetectionJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDominantLanguageDetectionJobProperties(value: DominantLanguageDetectionJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DominantLanguageDetectionJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantLanguageDetectionJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DominantLanguageDetectionJobProperties")(js.undefined)
        ret
    }
  }
  
}

