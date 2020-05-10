package typingsSlinky.nodeForge.mod.asn1

import typingsSlinky.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asn1 extends js.Object {
  var composed: Boolean = js.native
  var constructed: Boolean = js.native
  var tagClass: Class = js.native
  var `type`: Type = js.native
  var value: Bytes | js.Array[Asn1] = js.native
}

object Asn1 {
  @scala.inline
  def apply(
    composed: Boolean,
    constructed: Boolean,
    tagClass: Class,
    `type`: Type,
    value: Bytes | js.Array[Asn1]
  ): Asn1 = {
    val __obj = js.Dynamic.literal(composed = composed.asInstanceOf[js.Any], constructed = constructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1]
  }
  @scala.inline
  implicit class Asn1Ops[Self <: Asn1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagClass(value: Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Bytes | js.Array[Asn1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

