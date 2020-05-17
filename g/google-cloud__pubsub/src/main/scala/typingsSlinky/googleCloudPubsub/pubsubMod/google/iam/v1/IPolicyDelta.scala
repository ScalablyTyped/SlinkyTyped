package typingsSlinky.googleCloudPubsub.pubsubMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PolicyDelta. */
@js.native
trait IPolicyDelta extends js.Object {
  /** PolicyDelta auditConfigDeltas */
  var auditConfigDeltas: js.UndefOr[js.Array[IAuditConfigDelta] | Null] = js.native
  /** PolicyDelta bindingDeltas */
  var bindingDeltas: js.UndefOr[js.Array[IBindingDelta] | Null] = js.native
}

object IPolicyDelta {
  @scala.inline
  def apply(): IPolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyDelta]
  }
  @scala.inline
  implicit class IPolicyDeltaOps[Self <: IPolicyDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditConfigDeltas(value: js.Array[IAuditConfigDelta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditConfigDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditConfigDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditConfigDeltas")(js.undefined)
        ret
    }
    @scala.inline
    def withAuditConfigDeltasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditConfigDeltas")(null)
        ret
    }
    @scala.inline
    def withBindingDeltas(value: js.Array[IBindingDelta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingDeltasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(null)
        ret
    }
  }
  
}

