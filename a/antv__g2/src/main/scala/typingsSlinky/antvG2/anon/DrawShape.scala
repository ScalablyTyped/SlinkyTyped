package typingsSlinky.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawShape extends js.Object {
  
  var drawShape: js.Any = js.native
  
  var getMarkerCfg: js.UndefOr[js.Any] = js.native
  
  var getPoints: js.UndefOr[js.Any] = js.native
}
object DrawShape {
  
  @scala.inline
  def apply(drawShape: js.Any): DrawShape = {
    val __obj = js.Dynamic.literal(drawShape = drawShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawShape]
  }
  
  @scala.inline
  implicit class DrawShapeOps[Self <: DrawShape] (val x: Self) extends AnyVal {
    
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
    def setDrawShape(value: js.Any): Self = this.set("drawShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMarkerCfg(value: js.Any): Self = this.set("getMarkerCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetMarkerCfg: Self = this.set("getMarkerCfg", js.undefined)
    
    @scala.inline
    def setGetPoints(value: js.Any): Self = this.set("getPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetPoints: Self = this.set("getPoints", js.undefined)
  }
}
