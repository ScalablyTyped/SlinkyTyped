package typingsSlinky.realm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a user.
  */
@JSImport("realm", "UserState")
@js.native
object UserState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.UserState with String] = js.native
  
  /* "active" */ val Active: typingsSlinky.realm.Realm.UserState.Active with String = js.native
  
  /* "logged-out" */ val LoggedOut: typingsSlinky.realm.Realm.UserState.LoggedOut with String = js.native
  
  /* "removed" */ val Removed: typingsSlinky.realm.Realm.UserState.Removed with String = js.native
}
