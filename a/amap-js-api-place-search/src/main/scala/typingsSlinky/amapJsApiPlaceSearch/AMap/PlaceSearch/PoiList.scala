package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoiList extends js.Object {
  
  /**
    * 查询结果总数
    */
  var count: Double = js.native
  
   // PlaceSearchPoiBase[] | PlaceSearchPoiExt[];
  /**
    * 页码
    */
  var pageIndex: Double = js.native
  
  /**
    * 单页结果数
    */
  var pageSize: Double = js.native
  
  /**
    * Poi列表
    */
  var pois: js.Array[Poi] = js.native
}
object PoiList {
  
  @scala.inline
  def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiList]
  }
  
  @scala.inline
  implicit class PoiListOps[Self <: PoiList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoisVarargs(value: Poi*): Self = this.set("pois", js.Array(value :_*))
    
    @scala.inline
    def setPois(value: js.Array[Poi]): Self = this.set("pois", value.asInstanceOf[js.Any])
  }
}
