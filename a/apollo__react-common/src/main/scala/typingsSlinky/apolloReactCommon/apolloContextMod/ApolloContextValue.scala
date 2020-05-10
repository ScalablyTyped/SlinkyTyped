package typingsSlinky.apolloReactCommon.apolloContextMod

import typingsSlinky.apolloClient.mod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloContextValue extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.native
  var renderPromises: js.UndefOr[Record[_, _]] = js.native
}

object ApolloContextValue {
  @scala.inline
  def apply(): ApolloContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloContextValue]
  }
  @scala.inline
  implicit class ApolloContextValueOps[Self <: ApolloContextValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: default[js.Object]): Self = {
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
    @scala.inline
    def withRenderPromises(value: Record[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPromises")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPromises: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPromises")(js.undefined)
        ret
    }
  }
  
}

