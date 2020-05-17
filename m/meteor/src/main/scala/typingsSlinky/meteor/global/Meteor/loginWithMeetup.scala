package typingsSlinky.meteor.global.Meteor

import typingsSlinky.meteor.Meteor.LoginWithExternalServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWithMeetup")
@js.native
object loginWithMeetup extends js.Object {
  def apply(): Unit = js.native
  def apply(options: LoginWithExternalServiceOptions): Unit = js.native
  def apply(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
}

