package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.Ray
import typingsSlinky.playcanvas.pc.XrHitTestSource
import typingsSlinky.playcanvas.pc.callbacks.XrHitTestStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetRay extends StObject {
  
  var callback: js.UndefOr[XrHitTestStart] = js.native
  
  var entityTypes: js.UndefOr[js.Array[String]] = js.native
  
  var offsetRay: js.UndefOr[Ray] = js.native
}
object OffsetRay {
  
  @scala.inline
  def apply(): OffsetRay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetRay]
  }
  
  @scala.inline
  implicit class OffsetRayMutableBuilder[Self <: OffsetRay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (/* err */ js.Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRay(value: Ray): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
  }
}
