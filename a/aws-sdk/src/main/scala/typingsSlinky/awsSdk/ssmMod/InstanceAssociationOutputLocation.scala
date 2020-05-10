package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationOutputLocation extends js.Object {
  /**
    * An Amazon S3 bucket where you want to store the results of this request.
    */
  var S3Location: js.UndefOr[S3OutputLocation] = js.native
}

object InstanceAssociationOutputLocation {
  @scala.inline
  def apply(): InstanceAssociationOutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputLocation]
  }
  @scala.inline
  implicit class InstanceAssociationOutputLocationOps[Self <: InstanceAssociationOutputLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Location(value: S3OutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Location")(js.undefined)
        ret
    }
  }
  
}

