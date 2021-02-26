package typingsSlinky.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScryptOptions extends StObject {
  
  var N: js.UndefOr[Double] = js.native
  
  var maxmem: js.UndefOr[Double] = js.native
  
  var p: js.UndefOr[Double] = js.native
  
  var r: js.UndefOr[Double] = js.native
}
object ScryptOptions {
  
  @scala.inline
  def apply(): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScryptOptions]
  }
  
  @scala.inline
  implicit class ScryptOptionsMutableBuilder[Self <: ScryptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
