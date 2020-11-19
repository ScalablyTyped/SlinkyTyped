package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithUsernamePassword")
@js.native
object loginWithUsernamePassword extends js.Object {
  
  def apply(username: String, password: String): js.Promise[UserTokenCredentials] = js.native
  def apply(
    username: String,
    password: String,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ UserTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
  def apply(username: String, password: String, options: LoginWithUsernamePasswordOptions): js.Promise[UserTokenCredentials] = js.native
  def apply(
    username: String,
    password: String,
    options: LoginWithUsernamePasswordOptions,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ UserTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
}
