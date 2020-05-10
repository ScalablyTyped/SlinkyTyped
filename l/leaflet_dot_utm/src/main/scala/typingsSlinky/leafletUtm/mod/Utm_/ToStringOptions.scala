package typingsSlinky.leafletUtm.mod.Utm_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToStringOptions extends js.Object {
  /** Number of decimals for x and y. Default 1. */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * String defining the format to use.
    * Default `{x}{sep} {y}{sep} {zone}{band}{sep} {datum}`, where:
    * `{x}: easting`
    * `{y}: northing`
    * `{zone}: UTM zone, value between 1 and 60`
    * `{band}: Band letter, between C and X`
    * `{datum}: WGS84`
    * `{hemi}: Hemisphere, north or south`
    * `{sep}: separator`
    */
  var format: js.UndefOr[String] = js.native
  /** String used in the format for field {hemi} in the north hemisphere. Default 'North'. */
  var north: js.UndefOr[String] = js.native
  /** Separator used in the format. Default ','. */
  var sep: js.UndefOr[String] = js.native
  /** String used in the format for field {hemi} in the south hemisphere. Default 'South'. */
  var south: js.UndefOr[String] = js.native
}

object ToStringOptions {
  @scala.inline
  def apply(): ToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToStringOptions]
  }
  @scala.inline
  implicit class ToStringOptionsOps[Self <: ToStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withNorth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNorth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(js.undefined)
        ret
    }
    @scala.inline
    def withSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(js.undefined)
        ret
    }
    @scala.inline
    def withSouth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSouth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(js.undefined)
        ret
    }
  }
  
}

