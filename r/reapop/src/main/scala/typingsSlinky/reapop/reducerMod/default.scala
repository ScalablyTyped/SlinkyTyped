package typingsSlinky.reapop.reducerMod

import typingsSlinky.reapop.actionsMod.NotificationActions
import typingsSlinky.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop/dist/reducers/notifications/reducer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = js.native
}
