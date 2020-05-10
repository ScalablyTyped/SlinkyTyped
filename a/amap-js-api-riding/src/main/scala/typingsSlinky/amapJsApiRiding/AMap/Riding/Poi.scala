package typingsSlinky.amapJsApiRiding.AMap.Riding

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.end
import typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poi extends js.Object {
  /**
    * 坐标
    */
  var location: LngLat = js.native
  /**
    * 名称
    */
  var name: String = js.native
  /**
    * 类型
    */
  var `type`: start | end = js.native
}

object Poi {
  @scala.inline
  def apply(location: LngLat, name: String, `type`: start | end): Poi = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
  @scala.inline
  implicit class PoiOps[Self <: Poi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

