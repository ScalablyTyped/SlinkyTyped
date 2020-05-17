package typingsSlinky.intercomClient.leadMod

import typingsSlinky.intercomClient.anon.Id
import typingsSlinky.intercomClient.anon.Userid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Userid
*/
trait LeadIdentifier extends js.Object

object LeadIdentifier {
  @scala.inline
  implicit def apply(value: Id): LeadIdentifier = value.asInstanceOf[LeadIdentifier]
  @scala.inline
  implicit def apply(value: Userid): LeadIdentifier = value.asInstanceOf[LeadIdentifier]
}

