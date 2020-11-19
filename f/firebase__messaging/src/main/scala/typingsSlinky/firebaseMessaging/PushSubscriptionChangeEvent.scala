package typingsSlinky.firebaseMessaging

import org.scalajs.dom.experimental.push.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionChangeEvent extends ExtendableEvent {
  
  val newSubscription: PushSubscription | Null = js.native
  
  val oldSubscription: PushSubscription | Null = js.native
}
