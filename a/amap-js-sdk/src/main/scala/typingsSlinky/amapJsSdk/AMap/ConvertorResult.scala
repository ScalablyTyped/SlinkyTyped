package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 坐标转换结果
  */
@js.native
trait ConvertorResult extends js.Object {
  
  var info: String = js.native
  
  var locations: js.Array[LngLat] = js.native
}
object ConvertorResult {
  
  @scala.inline
  def apply(info: String, locations: js.Array[LngLat]): ConvertorResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertorResult]
  }
  
  @scala.inline
  implicit class ConvertorResultOps[Self <: ConvertorResult] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: LngLat*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[LngLat]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
}
