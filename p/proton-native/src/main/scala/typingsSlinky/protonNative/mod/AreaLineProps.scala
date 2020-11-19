package typingsSlinky.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaLineProps extends AreaBaseProps {
  
  /**
    * The x coordinate of the line's start point.
    */
  var x1: Double | String = js.native
  
  /**
    * The x coordinate of the line's end point.
    */
  var x2: Double | String = js.native
  
  /**
    * The y coordinate of the line's start point.
    */
  var y1: Double | String = js.native
  
  /**
    * The y coordinate of the line's end point.
    */
  var y2: Double | String = js.native
}
object AreaLineProps {
  
  @scala.inline
  def apply(x1: Double | String, x2: Double | String, y1: Double | String, y2: Double | String): AreaLineProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaLineProps]
  }
  
  @scala.inline
  implicit class AreaLinePropsOps[Self <: AreaLineProps] (val x: Self) extends AnyVal {
    
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
    def setX1(value: Double | String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double | String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double | String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double | String): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
}
