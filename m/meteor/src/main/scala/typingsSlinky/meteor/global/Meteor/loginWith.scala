package typingsSlinky.meteor.global.Meteor

import typingsSlinky.meteor.anon.LoginStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
  def apply[ExternalService](options: LoginStyle): Unit = js.native
  def apply[ExternalService](
    options: LoginStyle,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.Meteor.Error | typingsSlinky.meteor.Meteor.TypedError
      ], 
      Unit
    ]
  ): Unit = js.native
}
