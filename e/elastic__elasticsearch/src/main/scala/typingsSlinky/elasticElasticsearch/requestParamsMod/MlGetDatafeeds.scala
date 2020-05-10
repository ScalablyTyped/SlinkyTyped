package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetDatafeeds extends Generic {
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.native
  var datafeed_id: js.UndefOr[String] = js.native
}

object MlGetDatafeeds {
  @scala.inline
  def apply(): MlGetDatafeeds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetDatafeeds]
  }
  @scala.inline
  implicit class MlGetDatafeedsOps[Self <: MlGetDatafeeds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_no_datafeeds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_datafeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_datafeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_datafeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeed_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeed_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeed_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeed_id")(js.undefined)
        ret
    }
  }
  
}

