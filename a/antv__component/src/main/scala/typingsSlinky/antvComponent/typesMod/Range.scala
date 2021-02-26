package typingsSlinky.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  /**
    * 结束值
    * @type {number}
    */
  var max: Double = js.native
  
  /**
    * 开始值
    * @type {number}
    */
  var min: Double = js.native
}
object Range {
  
  @scala.inline
  def apply(max: Double, min: Double): Range = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
