package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalPrimitiveValueBlockParams extends LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  
  var valueHex: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}
object LocalPrimitiveValueBlockParams {
  
  @scala.inline
  def apply(): LocalPrimitiveValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalPrimitiveValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalPrimitiveValueBlockParamsMutableBuilder[Self <: LocalPrimitiveValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    @scala.inline
    def setValueHex(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
