package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTag extends js.Object {
  /**
    * The name of the message tag. The message tag name has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Name: MessageTagName = js.native
  /**
    * The value of the message tag. The message tag value has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Value: MessageTagValue = js.native
}

object MessageTag {
  @scala.inline
  def apply(Name: MessageTagName, Value: MessageTagValue): MessageTag = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  @scala.inline
  implicit class MessageTagOps[Self <: MessageTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MessageTagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: MessageTagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

