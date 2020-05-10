package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalIdFormat extends js.Object {
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}

object PrincipalIdFormat {
  @scala.inline
  def apply(): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalIdFormat]
  }
  @scala.inline
  implicit class PrincipalIdFormatOps[Self <: PrincipalIdFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatuses(value: IdFormatList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(js.undefined)
        ret
    }
  }
  
}

