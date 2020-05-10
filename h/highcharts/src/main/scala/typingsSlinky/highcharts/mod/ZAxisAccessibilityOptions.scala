package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZAxisAccessibilityOptions extends js.Object {
  /**
    * (Highcharts) Description for an axis to expose to screen reader users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Enable axis accessibility features, including axis
    * information in the screen reader information region. If this is disabled
    * on the xAxis, the x values are not exposed to screen readers for the
    * individual data points by default.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Range description for an axis. Overrides the default range
    * description. Set to empty to disable range description for this axis.
    */
  var rangeDescription: js.UndefOr[String] = js.native
}

object ZAxisAccessibilityOptions {
  @scala.inline
  def apply(): ZAxisAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisAccessibilityOptions]
  }
  @scala.inline
  implicit class ZAxisAccessibilityOptionsOps[Self <: ZAxisAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeDescription")(js.undefined)
        ret
    }
  }
  
}

