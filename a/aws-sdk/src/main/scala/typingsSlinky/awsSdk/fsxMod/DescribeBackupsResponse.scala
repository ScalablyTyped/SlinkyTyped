package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsResponse extends js.Object {
  /**
    * Any array of backups.
    */
  var Backups: js.UndefOr[typingsSlinky.awsSdk.fsxMod.Backups] = js.native
  /**
    * This is present if there are more backups than returned in the response (String). You can use the NextToken value in the later request to fetch the backups. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeBackupsResponse {
  @scala.inline
  def apply(): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
  @scala.inline
  implicit class DescribeBackupsResponseOps[Self <: DescribeBackupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackups(value: Backups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backups")(js.undefined)
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

