package typingsSlinky.jackrabbit.anon

import typingsSlinky.amqplib.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amqp extends js.Object {
  var amqp: js.Any
  var connection: Connection
}

object Amqp {
  @scala.inline
  def apply(amqp: js.Any, connection: Connection): Amqp = {
    val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amqp]
  }
}

