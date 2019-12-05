package typingsSlinky.atApolloReactDashCommon.libContextApolloConsumerMod

import typingsSlinky.apolloDashClient.apolloDashClientMod.default
import typingsSlinky.react.reactMod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloConsumerProps extends js.Object {
  def children(client: default[js.Object]): ReactChild | Null
}

object ApolloConsumerProps {
  @scala.inline
  def apply(children: default[js.Object] => ReactChild | Null): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ApolloConsumerProps]
  }
}

