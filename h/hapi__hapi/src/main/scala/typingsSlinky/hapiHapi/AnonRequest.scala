package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequest extends js.Object {
  /**
    * decorations on the request object.
    */
  var request: js.Array[String] = js.native
  /**
    * decorations on the server object.
    */
  var server: js.Array[String] = js.native
  /**
    * decorations on the response toolkit.
    */
  var toolkit: js.Array[String] = js.native
}

object AnonRequest {
  @scala.inline
  def apply(request: js.Array[String], server: js.Array[String], toolkit: js.Array[String]): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], toolkit = toolkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest]
  }
  @scala.inline
  implicit class AnonRequestOps[Self <: AnonRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolkit(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolkit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

