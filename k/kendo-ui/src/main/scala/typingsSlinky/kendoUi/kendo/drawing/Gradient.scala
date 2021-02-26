package typingsSlinky.kendoUi.kendo.drawing

import typingsSlinky.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gradient extends Class {
  
  def addStop(offset: Double, color: String, opacity: Double): GradientStop = js.native
  
  var options: GradientOptions = js.native
  
  def removeStop(stop: GradientStop): Unit = js.native
  
  var stops: js.Any = js.native
}
object Gradient {
  
  @scala.inline
  def apply(
    addStop: (Double, String, Double) => GradientStop,
    options: GradientOptions,
    removeStop: GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit class GradientMutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddStop(value: (Double, String, Double) => GradientStop): Self = StObject.set(x, "addStop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOptions(value: GradientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStop(value: GradientStop => Unit): Self = StObject.set(x, "removeStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
