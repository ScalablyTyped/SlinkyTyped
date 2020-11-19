package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackItemObject extends js.Object {
  
  /**
    * Alignment settings
    */
  var alignOptions: AlignObject = js.native
  
  /**
    * Related axis
    */
  var axis: Axis = js.native
  
  /**
    * Cumulative value of the stacked data points
    */
  var cumulative: Double = js.native
  
  /**
    * True if on the negative side
    */
  var isNegative: Boolean = js.native
  
  /**
    * Related SVG element
    */
  var label: SVGElement = js.native
  
  /**
    * Related stack options
    */
  var options: YAxisStackLabelsOptions = js.native
  
  /**
    * Total value of the stacked data points
    */
  var total: Double = js.native
  
  /**
    * Shared x value of the stack
    */
  var x: Double = js.native
}
object StackItemObject {
  
  @scala.inline
  def apply(
    alignOptions: AlignObject,
    axis: Axis,
    cumulative: Double,
    isNegative: Boolean,
    label: SVGElement,
    options: YAxisStackLabelsOptions,
    total: Double,
    x: Double
  ): StackItemObject = {
    val __obj = js.Dynamic.literal(alignOptions = alignOptions.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], isNegative = isNegative.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackItemObject]
  }
  
  @scala.inline
  implicit class StackItemObjectOps[Self <: StackItemObject] (val x: Self) extends AnyVal {
    
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
    def setAlignOptions(value: AlignObject): Self = this.set("alignOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulative(value: Double): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNegative(value: Boolean): Self = this.set("isNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: SVGElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: YAxisStackLabelsOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
  }
}
