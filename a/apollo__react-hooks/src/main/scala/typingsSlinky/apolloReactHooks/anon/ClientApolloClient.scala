package typingsSlinky.apolloReactHooks.anon

import typingsSlinky.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApolloClient extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.native
}

object ClientApolloClient {
  @scala.inline
  def apply(): ClientApolloClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientApolloClient]
  }
  @scala.inline
  implicit class ClientApolloClientOps[Self <: ClientApolloClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ApolloClient[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
  }
  
}

