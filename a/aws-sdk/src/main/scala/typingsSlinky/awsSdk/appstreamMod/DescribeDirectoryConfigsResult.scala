package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectoryConfigsResult extends js.Object {
  /**
    * Information about the directory configurations. Note that although the response syntax in this topic includes the account password, this password is not returned in the actual response. 
    */
  var DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeDirectoryConfigsResult {
  @scala.inline
  def apply(): DescribeDirectoryConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoryConfigsResult]
  }
  @scala.inline
  implicit class DescribeDirectoryConfigsResultOps[Self <: DescribeDirectoryConfigsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryConfigs(value: DirectoryConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryConfigs")(js.undefined)
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
  }
  
}

