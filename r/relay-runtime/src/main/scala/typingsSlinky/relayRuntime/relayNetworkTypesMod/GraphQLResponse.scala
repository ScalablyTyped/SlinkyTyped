package typingsSlinky.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData
  - typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData
*/
trait GraphQLResponse extends js.Object

object GraphQLResponse {
  @scala.inline
  implicit def apply(value: GraphQLResponseWithData): GraphQLResponse = value.asInstanceOf[GraphQLResponse]
  @scala.inline
  implicit def apply(value: GraphQLResponseWithoutData): GraphQLResponse = value.asInstanceOf[GraphQLResponse]
}

