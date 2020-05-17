package typingsSlinky.googleGax.fallbackErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtobufAny extends js.Object {
  var type_url: String = js.native
  var value: js.typedarray.Uint8Array = js.native
}

object ProtobufAny {
  @scala.inline
  def apply(type_url: String, value: js.typedarray.Uint8Array): ProtobufAny = {
    val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufAny]
  }
  @scala.inline
  implicit class ProtobufAnyOps[Self <: ProtobufAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

