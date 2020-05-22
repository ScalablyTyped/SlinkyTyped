package typingsSlinky.meteor.mod.Accounts

import typingsSlinky.meteor.Meteor.Connection
import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: Boolean
  var connection: Connection
  var error: Error
  var methodArguments: js.Array[_]
  var methodName: String
  var `type`: String
  var user: User
}

object IValidateLoginAttemptCbOpts {
  @scala.inline
  def apply(
    allowed: Boolean,
    connection: Connection,
    error: Error,
    methodArguments: js.Array[_],
    methodName: String,
    `type`: String,
    user: User
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
}

