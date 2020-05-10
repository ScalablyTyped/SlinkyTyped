package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsResponse extends js.Object {
  /**
    * An array of access point descriptions.
    */
  var AccessPoints: js.UndefOr[AccessPointDescriptions] = js.native
  /**
    * Present if there are more access points than returned in the response. You can use the NextMarker in the subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeAccessPointsResponse {
  @scala.inline
  def apply(): DescribeAccessPointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsResponse]
  }
  @scala.inline
  implicit class DescribeAccessPointsResponseOps[Self <: DescribeAccessPointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPoints(value: AccessPointDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

