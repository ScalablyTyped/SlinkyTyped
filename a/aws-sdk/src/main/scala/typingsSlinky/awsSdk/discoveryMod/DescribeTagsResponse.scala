package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * The call returns a token. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a specific configuration item.
    */
  var tags: js.UndefOr[ConfigurationTagSet] = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  @scala.inline
  implicit class DescribeTagsResponseOps[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTags(value: ConfigurationTagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

