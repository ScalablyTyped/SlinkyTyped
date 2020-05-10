package typingsSlinky.relayTestUtils

import typingsSlinky.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typingsSlinky.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandlerProvider extends js.Object {
  var handlerProvider: js.UndefOr[HandlerProvider] = js.native
  var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.native
  var operationLoader: js.UndefOr[OperationLoader] = js.native
  var operationTracker: js.UndefOr[OperationTracker] = js.native
}

object AnonHandlerProvider {
  @scala.inline
  def apply(): AnonHandlerProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHandlerProvider]
  }
  @scala.inline
  implicit class AnonHandlerProviderOps[Self <: AnonHandlerProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

