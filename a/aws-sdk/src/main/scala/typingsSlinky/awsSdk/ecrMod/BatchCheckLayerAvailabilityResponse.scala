package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCheckLayerAvailabilityResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[LayerFailureList] = js.native
  /**
    * A list of image layer objects corresponding to the image layer references in the request.
    */
  var layers: js.UndefOr[LayerList] = js.native
}

object BatchCheckLayerAvailabilityResponse {
  @scala.inline
  def apply(): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
  @scala.inline
  implicit class BatchCheckLayerAvailabilityResponseOps[Self <: BatchCheckLayerAvailabilityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: LayerFailureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: LayerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

