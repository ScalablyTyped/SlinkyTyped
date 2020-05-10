package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicsResponse extends js.Object {
  /**
    * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  /**
    * A list of topic ARNs.
    */
  var Topics: js.UndefOr[TopicsList] = js.native
}

object ListTopicsResponse {
  @scala.inline
  def apply(): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsResponse]
  }
  @scala.inline
  implicit class ListTopicsResponseOps[Self <: ListTopicsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: nextToken): Self = {
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
    def withTopics(value: TopicsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topics")(js.undefined)
        ret
    }
  }
  
}

