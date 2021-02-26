package typingsSlinky.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slope and y-intercept of a line.
  */
@js.native
trait ISlope extends StObject {
  
  /**
    * Boolean to see if line has slope or is vertical.
    */
  var hasSlope: Boolean = js.native
  
  /**
    * Line used to calculate this slope.
    */
  var line: IPathLine = js.native
  
  /**
    * Optional value of non-vertical slope.
    */
  var slope: js.UndefOr[Double] = js.native
  
  /**
    * Optional value of y when x = 0.
    */
  var yIntercept: js.UndefOr[Double] = js.native
}
object ISlope {
  
  @scala.inline
  def apply(hasSlope: Boolean, line: IPathLine): ISlope = {
    val __obj = js.Dynamic.literal(hasSlope = hasSlope.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlope]
  }
  
  @scala.inline
  implicit class ISlopeMutableBuilder[Self <: ISlope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasSlope(value: Boolean): Self = StObject.set(x, "hasSlope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: IPathLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlope(value: Double): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
    
    @scala.inline
    def setYIntercept(value: Double): Self = StObject.set(x, "yIntercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInterceptUndefined: Self = StObject.set(x, "yIntercept", js.undefined)
  }
}
