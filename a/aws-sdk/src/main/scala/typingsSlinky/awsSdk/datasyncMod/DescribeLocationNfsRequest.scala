package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationNfsRequest extends js.Object {
  /**
    * The Amazon resource Name (ARN) of the NFS location to describe.
    */
  var LocationArn: typingsSlinky.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationNfsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationNfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationNfsRequest]
  }
  @scala.inline
  implicit class DescribeLocationNfsRequestOps[Self <: DescribeLocationNfsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

