package typingsSlinky.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessagingQOS extends StObject
@JSImport("clearbladejs-node", "MessagingQOS")
@js.native
object MessagingQOS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagingQOS with Double] = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_AT_LEAST_ONCE extends MessagingQOS
  /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typingsSlinky.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_AT_MOST_ONCE extends MessagingQOS
  /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typingsSlinky.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
  
  @js.native
  sealed trait MESSAGING_QOS_EXACTLY_ONCE extends MessagingQOS
  /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typingsSlinky.clearbladejsNode.mod.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
}
