package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryConfiguration extends js.Object {
  var ageBuckets: js.UndefOr[Double] = js.native
  var aggregator: js.UndefOr[Aggregator] = js.native
  var compressCount: js.UndefOr[Double] = js.native
  var help: String = js.native
  var labelNames: js.UndefOr[js.Array[String]] = js.native
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var name: String = js.native
  var percentiles: js.UndefOr[js.Array[Double]] = js.native
  var registers: js.UndefOr[js.Array[Registry]] = js.native
}

object SummaryConfiguration {
  @scala.inline
  def apply(help: String, name: String): SummaryConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration]
  }
  @scala.inline
  implicit class SummaryConfigurationOps[Self <: SummaryConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgeBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregator(value: Aggregator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentiles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisters(value: js.Array[Registry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registers")(js.undefined)
        ret
    }
  }
  
}

