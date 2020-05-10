package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiDataRow extends js.Object {
  var clicks: js.UndefOr[Double] = js.native
  var ctr: js.UndefOr[Double] = js.native
  var impressions: js.UndefOr[Double] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var position: js.UndefOr[Double] = js.native
}

object ApiDataRow {
  @scala.inline
  def apply(): ApiDataRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDataRow]
  }
  @scala.inline
  implicit class ApiDataRowOps[Self <: ApiDataRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicks")(js.undefined)
        ret
    }
    @scala.inline
    def withCtr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctr")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

