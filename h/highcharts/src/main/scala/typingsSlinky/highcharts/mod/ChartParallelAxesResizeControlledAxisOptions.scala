package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesResizeControlledAxisOptions extends StObject {
  
  /**
    * (Highstock) Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis will be used.
    */
  var next: js.UndefOr[js.Array[Double | String]] = js.native
  
  /**
    * (Highstock) Array of axes that should move with the current axis while
    * resizing.
    */
  var prev: js.UndefOr[js.Array[Double | String]] = js.native
}
object ChartParallelAxesResizeControlledAxisOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesResizeControlledAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesResizeControlledAxisOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesResizeControlledAxisOptionsMutableBuilder[Self <: ChartParallelAxesResizeControlledAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: js.Array[Double | String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setNextVarargs(value: (Double | String)*): Self = StObject.set(x, "next", js.Array(value :_*))
    
    @scala.inline
    def setPrev(value: js.Array[Double | String]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setPrevVarargs(value: (Double | String)*): Self = StObject.set(x, "prev", js.Array(value :_*))
  }
}
