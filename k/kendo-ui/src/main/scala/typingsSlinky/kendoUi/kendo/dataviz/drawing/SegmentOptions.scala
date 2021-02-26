package typingsSlinky.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object SegmentOptions {
  
  @scala.inline
  def apply(): SegmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentOptions]
  }
  
  @scala.inline
  implicit class SegmentOptionsMutableBuilder[Self <: SegmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
