package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth {
  import typingsSlinky.reactDashNativeDashFirebase.Anon_Authenticated
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.User

  type AuthListenerCallback = js.Function1[/* user */ OrNull[User], Unit]
  type AuthResult = Anon_Authenticated | Null
  type OrNull[T] = T | Null
}
