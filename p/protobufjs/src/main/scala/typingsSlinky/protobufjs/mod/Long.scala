package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long extends StObject {
  
  /** High bits */
  var high: Double = js.native
  
  /** Low bits */
  var low: Double = js.native
  
  /** Whether unsigned or not */
  var unsigned: Boolean = js.native
}
object Long {
  
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): Long = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
  }
}
