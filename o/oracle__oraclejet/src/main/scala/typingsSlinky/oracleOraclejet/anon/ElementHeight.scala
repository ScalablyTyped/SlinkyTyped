package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementHeight extends js.Object {
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object ElementHeight {
  
  @scala.inline
  def apply(element: org.scalajs.dom.raw.Element, height: Double, width: Double): ElementHeight = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementHeight]
  }
  
  @scala.inline
  implicit class ElementHeightOps[Self <: ElementHeight] (val x: Self) extends AnyVal {
    
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
    def setElement(value: org.scalajs.dom.raw.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
