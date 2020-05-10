package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistrictSearchOptions extends js.Object {
  var extensions: js.UndefOr[String] = js.native
  var level: String = js.native
  var showbiz: js.UndefOr[Boolean] = js.native
  var subdistrict: js.UndefOr[Double] = js.native
}

object DistrictSearchOptions {
  @scala.inline
  def apply(level: String): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
  @scala.inline
  implicit class DistrictSearchOptionsOps[Self <: DistrictSearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowbiz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showbiz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowbiz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showbiz")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdistrict(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdistrict")(js.undefined)
        ret
    }
  }
  
}

