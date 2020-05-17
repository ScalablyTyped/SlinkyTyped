package typingsSlinky.amapJsApiIndoorMap.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.Shop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buildingid extends js.Object {
  /**
    * 店铺所属楼宇信息
    */
  var building_id: String = js.native
  /**
    * 楼层
    */
  var floor: Double = js.native
  /**
    * 经纬度
    */
  var lnglat: LngLat = js.native
  /**
    * 商店
    */
  var shop: Shop = js.native
}

object Buildingid {
  @scala.inline
  def apply(building_id: String, floor: Double, lnglat: LngLat, shop: Shop): Buildingid = {
    val __obj = js.Dynamic.literal(building_id = building_id.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildingid]
  }
  @scala.inline
  implicit class BuildingidOps[Self <: Buildingid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilding_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLnglat(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnglat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShop(value: Shop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

