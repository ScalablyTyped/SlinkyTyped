package typingsSlinky.amapJsApiIndoorMap

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.Shop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Buildingid extends StObject {
    
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
    implicit class BuildingidMutableBuilder[Self <: Buildingid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuilding_id(value: String): Self = StObject.set(x, "building_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShop(value: Shop): Self = StObject.set(x, "shop", value.asInstanceOf[js.Any])
    }
  }
}
