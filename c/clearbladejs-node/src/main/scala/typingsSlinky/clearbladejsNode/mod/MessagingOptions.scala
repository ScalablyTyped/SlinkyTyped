package typingsSlinky.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingOptions extends CommonMessagingProperties {
  var qos: js.UndefOr[MessagingQOS] = js.native
}

object MessagingOptions {
  @scala.inline
  def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  @scala.inline
  implicit class MessagingOptionsOps[Self <: MessagingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQos(value: MessagingQOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(js.undefined)
        ret
    }
  }
  
}

