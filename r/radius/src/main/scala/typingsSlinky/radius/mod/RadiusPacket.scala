package typingsSlinky.radius.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiusPacket extends js.Object {
  var attributes: js.Any = js.native
  var code: String = js.native
  var identifier: Double = js.native
  var length: Double = js.native
  var raw_attributes: js.Array[js.Array[_]] = js.native
}

object RadiusPacket {
  @scala.inline
  def apply(
    attributes: js.Any,
    code: String,
    identifier: Double,
    length: Double,
    raw_attributes: js.Array[js.Array[_]]
  ): RadiusPacket = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], raw_attributes = raw_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusPacket]
  }
  @scala.inline
  implicit class RadiusPacketOps[Self <: RadiusPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_attributes(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_attributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

