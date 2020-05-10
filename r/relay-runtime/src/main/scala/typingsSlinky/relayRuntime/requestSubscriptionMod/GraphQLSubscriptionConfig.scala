package typingsSlinky.relayRuntime.requestSubscriptionMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSubscriptionConfig[TSubscriptionPayload] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onNext: js.UndefOr[js.Function1[/* response */ js.UndefOr[TSubscriptionPayload | Null], Unit]] = js.native
  var subscription: GraphQLTaggedNode = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[TSubscriptionPayload]] = js.native
  var variables: Variables = js.native
}

object GraphQLSubscriptionConfig {
  @scala.inline
  def apply[TSubscriptionPayload](subscription: GraphQLTaggedNode, variables: Variables): GraphQLSubscriptionConfig[TSubscriptionPayload] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscriptionPayload]]
  }
  @scala.inline
  implicit class GraphQLSubscriptionConfigOps[Self[tsubscriptionpayload] <: GraphQLSubscriptionConfig[tsubscriptionpayload], TSubscriptionPayload] (val x: Self[TSubscriptionPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSubscriptionPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSubscriptionPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSubscriptionPayload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSubscriptionPayload] with Other]
    @scala.inline
    def withSubscriptionFunction0(value: () => ReaderFragment | ConcreteRequest): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscription(value: GraphQLTaggedNode): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigs(value: js.Array[DeclarativeMutationConfig]): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigs: Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleted(value: () => Unit): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCompleted: Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: /* response */ js.UndefOr[TSubscriptionPayload | Null] => Unit): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdater(value: (/* store */ RecordSourceSelectorProxy[TSubscriptionPayload], TSubscriptionPayload) => Unit): Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdater: Self[TSubscriptionPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.undefined)
        ret
    }
  }
  
}

