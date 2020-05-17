package typingsSlinky.meteor.mod.Accounts

import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.TypedError
import typingsSlinky.meteor.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: Email): String = js.native
  def apply(
    options: Email,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): String = js.native
}

