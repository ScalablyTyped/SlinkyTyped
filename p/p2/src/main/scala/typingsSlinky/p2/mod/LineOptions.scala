package typingsSlinky.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOptions extends SharedShapeOptions {
  
  var length: js.UndefOr[Double] = js.native
}
object LineOptions {
  
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit class LineOptionsMutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
