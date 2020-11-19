package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pubnub", JSImport.Namespace)
@js.native
class ^ protected () extends Pubnub {
  def this(config: PubnubConfig) = this()
}
@JSImport("pubnub", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var CATEGORIES: Categories = js.native
  
  var OPERATIONS: Operations = js.native
  
  def generateUUID(): String = js.native
  
  def notificationPayload(title: String, body: String): NotificationsPayload = js.native
}
