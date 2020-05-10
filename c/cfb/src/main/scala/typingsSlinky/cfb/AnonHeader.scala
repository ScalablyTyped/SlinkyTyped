package typingsSlinky.cfb

import typingsSlinky.cfb.mod.CFBBlob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeader extends js.Object {
  var header: CFBBlob = js.native
  var sectors: js.Array[CFBBlob] = js.native
}

object AnonHeader {
  @scala.inline
  def apply(header: CFBBlob, sectors: js.Array[CFBBlob]): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
  @scala.inline
  implicit class AnonHeaderOps[Self <: AnonHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: CFBBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectors(value: js.Array[CFBBlob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

