package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalPrimitiveValueBlockParams extends LocalBaseBlockParams {
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  var valueHex: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object LocalPrimitiveValueBlockParams {
  @scala.inline
  def apply(): LocalPrimitiveValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalPrimitiveValueBlockParams]
  }
  @scala.inline
  implicit class LocalPrimitiveValueBlockParamsOps[Self <: LocalPrimitiveValueBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHexOnly(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHexOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withValueHex(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHex")(js.undefined)
        ret
    }
  }
  
}

