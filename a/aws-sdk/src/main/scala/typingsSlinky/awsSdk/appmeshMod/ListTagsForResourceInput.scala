package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The maximum number of tag results returned by ListTagsForResource in
    paginated output. When this parameter is used, ListTagsForResource returns
    only limit results in a single page along with a nextToken
    response element. You can see the remaining results of the initial request by sending
    another ListTagsForResource request with the returned nextToken
    value. This value can be between 1 and 100. If you don't use
    this parameter, ListTagsForResource returns up to 100
    results and a nextToken value if applicable.
    */
  var limit: js.UndefOr[TagsLimit] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListTagsForResource request where limit was used and the
    results exceeded the value of that parameter. Pagination continues from the end of the
    previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the resource to list the tags for.
    */
  var resourceArn: Arn = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(resourceArn: Arn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  @scala.inline
  implicit class ListTagsForResourceInputOps[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: TagsLimit): Self = {
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
    def withNextToken(value: String): Self = {
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

