package typingsSlinky.apolloReactCommon.apolloProviderMod

import slinky.core.TagMod
import typingsSlinky.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: TagMod[Any] | js.Array[TagMod[Any]] | Null
  var client: default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](
    client: default[TCache],
    children: js.UndefOr[Null | TagMod[Any] | js.Array[TagMod[Any]]] = js.undefined
  ): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

