package typingsSlinky.ldapjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ldapjs.mod.AttributeJson
import typingsSlinky.ldapjs.mod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ldapjs.ldapjs.LDAPMessageJsonObject & {  objectName  :string,   attributes  :std.Array<ldapjs.ldapjs.AttributeJson>} */
@js.native
trait LDAPMessageJsonObjectobje
  extends /* k */ StringDictionary[js.Any] {
  var attributes: js.Array[AttributeJson] = js.native
  var controls: js.Array[Control] = js.native
  var messageID: Double = js.native
  var objectName: String = js.native
  var protocolOp: js.UndefOr[String] = js.native
}

object LDAPMessageJsonObjectobje {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeJson],
    controls: js.Array[Control],
    messageID: Double,
    objectName: String
  ): LDAPMessageJsonObjectobje = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObjectobje]
  }
  @scala.inline
  implicit class LDAPMessageJsonObjectobjeOps[Self <: LDAPMessageJsonObjectobje] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[AttributeJson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withObjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectName")(value.asInstanceOf[js.Any])
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

