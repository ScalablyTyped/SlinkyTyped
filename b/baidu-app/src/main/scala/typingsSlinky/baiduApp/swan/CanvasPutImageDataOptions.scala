package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPutImageDataOptions extends CanvasImageDataOptions {
  
  var data: js.typedarray.Uint8ClampedArray = js.native
}
object CanvasPutImageDataOptions {
  
  @scala.inline
  def apply(
    canvasId: String,
    data: js.typedarray.Uint8ClampedArray,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
  
  @scala.inline
  implicit class CanvasPutImageDataOptionsMutableBuilder[Self <: CanvasPutImageDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
