package typingsSlinky.node.tlsMod

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PSKCallbackNegotation extends js.Object {
  var identitty: String = js.native
  var psk: js.typedarray.DataView | TypedArray = js.native
}

object PSKCallbackNegotation {
  @scala.inline
  def apply(identitty: String, psk: js.typedarray.DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identitty = identitty.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
  @scala.inline
  implicit class PSKCallbackNegotationOps[Self <: PSKCallbackNegotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentitty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identitty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskDataView(value: js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPsk(value: js.typedarray.DataView | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPskInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

