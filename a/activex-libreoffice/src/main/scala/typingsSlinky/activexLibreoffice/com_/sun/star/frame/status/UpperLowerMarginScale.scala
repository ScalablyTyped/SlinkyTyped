package typingsSlinky.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an upper and lower margin.
  * @since OOo 2.0
  */
@js.native
trait UpperLowerMarginScale extends js.Object {
  
  /** specifies a lower margin in 1/100th mm. */
  var Lower: Double = js.native
  
  /** specifies a scale value for the lower margin. */
  var ScaleLower: Double = js.native
  
  /** specifies a scale value for the upper margin. */
  var ScaleUpper: Double = js.native
  
  /** specifies a upper margin in 1/100th mm. */
  var Upper: Double = js.native
}
object UpperLowerMarginScale {
  
  @scala.inline
  def apply(Lower: Double, ScaleLower: Double, ScaleUpper: Double, Upper: Double): UpperLowerMarginScale = {
    val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], ScaleLower = ScaleLower.asInstanceOf[js.Any], ScaleUpper = ScaleUpper.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpperLowerMarginScale]
  }
  
  @scala.inline
  implicit class UpperLowerMarginScaleOps[Self <: UpperLowerMarginScale] (val x: Self) extends AnyVal {
    
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
    def setLower(value: Double): Self = this.set("Lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleLower(value: Double): Self = this.set("ScaleLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUpper(value: Double): Self = this.set("ScaleUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: Double): Self = this.set("Upper", value.asInstanceOf[js.Any])
  }
}
