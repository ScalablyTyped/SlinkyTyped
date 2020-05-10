package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystems] = js.native
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  @scala.inline
  implicit class DescribeFileSystemsResponseOps[Self <: DescribeFileSystemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystems(value: FileSystems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

