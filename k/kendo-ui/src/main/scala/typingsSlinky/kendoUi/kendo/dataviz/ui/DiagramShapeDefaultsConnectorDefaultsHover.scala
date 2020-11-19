package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeDefaultsConnectorDefaultsHover extends js.Object {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverFill] = js.native
  
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverStroke] = js.native
}
object DiagramShapeDefaultsConnectorDefaultsHover {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHover]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsConnectorDefaultsHoverOps[Self <: DiagramShapeDefaultsConnectorDefaultsHover] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String | DiagramShapeDefaultsConnectorDefaultsHoverFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeDefaultsConnectorDefaultsHoverStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
