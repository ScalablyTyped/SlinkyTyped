package typingsSlinky.meteor.global.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithPassword")
@js.native
object loginWithPassword extends js.Object {
  def apply(user: String, password: String): Unit = js.native
  def apply(
    user: String,
    password: String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
  def apply(user: js.Object, password: String): Unit = js.native
  def apply(
    user: js.Object,
    password: String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
}

