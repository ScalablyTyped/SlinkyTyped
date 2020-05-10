package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSharedDirectoriesResult extends js.Object {
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SharedDirectories] = js.native
}

object DescribeSharedDirectoriesResult {
  @scala.inline
  def apply(): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
  @scala.inline
  implicit class DescribeSharedDirectoriesResultOps[Self <: DescribeSharedDirectoriesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSharedDirectories(value: SharedDirectories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectories")(js.undefined)
        ret
    }
  }
  
}

