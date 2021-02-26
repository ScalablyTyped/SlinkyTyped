package typingsSlinky.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A measurement of extents, the high and low points.
  */
@js.native
trait IMeasure extends StObject {
  
  /**
    * The point containing both the highest x and y values of the rectangle containing the item being measured.
    */
  var high: IPoint = js.native
  
  /**
    * The point containing both the lowest x and y values of the rectangle containing the item being measured.
    */
  var low: IPoint = js.native
}
object IMeasure {
  
  @scala.inline
  def apply(high: IPoint, low: IPoint): IMeasure = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasure]
  }
  
  @scala.inline
  implicit class IMeasureMutableBuilder[Self <: IMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: IPoint): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: IPoint): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
