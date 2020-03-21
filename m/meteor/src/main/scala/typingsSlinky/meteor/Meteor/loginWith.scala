package typingsSlinky.meteor.Meteor

import typingsSlinky.meteor.AnonLoginStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](options: AnonLoginStyle): Unit = js.native
  def apply[ExternalService](
    options: AnonLoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

