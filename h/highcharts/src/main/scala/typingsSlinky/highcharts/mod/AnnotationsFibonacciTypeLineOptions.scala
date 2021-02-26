package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsFibonacciTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
}
object AnnotationsFibonacciTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsFibonacciTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsFibonacciTypeLineOptionsMutableBuilder[Self <: AnnotationsFibonacciTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
