package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDestinationsRequest extends js.Object {
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var DestinationNamePrefix: js.UndefOr[DestinationName] = js.native
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeDestinationsRequest {
  @scala.inline
  def apply(): DescribeDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDestinationsRequest]
  }
  @scala.inline
  implicit class DescribeDestinationsRequestOps[Self <: DescribeDestinationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationNamePrefix(value: DestinationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: DescribeLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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

