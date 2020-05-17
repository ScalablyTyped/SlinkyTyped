package typingsSlinky.meteor.global.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithToken")
@js.native
object loginWithToken extends js.Object {
  def apply(token: String): Unit = js.native
  def apply(
    token: String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
}

