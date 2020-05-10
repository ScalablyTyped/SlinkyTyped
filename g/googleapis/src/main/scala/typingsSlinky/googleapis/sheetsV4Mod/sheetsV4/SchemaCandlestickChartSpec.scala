package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/candlestickchart&quot;&gt;candlestick
  * chart&lt;/a&gt;.
  */
@js.native
trait SchemaCandlestickChartSpec extends js.Object {
  /**
    * The Candlestick chart data. Only one CandlestickData is supported.
    */
  var data: js.UndefOr[js.Array[SchemaCandlestickData]] = js.native
  /**
    * The domain data (horizontal axis) for the candlestick chart.  String data
    * will be treated as discrete labels, other data will be treated as
    * continuous values.
    */
  var domain: js.UndefOr[SchemaCandlestickDomain] = js.native
}

object SchemaCandlestickChartSpec {
  @scala.inline
  def apply(): SchemaCandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickChartSpec]
  }
  @scala.inline
  implicit class SchemaCandlestickChartSpecOps[Self <: SchemaCandlestickChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[SchemaCandlestickData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: SchemaCandlestickDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
  }
  
}

