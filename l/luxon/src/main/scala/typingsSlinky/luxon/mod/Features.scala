package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  var intl: Boolean = js.native
  var intlTokens: Boolean = js.native
  var zones: Boolean = js.native
}

object Features {
  @scala.inline
  def apply(intl: Boolean, intlTokens: Boolean, zones: Boolean): Features = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], intlTokens = intlTokens.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntlTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intlTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZones(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

