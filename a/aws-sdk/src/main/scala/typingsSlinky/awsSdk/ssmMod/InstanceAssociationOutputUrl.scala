package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationOutputUrl extends js.Object {
  /**
    * The URL of Amazon S3 bucket where you want to store the results of this request.
    */
  var S3OutputUrl: js.UndefOr[typingsSlinky.awsSdk.ssmMod.S3OutputUrl] = js.native
}

object InstanceAssociationOutputUrl {
  @scala.inline
  def apply(): InstanceAssociationOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputUrl]
  }
  @scala.inline
  implicit class InstanceAssociationOutputUrlOps[Self <: InstanceAssociationOutputUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3OutputUrl(value: S3OutputUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputUrl")(js.undefined)
        ret
    }
  }
  
}

