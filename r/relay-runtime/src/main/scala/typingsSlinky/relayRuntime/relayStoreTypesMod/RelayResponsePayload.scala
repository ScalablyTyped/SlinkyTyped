package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayResponsePayload extends js.Object {
  val connectionEvents: js.UndefOr[js.Array[ConnectionInternalEvent] | Null] = js.native
  val errors: js.UndefOr[js.Array[PayloadError] | Null] = js.native
  val fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.native
  val incrementalPlaceholders: js.UndefOr[js.Array[IncrementalDataPlaceholder] | Null] = js.native
  val moduleImportPayloads: js.UndefOr[js.Array[ModuleImportPayload] | Null] = js.native
  val source: MutableRecordSource = js.native
}

object RelayResponsePayload {
  @scala.inline
  def apply(source: MutableRecordSource): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayResponsePayload]
  }
  @scala.inline
  implicit class RelayResponsePayloadOps[Self <: RelayResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: MutableRecordSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionEvents(value: js.Array[ConnectionInternalEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionEventsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionEvents")(null)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[PayloadError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(null)
        ret
    }
    @scala.inline
    def withFieldPayloads(value: js.Array[HandleFieldPayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPayloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPayloads")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldPayloadsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPayloads")(null)
        ret
    }
    @scala.inline
    def withIncrementalPlaceholders(value: js.Array[IncrementalDataPlaceholder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalPlaceholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementalPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalPlaceholders")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementalPlaceholdersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalPlaceholders")(null)
        ret
    }
    @scala.inline
    def withModuleImportPayloads(value: js.Array[ModuleImportPayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleImportPayloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleImportPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleImportPayloads")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleImportPayloadsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleImportPayloads")(null)
        ret
    }
  }
  
}

