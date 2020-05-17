package typingsSlinky.amapJsApiPlaceSearch.anon

import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Dining
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.DINING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deeptype extends js.Object {
  var deep_type: DINING = js.native
  /**
    * @deprecated 餐饮类深度信息
    */
  var dining: Dining = js.native
}

object Deeptype {
  @scala.inline
  def apply(deep_type: DINING, dining: Dining): Deeptype = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], dining = dining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeptype]
  }
  @scala.inline
  implicit class DeeptypeOps[Self <: Deeptype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep_type(value: DINING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDining(value: Dining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dining")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

