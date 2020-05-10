package typingsSlinky.relayRuntime.relayModernEnvironmentMod

import typingsSlinky.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typingsSlinky.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typingsSlinky.relayRuntime.relayNetworkTypesMod.Network
import typingsSlinky.relayRuntime.relayStoreTypesMod.LogEvent
import typingsSlinky.relayRuntime.relayStoreTypesMod.LogFunction
import typingsSlinky.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationTracker
import typingsSlinky.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentConfig extends js.Object {
  val configName: js.UndefOr[String] = js.native
  val handlerProvider: js.UndefOr[HandlerProvider | Null] = js.native
  val log: js.UndefOr[LogFunction | Null] = js.native
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.native
  val network: Network = js.native
  val operationLoader: js.UndefOr[OperationLoader | Null] = js.native
  val operationTracker: js.UndefOr[OperationTracker | Null] = js.native
  val scheduler: js.UndefOr[TaskScheduler | Null] = js.native
  val store: Store = js.native
}

object EnvironmentConfig {
  @scala.inline
  def apply(network: Network, store: Store): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentConfig]
  }
  @scala.inline
  implicit class EnvironmentConfigOps[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlerProvider(value: /* handle */ String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandlerProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlerProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerProvider")(null)
        ret
    }
    @scala.inline
    def withLog(value: /* logEvent */ LogEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withLogNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(null)
        ret
    }
    @scala.inline
    def withMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingFieldHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingFieldHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingFieldHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingFieldHandlersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingFieldHandlers")(null)
        ret
    }
    @scala.inline
    def withOperationLoader(value: OperationLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationLoaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(null)
        ret
    }
    @scala.inline
    def withOperationTracker(value: OperationTracker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationTrackerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTracker")(null)
        ret
    }
    @scala.inline
    def withScheduler(value: TaskScheduler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(null)
        ret
    }
  }
  
}

