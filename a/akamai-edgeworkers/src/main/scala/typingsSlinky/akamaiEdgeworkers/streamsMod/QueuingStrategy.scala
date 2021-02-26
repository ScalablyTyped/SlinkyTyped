package typingsSlinky.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueuingStrategy[T] extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[QueuingStrategySizeCallback[T]] = js.native
}
object QueuingStrategy {
  
  @scala.inline
  def apply[T](): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
  
  @scala.inline
  implicit class QueuingStrategyMutableBuilder[Self <: QueuingStrategy[_], T] (val x: Self with QueuingStrategy[T]) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setSize(value: T => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
