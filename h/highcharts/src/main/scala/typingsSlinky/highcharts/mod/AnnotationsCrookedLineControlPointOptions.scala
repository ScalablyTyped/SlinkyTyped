package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsCrookedLineControlPointOptions extends StObject {
  
  var events: js.UndefOr[js.Any] = js.native
}
object AnnotationsCrookedLineControlPointOptions {
  
  @scala.inline
  def apply(): AnnotationsCrookedLineControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsCrookedLineControlPointOptions]
  }
  
  @scala.inline
  implicit class AnnotationsCrookedLineControlPointOptionsMutableBuilder[Self <: AnnotationsCrookedLineControlPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
