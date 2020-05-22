package typingsSlinky.meteor.anon

import typingsSlinky.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: typingsSlinky.meteor.Meteor.Connection
  var user: User
}

object Connection {
  @scala.inline
  def apply(connection: typingsSlinky.meteor.Meteor.Connection, user: User): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

