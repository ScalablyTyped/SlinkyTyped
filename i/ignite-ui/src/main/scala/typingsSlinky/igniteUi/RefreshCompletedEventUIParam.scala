package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshCompletedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
}

object RefreshCompletedEventUIParam {
  @scala.inline
  def apply(): RefreshCompletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCompletedEventUIParam]
  }
  @scala.inline
  implicit class RefreshCompletedEventUIParamOps[Self <: RefreshCompletedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
  }
  
}

