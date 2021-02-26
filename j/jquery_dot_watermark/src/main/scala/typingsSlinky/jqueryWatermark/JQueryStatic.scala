package typingsSlinky.jqueryWatermark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var watermark: Watermark = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(watermark: Watermark): JQueryStatic = {
    val __obj = js.Dynamic.literal(watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWatermark(value: Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
