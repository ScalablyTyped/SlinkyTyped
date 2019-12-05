package typingsSlinky.meteor.accountsDashBaseMod.Accounts

import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.changePassword")
@js.native
object changePassword extends js.Object {
  def apply(oldPassword: String, newPassword: String): Unit = js.native
  def apply(
    oldPassword: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

