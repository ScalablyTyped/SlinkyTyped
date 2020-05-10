package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServerResponse extends js.Object {
  /**
    * An array containing the properties of the server with the ServerID you specified.
    */
  var Server: DescribedServer = js.native
}

object DescribeServerResponse {
  @scala.inline
  def apply(Server: DescribedServer): DescribeServerResponse = {
    val __obj = js.Dynamic.literal(Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerResponse]
  }
  @scala.inline
  implicit class DescribeServerResponseOps[Self <: DescribeServerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: DescribedServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

