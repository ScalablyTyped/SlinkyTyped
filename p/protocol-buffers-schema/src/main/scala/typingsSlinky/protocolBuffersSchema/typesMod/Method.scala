package typingsSlinky.protocolBuffersSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  var client_streaming: Boolean = js.native
  var input_type: String = js.native
  var name: String = js.native
  var options: Options = js.native
  var output_type: String = js.native
  var server_streaming: Boolean = js.native
}

object Method {
  @scala.inline
  def apply(
    client_streaming: Boolean,
    input_type: String,
    name: String,
    options: Options,
    output_type: String,
    server_streaming: Boolean
  ): Method = {
    val __obj = js.Dynamic.literal(client_streaming = client_streaming.asInstanceOf[js.Any], input_type = input_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], server_streaming = server_streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_streaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_streaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer_streaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_streaming")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

