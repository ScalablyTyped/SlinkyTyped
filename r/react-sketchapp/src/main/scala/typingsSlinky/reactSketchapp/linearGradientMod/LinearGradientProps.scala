package typingsSlinky.reactSketchapp.linearGradientMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGradientProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var x1: NumberProp = js.native
  
  var x2: NumberProp = js.native
  
  var y1: NumberProp = js.native
  
  var y2: NumberProp = js.native
}
object LinearGradientProps {
  
  @scala.inline
  def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): LinearGradientProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
  
  @scala.inline
  implicit class LinearGradientPropsOps[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
    
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
    def setX1(value: NumberProp): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: NumberProp): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: NumberProp): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: NumberProp): Self = this.set("y2", value.asInstanceOf[js.Any])
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
