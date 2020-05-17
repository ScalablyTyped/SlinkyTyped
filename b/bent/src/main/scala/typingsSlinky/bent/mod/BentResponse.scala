package typingsSlinky.bent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bent.mod.NodeResponse
  - typingsSlinky.bent.mod.FetchResponse
*/
trait BentResponse extends ValidResponse

object BentResponse {
  @scala.inline
  implicit def apply(value: FetchResponse): BentResponse = value.asInstanceOf[BentResponse]
  @scala.inline
  implicit def apply(value: NodeResponse): BentResponse = value.asInstanceOf[BentResponse]
}

