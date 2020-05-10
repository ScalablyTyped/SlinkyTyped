package typingsSlinky.relayRuntime.commitMutationMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadError
import typingsSlinky.relayRuntime.relayNetworkTypesMod.UploadableMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationConfig[TOperation /* <: MutationParameters */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
  var mutation: GraphQLTaggedNode = js.native
  var onCompleted: js.UndefOr[
    (js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
      Unit
    ]) | Null
  ] = js.native
  var onError: js.UndefOr[(js.Function1[/* error */ js.Error, Unit]) | Null] = js.native
  var optimisticResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
  ] = js.native
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.native
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.native
  var uploadables: js.UndefOr[UploadableMap | Null] = js.native
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any = js.native
}

object MutationConfig {
  @scala.inline
  def apply[TOperation](
    mutation: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): MutationConfig[TOperation] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationConfig[TOperation]]
  }
  @scala.inline
  implicit class MutationConfigOps[Self[toperation] <: MutationConfig[toperation], TOperation] (val x: Self[TOperation]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOperation] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOperation]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOperation] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOperation] with Other]
    @scala.inline
    def withMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMutation(value: GraphQLTaggedNode): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigs(value: js.Array[DeclarativeMutationConfig]): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigs: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleted(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCompleted: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompletedNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(null)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(null)
        ret
    }
    @scala.inline
    def withOptimisticResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOptimisticUpdater: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticUpdaterNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(null)
        ret
    }
    @scala.inline
    def withUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdater: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdaterNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(null)
        ret
    }
    @scala.inline
    def withUploadables(value: UploadableMap): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadables: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadablesNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(null)
        ret
    }
  }
  
}

