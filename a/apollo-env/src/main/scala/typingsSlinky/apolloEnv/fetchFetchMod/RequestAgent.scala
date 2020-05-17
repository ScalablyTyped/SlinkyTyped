package typingsSlinky.apolloEnv.fetchFetchMod

import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.httpMod.Agent
  - typingsSlinky.node.httpsMod.Agent
*/
trait RequestAgent extends js.Object

object RequestAgent {
  @scala.inline
  implicit def apply(value: Agent): RequestAgent = value.asInstanceOf[RequestAgent]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.httpsMod.Agent): RequestAgent = value.asInstanceOf[RequestAgent]
}

