package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSourceCredentialsOutput extends js.Object {
  /**
    *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
    */
  var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.native
}

object ListSourceCredentialsOutput {
  @scala.inline
  def apply(): ListSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceCredentialsOutput]
  }
  @scala.inline
  implicit class ListSourceCredentialsOutputOps[Self <: ListSourceCredentialsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceCredentialsInfos(value: SourceCredentialsInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCredentialsInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCredentialsInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCredentialsInfos")(js.undefined)
        ret
    }
  }
  
}

