package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInstrumentOptionsObject extends js.Object {
  /**
    * The maximum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 2000.
    */
  var maxDuration: js.UndefOr[Double] = js.native
  /**
    * The maximum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 2200.
    */
  var maxFrequency: js.UndefOr[Double] = js.native
  /**
    * The maximum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to 1 (fully right).
    */
  var maxPan: js.UndefOr[Double] = js.native
  /**
    * The maximum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 1.
    */
  var maxVolume: js.UndefOr[Double] = js.native
  /**
    * The minimum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 20.
    */
  var minDuration: js.UndefOr[Double] = js.native
  /**
    * The minimum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 220.
    */
  var minFrequency: js.UndefOr[Double] = js.native
  /**
    * The minimum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to -1 (fully left).
    */
  var minPan: js.UndefOr[Double] = js.native
  /**
    * The minimum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 0.1.
    */
  var minVolume: js.UndefOr[Double] = js.native
}

object PointInstrumentOptionsObject {
  @scala.inline
  def apply(): PointInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInstrumentOptionsObject]
  }
  @scala.inline
  implicit class PointInstrumentOptionsObjectOps[Self <: PointInstrumentOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPan")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVolume")(js.undefined)
        ret
    }
  }
  
}

