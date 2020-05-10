package typingsSlinky.firebaseFirestore.remoteSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializerOptions extends js.Object {
  /**
    * The serializer supports both Protobuf.js and Proto3 JSON formats. By
    * setting this flag to true, the serializer will use the Proto3 JSON format.
    *
    * For a description of the Proto3 JSON format check
    * https://developers.google.com/protocol-buffers/docs/proto3#json
    */
  var useProto3Json: Boolean = js.native
}

object SerializerOptions {
  @scala.inline
  def apply(useProto3Json: Boolean): SerializerOptions = {
    val __obj = js.Dynamic.literal(useProto3Json = useProto3Json.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseProto3Json(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProto3Json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

