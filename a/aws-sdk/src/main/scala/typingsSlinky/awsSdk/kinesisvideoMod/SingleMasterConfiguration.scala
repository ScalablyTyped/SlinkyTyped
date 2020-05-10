package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterConfiguration extends js.Object {
  /**
    * The period of time a signaling channel retains underlivered messages before they are discarded.
    */
  var MessageTtlSeconds: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.MessageTtlSeconds] = js.native
}

object SingleMasterConfiguration {
  @scala.inline
  def apply(): SingleMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterConfiguration]
  }
  @scala.inline
  implicit class SingleMasterConfigurationOps[Self <: SingleMasterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageTtlSeconds(value: MessageTtlSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageTtlSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTtlSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageTtlSeconds")(js.undefined)
        ret
    }
  }
  
}

