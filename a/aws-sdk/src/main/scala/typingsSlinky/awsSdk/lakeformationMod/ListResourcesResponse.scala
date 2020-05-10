package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A summary of the data lake resources.
    */
  var ResourceInfoList: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ResourceInfoList] = js.native
}

object ListResourcesResponse {
  @scala.inline
  def apply(): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResponse]
  }
  @scala.inline
  implicit class ListResourcesResponseOps[Self <: ListResourcesResponse] (val x: Self) extends AnyVal {
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
    def withResourceInfoList(value: ResourceInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInfoList")(js.undefined)
        ret
    }
  }
  
}

