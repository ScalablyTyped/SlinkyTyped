package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFailure extends js.Object {
  /**
    * The failure code associated with the failure.
    */
  var failureCode: js.UndefOr[LayerFailureCode] = js.native
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[LayerFailureReason] = js.native
  /**
    * The layer digest associated with the failure.
    */
  var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.native
}

object LayerFailure {
  @scala.inline
  def apply(): LayerFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerFailure]
  }
  @scala.inline
  implicit class LayerFailureOps[Self <: LayerFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureCode(value: LayerFailureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: LayerFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerDigest(value: BatchedOperationLayerDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(js.undefined)
        ret
    }
  }
  
}

