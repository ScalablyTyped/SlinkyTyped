package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagePermissionsResult extends js.Object {
  /**
    * The name of the private image.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Name] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The permissions for a private image that you own. 
    */
  var SharedImagePermissionsList: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.SharedImagePermissionsList] = js.native
}

object DescribeImagePermissionsResult {
  @scala.inline
  def apply(): DescribeImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagePermissionsResult]
  }
  @scala.inline
  implicit class DescribeImagePermissionsResultOps[Self <: DescribeImagePermissionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withSharedImagePermissionsList(value: SharedImagePermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedImagePermissionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedImagePermissionsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedImagePermissionsList")(js.undefined)
        ret
    }
  }
  
}

