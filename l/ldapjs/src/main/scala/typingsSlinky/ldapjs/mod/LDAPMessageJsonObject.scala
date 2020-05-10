package typingsSlinky.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDAPMessageJsonObject
  extends /* k */ StringDictionary[js.Any] {
  var controls: js.Array[Control] = js.native
  var messageID: Double = js.native
  var protocolOp: js.UndefOr[String] = js.native
}

object LDAPMessageJsonObject {
  @scala.inline
  def apply(controls: js.Array[Control], messageID: Double): LDAPMessageJsonObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObject]
  }
  @scala.inline
  implicit class LDAPMessageJsonObjectOps[Self <: LDAPMessageJsonObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: js.Array[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolOp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolOp")(js.undefined)
        ret
    }
  }
  
}

