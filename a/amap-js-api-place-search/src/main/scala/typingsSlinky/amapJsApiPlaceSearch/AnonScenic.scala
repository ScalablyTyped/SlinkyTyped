package typingsSlinky.amapJsApiPlaceSearch

import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScenic extends js.Object {
  var deep_type: SCENIC = js.native
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: Scenic = js.native
}

object AnonScenic {
  @scala.inline
  def apply(deep_type: SCENIC, scenic: Scenic): AnonScenic = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScenic]
  }
  @scala.inline
  implicit class AnonScenicOps[Self <: AnonScenic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep_type(value: SCENIC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenic(value: Scenic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

