package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitLine extends js.Object {
  /**
    * is an array containing a single `TransitAgency` object.
    * The `TransitAgency` object provides information about the operator of the line
    */
  var agencies: js.Array[TransitAgency] = js.native
  /** contains the color commonly used in signage for this transit line. The color will be specified as a hex string such as: #FF0033. */
  var color: String = js.native
  /** contains the URL for the icon associated with this line. */
  var icon: String = js.native
  /** contains the full name of this transit line. eg. "7 Avenue Express". */
  var name: String = js.native
  /** contains the short name of this transit line. This will normally be a line number, such as "M7" or "355". */
  var short_name: String = js.native
  /** contains the color of text commonly used for signage of this line. The color will be specified as a hex string. */
  var text_color: String = js.native
  /** contains the URL for this transit line as provided by the transit agency. */
  var url: String = js.native
  /** contains the type of vehicle used on this line. */
  var vehicle: TransitVehicle = js.native
}

object TransitLine {
  @scala.inline
  def apply(
    agencies: js.Array[TransitAgency],
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
  @scala.inline
  implicit class TransitLineOps[Self <: TransitLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgencies(value: js.Array[TransitAgency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVehicle(value: TransitVehicle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

