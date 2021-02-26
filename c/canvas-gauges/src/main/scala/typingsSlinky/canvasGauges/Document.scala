package typingsSlinky.canvasGauges

import typingsSlinky.canvasGauges.CanvasGauges.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  var gauges: Collection = js.native
}
object Document {
  
  @scala.inline
  def apply(gauges: Collection): Document = {
    val __obj = js.Dynamic.literal(gauges = gauges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGauges(value: Collection): Self = StObject.set(x, "gauges", value.asInstanceOf[js.Any])
  }
}
