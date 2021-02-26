package typingsSlinky.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinchRotateOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object PinchRotateOptions {
  
  @scala.inline
  def apply(): PinchRotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchRotateOptions]
  }
  
  @scala.inline
  implicit class PinchRotateOptionsMutableBuilder[Self <: PinchRotateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
