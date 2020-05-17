package typingsSlinky.meteor.mod.Accounts

import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.TypedError
import typingsSlinky.meteor.anon.EmailString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: EmailString): Unit = js.native
  def apply(
    options: EmailString,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

