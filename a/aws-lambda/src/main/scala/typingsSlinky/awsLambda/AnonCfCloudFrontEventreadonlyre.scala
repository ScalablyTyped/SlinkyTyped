package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCfCloudFrontEventreadonlyre extends js.Object {
  var cf: CloudFrontEventreadonlyre = js.native
}

object AnonCfCloudFrontEventreadonlyre {
  @scala.inline
  def apply(cf: CloudFrontEventreadonlyre): AnonCfCloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCfCloudFrontEventreadonlyre]
  }
  @scala.inline
  implicit class AnonCfCloudFrontEventreadonlyreOps[Self <: AnonCfCloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCf(value: CloudFrontEventreadonlyre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

