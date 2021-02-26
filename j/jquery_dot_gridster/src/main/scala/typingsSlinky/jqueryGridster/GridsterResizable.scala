package typingsSlinky.jqueryGridster

import org.scalajs.dom.raw.Event
import typingsSlinky.jqueryGridster.anon.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterResizable extends StObject {
  
  var axes: js.UndefOr[js.Array[String]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var handle_append_to: js.UndefOr[String] = js.native
  
  var handle_class: js.UndefOr[String] = js.native
  
  var max_size: js.UndefOr[js.Array[Double]] = js.native
  
  var min_size: js.UndefOr[js.Array[Double]] = js.native
  
  var resize: js.UndefOr[js.Function3[/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.native
  
  var start: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.native
  
  var stop: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.native
}
object GridsterResizable {
  
  @scala.inline
  def apply(): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterResizable]
  }
  
  @scala.inline
  implicit class GridsterResizableMutableBuilder[Self <: GridsterResizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Array[String]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setAxesVarargs(value: String*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHandle_append_to(value: String): Self = StObject.set(x, "handle_append_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle_append_toUndefined: Self = StObject.set(x, "handle_append_to", js.undefined)
    
    @scala.inline
    def setHandle_class(value: String): Self = StObject.set(x, "handle_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle_classUndefined: Self = StObject.set(x, "handle_class", js.undefined)
    
    @scala.inline
    def setMax_size(value: js.Array[Double]): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_sizeUndefined: Self = StObject.set(x, "max_size", js.undefined)
    
    @scala.inline
    def setMax_sizeVarargs(value: Double*): Self = StObject.set(x, "max_size", js.Array(value :_*))
    
    @scala.inline
    def setMin_size(value: js.Array[Double]): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_sizeUndefined: Self = StObject.set(x, "min_size", js.undefined)
    
    @scala.inline
    def setMin_sizeVarargs(value: Double*): Self = StObject.set(x, "min_size", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: (/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
