package typingsSlinky.awsSdkEventstreamMarshaller.messageMod

import typingsSlinky.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongHeaderValue extends MessageHeaderValue {
  var `type`: long = js.native
  var value: Int64 = js.native
}

object LongHeaderValue {
  @scala.inline
  def apply(`type`: long, value: Int64): LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongHeaderValue]
  }
  @scala.inline
  implicit class LongHeaderValueOps[Self <: LongHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Int64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

