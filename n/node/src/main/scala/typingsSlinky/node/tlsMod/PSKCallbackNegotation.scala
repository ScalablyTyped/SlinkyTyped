package typingsSlinky.node.tlsMod

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PSKCallbackNegotation extends js.Object {
  var identitty: String
  var psk: js.typedarray.DataView | TypedArray
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentitty(value: String): Self = this.set("identitty", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskInt32Array(value: js.typedarray.Int32Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskInt8Array(value: js.typedarray.Int8Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskInt16Array(value: js.typedarray.Int16Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskDataView(value: js.typedarray.DataView): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskUint32Array(value: js.typedarray.Uint32Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskFloat64Array(value: js.typedarray.Float64Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPsk(value: js.typedarray.DataView | TypedArray): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskUint16Array(value: js.typedarray.Uint16Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskUint8Array(value: js.typedarray.Uint8Array): Self = this.set("psk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPskFloat32Array(value: js.typedarray.Float32Array): Self = this.set("psk", value.asInstanceOf[js.Any])
  }
  
}

