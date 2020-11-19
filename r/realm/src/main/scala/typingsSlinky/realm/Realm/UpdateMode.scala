package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateMode extends js.Object
@JSGlobal("Realm.UpdateMode")
@js.native
object UpdateMode extends js.Object {
  
  @js.native
  sealed trait All extends UpdateMode
  
  @js.native
  sealed trait Modified extends UpdateMode
  
  @js.native
  sealed trait Never extends UpdateMode
}
