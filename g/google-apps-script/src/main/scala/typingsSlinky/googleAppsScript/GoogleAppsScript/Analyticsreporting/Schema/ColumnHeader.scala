package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnHeader extends js.Object {
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  var metricHeader: js.UndefOr[MetricHeader] = js.native
}

object ColumnHeader {
  @scala.inline
  def apply(): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeader]
  }
  @scala.inline
  implicit class ColumnHeaderOps[Self <: ColumnHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricHeader(value: MetricHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeader")(js.undefined)
        ret
    }
  }
  
}

