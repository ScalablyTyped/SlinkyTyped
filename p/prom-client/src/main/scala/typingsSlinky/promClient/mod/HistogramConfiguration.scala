package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.native
  var buckets: js.UndefOr[js.Array[Double]] = js.native
  var help: String = js.native
  var labelNames: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var registers: js.UndefOr[js.Array[Registry]] = js.native
}

object HistogramConfiguration {
  @scala.inline
  def apply(help: String, name: String): HistogramConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfiguration]
  }
  @scala.inline
  implicit class HistogramConfigurationOps[Self <: HistogramConfiguration] (val x: Self) extends AnyVal {
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
    def withBuckets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
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

