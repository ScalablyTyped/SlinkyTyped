package typingsSlinky.meteor.Accounts

import typingsSlinky.meteor.AnonEmailString
import typingsSlinky.meteor.Meteor.Error
import typingsSlinky.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: AnonEmailString): Unit = js.native
  def apply(
    options: AnonEmailString,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

