package typingsSlinky.meteor.mod.Accounts

import typingsSlinky.meteor.AnonEmail
import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: AnonEmail): String = js.native
  def apply(
    options: AnonEmail,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): String = js.native
}

