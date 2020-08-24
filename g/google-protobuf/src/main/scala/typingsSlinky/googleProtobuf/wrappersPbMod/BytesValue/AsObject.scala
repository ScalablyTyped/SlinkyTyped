package typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var value: js.typedarray.Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(value: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setValueUint8Array(value: js.typedarray.Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array | String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

