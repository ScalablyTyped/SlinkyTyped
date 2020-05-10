package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.native
  var help: String = js.native
  var labelNames: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var registers: js.UndefOr[js.Array[Registry]] = js.native
}

object GaugeConfiguration {
  @scala.inline
  def apply(help: String, name: String): GaugeConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeConfiguration]
  }
  @scala.inline
  implicit class GaugeConfigurationOps[Self <: GaugeConfiguration] (val x: Self) extends AnyVal {
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

