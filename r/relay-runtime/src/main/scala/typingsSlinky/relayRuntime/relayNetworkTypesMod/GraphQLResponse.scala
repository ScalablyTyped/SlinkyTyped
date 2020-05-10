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
  def GraphQLResponseWithData(data: PayloadData): GraphQLResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
  @scala.inline
  def GraphQLResponseWithoutData(errors: js.Array[PayloadError]): GraphQLResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
}

