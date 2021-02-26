package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialPlotDataAutobinx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStyle extends StObject {
  
  var target: Double | String | (js.Array[Double | String]) = js.native
  
  var value: PartialPlotDataAutobinx = js.native
}
object TransformStyle {
  
  @scala.inline
  def apply(target: Double | String | (js.Array[Double | String]), value: PartialPlotDataAutobinx): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStyle]
  }
  
  @scala.inline
  implicit class TransformStyleMutableBuilder[Self <: TransformStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (Double | String)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: PartialPlotDataAutobinx): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
