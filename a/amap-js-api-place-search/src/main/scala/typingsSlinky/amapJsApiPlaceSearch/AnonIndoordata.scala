package typingsSlinky.amapJsApiPlaceSearch

import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndoordata extends js.Object {
  var indoor_data: AnonCpid = js.native
  var indoor_map: `true` = js.native
}

object AnonIndoordata {
  @scala.inline
  def apply(indoor_data: AnonCpid, indoor_map: `true`): AnonIndoordata = {
    val __obj = js.Dynamic.literal(indoor_data = indoor_data.asInstanceOf[js.Any], indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndoordata]
  }
  @scala.inline
  implicit class AnonIndoordataOps[Self <: AnonIndoordata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndoor_data(value: AnonCpid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoor_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndoor_map(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoor_map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

