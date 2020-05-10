package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBooleanValueBlockParams extends LocalBaseBlockParams {
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  var value: js.UndefOr[scala.Boolean] = js.native
  var valueHex: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object LocalBooleanValueBlockParams {
  @scala.inline
  def apply(): LocalBooleanValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBooleanValueBlockParams]
  }
  @scala.inline
  implicit class LocalBooleanValueBlockParamsOps[Self <: LocalBooleanValueBlockParams] (val x: Self) extends AnyVal {
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
    def withValue(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
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

