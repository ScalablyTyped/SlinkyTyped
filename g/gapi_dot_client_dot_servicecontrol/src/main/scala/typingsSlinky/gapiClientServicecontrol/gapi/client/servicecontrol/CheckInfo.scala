package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckInfo extends js.Object {
  /** Consumer info of this check. */
  var consumerInfo: js.UndefOr[ConsumerInfo] = js.native
  /**
    * A list of fields and label keys that are ignored by the server.
    * The client doesn't need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object CheckInfo {
  @scala.inline
  def apply(): CheckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInfo]
  }
  @scala.inline
  implicit class CheckInfoOps[Self <: CheckInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerInfo(value: ConsumerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedArguments")(js.undefined)
        ret
    }
  }
  
}

