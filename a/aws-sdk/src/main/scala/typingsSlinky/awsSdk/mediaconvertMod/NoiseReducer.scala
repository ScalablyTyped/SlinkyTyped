package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducer extends js.Object {
  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
    */
  var Filter: js.UndefOr[NoiseReducerFilter] = js.native
  /**
    * Settings for a noise reducer filter
    */
  var FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.native
  /**
    * Noise reducer filter settings for spatial filter.
    */
  var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.native
  /**
    * Noise reducer filter settings for temporal filter.
    */
  var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings] = js.native
}

object NoiseReducer {
  @scala.inline
  def apply(): NoiseReducer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducer]
  }
  @scala.inline
  implicit class NoiseReducerOps[Self <: NoiseReducer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: NoiseReducerFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSettings(value: NoiseReducerFilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialFilterSettings(value: NoiseReducerSpatialFilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpatialFilterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpatialFilterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporalFilterSettings(value: NoiseReducerTemporalFilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalFilterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporalFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporalFilterSettings")(js.undefined)
        ret
    }
  }
  
}

