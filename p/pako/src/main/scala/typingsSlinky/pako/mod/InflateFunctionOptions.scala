package typingsSlinky.pako.mod

import typingsSlinky.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflateFunctionOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var to: js.UndefOr[string] = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object InflateFunctionOptions {
  
  @scala.inline
  def apply(): InflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InflateFunctionOptions]
  }
  
  @scala.inline
  implicit class InflateFunctionOptionsMutableBuilder[Self <: InflateFunctionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setTo(value: string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
