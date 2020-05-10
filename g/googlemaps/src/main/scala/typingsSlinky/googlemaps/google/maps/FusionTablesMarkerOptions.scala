package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionTablesMarkerOptions extends js.Object {
  var iconName: String = js.native
}

object FusionTablesMarkerOptions {
  @scala.inline
  def apply(iconName: String): FusionTablesMarkerOptions = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesMarkerOptions]
  }
  @scala.inline
  implicit class FusionTablesMarkerOptionsOps[Self <: FusionTablesMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

