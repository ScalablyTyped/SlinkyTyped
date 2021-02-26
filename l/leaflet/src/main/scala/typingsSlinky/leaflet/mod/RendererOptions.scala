package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererOptions extends LayerOptions {
  
  var padding: js.UndefOr[Double] = js.native
  
  var tolerance: js.UndefOr[Double] = js.native
}
object RendererOptions {
  
  @scala.inline
  def apply(): RendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererOptions]
  }
  
  @scala.inline
  implicit class RendererOptionsMutableBuilder[Self <: RendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
