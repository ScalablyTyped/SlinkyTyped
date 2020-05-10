package typingsSlinky.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientsInfo extends js.Object {
  var blocked_clients: String = js.native
  var client_biggest_input_buf: String = js.native
  var client_longest_output_list: String = js.native
  var connected_clients: String = js.native
}

object ClientsInfo {
  @scala.inline
  def apply(
    blocked_clients: String,
    client_biggest_input_buf: String,
    client_longest_output_list: String,
    connected_clients: String
  ): ClientsInfo = {
    val __obj = js.Dynamic.literal(blocked_clients = blocked_clients.asInstanceOf[js.Any], client_biggest_input_buf = client_biggest_input_buf.asInstanceOf[js.Any], client_longest_output_list = client_longest_output_list.asInstanceOf[js.Any], connected_clients = connected_clients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsInfo]
  }
  @scala.inline
  implicit class ClientsInfoOps[Self <: ClientsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked_clients(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_biggest_input_buf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_biggest_input_buf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_longest_output_list(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_longest_output_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnected_clients(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected_clients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

