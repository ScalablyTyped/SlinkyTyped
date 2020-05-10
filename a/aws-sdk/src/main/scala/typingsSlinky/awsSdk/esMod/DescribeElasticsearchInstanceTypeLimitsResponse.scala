package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
  var LimitsByRole: js.UndefOr[typingsSlinky.awsSdk.esMod.LimitsByRole] = js.native
}

object DescribeElasticsearchInstanceTypeLimitsResponse {
  @scala.inline
  def apply(): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
  @scala.inline
  implicit class DescribeElasticsearchInstanceTypeLimitsResponseOps[Self <: DescribeElasticsearchInstanceTypeLimitsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitsByRole(value: LimitsByRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitsByRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitsByRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitsByRole")(js.undefined)
        ret
    }
  }
  
}

