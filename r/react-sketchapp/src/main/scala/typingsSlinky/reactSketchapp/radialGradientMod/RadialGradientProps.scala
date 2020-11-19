package typingsSlinky.reactSketchapp.radialGradientMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGradientProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var cx: NumberProp = js.native
  
  var cy: NumberProp = js.native
  
  var fx: NumberProp = js.native
  
  var fy: NumberProp = js.native
  
  var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.native
  
  var id: String = js.native
  
  var r: js.UndefOr[NumberProp] = js.native
  
  var rx: js.UndefOr[NumberProp] = js.native
  
  var ry: js.UndefOr[NumberProp] = js.native
}
object RadialGradientProps {
  
  @scala.inline
  def apply(cx: NumberProp, cy: NumberProp, fx: NumberProp, fy: NumberProp, id: String): RadialGradientProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientProps]
  }
  
  @scala.inline
  implicit class RadialGradientPropsOps[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
    
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
    def setCx(value: NumberProp): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy(value: NumberProp): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFx(value: NumberProp): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFy(value: NumberProp): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: objectBoundingBox | userSpaceOnUse): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    
    @scala.inline
    def setR(value: NumberProp): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setRx(value: NumberProp): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: NumberProp): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
  }
}
