package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsMeasureControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.native
}
object AnnotationsMeasureControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureControlPointOptionsMutableBuilder[Self <: AnnotationsMeasureControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
