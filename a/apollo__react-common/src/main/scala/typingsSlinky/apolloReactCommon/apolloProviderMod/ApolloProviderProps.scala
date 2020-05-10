package typingsSlinky.apolloReactCommon.apolloProviderMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProviderProps[TCache] extends js.Object {
  var children: TagMod[Any] | js.Array[TagMod[Any]] | Null = js.native
  var client: default[TCache] = js.native
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](client: default[TCache]): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
  @scala.inline
  implicit class ApolloProviderPropsOps[Self[tcache] <: ApolloProviderProps[tcache], TCache] (val x: Self[TCache]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCache] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCache]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCache] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCache] with Other]
    @scala.inline
    def withClient(value: default[TCache]): Self[TCache] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[TCache] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | js.Array[TagMod[Any]]): Self[TCache] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[TCache] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self[TCache] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
  }
  
}

