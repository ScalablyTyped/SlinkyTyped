package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBatchStatusRequest extends js.Object {
  /** ClientBatchStatusRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientBatchStatusRequest timeout */
  var timeout: js.UndefOr[Double | Null] = js.native
  /** ClientBatchStatusRequest wait */
  @JSName("wait")
  var wait_FIClientBatchStatusRequest: js.UndefOr[Boolean | Null] = js.native
}

object IClientBatchStatusRequest {
  @scala.inline
  def apply(): IClientBatchStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusRequest]
  }
  @scala.inline
  implicit class IClientBatchStatusRequestOps[Self <: IClientBatchStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(null)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(null)
        ret
    }
    @scala.inline
    def withWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(null)
        ret
    }
  }
  
}

