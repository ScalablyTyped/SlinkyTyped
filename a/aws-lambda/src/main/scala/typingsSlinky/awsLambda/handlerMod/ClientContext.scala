package typingsSlinky.awsLambda.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContext extends js.Object {
  var Custom: js.UndefOr[js.Any] = js.native
  var client: ClientContextClient = js.native
  var env: ClientContextEnv = js.native
}

object ClientContext {
  @scala.inline
  def apply(client: ClientContextClient, env: ClientContextEnv): ClientContext = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContext]
  }
  @scala.inline
  implicit class ClientContextOps[Self <: ClientContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ClientContextClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: ClientContextEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Custom")(js.undefined)
        ret
    }
  }
  
}

