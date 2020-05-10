package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveEnvironmentInfoResultMessage extends js.Object {
  /**
    *  The EnvironmentInfoDescription of the environment. 
    */
  var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.native
}

object RetrieveEnvironmentInfoResultMessage {
  @scala.inline
  def apply(): RetrieveEnvironmentInfoResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
  }
  @scala.inline
  implicit class RetrieveEnvironmentInfoResultMessageOps[Self <: RetrieveEnvironmentInfoResultMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentInfo(value: EnvironmentInfoDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentInfo")(js.undefined)
        ret
    }
  }
  
}

