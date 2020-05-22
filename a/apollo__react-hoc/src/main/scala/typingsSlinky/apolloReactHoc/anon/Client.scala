package typingsSlinky.apolloReactHoc.anon

import typingsSlinky.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: ApolloClient[_]
}

object Client {
  @scala.inline
  def apply(client: ApolloClient[_]): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

