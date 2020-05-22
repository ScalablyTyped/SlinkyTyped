package typingsSlinky.amqpConnectionManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: typingsSlinky.amqplib.mod.Connection
  var url: String
}

object Connection {
  @scala.inline
  def apply(connection: typingsSlinky.amqplib.mod.Connection, url: String): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

