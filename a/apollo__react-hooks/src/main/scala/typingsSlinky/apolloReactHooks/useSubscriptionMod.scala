package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactHooks.typesMod.SubscriptionHookOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useSubscription", JSImport.Namespace)
@js.native
object useSubscriptionMod extends js.Object {
  def useSubscription[TData, TVariables](subscription: DocumentNode): AnonError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): AnonError[TVariables, TData] = js.native
}

