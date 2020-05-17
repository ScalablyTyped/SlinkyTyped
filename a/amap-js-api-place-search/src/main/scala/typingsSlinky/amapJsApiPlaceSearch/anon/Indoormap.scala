package typingsSlinky.amapJsApiPlaceSearch.anon

import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indoormap extends js.Object {
  var indoor_map: `false` = js.native
}

object Indoormap {
  @scala.inline
  def apply(indoor_map: `false`): Indoormap = {
    val __obj = js.Dynamic.literal(indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indoormap]
  }
  @scala.inline
  implicit class IndoormapOps[Self <: Indoormap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndoor_map(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoor_map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

