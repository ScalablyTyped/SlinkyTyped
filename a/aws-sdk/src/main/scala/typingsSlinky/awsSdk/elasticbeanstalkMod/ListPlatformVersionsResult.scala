package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsResult extends js.Object {
  /**
    * The starting index into the remaining list of platforms. if this value is not null, you can use it in a subsequent ListPlatformVersion call. 
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Detailed information about the platforms.
    */
  var PlatformSummaryList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformSummaryList] = js.native
}

object ListPlatformVersionsResult {
  @scala.inline
  def apply(): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
  @scala.inline
  implicit class ListPlatformVersionsResultOps[Self <: ListPlatformVersionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPlatformSummaryList(value: PlatformSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSummaryList")(js.undefined)
        ret
    }
  }
  
}

