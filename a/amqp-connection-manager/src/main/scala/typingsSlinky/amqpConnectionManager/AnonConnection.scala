package typingsSlinky.amqpConnectionManager

import typingsSlinky.amqplib.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var connection: Connection
  var url: String
}

object AnonConnection {
  @scala.inline
  def apply(connection: Connection, url: String): AnonConnection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnection]
  }
}

