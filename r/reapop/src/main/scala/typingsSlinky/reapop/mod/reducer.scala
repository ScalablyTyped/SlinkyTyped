package typingsSlinky.reapop.mod

import typingsSlinky.reapop.anon.PayloadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop", "reducer")
@js.native
object reducer extends js.Object {
  
  def apply(): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ PayloadType, 
    js.Array[Notification]
  ] = js.native
  def apply(defaultNotification: Notification): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ PayloadType, 
    js.Array[Notification]
  ] = js.native
}
