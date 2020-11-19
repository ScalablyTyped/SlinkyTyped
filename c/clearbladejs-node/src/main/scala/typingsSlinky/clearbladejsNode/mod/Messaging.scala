package typingsSlinky.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messaging extends js.Object {
  
  var URI: String = js.native
  
  var client: js.Object = js.native
  
  def getMessageHistory(topic: String, startTime: Double, count: Double, callback: CbCallback): Unit = js.native
  
  def publish(topic: String, payload: js.Object): Unit = js.native
  
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  def unsubscribe(topic: String): Unit = js.native
  def unsubscribe(
    topic: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* packet */ js.UndefOr[js.Object], _]
  ): Unit = js.native
  
  var user: APIUser = js.native
}
