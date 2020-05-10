package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.asn1js.mod.LocalBaseBlockParams because Already inherited
- typingsSlinky.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ @js.native
trait LocalBitStringValueBlockParams extends LocalConstructedValueBlockParams {
  var isConstructed: js.UndefOr[scala.Boolean] = js.native
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  var unusedBits: js.UndefOr[Double] = js.native
  var valueHex: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object LocalBitStringValueBlockParams {
  @scala.inline
  def apply(): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
  @scala.inline
  implicit class LocalBitStringValueBlockParamsOps[Self <: LocalBitStringValueBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsConstructed(value: scala.Boolean): Self = {
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
    def withUnusedBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedBits")(js.undefined)
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

