package typingsSlinky.asn1js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asn1js.asn1js.LocalHexBlockParams & {  isConstructed ? :boolean,   tagClass ? :number,   tagNumber ? :number} */
@js.native
trait LocalHexBlockParamsisCons extends js.Object {
  var blockLength: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var isConstructed: js.UndefOr[Boolean] = js.native
  var isHexOnly: js.UndefOr[Boolean] = js.native
  var tagClass: js.UndefOr[Double] = js.native
  var tagNumber: js.UndefOr[Double] = js.native
  var valueBeforeDecode: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var valueHex: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object LocalHexBlockParamsisCons {
  @scala.inline
  def apply(): LocalHexBlockParamsisCons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalHexBlockParamsisCons]
  }
  @scala.inline
  implicit class LocalHexBlockParamsisConsOps[Self <: LocalHexBlockParamsisCons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockLength")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConstructed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConstructed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHexOnly(value: Boolean): Self = {
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
    def withTagClass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBeforeDecode(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBeforeDecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBeforeDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBeforeDecode")(js.undefined)
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
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

