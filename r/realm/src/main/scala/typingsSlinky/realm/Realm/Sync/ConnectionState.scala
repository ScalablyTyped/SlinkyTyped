package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionState extends js.Object
@JSGlobal("Realm.Sync.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  
  @js.native
  sealed trait Connected extends ConnectionState
  
  @js.native
  sealed trait Connecting extends ConnectionState
  
  @js.native
  sealed trait Disconnected extends ConnectionState
}
