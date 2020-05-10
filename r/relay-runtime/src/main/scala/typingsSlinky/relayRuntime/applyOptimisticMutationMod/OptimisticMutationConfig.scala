package typingsSlinky.relayRuntime.applyOptimisticMutationMod

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
trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.native
  var mutation: GraphQLTaggedNode = js.native
  var optimisticResponse: js.UndefOr[js.Object] = js.native
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  var variables: Variables = js.native
}

object OptimisticMutationConfig {
  @scala.inline
  def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticMutationConfig]
  }
  @scala.inline
  implicit class OptimisticMutationConfigOps[Self <: OptimisticMutationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMutation(value: GraphQLTaggedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigs(value: js.Array[DeclarativeMutationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(null)
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOptimisticUpdater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticUpdaterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(null)
        ret
    }
  }
  
}

