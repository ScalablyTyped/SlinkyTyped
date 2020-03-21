package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsSlinky.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsSlinky.apolloReactCommon.typesMod.OnSubscriptionDataOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionHookOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var subscription: js.UndefOr[DocumentNode] = js.undefined
}

object SubscriptionHookOptions {
  @scala.inline
  def apply[TData, TVariables](
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: () => Unit = null,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => _ = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    subscription: DocumentNode = null,
    variables: TVariables = null
  ): SubscriptionHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onSubscriptionComplete != null) __obj.updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(onSubscriptionComplete))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1(onSubscriptionData))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionHookOptions[TData, TVariables]]
  }
}

