package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOperatingSystemsResponse extends js.Object {
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.OperatingSystems] = js.native
}

object DescribeOperatingSystemsResponse {
  @scala.inline
  def apply(): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
  @scala.inline
  implicit class DescribeOperatingSystemsResponseOps[Self <: DescribeOperatingSystemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatingSystems(value: OperatingSystems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystems")(js.undefined)
        ret
    }
  }
  
}

