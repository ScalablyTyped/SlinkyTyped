package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessPointsResult extends js.Object {
  /**
    * Contains identification and configuration information for one or more access points associated with the specified bucket.
    */
  var AccessPointList: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.AccessPointList] = js.native
  /**
    * If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object ListAccessPointsResult {
  @scala.inline
  def apply(): ListAccessPointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPointsResult]
  }
  @scala.inline
  implicit class ListAccessPointsResultOps[Self <: ListAccessPointsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPointList(value: AccessPointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPointList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonEmptyMaxLength1024String): Self = {
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

