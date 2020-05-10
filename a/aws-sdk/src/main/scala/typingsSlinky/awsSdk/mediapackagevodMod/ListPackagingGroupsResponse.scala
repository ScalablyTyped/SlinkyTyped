package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingGroupsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * A list of MediaPackage VOD PackagingGroup resources.
    */
  var PackagingGroups: js.UndefOr[listOfPackagingGroup] = js.native
}

object ListPackagingGroupsResponse {
  @scala.inline
  def apply(): ListPackagingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsResponse]
  }
  @scala.inline
  implicit class ListPackagingGroupsResponseOps[Self <: ListPackagingGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
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
    def withPackagingGroups(value: listOfPackagingGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackagingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingGroups")(js.undefined)
        ret
    }
  }
  
}

