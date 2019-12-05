package typingsSlinky.atApolloReactDashCommon.libContextApolloProviderMod

import slinky.core.TagMod
import typingsSlinky.apolloDashClient.apolloDashClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: TagMod[Any] | js.Array[TagMod[Any]] | Null
  var client: default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](client: default[TCache], children: TagMod[Any] | js.Array[TagMod[Any]] = null): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

