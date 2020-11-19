package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightUrl extends js.Object {
  
  var height: js.UndefOr[Double | RangeMaxPoint] = js.native
  
  var url: js.UndefOr[String | RangeMinPoint] = js.native
  
  var width: js.UndefOr[Double | RangeMaxPoint] = js.native
}
object HeightUrl {
  
  @scala.inline
  def apply(): HeightUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightUrl]
  }
  
  @scala.inline
  implicit class HeightUrlOps[Self <: HeightUrl] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double | RangeMaxPoint): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setUrl(value: String | RangeMinPoint): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | RangeMaxPoint): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
