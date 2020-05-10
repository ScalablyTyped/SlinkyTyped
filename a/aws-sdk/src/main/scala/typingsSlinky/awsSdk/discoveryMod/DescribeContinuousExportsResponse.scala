package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousExportsResponse extends js.Object {
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.native
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeContinuousExportsResponse {
  @scala.inline
  def apply(): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
  @scala.inline
  implicit class DescribeContinuousExportsResponseOps[Self <: DescribeContinuousExportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptions(value: ContinuousExportDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

