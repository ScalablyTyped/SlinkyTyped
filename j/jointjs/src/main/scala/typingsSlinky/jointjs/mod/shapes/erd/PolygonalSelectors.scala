package typingsSlinky.jointjs.mod.shapes.erd

import typingsSlinky.jointjs.mod.attributes.SVGPolygonAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonalSelectors extends Selectors {
  
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGPolygonAttributes] = js.native
  
  @JSName(".label")
  var Dotlabel: js.UndefOr[SVGPolygonAttributes] = js.native
  
  var text: js.UndefOr[SVGTextAttributes] = js.native
}
object PolygonalSelectors {
  
  @scala.inline
  def apply(): PolygonalSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonalSelectors]
  }
  
  @scala.inline
  implicit class PolygonalSelectorsOps[Self <: PolygonalSelectors] (val x: Self) extends AnyVal {
    
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
    def setDotbody(value: SVGPolygonAttributes): Self = this.set(".body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotbody: Self = this.set(".body", js.undefined)
    
    @scala.inline
    def setDotlabel(value: SVGPolygonAttributes): Self = this.set(".label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotlabel: Self = this.set(".label", js.undefined)
    
    @scala.inline
    def setText(value: SVGTextAttributes): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
