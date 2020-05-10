package typingsSlinky.googleCloudStorage.bucketMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.GetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketExistsOptions extends GetConfig {
  var userProject: js.UndefOr[String] = js.native
}

object BucketExistsOptions {
  @scala.inline
  def apply(): BucketExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketExistsOptions]
  }
  @scala.inline
  implicit class BucketExistsOptionsOps[Self <: BucketExistsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

