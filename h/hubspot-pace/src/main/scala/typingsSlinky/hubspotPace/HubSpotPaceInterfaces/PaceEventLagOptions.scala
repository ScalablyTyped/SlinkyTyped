package typingsSlinky.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceEventLagOptions extends js.Object {
  /**
    * Above how many ms of lag is the CPU considered busy?
    */
  var lagThreshold: js.UndefOr[Double] = js.native
  /**
    * When we first start measuring event lag, not much is going on in the browser yet, so it's not uncommon for the numbers to be abnormally low for the first few samples. This configures how many samples we need before we consider a low number to mean completion.
    */
  var minSamples: js.UndefOr[Double] = js.native
  /**
    * How many samples should we average to decide what the current lag is?
    */
  var sampleCount: js.UndefOr[Double] = js.native
}

object PaceEventLagOptions {
  @scala.inline
  def apply(): PaceEventLagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceEventLagOptions]
  }
  @scala.inline
  implicit class PaceEventLagOptionsOps[Self <: PaceEventLagOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLagThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSamples")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleCount")(js.undefined)
        ret
    }
  }
  
}

