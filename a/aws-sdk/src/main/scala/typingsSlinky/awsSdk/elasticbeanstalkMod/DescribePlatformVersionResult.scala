package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the platform.
    */
  var PlatformDescription: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformDescription] = js.native
}

object DescribePlatformVersionResult {
  @scala.inline
  def apply(): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
  @scala.inline
  implicit class DescribePlatformVersionResultOps[Self <: DescribePlatformVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformDescription(value: PlatformDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDescription")(js.undefined)
        ret
    }
  }
  
}

