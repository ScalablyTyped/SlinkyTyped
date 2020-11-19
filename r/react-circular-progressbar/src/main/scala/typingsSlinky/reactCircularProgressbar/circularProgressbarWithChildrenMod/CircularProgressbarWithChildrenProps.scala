package typingsSlinky.reactCircularProgressbar.circularProgressbarWithChildrenMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactCircularProgressbar.anon.Background
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-circular-progressbar.react-circular-progressbar/dist/types.CircularProgressbarWrapperProps & {  children :react.react.ReactNode | undefined} */
@js.native
trait CircularProgressbarWithChildrenProps extends js.Object {
  
  var background: js.UndefOr[Boolean] = js.native
  
  var backgroundPadding: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var circleRatio: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[Background] = js.native
  
  var counterClockwise: js.UndefOr[Boolean] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
  
  var styles: js.UndefOr[CircularProgressbarStyles] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: Double = js.native
}
object CircularProgressbarWithChildrenProps {
  
  @scala.inline
  def apply(value: Double): CircularProgressbarWithChildrenProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarWithChildrenProps]
  }
  
  @scala.inline
  implicit class CircularProgressbarWithChildrenPropsOps[Self <: CircularProgressbarWithChildrenProps] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Double): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPadding: Self = this.set("backgroundPadding", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCircleRatio(value: Double): Self = this.set("circleRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleRatio: Self = this.set("circleRatio", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: Background): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCounterClockwise(value: Boolean): Self = this.set("counterClockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterClockwise: Self = this.set("counterClockwise", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setStyles(value: CircularProgressbarStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
