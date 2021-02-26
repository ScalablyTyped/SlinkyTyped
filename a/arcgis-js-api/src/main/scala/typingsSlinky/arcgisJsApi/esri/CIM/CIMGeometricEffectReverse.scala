package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectReverse
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * A value indicating whether the dynamic output of a previous geometric effect is to be flipped or not.
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectReverse: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse = js.native
}
object CIMGeometricEffectReverse {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse): CIMGeometricEffectReverse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectReverse]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectReverseMutableBuilder[Self <: CIMGeometricEffectReverse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
