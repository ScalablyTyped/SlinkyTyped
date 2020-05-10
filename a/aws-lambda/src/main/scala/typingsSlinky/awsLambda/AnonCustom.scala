package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustom extends CloudFrontOrigin {
  var custom: CloudFrontCustomOrigin = js.native
}

object AnonCustom {
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
  @scala.inline
  implicit class AnonCustomOps[Self <: AnonCustom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: CloudFrontCustomOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

