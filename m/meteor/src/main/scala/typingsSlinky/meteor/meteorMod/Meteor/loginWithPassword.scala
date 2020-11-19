package typingsSlinky.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/meteor", "Meteor.loginWithPassword")
@js.native
object loginWithPassword extends js.Object {
  
  def apply(user: String, password: String): Unit = js.native
  def apply(
    user: String,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
  def apply(user: js.Object, password: String): Unit = js.native
  def apply(
    user: js.Object,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}
