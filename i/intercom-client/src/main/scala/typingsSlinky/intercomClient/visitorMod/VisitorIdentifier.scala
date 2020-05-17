package typingsSlinky.intercomClient.visitorMod

import typingsSlinky.intercomClient.anon.Id
import typingsSlinky.intercomClient.anon.Userid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Userid
*/
trait VisitorIdentifier extends js.Object

object VisitorIdentifier {
  @scala.inline
  implicit def apply(value: Id): VisitorIdentifier = value.asInstanceOf[VisitorIdentifier]
  @scala.inline
  implicit def apply(value: Userid): VisitorIdentifier = value.asInstanceOf[VisitorIdentifier]
}

