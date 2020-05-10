package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartOptions extends js.Object {
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
    */
  var reverseData: js.UndefOr[Boolean] = js.native
}

object IChartOptions {
  @scala.inline
  def apply(): IChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartOptions]
  }
  @scala.inline
  implicit class IChartOptionsOps[Self <: IChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseData")(js.undefined)
        ret
    }
  }
  
}

