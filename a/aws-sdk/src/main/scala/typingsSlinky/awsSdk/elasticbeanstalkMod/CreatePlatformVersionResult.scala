package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformVersionResult extends js.Object {
  /**
    * The builder used to create the custom platform.
    */
  var Builder: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Builder] = js.native
  /**
    * Detailed information about the new version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}

object CreatePlatformVersionResult {
  @scala.inline
  def apply(): CreatePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformVersionResult]
  }
  @scala.inline
  implicit class CreatePlatformVersionResultOps[Self <: CreatePlatformVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilder(value: Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Builder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformSummary(value: PlatformSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSummary")(js.undefined)
        ret
    }
  }
  
}

