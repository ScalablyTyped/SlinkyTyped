package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the relative number of devices running a given configuration of
  * the Android platform.
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * Output only. The estimated fraction (0-1) of the total market with this
    * configuration.
    */
  var marketShare: js.UndefOr[Double] = js.native
  /**
    * Output only. The time this distribution was measured.
    */
  var measurementTime: js.UndefOr[String] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  @scala.inline
  implicit class SchemaDistributionOps[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarketShare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketShare")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementTime")(js.undefined)
        ret
    }
  }
  
}

