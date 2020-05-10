package typingsSlinky.meteor.Accounts

import typingsSlinky.meteor.Meteor.Connection
import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: Boolean = js.native
  var connection: Connection = js.native
  var error: Error = js.native
  var methodArguments: js.Array[_] = js.native
  var methodName: String = js.native
  var `type`: String = js.native
  var user: User_ = js.native
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
    user: User_
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
  @scala.inline
  implicit class IValidateLoginAttemptCbOptsOps[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

