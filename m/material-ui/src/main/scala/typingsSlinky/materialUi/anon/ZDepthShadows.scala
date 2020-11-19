package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZDepthShadows extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var zDepthShadows: js.UndefOr[js.Array[String]] = js.native
}
object ZDepthShadows {
  
  @scala.inline
  def apply(): ZDepthShadows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZDepthShadows]
  }
  
  @scala.inline
  implicit class ZDepthShadowsOps[Self <: ZDepthShadows] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setZDepthShadowsVarargs(value: String*): Self = this.set("zDepthShadows", js.Array(value :_*))
    
    @scala.inline
    def setZDepthShadows(value: js.Array[String]): Self = this.set("zDepthShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDepthShadows: Self = this.set("zDepthShadows", js.undefined)
  }
}
