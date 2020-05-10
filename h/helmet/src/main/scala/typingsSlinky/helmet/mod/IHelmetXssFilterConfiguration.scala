package typingsSlinky.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetXssFilterConfiguration extends js.Object {
  var reportUri: js.UndefOr[String] = js.native
  var setOnOldIE: js.UndefOr[Boolean] = js.native
}

object IHelmetXssFilterConfiguration {
  @scala.inline
  def apply(): IHelmetXssFilterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetXssFilterConfiguration]
  }
  @scala.inline
  implicit class IHelmetXssFilterConfigurationOps[Self <: IHelmetXssFilterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnOldIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnOldIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetOnOldIE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnOldIE")(js.undefined)
        ret
    }
  }
  
}

