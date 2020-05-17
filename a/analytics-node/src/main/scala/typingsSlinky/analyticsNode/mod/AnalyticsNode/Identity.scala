package typingsSlinky.analyticsNode.mod.AnalyticsNode

import typingsSlinky.analyticsNode.anon.AnonymousId
import typingsSlinky.analyticsNode.anon.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.analyticsNode.anon.UserId
  - typingsSlinky.analyticsNode.anon.AnonymousId
*/
trait Identity extends js.Object

object Identity {
  @scala.inline
  implicit def apply(value: AnonymousId): Identity = value.asInstanceOf[Identity]
  @scala.inline
  implicit def apply(value: UserId): Identity = value.asInstanceOf[Identity]
}

