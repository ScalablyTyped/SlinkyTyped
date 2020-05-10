package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClient extends js.Object {
  var client: ApolloClient[js.Object] = js.native
  var isNew: Boolean = js.native
}

object AnonClient {
  @scala.inline
  def apply(client: ApolloClient[js.Object], isNew: Boolean): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
  @scala.inline
  implicit class AnonClientOps[Self <: AnonClient] (val x: Self) extends AnyVal {
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
    def withIsNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

