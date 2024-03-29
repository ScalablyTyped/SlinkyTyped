package typingsSlinky.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.IntegerOptions> */
@js.native
trait PartialIntegerOptions extends StObject {
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
}
object PartialIntegerOptions {
  
  @scala.inline
  def apply(): PartialIntegerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIntegerOptions]
  }
  
  @scala.inline
  implicit class PartialIntegerOptionsMutableBuilder[Self <: PartialIntegerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
