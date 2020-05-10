package typingsSlinky.amapJsApiHeatmap

import typingsSlinky.amapJsApiHeatmap.AMap.Heatmap.DataSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData extends js.Object {
  var data: String = js.native
  var dataParser: js.UndefOr[js.Function1[/* data */ js.Any, DataSet]] = js.native
}

object AnonData {
  @scala.inline
  def apply(data: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
  @scala.inline
  implicit class AnonDataOps[Self <: AnonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataParser(value: /* data */ js.Any => DataSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataParser")(js.undefined)
        ret
    }
  }
  
}

